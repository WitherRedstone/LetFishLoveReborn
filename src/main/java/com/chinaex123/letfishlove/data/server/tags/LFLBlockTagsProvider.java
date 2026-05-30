package com.chinaex123.letfishlove.data.server.tags;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.blocks.RoeBlock;
import com.chinaex123.letfishlove.init.LFLBlockTags;
import com.chinaex123.letfishlove.init.LFLBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LFLBlockTagsProvider extends BlockTagsProvider {

    public LFLBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LetFishLoveMod.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags(HolderLookup.Provider pProvider) {
        RoeBlock.getAllBlocks().forEach(block -> tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block));

        tag(LFLBlockTags.COD).add(LFLBlocks.COD_ROE_BLOCK.get());
        tag(LFLBlockTags.SALMON).add(LFLBlocks.SALMON_ROE_BLOCK.get());
        tag(LFLBlockTags.PUFFERFISH).add(LFLBlocks.PUFFERFISH_ROE_BLOCK.get());
        tag(LFLBlockTags.TROPICAL_FISH).add(LFLBlocks.TROPICAL_FISH_ROE_BLOCK.get());

    }

}
