package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LFLCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LetFishLoveMod.MOD_ID);

    public static final Supplier<CreativeModeTab> LETFISHLOVE_TAB =
            CREATIVE_MODE_TAB.register("letfishlove_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(LFLItems.COD_ROE.get()))
                    .title(Component.translatable("itemGroup.letfishlove_tab"))
                    .displayItems((parameters, output) -> {

                        // ==================== 原版 ====================
                        output.accept(LFLItems.COD_ROE.get());
                        output.accept(LFLItems.PUFFERFISH_ROE.get());
                        output.accept(LFLItems.SALMON_ROE.get());
                        output.accept(LFLItems.TROPICAL_FISH_ROE.get());

                    })
                    .build());
}
