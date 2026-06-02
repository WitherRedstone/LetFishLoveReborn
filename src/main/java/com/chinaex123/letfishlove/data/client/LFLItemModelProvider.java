package com.chinaex123.letfishlove.data.client;


import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.init.LFLItems;
import com.chinaex123.letfishlove.init.compat.tide.LFLTideItems;
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
        LFLTideItems.ITEMS.getEntries().forEach(this::basicItem);
    }

    private void basicItem(Supplier<? extends Item> item) {
        Item itemObj = item.get();
        String itemName = itemObj.toString().replace("letfishlove:", "");
        String texturePath = getTexturePath(itemName);
        
        withExistingParent(itemName, mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + texturePath));
    }

    private String getTexturePath(String itemName) {
        String[] vanillaFish = {"cod", "salmon", "pufferfish", "tropical_fish"};
        for (String fish : vanillaFish) {
            if (itemName.startsWith(fish + "_roe")) {
                return itemName;
            }
        }
        return "compat/tide/" + itemName;
    }
}