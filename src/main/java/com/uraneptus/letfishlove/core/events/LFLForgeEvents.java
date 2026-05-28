package com.uraneptus.letfishlove.core.events;

import com.uraneptus.letfishlove.common.RoeHatchDataReloadListener;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddReloadListenerEvent;

@EventBusSubscriber
public class LFLForgeEvents {

    @SubscribeEvent
    public static void registerReloadListeners(AddReloadListenerEvent event) {
        event.addListener(new RoeHatchDataReloadListener());
    }
}
