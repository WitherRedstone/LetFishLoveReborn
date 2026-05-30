package com.chinaex123.letfishlove.data.server.tags;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.init.LFLEntityTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class LFLEntityTagsProvider extends EntityTypeTagsProvider {

    public LFLEntityTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pProvider, ExistingFileHelper fileHelper) {
        super(packOutput, pProvider, LetFishLoveMod.MOD_ID, fileHelper);
    }

    @Override
    public void addTags(HolderLookup.Provider pProvider) {
        tag(LFLEntityTags.BREEDABLE_FISH).add(EntityType.COD, EntityType.SALMON, EntityType.PUFFERFISH, EntityType.TROPICAL_FISH);
    }
}
