package com.uraneptus.letfishlove.data;

import com.uraneptus.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ModelProvider;

public class LFLDatagenUtil {
    public static final String LAYER0 = "layer0";
    public static final String GENERATED = "item/generated";
    public static final String HANDHELD = "item/handheld";
    public static final String FROGSPAWN_PARENT = "frogspawn";

    public static String name(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    public static String name(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }

    public static ResourceLocation modBlockLocation(String path) {
        return LetFishLoveMod.modPrefix(ModelProvider.BLOCK_FOLDER + "/" + path);
    }

    public static ResourceLocation modItemLocation(String path) {
        return LetFishLoveMod.modPrefix(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    public static ResourceLocation vanillaBlockLocation(String path) {
        return ResourceLocation.tryParse(ModelProvider.BLOCK_FOLDER + "/" + path);
    }

    public static ResourceLocation vanillaItemLocation(String path) {
        return ResourceLocation.tryParse(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    public static ResourceLocation craftingPath(String name) {
        return LetFishLoveMod.modPrefix("crafting/" + name);
    }

    public static ResourceLocation cookingPath(String name) {
        return LetFishLoveMod.modPrefix("cooking/" + name);
    }

}
