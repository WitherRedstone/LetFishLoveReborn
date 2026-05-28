package com.uraneptus.letfishlove.core.registry;

import com.uraneptus.letfishlove.LetFishLoveMod;
import com.uraneptus.letfishlove.common.items.RoeItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LFLItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LetFishLoveMod.MOD_ID);

    public static final DeferredItem<Item> COD_ROE = ITEMS.register("cod_roe", () -> new RoeItem(LFLBlocks.COD_ROE_BLOCK));
    public static final DeferredItem<Item> PUFFERFISH_ROE = ITEMS.register("pufferfish_roe", () -> new RoeItem(LFLBlocks.PUFFERFISH_ROE_BLOCK));
    public static final DeferredItem<Item> SALMON_ROE = ITEMS.register("salmon_roe", () -> new RoeItem(LFLBlocks.SALMON_ROE_BLOCK));
    public static final DeferredItem<Item> TROPICAL_FISH_ROE = ITEMS.register("tropical_fish_roe", () -> new RoeItem(LFLBlocks.TROPICAL_FISH_ROE_BLOCK));
}
