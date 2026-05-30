package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.items.RoeItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface LFLItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(LetFishLoveMod.MOD_ID);

    DeferredItem<Item> COD_ROE = ITEMS.register("cod_roe", () -> new RoeItem(LFLBlocks.COD_ROE_BLOCK));
    DeferredItem<Item> PUFFERFISH_ROE = ITEMS.register("pufferfish_roe", () -> new RoeItem(LFLBlocks.PUFFERFISH_ROE_BLOCK));
    DeferredItem<Item> SALMON_ROE = ITEMS.register("salmon_roe", () -> new RoeItem(LFLBlocks.SALMON_ROE_BLOCK));
    DeferredItem<Item> TROPICAL_FISH_ROE = ITEMS.register("tropical_fish_roe", () -> new RoeItem(LFLBlocks.TROPICAL_FISH_ROE_BLOCK));
}
