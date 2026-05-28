package com.uraneptus.letfishlove.common.capabilities;

import com.uraneptus.letfishlove.LetFishLoveMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.EntityLeaveLevelEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

public class FishBreedingCapAttacher {

    public static final EntityCapability<FishBreedingCap, Void> FISH_BREEDING_CAPABILITY =
            EntityCapability.createVoid(LetFishLoveMod.modPrefix("fish_breeding"), FishBreedingCap.class);

    public static final ResourceLocation LET_FISH_LOVE_CAP_RL = LetFishLoveMod.modPrefix("let_fish_love_cap");

    public static final Map<UUID, FishBreedingCap> CAPABILITY_CACHE = new HashMap<>();

    public static void onRegisterCapabilities(RegisterCapabilitiesEvent event) {
        Stream.of(
                EntityType.COD,
                EntityType.SALMON,
                EntityType.TROPICAL_FISH,
                EntityType.PUFFERFISH
        ).forEach(fishType ->
                event.registerEntity(FISH_BREEDING_CAPABILITY, fishType, (entity, context) ->
                        CAPABILITY_CACHE.computeIfAbsent(entity.getUUID(), uuid -> new FishBreedingCap(entity))
                )
        );
    }

    public static void onEntityJoin(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof WaterAnimal fish) {
            FishBreedingCap cap = fish.getCapability(FISH_BREEDING_CAPABILITY);
            if (cap != null) {
                CAPABILITY_CACHE.put(fish.getUUID(), cap);
            }
        }
    }

    public static FishBreedingCap getFishBreedingCapability(WaterAnimal entity) {
        FishBreedingCap cap = entity.getCapability(FISH_BREEDING_CAPABILITY);
        if (cap == null) {
            cap = CAPABILITY_CACHE.get(entity.getUUID());
        }
        if (cap == null) {
            cap = new FishBreedingCap(entity);
        }
        return cap;
    }

    public static void removeCachedCapability(UUID uuid) {
        CAPABILITY_CACHE.remove(uuid);
    }

    public static void onEntityLeaveLevel(EntityLeaveLevelEvent event) {
        if (event.getEntity() instanceof WaterAnimal fish) {
            CAPABILITY_CACHE.remove(fish.getUUID());
        }
    }
}