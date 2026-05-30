package com.chinaex123.letfishlove.event;

import com.chinaex123.letfishlove.data.RoeHatchDataReloadListener;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddReloadListenerEvent;

@EventBusSubscriber
public class LFLNeoForgeEvents {

    /**
     * 注册数据包重新加载监听器时触发，用于添加鱼卵孵化数据的自定义重新加载逻辑。
     */
    @SubscribeEvent
    public static void registerReloadListeners(AddReloadListenerEvent event) {
        // 添加鱼卵孵化数据重新加载监听器，使模组的数据包支持命令热重载
        event.addListener(new RoeHatchDataReloadListener());
    }
}