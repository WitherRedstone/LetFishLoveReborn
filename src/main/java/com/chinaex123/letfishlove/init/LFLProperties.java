package com.chinaex123.letfishlove.init;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * 鱼卵的方块与物品属性配置类。
 */
public interface LFLProperties {

    //BLOCKS
    static BlockBehaviour.Properties roeBlockProperties() {
        return BlockBehaviour.Properties.ofFullCopy(Blocks.FROGSPAWN).requiresCorrectToolForDrops();
    }

    //ITEMS
    static Item.Properties roeItemProperties() {
        return new Item.Properties().stacksTo(16).food(new FoodProperties.Builder().nutrition(1).build());
    }
}
