package com.chinaex123.letfishlove.compat.tide;

import com.chinaex123.letfishlove.capabilities.FishBreedingCapAttacher;
import com.chinaex123.letfishlove.init.compat.tide.LFLTideBlocks;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;

public class LFLTideCompat {
    public static void registerTideCapabilities(RegisterCapabilitiesEvent event) {
        FishBreedingCapAttacher.registerModFishCapabilities(event, LFLTideBlocks.TIDE_FISH_IDS);
    }
}
