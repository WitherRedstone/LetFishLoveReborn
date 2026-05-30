package com.chinaex123.letfishlove.capabilities;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.capabilities.ICapabilityProvider;
import net.neoforged.neoforge.common.util.INBTSerializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 鱼类繁殖能力提供器，负责提供和序列化鱼类繁殖能力数据。
 */
public class FishBreedingCapProvider implements ICapabilityProvider<Entity, Void, FishBreedingCap>, INBTSerializable<CompoundTag> {

    // 持有的鱼类繁殖能力数据实例
    private final FishBreedingCap capability;

    /**
     * 构造方法，传入能力数据实例。
     */
    public FishBreedingCapProvider(FishBreedingCap capability) {
        this.capability = capability;
    }

    /**
     * 获取能力数据实例。
     * @param entity 所属实体
     * @param context 上下文（此处为Void，无意义）
     * @return 鱼类繁殖能力数据
     */
    @Nullable
    @Override
    public FishBreedingCap getCapability(@NotNull Entity entity, @Nullable Void context) {
        return capability;
    }

    /**
     * 将能力数据序列化为NBT，用于保存到世界文件。
     */
    @Override
    public CompoundTag serializeNBT(HolderLookup.Provider provider) {
        return capability.serializeNBT(provider);
    }

    /**
     * 从NBT反序列化能力数据，用于从世界文件加载。
     */
    @Override
    public void deserializeNBT(HolderLookup.Provider provider, CompoundTag nbt) {
        capability.deserializeNBT(provider, nbt);
    }
}