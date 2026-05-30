package com.chinaex123.letfishlove.data.client;


import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.init.LFLItems;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class LFLItemModelProvider extends ItemModelProvider {

    public LFLItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, LetFishLoveMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        LFLItems.ITEMS.getEntries().forEach(this::basicItem);
    }

    private void basicItem(Supplier<? extends Item> item) {
        basicItem(item.get());
    }
}
