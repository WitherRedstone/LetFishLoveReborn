package com.uraneptus.letfishlove.common.capabilities;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.capabilities.ICapabilityProvider;
import net.neoforged.neoforge.common.util.INBTSerializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FishBreedingCapProvider implements ICapabilityProvider<Entity, Void, FishBreedingCap>, INBTSerializable<CompoundTag> {
    private final FishBreedingCap capability;

    public FishBreedingCapProvider(FishBreedingCap capability) {
        this.capability = capability;
    }

    @Nullable
    @Override
    public FishBreedingCap getCapability(@NotNull Entity entity, @Nullable Void context) {
        return capability;
    }

    @Override
    public CompoundTag serializeNBT(HolderLookup.Provider provider) {
        return capability.serializeNBT(provider);
    }

    @Override
    public void deserializeNBT(HolderLookup.Provider provider, CompoundTag nbt) {
        capability.deserializeNBT(provider, nbt);
    }
}
