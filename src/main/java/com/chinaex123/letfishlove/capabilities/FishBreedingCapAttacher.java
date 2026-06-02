package com.chinaex123.letfishlove.capabilities;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.neoforged.neoforge.capabilities.EntityCapability;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;

import static com.mojang.text2speech.Narrator.LOGGER;

/**
 * 鱼类繁殖能力附着器，负责注册、管理和获取鱼类的繁殖能力数据。
 */
public class FishBreedingCapAttacher {

    /**
     * 定义鱼类繁殖能力实体能力。
     */
    public static final EntityCapability<FishBreedingCap, Void> FISH_BREEDING_CAPABILITY =
            EntityCapability.createVoid(LetFishLoveMod.modPrefix("fish_breeding"), FishBreedingCap.class);

    /**
     * 能力的数据资源位置。
     */
    public static final ResourceLocation LET_FISH_LOVE_CAP_RL = LetFishLoveMod.modPrefix("let_fish_love_cap");

    /**
     * 能力数据缓存，通过UUID快速访问鱼类繁殖数据。
     */
    public static final Map<UUID, FishBreedingCap> CAPABILITY_CACHE = new HashMap<>();

    /**
     * 注册能力到指定的鱼类实体类型。
     */
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

    /**
     * 批量注册模组鱼的能力。
     * @param event 能力注册事件
     * @param fishIds 鱼的实体ID数组
     */
    @SuppressWarnings("unchecked")
    public static void registerModFishCapabilities(RegisterCapabilitiesEvent event, String[] fishIds) {
        for (String fishId : fishIds) {
            EntityType.byString(fishId).ifPresentOrElse(fishType -> {
                if (Entity.class.isAssignableFrom(fishType.getBaseClass())) {
                    event.registerEntity(FISH_BREEDING_CAPABILITY, (EntityType<? extends WaterAnimal>) fishType, (entity, context) ->
                            CAPABILITY_CACHE.computeIfAbsent(entity.getUUID(), uuid -> new FishBreedingCap(entity))
                    );
                }
            }, () -> {});
        }
    }

    /**
     * 实体加入世界时触发，将能力数据加入缓存。
     */
    public static void onEntityJoin(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof WaterAnimal fish) {
            FishBreedingCap cap = fish.getCapability(FISH_BREEDING_CAPABILITY);
            if (cap != null) {
                CAPABILITY_CACHE.put(fish.getUUID(), cap);
            }
        }
    }

    /**
     * 获取鱼类的繁殖能力数据。
     * 优先从能力系统获取，其次从缓存获取，最后新建一个。
     */
    public static FishBreedingCap getFishBreedingCapability(WaterAnimal entity) {
        // 尝试从能力系统获取
        FishBreedingCap cap = entity.getCapability(FISH_BREEDING_CAPABILITY);
        if (cap == null) {
            // 从缓存获取
            cap = CAPABILITY_CACHE.get(entity.getUUID());
        }
        if (cap == null) {
            // 新建一个
            cap = new FishBreedingCap(entity);
        }
        return cap;
    }

    /**
     * 从缓存中移除指定的能力数据。
     */
    public static void removeCachedCapability(UUID uuid) {
        CAPABILITY_CACHE.remove(uuid);
    }
}