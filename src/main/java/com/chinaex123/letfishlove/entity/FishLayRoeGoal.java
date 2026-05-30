package com.chinaex123.letfishlove.entity;

import com.chinaex123.letfishlove.blocks.RoeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluids;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 鱼类产卵AI目标，控制怀孕的鱼找到合适位置并放置鱼卵方块。
 */
public class FishLayRoeGoal extends MoveToBlockGoal {

    // 需要产卵的鱼类实体
    private final WaterAnimal fish;

    /**
     * 构造产卵AI目标。
     * @param fish 需要产卵的鱼
     */
    public FishLayRoeGoal(WaterAnimal fish) {
        // 参数：实体、移动速度、搜索范围XZ、搜索范围Y
        super(fish, 0.8F, 10, 5);
        this.fish = fish;
        // 设置需要移动和跳跃
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP));
    }

    /**
     * 检查AI是否可以启动。
     * 条件：鱼处于怀孕状态，且找到了合适的位置。
     */
    @Override
    public boolean canUse() {
        return FishBreedingUtil.getFishCap(fish).isPregnant() && super.canUse();
    }

    /**
     * 检查AI是否可以继续执行。
     * 条件：导航未完成、鱼仍处于怀孕状态、且父类条件满足。
     */
    @Override
    public boolean canContinueToUse() {
        return !this.fish.getNavigation().isDone() && FishBreedingUtil.getFishCap(fish).isPregnant() && super.canContinueToUse();
    }

    /**
     * 获取目标位置的有效距离（0表示必须精确到达）。
     */
    @Override
    public double acceptedDistance() {
        return 0.0D;
    }

    /**
     * 检查指定位置是否是有效的产卵位置。
     * 条件：上方方块是空气，当前位置的水是水源方块。
     */
    @Override
    protected boolean isValidTarget(LevelReader pLevel, BlockPos pPos) {
        return pLevel.getBlockState(pPos.above()).isAir() && pLevel.getBlockState(pPos).getFluidState().is(Fluids.WATER);
    }

    /**
     * AI停止时调用，执行产卵逻辑。
     */
    @Override
    public void stop() {
        Level level = this.fish.level();
        // 获取目标位置（找到的产卵位置）
        BlockPos fishPos = this.getMoveToTarget();
        // 获取当前鱼类对应的鱼卵方块标签
        TagKey<Block> blockTag = FishBreedingUtil.getRoeBlock(fish.getType());
        if (blockTag != null) {
            // 从标签中获取所有鱼卵方块
            List<Block> roeBlocks = level.holderLookup(Registries.BLOCK)
                    .get(blockTag)
                    .map(tag -> tag.stream().map(Holder::value).collect(Collectors.toList()))
                    .orElse(List.of());

            if (!roeBlocks.isEmpty()) {
                // 随机选择一种鱼卵方块
                Block block = roeBlocks.get(level.getRandom().nextInt(roeBlocks.size()));
                if (block instanceof RoeBlock roe) {
                    // 设置亲本实体，用于继承特征
                    roe.setParentEntity(fish);
                    // 放置鱼卵方块
                    level.setBlockAndUpdate(fishPos, roe.defaultBlockState());
                }
            }
            // 将鱼的怀孕状态设为false，产卵完成
            FishBreedingUtil.getFishCap(fish).setPregnant(false, true);
        }
    }
}