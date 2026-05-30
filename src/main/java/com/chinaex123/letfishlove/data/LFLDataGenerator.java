package com.chinaex123.letfishlove.data;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.data.client.LFLBlockStateProvider;
import com.chinaex123.letfishlove.data.client.LFLItemModelProvider;
import com.chinaex123.letfishlove.data.server.loot.LFLLootTableProvider;
import com.chinaex123.letfishlove.data.server.tags.LFLBlockTagsProvider;
import com.chinaex123.letfishlove.data.server.tags.LFLEntityTagsProvider;
import com.chinaex123.letfishlove.data.server.tags.LFLItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = LetFishLoveMod.MOD_ID)
public class LFLDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        boolean includeClient = event.includeClient();
        boolean includeServer = event.includeServer();
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(includeClient, new LFLBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(includeClient, new LFLItemModelProvider(packOutput, fileHelper));

        LFLBlockTagsProvider blockTagsProvider = new LFLBlockTagsProvider(packOutput, lookupProvider, fileHelper);
        generator.addProvider(includeServer, blockTagsProvider);
        generator.addProvider(includeServer, new LFLItemTagsProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), fileHelper));
        generator.addProvider(includeServer, new LFLEntityTagsProvider(packOutput, lookupProvider, fileHelper));
        generator.addProvider(includeServer, new LFLLootTableProvider(packOutput, lookupProvider));
    }
}
