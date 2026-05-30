package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public interface LFLBlockTags {
    TagKey<Block> COD = create("cod");
    TagKey<Block> SALMON = create("salmon");
    TagKey<Block> PUFFERFISH = create("pufferfish");
    TagKey<Block> TROPICAL_FISH = create("tropical_fish");

    static TagKey<Block> create(String fishName) {
        return TagKey.create(Registries.BLOCK, LetFishLoveMod.modPrefix("fish_roe/minecraft/" + fishName));
    }

}
