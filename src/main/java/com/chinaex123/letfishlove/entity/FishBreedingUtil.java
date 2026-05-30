package com.chinaex123.letfishlove.entity;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.capabilities.FishBreedingCap;
import com.chinaex123.letfishlove.capabilities.FishBreedingCapAttacher;
import com.chinaex123.letfishlove.init.LFLEntityTags;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

/**
 * 鱼类繁殖工具类，提供繁殖相关的静态方法。
 */
public class FishBreedingUtil {

    /**
     * 消耗玩家手中的物品
     * @param pPlayer 玩家
     * @param pStack 物品栈
     */
    public static void usePlayerItem(Player pPlayer, ItemStack pStack) {
        if (!pPlayer.getAbilities().instabuild) {
            pStack.shrink(1);
        }
    }

    /**
     * 根据鱼类类型获取其喜欢的食物标签。
     * 标签路径格式：fish_food/命名空间/路径
     * @param entityType 鱼类实体类型
     * @return 食物物品标签
     */
    public static @NotNull TagKey<Item> getTemptationItems(EntityType<?> entityType) {
        ResourceLocation rl = BuiltInRegistries.ENTITY_TYPE.getKey(entityType);
        return TagKey.create(Registries.ITEM, LetFishLoveMod.modPrefix("fish_food/" + rl.getNamespace() + "/" + rl.getPath()));
    }

    /**
     * 根据鱼类类型获取其对应的鱼卵方块标签。
     * 标签路径格式：fish_roe/命名空间/路径
     * @param entityType 鱼类实体类型
     * @return 鱼卵方块标签
     */
    public static TagKey<Block> getRoeBlock(EntityType<?> entityType) {
        ResourceLocation rl = BuiltInRegistries.ENTITY_TYPE.getKey(entityType);
        return TagKey.create(Registries.BLOCK, LetFishLoveMod.modPrefix("fish_roe/" + rl.getNamespace() + "/" + rl.getPath()));
    }

    /**
     * 判断鱼类是否可繁殖。
     * @param entity 鱼类实体
     * @return 是否可繁殖
     */
    public static boolean isBreedable(WaterAnimal entity) {
        return entity.getType().is(LFLEntityTags.BREEDABLE_FISH);
    }

    /**
     * 获取鱼类的繁殖能力数据。
     * @param fish 鱼类实体
     * @return 繁殖能力数据
     */
    public static FishBreedingCap getFishCap(WaterAnimal fish) {
        return FishBreedingCapAttacher.getFishBreedingCapability(fish);
    }

    /**
     * 判断两条鱼是否可以进行交配。
     * 条件：不是同一条鱼、类型相同、且两条鱼都处于求爱模式。
     * @param thisFish 当前鱼
     * @param pOtherFish 另一条鱼
     * @return 是否可以交配
     */
    public static boolean canMate(WaterAnimal thisFish, WaterAnimal pOtherFish) {
        if (pOtherFish == thisFish) {
            return false;
        } else if (pOtherFish.getClass() != thisFish.getClass()) {
            return false;
        } else {
            return getFishCap(thisFish).isInLove() && getFishCap(pOtherFish).isInLove();
        }
    }

    /**
     * 执行繁殖，生成鱼卵并播放效果。
     * @param pLevel 服务端世界
     * @param thisFish 当前鱼
     * @param otherFish 配偶鱼
     */
    public static void spawnFishFromBreeding(ServerLevel pLevel, WaterAnimal thisFish, WaterAnimal otherFish) {
        FishBreedingCap thisFishCap = getFishCap(thisFish);
        FishBreedingCap otherFishCap = getFishCap(otherFish);

        // 获取触发繁殖的玩家（任意一条鱼的求爱触发者）
        ServerPlayer serverplayer = thisFishCap.getLoveCause(pLevel);
        if (serverplayer == null && otherFishCap.getLoveCause(pLevel) != null) {
            serverplayer = otherFishCap.getLoveCause(pLevel);
        }

        // 增加玩家繁殖统计
        if (serverplayer != null) {
            // 通常这里会有一个进度触发器
            // TODO 研究如何触发这个进度
            serverplayer.awardStat(Stats.ANIMALS_BRED);
        }

        // 重置两条鱼的求爱状态
        thisFishCap.resetLove();
        otherFishCap.resetLove();
        // 设置繁殖冷却时间为6000刻
        thisFishCap.setCanLoveCooldown(6000, true);
        otherFishCap.setCanLoveCooldown(6000, true);
        // 设置当前鱼怀孕
        thisFishCap.setPregnant(true, true);
        pLevel.broadcastEntityEvent(thisFish, (byte)18);
        // 根据游戏规则生成经验球
        if (pLevel.getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT)) {
            pLevel.addFreshEntity(new ExperienceOrb(pLevel, thisFish.getX(), thisFish.getY(), thisFish.getZ(), thisFish.getRandom().nextInt(7) + 1));
        }
    }
}