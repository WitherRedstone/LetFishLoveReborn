package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.blocks.RoeBlock;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface LFLBlocks {
    DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LetFishLoveMod.MOD_ID);

    DeferredBlock<Block> COD_ROE_BLOCK = BLOCKS.register("cod_roe_block", () -> new
            RoeBlock(() -> EntityType.COD, LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> PUFFERFISH_ROE_BLOCK = BLOCKS.register("pufferfish_roe_block", () ->
            new RoeBlock(() -> EntityType.PUFFERFISH, LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SALMON_ROE_BLOCK = BLOCKS.register("salmon_roe_block", () ->
            new RoeBlock(() -> EntityType.SALMON, LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> TROPICAL_FISH_ROE_BLOCK = BLOCKS.register("tropical_fish_roe_block", () ->
            new RoeBlock(() -> EntityType.TROPICAL_FISH, LFLProperties.roeBlockProperties()));
}