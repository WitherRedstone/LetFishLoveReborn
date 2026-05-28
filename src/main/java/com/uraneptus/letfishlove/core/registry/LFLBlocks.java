package com.uraneptus.letfishlove.core.registry;

import com.uraneptus.letfishlove.LetFishLoveMod;
import com.uraneptus.letfishlove.common.blocks.RoeBlock;
import com.uraneptus.letfishlove.core.other.LFLProperties;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LFLBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LetFishLoveMod.MOD_ID);

    public static final DeferredBlock<Block> COD_ROE_BLOCK = BLOCKS.register("cod_roe_block", () -> new RoeBlock(() -> EntityType.COD, LFLProperties.roeBlockProperties()));
    public static final DeferredBlock<Block> PUFFERFISH_ROE_BLOCK = BLOCKS.register("pufferfish_roe_block", () -> new RoeBlock(() -> EntityType.PUFFERFISH, LFLProperties.roeBlockProperties()));
    public static final DeferredBlock<Block> SALMON_ROE_BLOCK = BLOCKS.register("salmon_roe_block", () -> new RoeBlock(() -> EntityType.SALMON, LFLProperties.roeBlockProperties()));
    public static final DeferredBlock<Block> TROPICAL_FISH_ROE_BLOCK = BLOCKS.register("tropical_fish_roe_block", () -> new RoeBlock(() -> EntityType.TROPICAL_FISH, LFLProperties.roeBlockProperties()));

}