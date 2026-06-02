package com.chinaex123.letfishlove.data.server.tags;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.init.LFLBlockTags;
import com.chinaex123.letfishlove.init.LFLItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class LFLItemTagsProvider extends ItemTagsProvider {
    public LFLItemTagsProvider(PackOutput generator, CompletableFuture<HolderLookup.Provider> pProvider,
                               CompletableFuture<TagsProvider.TagLookup<Block>> blockProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, pProvider, blockProvider, LetFishLoveMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        tag(LFLItemTags.COD).add(Items.BEETROOT);
        tag(LFLItemTags.SALMON).add(Items.SWEET_BERRIES);
        tag(LFLItemTags.PUFFERFISH).add(Items.GOLDEN_CARROT);
        tag(LFLItemTags.TROPICAL_FISH).add(Items.MELON_SLICE);

        // ========== 大鱼吃中鱼 ==========
        tag(LFLItemTags.GREAT_WHITE_SHARK).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.MANTA_RAY).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.DARKNESS_EATER).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.SHADOW_SHARK).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.MANTYVERN).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.SNATCHER_SQUID).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.DRAGON_FISH).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.ALPHA_FISH).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.COELACANTH).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.CHASM_EEL).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.CAVE_EEL).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.CAVE_CRAWLER).addTag(LFLItemTags.MEDIUM_FISH);
        tag(LFLItemTags.PENTAPUS).addTag(LFLItemTags.MEDIUM_FISH);

        // ========== 中鱼吃小鱼 ==========
        tag(LFLItemTags.RAINBOW_TROUT).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.LARGEMOUTH_BASS).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.WALLEYE).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.OCEAN_PERCH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.FLOUNDER).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.CATFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.MIRAGE_CATFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.CARP).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SLEEPY_CARP).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.PALE_CLUBFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.VOIDSEEKER).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.MACKEREL).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SNOOK).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.RED_SNAPPER).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.PIKE).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.DEEP_GROUPER).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.GLOWFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SLIMY_SALMON).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.CHORUS_COD).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.AQUATHORN).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.WINDBASS).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SATURN_CUTTLEFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.MARSTILUS).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.VOLCANO_TUNA).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.OBSIDIAN_PIKE).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.TUNA).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.MAHI_MAHI).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.ARAPAIMA).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.STURGEON).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SAND_TIGER_SHARK).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.BULL_SHARK).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SAILFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.SWORDFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.BLAZING_SWORDFISH).addTag(LFLItemTags.SMALL_FISH);
        tag(LFLItemTags.MAGMA_MACKEREL).addTag(LFLItemTags.SMALL_FISH);

        // ========== 小鱼吃晶虾 ==========
        tag(LFLItemTags.DEVILS_HOLE_PUPFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.INCANDESCENT_LARVA).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.IRON_TETRA).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BEDROCK_TETRA).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BEDROCK_BUG).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.GUPPY).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.INFERNO_GUPPY).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.WARPED_GUPPY).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.DUTCHMAN_SOCK).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.CRYSTAL_SHRIMP).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ANCHOVY).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.GILDED_MINNOW).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ANGELFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.RED_40).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.YELLOW_PERCH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BLUEGILL).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ASH_PERCH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ANGLERFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ABYSS_ANGLER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.WHITE_CRAPPIE).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.MOONEYE).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BLACK_CRAPPIE).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ENDERGAZER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.WITHERFIN).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.PLUTO_SNAIL).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.LAPIS_LANTERNFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ENDER_GLIDER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.VIOLET_CARP).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.MIDAS_FISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ECHO_SNAPPER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.DRIPSTONE_DARTER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.CRYSTALLINE_CARP).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.FROSTBITE_FLOUNDER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BROOK_TROUT).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.SMALLMOUTH_BASS).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BLOSSOM_BASS).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.SPORE_STALKER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.CRIMSON_FANGJAW).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.AMBER_ROCKFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ENDERFIN).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.ELYTROUT).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.SHADOW_SNAPPER).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.LUMINESCENT_JELLYFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.NEPTUNE_KOI).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.SUN_EMBLEM).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.DEEP_BLUE).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.JUDGMENT_FISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.VENGEANCE).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.BLUE_NEONFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.NEPHROSILU).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.URANIAS_PISCES).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.SHOOTING_STARFISH).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.SOULSCALE).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));
        tag(LFLItemTags.EMBER_KOI).addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"));

        // ========== 小鱼 (SMALL_FISH) ==========
        tag(LFLItemTags.SMALL_FISH)
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "devils_hole_pupfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "incandescent_larva"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "iron_tetra"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "bedrock_tetra"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "bedrock_bug"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "guppy"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "inferno_guppy"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "warped_guppy"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "dutchman_sock"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystal_shrimp"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "radiant_guppy"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "anchovy"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "gilded_minnow"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "angelfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "red_40"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "yellow_perch"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "bluegill"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "ash_perch"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "anglerfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "abyss_angler"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "white_crappie"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "mooneye"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "black_crappie"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "endergazer"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "witherfin"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "rock_stonefish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "pluto_snail"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "lapis_lanternfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "ender_glider"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "violet_carp"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "midas_fish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "echo_snapper"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "dripstone_darter"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crystalline_carp"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "frostbite_flounder"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "brook_trout"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "smallmouth_bass"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "blossom_bass"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "spore_stalker"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "crimson_fangjaw"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "amber_rockfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "enderfin"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "elytrout"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "shadow_snapper"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "glowfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "luminescent_jellyfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "neptune_koi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "sun_emblem"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "deep_blue"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "judgment_fish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "vengeance"));

        // ========== 中鱼 (MEDIUM_FISH) ==========
        tag(LFLItemTags.MEDIUM_FISH)
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "rainbow_trout"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "largemouth_bass"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "walleye"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "ocean_perch"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "flounder"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "catfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "mirage_catfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "zombie_fish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "flopper"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "carp"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "sleepy_carp"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "pale_clubfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "voidseeker"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "mackerel"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "snook"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "red_snapper"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "pike"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "magic_carp"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "deep_grouper"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "glowfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "slimy_salmon"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "chorus_cod"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "aquathorn"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "windbass"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "saturn_cuttlefish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "marstilus"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "volcano_tuna"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "obsidian_pike"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "tuna"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "mahi_mahi"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "arapaima"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "sturgeon"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "dog_fish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "sand_tiger_shark"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "bull_shark"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "sailfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "swordfish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "blazing_swordfish"));

        // ========== 大鱼 (LARGE_FISH) ==========
        tag(LFLItemTags.LARGE_FISH)
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "great_white_shark"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "manta_ray"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "darkness_eater"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "shadow_shark"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "mantyvern"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "snatcher_squid"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "dragon_fish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "alpha_fish"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "coelacanth"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "chasm_eel"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "cave_eel"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "cave_crawler"))
                .addOptional(ResourceLocation.fromNamespaceAndPath("tide", "pentapus"));

    }

}
