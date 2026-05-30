package com.chinaex123.letfishlove.event;

import com.chinaex123.letfishlove.capabilities.FishBreedingCap;
import com.chinaex123.letfishlove.capabilities.FishBreedingCapAttacher;
import com.chinaex123.letfishlove.entity.FishBreedGoal;
import com.chinaex123.letfishlove.entity.FishBreedingUtil;
import com.chinaex123.letfishlove.entity.FishLayRoeGoal;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.EntityLeaveLevelEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;

/**
 * 鱼类繁殖相关的事件处理类。
 */
@EventBusSubscriber
public class EntityEvents {

    /**
     * 玩家与鱼交互时触发，用于喂食使鱼进入求爱模式。
     */
    @SubscribeEvent
    public static void onEntityInteract(PlayerInteractEvent.EntityInteract event) {
        if (!event.getLevel().isClientSide()) return;

        Player player = event.getEntity(); // 获取玩家
        InteractionHand hand = event.getHand(); // 获取交互的手
        ItemStack itemInHand = player.getItemInHand(hand); // 获取玩家手中的物品
        Entity target = event.getTarget(); // 获取目标实体
        Level level = event.getLevel(); // 获取世界

        // 检查目标是否为可繁殖的鱼类
        if (target instanceof WaterAnimal fish && FishBreedingUtil.isBreedable(fish)) {
            // 获取该鱼类喜欢的食物标签
            TagKey<Item> temptationItems = FishBreedingUtil.getTemptationItems(fish.getType());
            // 检查玩家手中的物品是否是鱼类喜欢的食物
            if (itemInHand.is(temptationItems)) {
                // 获取鱼类的繁殖能力数据
                FishBreedingCap fishCap = FishBreedingUtil.getFishCap(fish);
                // 检查鱼类是否能够进入求爱模式
                if (fishCap.canFallInLove()) {
                    // 设置鱼类进入求爱模式
                    fishCap.setInLove(fish, player, level);
                    // 消耗玩家手中的一个物品
                    FishBreedingUtil.usePlayerItem(player, itemInHand);

                    event.setCancellationResult(InteractionResult.sidedSuccess(level.isClientSide()));
                    event.setCanceled(true);
                }
            }
        }
    }

    /**
     * 每刻触发，更新鱼的求爱倒计时和冷却时间。
     */
    @SubscribeEvent
    public static void onEntityTick(EntityTickEvent.Pre event) {
        // 检查实体是否为可繁殖的鱼类
        if (event.getEntity() instanceof LivingEntity entity && entity instanceof WaterAnimal fish && FishBreedingUtil.isBreedable(fish)) {
            // 获取鱼类的繁殖能力数据
            FishBreedingCap cap = FishBreedingUtil.getFishCap(fish);
            // 如果求爱倒计时大于0，则减少1刻
            if (cap.getInLoveInt() > 0) {
                cap.setInLoveInt(cap.getInLoveInt() - 1, true);
            }
            // 如果冷却时间大于0，则减少1刻
            if (cap.getCanLoveCooldown() > 0) {
                cap.setCanLoveCooldown(cap.getCanLoveCooldown() - 1, true);
            }
        }
    }

    /**
     * 鱼加入世界时触发，添加繁殖相关的AI行为。
     */
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinLevelEvent event) {
        // 获取加入世界的实体
        Entity entity = event.getEntity();
        // 检查是否为鱼类
        if (entity instanceof WaterAnimal fish) {
            // 获取鱼类的繁殖能力数据
            FishBreedingCap cap = fish.getCapability(FishBreedingCapAttacher.FISH_BREEDING_CAPABILITY);
            // 将能力数据缓存到Map中
            if (cap != null) {
                FishBreedingCapAttacher.CAPABILITY_CACHE.put(fish.getUUID(), cap);
            }

            // 如果鱼类是可繁殖的，则添加相关的AI目标
            if (FishBreedingUtil.isBreedable(fish)) {
                // 获取鱼类喜欢的食物标签
                TagKey<Item> temptationItems = FishBreedingUtil.getTemptationItems(fish.getType());
                // 添加被食物吸引的AI（优先级0，最高）
                fish.goalSelector.addGoal(0, new TemptGoal(fish, 1.2D, Ingredient.of(temptationItems), false));
                // 添加繁殖AI（两只鱼靠近时繁殖）
                fish.goalSelector.addGoal(0, new FishBreedGoal(fish, 1.0D));
                // 添加产卵AI（繁殖后生成鱼卵方块）
                fish.goalSelector.addGoal(0, new FishLayRoeGoal(fish));
            }
        }
    }

    /**
     * 鱼离开世界时触发，清理缓存数据。
     */
    @SubscribeEvent
    public static void onEntityLeaveLevel(EntityLeaveLevelEvent event) {
        // 检查离开的实体是否为鱼类
        if (event.getEntity() instanceof WaterAnimal fish) {
            // 从缓存Map中移除该鱼类的能力数据，避免内存泄漏
            FishBreedingCapAttacher.CAPABILITY_CACHE.remove(fish.getUUID());
        }
    }
}