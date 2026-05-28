package com.uraneptus.letfishlove.data.server.loot;

import com.uraneptus.letfishlove.common.blocks.RoeBlock;
import com.uraneptus.letfishlove.core.registry.LFLBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.HolderLookup;

import java.util.Set;

public class LFLBlockLoot extends BlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Set.of();

    protected LFLBlockLoot(HolderLookup.Provider lookupProvider) {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return () -> LFLBlocks.BLOCKS.getEntries().stream()
                .map(holder -> (Block) holder.get())
                .iterator();
    }

    @Override
    protected void generate() {
        RoeBlock.getAllBlocks().forEach(this::dropSelf);
    }
}
