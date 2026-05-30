package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public interface LFLEntityTags {
    TagKey<EntityType<?>> BREEDABLE_FISH = TagKey.create(Registries.ENTITY_TYPE, LetFishLoveMod.modPrefix("breedable_fish"));
}
