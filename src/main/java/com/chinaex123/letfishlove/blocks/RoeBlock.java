package com.chinaex123.letfishlove.blocks;

import com.mojang.logging.annotations.MethodsReturnNonnullByDefault;
import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.data.RoeHatchDataReloadListener;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.fml.loading.FMLEnvironment;
import org.jetbrains.annotations.Nullable;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * 鱼卵方块类，可孵化出对应种类的鱼。
 */
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class RoeBlock extends Block {

    // 将要孵化出的鱼类类型
    private Supplier<EntityType<?>> fish;

    // 是否通过繁殖产生（用于继承亲本特征）
    protected boolean fromBreeding = false;

    // 亲本实体（用于继承特征，如热带鱼花纹）
    private Entity parentEntity;

    // 方块的碰撞箱形状：扁平的薄片（16x1.5x16）
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.5D, 16.0D);

    /**
     * 构造鱼卵方块
     * @param fish 将要孵化出的鱼类类型供应器
     * @param properties 方块属性
     */
    public RoeBlock(Supplier<EntityType<?>> fish, Properties properties) {
        super(properties);
        this.fish = fish;
    }

    /**
     * 获取方块的碰撞箱形状。
     */
    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    /**
     * 检查鱼卵方块是否可以放置在当前位置（需要下方是水，上方是空气）。
     */
    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return mayPlaceOn(pLevel, pPos.below());
    }

    /**
     * 方块被放置时触发，计划一个延迟刻来执行孵化。
     */
    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        pLevel.scheduleTick(pPos, this, getHatchDelay(pLevel.getRandom()));
    }

    /**
     * 获取孵化延迟时间（刻）
     */
    private int getHatchDelay(RandomSource pRandom) {
        // 开发环境使用短时间方便测试
        if (!FMLEnvironment.production) {
            return pRandom.nextInt(36, 120);
        }
        // 从数据包配置读取孵化时间范围
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(this.asBlock());
        RoeHatchDataReloadListener.RoeData roeData = RoeHatchDataReloadListener.ROE_HATCH_DATA_MAP.get(blockKey);
        if (roeData == null) {
            return pRandom.nextInt(36, 120);
        }
        return pRandom.nextInt(roeData.minHatchDuration(), roeData.maxHatchDuration());
    }

    /**
     * 当相邻方块更新时触发，如果无法生存则破坏方块。
     */
    @Override
    public BlockState updateShape(BlockState pState, Direction pDirection, BlockState pNeighborState, LevelAccessor pLevel, BlockPos pCurrentPos, BlockPos pNeighborPos) {
        return !this.canSurvive(pState, pLevel, pCurrentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(pState, pDirection, pNeighborState, pLevel, pCurrentPos, pNeighborPos);
    }

    /**
     * 方块的刻更新触发，执行孵化逻辑。
     */
    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!this.canSurvive(pState, pLevel, pPos)) {
            // 无法生存则破坏方块
            this.destroyBlock(pLevel, pPos);
        } else {
            // 执行孵化
            this.hatch(pLevel, pPos, pRandom);
        }
    }

    /**
     * 当实体进入方块内部时触发，如果是掉落的方块则破坏鱼卵。
     */
    @Override
    public void entityInside(BlockState pState, Level pLevel, BlockPos pPos, Entity pEntity) {
        if (pEntity.getType().equals(EntityType.FALLING_BLOCK)) {
            this.destroyBlock(pLevel, pPos);
        }
    }

    /**
     * 检查是否可以放置在指定位置（下方必须是水源，上方必须是空气）。
     */
    private static boolean mayPlaceOn(BlockGetter pLevel, BlockPos pPos) {
        FluidState fluidstate = pLevel.getFluidState(pPos);
        FluidState fluidstate1 = pLevel.getFluidState(pPos.above());
        return fluidstate.getType() == Fluids.WATER && fluidstate1.getType() == Fluids.EMPTY;
    }

    /**
     * 执行孵化：破坏方块、播放声音、生成鱼类。
     */
    private void hatch(ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        this.destroyBlock(pLevel, pPos);
        pLevel.playSound(null, pPos, SoundEvents.FROGSPAWN_HATCH, SoundSource.BLOCKS, 1.0F, 1.0F);
        this.spawnFish(pLevel, pPos, pRandom);
    }

    /**
     * 破坏鱼卵方块。
     */
    private void destroyBlock(Level pLevel, BlockPos pPos) {
        pLevel.destroyBlock(pPos, false);
    }

    /**
     * 生成孵化出的鱼类。
     */
    protected void spawnFish(ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        // 从配置获取孵化数量范围
        RoeHatchDataReloadListener.RoeData roeData = RoeHatchDataReloadListener.ROE_HATCH_DATA_MAP.get(BuiltInRegistries.BLOCK.getKey(this.asBlock()));
        int i;
        if (roeData == null) {
            i = pRandom.nextInt(1, 4);
        } else {
            i = pRandom.nextInt(roeData.minHatchAmount(), roeData.maxHatchAmount());
        }

        // 生成指定数量的鱼
        for(int j = 1; j <= i; ++j) {
            if (createEntity(pLevel) instanceof WaterAnimal waterAnimal) {
                // 计算随机位置偏移
                double d0 = (double)pPos.getX() + this.getRandomPositionOffset(pRandom);
                double d1 = (double)pPos.getZ() + this.getRandomPositionOffset(pRandom);
                int k = pRandom.nextInt(1, 361);
                // 设置鱼的位置和角度
                waterAnimal.moveTo(d0, (double)pPos.getY() - 0.5D, d1, (float)k, 0.0F);
                waterAnimal.setPersistenceRequired();
                // 处理特殊鱼类的变种（如热带鱼花纹继承）
                handleVariantFish(waterAnimal, pLevel, pPos, pRandom);
                // 将鱼添加到世界
                pLevel.addFreshEntity(waterAnimal);
            }
        }
    }

    /**
     * 处理特殊鱼类的变种（如热带鱼的花纹继承）。
     */
    protected void handleVariantFish(WaterAnimal waterAnimal, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (waterAnimal instanceof TropicalFish newTropicalFish) {
            // 如果是繁殖产生的鱼，继承亲本的花纹
            if (fromBreeding && this.getParentEntity() instanceof TropicalFish parentFish) {
                TropicalFish.Pattern parentVariant = parentFish.getVariant();
                newTropicalFish.setVariant(parentVariant);
            } else {
                // 否则随机选择一种热带鱼花纹
                TropicalFish.Variant randomVariant = Util.getRandom(TropicalFish.COMMON_VARIANTS, pRandom);
                newTropicalFish.setVariant(randomVariant.pattern());
            }
        }
    }

    /**
     * 创建鱼类实体。
     */
    public @Nullable Entity createEntity(Level pLevel) {
        this.getFish();
        return this.getFish().create(pLevel);
    }

    /**
     * 获取随机的水平位置偏移。
     */
    protected double getRandomPositionOffset(RandomSource pRandom) {
        double d0 = getFish().getWidth() / 2.0F;
        return Mth.clamp(pRandom.nextDouble(), d0, 1.0D - d0);
    }

    /**
     * 获取将要孵化出的鱼类类型。
     */
    public EntityType<?> getFish() {
        return fish.get();
    }

    /**
     * 设置将要孵化出的鱼类类型。
     */
    public void setFish(Supplier<EntityType<?>> fish) {
        this.fish = fish;
    }

    /**
     * 获取亲本实体。
     */
    public Entity getParentEntity() {
        return parentEntity;
    }

    /**
     * 设置亲本实体，并标记为繁殖产生。
     */
    public void setParentEntity(Entity parentEntity) {
        this.parentEntity = parentEntity;
        this.fromBreeding = true;
    }

    /**
     * 获取模组中所有鱼卵方块的列表。
     */
    public static Iterable<Block> getAllBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> {
                    BuiltInRegistries.BLOCK.getKey(block);
                    return LetFishLoveMod.MOD_ID.equals(BuiltInRegistries.BLOCK.getKey(block).getNamespace()) && block instanceof RoeBlock;
                })
                .collect(Collectors.toList());
    }
}