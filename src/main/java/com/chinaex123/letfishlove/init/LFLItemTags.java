package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public interface LFLItemTags {
    TagKey<Item> COD = create("cod");
    TagKey<Item> SALMON = create("salmon");
    TagKey<Item> PUFFERFISH = create("pufferfish");
    TagKey<Item> TROPICAL_FISH = create("tropical_fish");

    static TagKey<Item> create(String fishName) {
        return TagKey.create(Registries.ITEM, LetFishLoveMod.modPrefix("fish_food/minecraft/" + fishName));
    }
}
