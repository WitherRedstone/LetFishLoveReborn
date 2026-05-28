package com.uraneptus.letfishlove.core.events;

import com.mojang.logging.LogUtils;
import com.uraneptus.letfishlove.common.capabilities.FishBreedingCap;
import com.uraneptus.letfishlove.common.capabilities.FishBreedingCapAttacher;
import com.uraneptus.letfishlove.common.entity.FishBreedGoal;
import com.uraneptus.letfishlove.common.entity.FishBreedingUtil;
import com.uraneptus.letfishlove.common.entity.FishLayRoeGoal;
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
import org.slf4j.Logger;

@EventBusSubscriber
public class EntityEvents {

    @SubscribeEvent
    public static void onEntityInteract(PlayerInteractEvent.EntityInteract event) {
        if (!event.getLevel().isClientSide()) return;

        Player player = event.getEntity();
        InteractionHand hand = event.getHand();
        ItemStack itemInHand = player.getItemInHand(hand);
        Entity target = event.getTarget();
        Level level = event.getLevel();

        if (target instanceof WaterAnimal fish && FishBreedingUtil.isBreedable(fish)) {
            TagKey<Item> temptationItems = FishBreedingUtil.getTemptationItems(fish.getType());
            if (itemInHand.is(temptationItems)) {
                FishBreedingCap fishCap = FishBreedingUtil.getFishCap(fish);
                if (fishCap.canFallInLove()) {
                    fishCap.setInLove(fish, player, level);
                    FishBreedingUtil.usePlayerItem(player, itemInHand);
                    event.setCancellationResult(InteractionResult.sidedSuccess(level.isClientSide()));
                    event.setCanceled(true);
                }
            }
        }
    }

    @SubscribeEvent
    public static void onEntityTick(EntityTickEvent.Pre event) {
        if (event.getEntity() instanceof LivingEntity entity && entity instanceof WaterAnimal fish && FishBreedingUtil.isBreedable(fish)) {
            FishBreedingCap cap = FishBreedingUtil.getFishCap(fish);
            if (cap.getInLoveInt() > 0) {
                cap.setInLoveInt(cap.getInLoveInt() - 1, true);
            }
            if (cap.getCanLoveCooldown() > 0) {
                cap.setCanLoveCooldown(cap.getCanLoveCooldown() - 1, true);
            }
        }
    }

    @SubscribeEvent
    public static void onEntityJoin(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof WaterAnimal fish) {
            FishBreedingCap cap = fish.getCapability(FishBreedingCapAttacher.FISH_BREEDING_CAPABILITY);
            if (cap != null) {
                FishBreedingCapAttacher.CAPABILITY_CACHE.put(fish.getUUID(), cap);
            }

            if (FishBreedingUtil.isBreedable(fish)) {
                TagKey<Item> temptationItems = FishBreedingUtil.getTemptationItems(fish.getType());
                fish.goalSelector.addGoal(0, new TemptGoal(fish, 1.2D, Ingredient.of(temptationItems), false));
                fish.goalSelector.addGoal(0, new FishBreedGoal(fish, 1.0D));
                fish.goalSelector.addGoal(0, new FishLayRoeGoal(fish));
            }
        }
    }

    @SubscribeEvent
    public static void onEntityLeaveLevel(EntityLeaveLevelEvent event) {
        if (event.getEntity() instanceof WaterAnimal fish) {
            FishBreedingCapAttacher.CAPABILITY_CACHE.remove(fish.getUUID());
        }
    }
}
