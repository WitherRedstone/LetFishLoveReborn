package com.chinaex123.letfishlove.data.server.tags;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.blocks.RoeBlock;
import com.chinaex123.letfishlove.init.LFLBlockTags;
import com.chinaex123.letfishlove.init.LFLBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LFLBlockTagsProvider extends BlockTagsProvider {
    public LFLBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, LetFishLoveMod.MOD_ID, existingFileHelper);
    }

    @Override
    public void addTags(HolderLookup.@NotNull Provider pProvider) {
        RoeBlock.getAllBlocks().forEach(block -> tag(BlockTags.MINEABLE_WITH_SHOVEL).add(block));

        tag(LFLBlockTags.COD).add(LFLBlocks.COD_ROE_BLOCK.get());
        tag(LFLBlockTags.SALMON).add(LFLBlocks.SALMON_ROE_BLOCK.get());
        tag(LFLBlockTags.PUFFERFISH).add(LFLBlocks.PUFFERFISH_ROE_BLOCK.get());
        tag(LFLBlockTags.TROPICAL_FISH).add(LFLBlocks.TROPICAL_FISH_ROE_BLOCK.get());

        tag(LFLBlockTags.TUNA).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "tuna_roe_block"));
        tag(LFLBlockTags.MACKEREL).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "mackerel_roe_block"));
        tag(LFLBlockTags.SNOOK).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "snook_roe_block"));
        tag(LFLBlockTags.ANGELFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "angelfish_roe_block"));
        tag(LFLBlockTags.MAHI_MAHI).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "mahi_mahi_roe_block"));
        tag(LFLBlockTags.SAILFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "sailfish_roe_block"));
        tag(LFLBlockTags.SWORDFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "swordfish_roe_block"));
        tag(LFLBlockTags.MANTA_RAY).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "manta_ray_roe_block"));
        tag(LFLBlockTags.AQUATHORN).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "aquathorn_roe_block"));
        tag(LFLBlockTags.RAINBOW_TROUT).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "rainbow_trout_roe_block"));
        tag(LFLBlockTags.BROOK_TROUT).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "brook_trout_roe_block"));
        tag(LFLBlockTags.LARGEMOUTH_BASS).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "largemouth_bass_roe_block"));
        tag(LFLBlockTags.SMALLMOUTH_BASS).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "smallmouth_bass_roe_block"));
        tag(LFLBlockTags.WHITE_CRAPPIE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "white_crappie_roe_block"));
        tag(LFLBlockTags.BLACK_CRAPPIE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "black_crappie_roe_block"));
        tag(LFLBlockTags.YELLOW_PERCH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "yellow_perch_roe_block"));
        tag(LFLBlockTags.CARP).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "carp_roe_block"));
        tag(LFLBlockTags.PIKE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "pike_roe_block"));
        tag(LFLBlockTags.GUPPY).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "guppy_roe_block"));
        tag(LFLBlockTags.BLUEGILL).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "bluegill_roe_block"));
        tag(LFLBlockTags.CATFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "catfish_roe_block"));
        tag(LFLBlockTags.WALLEYE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "walleye_roe_block"));
        tag(LFLBlockTags.ARAPAIMA).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "arapaima_roe_block"));
        tag(LFLBlockTags.MIRAGE_CATFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "mirage_catfish_roe_block"));
        tag(LFLBlockTags.SAND_TIGER_SHARK).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "sand_tiger_shark_roe_block"));
        tag(LFLBlockTags.SLIMY_SALMON).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "slimy_salmon_roe_block"));
        tag(LFLBlockTags.FROSTBITE_FLOUNDER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "frostbite_flounder_roe_block"));
        tag(LFLBlockTags.STURGEON).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "sturgeon_roe_block"));
        tag(LFLBlockTags.BLOSSOM_BASS).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "blossom_bass_roe_block"));
        tag(LFLBlockTags.SPORE_STALKER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "spore_stalker_roe_block"));
        tag(LFLBlockTags.MOONEYE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "mooneye_roe_block"));
        tag(LFLBlockTags.BULL_SHARK).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "bull_shark_roe_block"));
        tag(LFLBlockTags.OCEAN_PERCH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "ocean_perch_roe_block"));
        tag(LFLBlockTags.RED_SNAPPER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "red_snapper_roe_block"));
        tag(LFLBlockTags.FLOUNDER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "flounder_roe_block"));
        tag(LFLBlockTags.ANCHOVY).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "anchovy_roe_block"));
        tag(LFLBlockTags.DEVILS_HOLE_PUPFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "devils_hole_pupfish_roe_block"));
        tag(LFLBlockTags.MIDAS_FISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "midas_fish_roe_block"));
        tag(LFLBlockTags.INCANDESCENT_LARVA).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "incandescent_larva_roe_block"));
        tag(LFLBlockTags.BEDROCK_BUG).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "bedrock_bug_roe_block"));
        tag(LFLBlockTags.SLEEPY_CARP).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "sleepy_carp_roe_block"));
        tag(LFLBlockTags.BLUE_NEONFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "blue_neonfish_roe_block"));
        tag(LFLBlockTags.JUDGMENT_FISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "judgment_fish_roe_block"));
        tag(LFLBlockTags.DEEP_BLUE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "deep_blue_roe_block"));
        tag(LFLBlockTags.NEPHROSILU).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "nephrosilu_roe_block"));
        tag(LFLBlockTags.NEPTUNE_KOI).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "neptune_koi_roe_block"));
        tag(LFLBlockTags.PLUTO_SNAIL).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "pluto_snail_roe_block"));
        tag(LFLBlockTags.SUN_EMBLEM).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "sun_emblem_roe_block"));
        tag(LFLBlockTags.SATURN_CUTTLEFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "saturn_cuttlefish_roe_block"));
        tag(LFLBlockTags.MARSTILUS).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "marstilus_roe_block"));
        tag(LFLBlockTags.URANIAS_PISCES).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "uranias_pisces_roe_block"));
        tag(LFLBlockTags.GREAT_WHITE_SHARK).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "great_white_shark_roe_block"));
        tag(LFLBlockTags.SHOOTING_STARFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "shooting_starfish_roe_block"));
        tag(LFLBlockTags.COELACANTH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "coelacanth_roe_block"));
        tag(LFLBlockTags.CAVE_EEL).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "cave_eel_roe_block"));
        tag(LFLBlockTags.CAVE_CRAWLER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "cave_crawler_roe_block"));
        tag(LFLBlockTags.DEEP_GROUPER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "deep_grouper_roe_block"));
        tag(LFLBlockTags.SHADOW_SNAPPER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "shadow_snapper_roe_block"));
        tag(LFLBlockTags.GLOWFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "glowfish_roe_block"));
        tag(LFLBlockTags.ANGLERFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "anglerfish_roe_block"));
        tag(LFLBlockTags.ABYSS_ANGLER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "abyss_angler_roe_block"));
        tag(LFLBlockTags.IRON_TETRA).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "iron_tetra_roe_block"));
        tag(LFLBlockTags.LAPIS_LANTERNFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "lapis_lanternfish_roe_block"));
        tag(LFLBlockTags.CRYSTAL_SHRIMP).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "crystal_shrimp_roe_block"));
        tag(LFLBlockTags.DRIPSTONE_DARTER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "dripstone_darter_roe_block"));
        tag(LFLBlockTags.LUMINESCENT_JELLYFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "luminescent_jellyfish_roe_block"));
        tag(LFLBlockTags.CRYSTALLINE_CARP).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "crystalline_carp_roe_block"));
        tag(LFLBlockTags.GILDED_MINNOW).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "gilded_minnow_roe_block"));
        tag(LFLBlockTags.BEDROCK_TETRA).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "bedrock_tetra_roe_block"));
        tag(LFLBlockTags.CHASM_EEL).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "chasm_eel_roe_block"));
        tag(LFLBlockTags.ECHO_SNAPPER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "echo_snapper_roe_block"));
        tag(LFLBlockTags.WINDBASS).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "windbass_roe_block"));
        tag(LFLBlockTags.SNATCHER_SQUID).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "snatcher_squid_roe_block"));
        tag(LFLBlockTags.VOIDSEEKER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "voidseeker_roe_block"));
        tag(LFLBlockTags.DRAGON_FISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "dragon_fish_roe_block"));
        tag(LFLBlockTags.VENGEANCE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "vengeance_roe_block"));
        tag(LFLBlockTags.PENTAPUS).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "pentapus_roe_block"));
        tag(LFLBlockTags.DARKNESS_EATER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "darkness_eater_roe_block"));
        tag(LFLBlockTags.SHADOW_SHARK).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "shadow_shark_roe_block"));
        tag(LFLBlockTags.ALPHA_FISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "alpha_fish_roe_block"));
        tag(LFLBlockTags.MAGMA_MACKEREL).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "magma_mackerel_roe_block"));
        tag(LFLBlockTags.EMBER_KOI).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "ember_koi_roe_block"));
        tag(LFLBlockTags.ASH_PERCH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "ash_perch_roe_block"));
        tag(LFLBlockTags.OBSIDIAN_PIKE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "obsidian_pike_roe_block"));
        tag(LFLBlockTags.VOLCANO_TUNA).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "volcano_tuna_roe_block"));
        tag(LFLBlockTags.INFERNO_GUPPY).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "inferno_guppy_roe_block"));
        tag(LFLBlockTags.WARPED_GUPPY).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "warped_guppy_roe_block"));
        tag(LFLBlockTags.CRIMSON_FANGJAW).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "crimson_fangjaw_roe_block"));
        tag(LFLBlockTags.SOULSCALE).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "soulscale_roe_block"));
        tag(LFLBlockTags.WITHERFIN).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "witherfin_roe_block"));
        tag(LFLBlockTags.BLAZING_SWORDFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "blazing_swordfish_roe_block"));
        tag(LFLBlockTags.PALE_CLUBFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "pale_clubfish_roe_block"));
        tag(LFLBlockTags.AMBER_ROCKFISH).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "amber_rockfish_roe_block"));
        tag(LFLBlockTags.ENDERFIN).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "enderfin_roe_block"));
        tag(LFLBlockTags.CHORUS_COD).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "chorus_cod_roe_block"));
        tag(LFLBlockTags.ENDER_GLIDER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "ender_glider_roe_block"));
        tag(LFLBlockTags.ENDERGAZER).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "endergazer_roe_block"));
        tag(LFLBlockTags.VIOLET_CARP).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "violet_carp_roe_block"));
        tag(LFLBlockTags.RED_40).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "red_40_roe_block"));
        tag(LFLBlockTags.DUTCHMAN_SOCK).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "dutchman_sock_roe_block"));
        tag(LFLBlockTags.ELYTROUT).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "elytrout_roe_block"));
        tag(LFLBlockTags.MANTYVERN).addOptional(ResourceLocation.fromNamespaceAndPath("letfishlove", "mantyvern_roe_block"));
    }

}
