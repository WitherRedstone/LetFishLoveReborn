package com.uraneptus.letfishlove.common.entity;

import com.uraneptus.letfishlove.common.blocks.RoeBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluids;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class FishLayRoeGoal extends MoveToBlockGoal {
    private final WaterAnimal fish;

    public FishLayRoeGoal(WaterAnimal fish) {
        super(fish, 0.8F, 10, 5);
        this.fish = fish;
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP));
    }

    @Override
    public boolean canUse() {
        return FishBreedingUtil.getFishCap(fish).isPregnant() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return !this.fish.getNavigation().isDone() && FishBreedingUtil.getFishCap(fish).isPregnant() && super.canContinueToUse();
    }

    @Override
    public double acceptedDistance() {
        return 0.0D;
    }

    @Override
    protected boolean isValidTarget(LevelReader pLevel, BlockPos pPos) {
        return pLevel.getBlockState(pPos.above()).isAir() && pLevel.getBlockState(pPos).getFluidState().is(Fluids.WATER);
    }

    @Override
    public void stop() {
        Level level = this.fish.level();
        BlockPos fishPos = this.getMoveToTarget();
        TagKey<Block> blockTag = FishBreedingUtil.getRoeBlock(fish.getType());
        if (blockTag != null) {
            List<Block> roeBlocks = level.holderLookup(Registries.BLOCK)
                    .get(blockTag)
                    .map(tag -> tag.stream().map(Holder::value).collect(Collectors.toList()))
                    .orElse(List.of());

            if (!roeBlocks.isEmpty()) {
                Block block = roeBlocks.get(level.getRandom().nextInt(roeBlocks.size()));
                if (block instanceof RoeBlock roe) {
                    roe.setParentEntity(fish);
                    level.setBlockAndUpdate(fishPos, roe.defaultBlockState());
                }
            }
            FishBreedingUtil.getFishCap(fish).setPregnant(false, true);
        }
    }
}