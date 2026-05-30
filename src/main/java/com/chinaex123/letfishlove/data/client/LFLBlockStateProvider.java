package com.chinaex123.letfishlove.data.client;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.blocks.RoeBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.chinaex123.letfishlove.data.LFLDatagenUtil.*;

public class LFLBlockStateProvider extends BlockStateProvider {

    public LFLBlockStateProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, LetFishLoveMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        RoeBlock.getAllBlocks().forEach((this::roeBlock));
    }

    private void roeBlock(Block block) {
        getVariantBuilder(block).forAllStates(state -> {
            ModelFile modelFile = models().withExistingParent(name(block), vanillaBlockLocation(FROGSPAWN_PARENT))
                    .texture("particle", modBlockLocation(name(block))).texture("texture", modBlockLocation(name(block))).renderType("translucent");
            return ConfiguredModel.builder().modelFile(modelFile).build();
        });
    }
}
