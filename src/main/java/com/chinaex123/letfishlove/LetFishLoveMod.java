package com.chinaex123.letfishlove;

import com.chinaex123.letfishlove.init.LFLCreativeTabs;
import com.mojang.logging.LogUtils;
import com.chinaex123.letfishlove.capabilities.FishBreedingCapAttacher;
import com.chinaex123.letfishlove.init.LFLBlocks;
import com.chinaex123.letfishlove.init.LFLItems;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(LetFishLoveMod.MOD_ID)
public class LetFishLoveMod {
    public static final String MOD_ID = "letfishlove";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation modPrefix(String name) {
        return ResourceLocation.tryBuild(LetFishLoveMod.MOD_ID, name);
    }

    public LetFishLoveMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(FishBreedingCapAttacher::onRegisterCapabilities);

        LFLBlocks.BLOCKS.register(modEventBus);
        LFLItems.ITEMS.register(modEventBus);
        LFLCreativeTabs.CREATIVE_MODE_TAB.register(modEventBus);
    }
}