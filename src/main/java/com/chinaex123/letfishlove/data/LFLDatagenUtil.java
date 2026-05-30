package com.chinaex123.letfishlove.data;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ModelProvider;

/**
 * 模组数据生成工具类，提供资源路径构建和名称获取的辅助方法。
 */
public class LFLDatagenUtil {

    // 通用模型层名称常量
    public static final String LAYER0 = "layer0";

    // 物品模型类型常量
    public static final String GENERATED = "item/generated"; // 普通物品模型（如鱼卵）
    public static final String HANDHELD = "item/handheld"; // 手持物品模型（如工具）

    // 父级模型名称常量（青蛙卵）
    public static final String FROGSPAWN_PARENT = "frogspawn";

    /**
     * 获取方块的注册名称（路径部分）。
     * @param block 方块
     * @return 注册名称，如 "cod_roe_block"
     */
    public static String name(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block).getPath();
    }

    /**
     * 获取物品的注册名称（路径部分）。
     * @param item 物品
     * @return 注册名称，如 "cod_roe"
     */
    public static String name(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }

    /**
     * 构建模组方块的资源路径。
     * @param path 方块名称
     * @return 资源路径，如 "letfishlove:block/cod_roe_block"
     */
    public static ResourceLocation modBlockLocation(String path) {
        return LetFishLoveMod.modPrefix(ModelProvider.BLOCK_FOLDER + "/" + path);
    }

    /**
     * 构建模组物品的资源路径。
     * @param path 物品名称
     * @return 资源路径，如 "letfishlove:item/cod_roe"
     */
    public static ResourceLocation modItemLocation(String path) {
        return LetFishLoveMod.modPrefix(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    /**
     * 构建原版方块的资源路径。
     * @param path 方块名称
     * @return 资源路径，如 "minecraft:block/stone"
     */
    public static ResourceLocation vanillaBlockLocation(String path) {
        return ResourceLocation.tryParse(ModelProvider.BLOCK_FOLDER + "/" + path);
    }

    /**
     * 构建原版物品的资源路径。
     * @param path 物品名称
     * @return 资源路径，如 "minecraft:item/stone"
     */
    public static ResourceLocation vanillaItemLocation(String path) {
        return ResourceLocation.tryParse(ModelProvider.ITEM_FOLDER + "/" + path);
    }

    /**
     * 构建合成配方的路径。
     * @param name 配方名称
     * @return 资源路径，如 "letfishlove:crafting/cod_roe"
     */
    public static ResourceLocation craftingPath(String name) {
        return LetFishLoveMod.modPrefix("crafting/" + name);
    }

    /**
     * 构建烹饪配方的路径（烧炼/烟熏/营火）。
     * @param name 配方名称
     * @return 资源路径，如 "letfishlove:cooking/cod_roe"
     */
    public static ResourceLocation cookingPath(String name) {
        return LetFishLoveMod.modPrefix("cooking/" + name);
    }
}