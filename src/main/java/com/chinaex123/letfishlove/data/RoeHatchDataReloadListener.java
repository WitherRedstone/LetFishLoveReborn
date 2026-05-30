package com.chinaex123.letfishlove.data;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 鱼卵孵化数据重新加载监听器，负责从数据包加载鱼卵方块的孵化配置。
 * 支持通过 /reload 命令热重载配置。
 */
public class RoeHatchDataReloadListener extends SimpleJsonResourceReloadListener {

    // 存储所有鱼卵孵化数据的映射表（Key：方块注册名，Value：孵化数据）
    public static Map<ResourceLocation, RoeData> ROE_HATCH_DATA_MAP = new LinkedHashMap<>();

    /**
     * 构造方法，指定数据文件夹路径为 "roe_hatch_data"。
     */
    public RoeHatchDataReloadListener() {
        super(new GsonBuilder().create(), "roe_hatch_data");
    }

    /**
     * 应用数据包中的JSON配置，解析并存入静态映射表。
     * @param pObject 解析后的JSON数据映射（文件路径 -> JSON元素）
     * @param pResourceManager 资源管理器
     * @param pProfiler 性能分析器
     */
    @Override
    protected void apply(Map<ResourceLocation, JsonElement> pObject, ResourceManager pResourceManager, ProfilerFiller pProfiler) {
        // 清空旧数据
        ROE_HATCH_DATA_MAP.clear();

        // 遍历所有JSON文件
        for (JsonElement entry : pObject.values()) {
            JsonObject obj = entry.getAsJsonObject();

            // 获取方块的注册名称
            String name = obj.getAsJsonPrimitive("registry_name").getAsString();
            ResourceLocation location = ResourceLocation.tryParse(name);

            // 校验注册名是否有效且对应的方块存在
            if (location == null || !BuiltInRegistries.BLOCK.containsKey(location)) {
                continue;
            }

            // 解析孵化数量范围
            int minHatchAmount = obj.getAsJsonPrimitive("minHatchAmount").getAsInt();
            int maxHatchAmount = obj.getAsJsonPrimitive("maxHatchAmount").getAsInt();

            // 解析孵化时间范围（刻）
            int minHatchDuration = obj.getAsJsonPrimitive("minHatchDuration").getAsInt();
            int maxHatchDuration = obj.getAsJsonPrimitive("maxHatchDuration").getAsInt();

            // 存入静态映射表
            ROE_HATCH_DATA_MAP.put(location, new RoeData(minHatchAmount, maxHatchAmount, minHatchDuration, maxHatchDuration));
        }
    }

    /**
     * 鱼卵孵化数据记录。
     * @param minHatchAmount 最少孵化数量
     * @param maxHatchAmount 最多孵化数量
     * @param minHatchDuration 最短孵化时间（刻）
     * @param maxHatchDuration 最长孵化时间（刻）
     */
    public record RoeData(int minHatchAmount, int maxHatchAmount, int minHatchDuration, int maxHatchDuration) {}
}