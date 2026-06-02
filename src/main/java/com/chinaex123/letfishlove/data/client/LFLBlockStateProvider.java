package com.chinaex123.letfishlove.data.client;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.blocks.RoeBlock;
import com.chinaex123.letfishlove.init.compat.tide.LFLTideItems;
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
        String blockName = name(block);
        String texturePath = getTexturePath(blockName);
        
        getVariantBuilder(block).forAllStates(state -> {
            ModelFile modelFile = models().withExistingParent(blockName, vanillaBlockLocation(FROGSPAWN_PARENT))
                    .texture("particle", modBlockLocation(texturePath))
                    .texture("texture", modBlockLocation(texturePath))
                    .renderType("translucent");
            return ConfiguredModel.builder().modelFile(modelFile).build();
        });
    }

    private String getTexturePath(String blockName) {
        String[] vanillaFish = {"cod", "salmon", "pufferfish", "tropical_fish"};
        for (String fish : vanillaFish) {
            if (blockName.startsWith(fish + "_roe_block")) {
                return blockName;
            }
        }
        return "compat/tide/" + blockName;
    }
}