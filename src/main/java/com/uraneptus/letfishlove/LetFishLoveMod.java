package com.uraneptus.letfishlove;

import com.mojang.logging.LogUtils;
import com.uraneptus.letfishlove.common.capabilities.FishBreedingCapAttacher;
import com.uraneptus.letfishlove.core.registry.LFLBlocks;
import com.uraneptus.letfishlove.core.registry.LFLItems;
import com.uraneptus.letfishlove.data.client.LFLBlockStateProvider;
import com.uraneptus.letfishlove.data.client.LFLItemModelProvider;
import com.uraneptus.letfishlove.data.client.LFLLangProvider;
import com.uraneptus.letfishlove.data.server.loot.LFLLootTableProvider;
import com.uraneptus.letfishlove.data.server.tags.LFLBlockTagsProvider;
import com.uraneptus.letfishlove.data.server.tags.LFLEntityTagsProvider;
import com.uraneptus.letfishlove.data.server.tags.LFLItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(LetFishLoveMod.MOD_ID)
public class LetFishLoveMod {
    public static final String MOD_ID = "letfishlove";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation modPrefix(String name) {
        return ResourceLocation.tryBuild(LetFishLoveMod.MOD_ID, name);
    }

    public LetFishLoveMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::gatherData);
        modEventBus.addListener(FishBreedingCapAttacher::onRegisterCapabilities);

        LFLBlocks.BLOCKS.register(modEventBus);
        LFLItems.ITEMS.register(modEventBus);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        boolean includeClient = event.includeClient();
        boolean includeServer = event.includeServer();
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(includeClient, new LFLBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(includeClient, new LFLItemModelProvider(packOutput, fileHelper));
        generator.addProvider(includeClient, new LFLLangProvider(packOutput));

        LFLBlockTagsProvider blockTagsProvider = new LFLBlockTagsProvider(packOutput, lookupProvider, fileHelper);
        generator.addProvider(includeServer, blockTagsProvider);
        generator.addProvider(includeServer, new LFLItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), fileHelper));
        generator.addProvider(includeServer, new LFLEntityTagsProvider(packOutput, lookupProvider, fileHelper));
        generator.addProvider(includeServer, new LFLLootTableProvider(packOutput, lookupProvider));
    }

}