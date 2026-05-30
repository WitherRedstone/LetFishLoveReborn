package com.chinaex123.letfishlove.data.server.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class LFLLootTableProvider extends LootTableProvider {
    public LFLLootTableProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider) {
        super(pOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(LFLBlockLoot::new, LootContextParamSets.BLOCK)
        ), pLookupProvider);
    }
}
