package com.chinaex123.letfishlove.init.compat.tide;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.blocks.RoeBlock;
import com.chinaex123.letfishlove.init.LFLProperties;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface LFLTideBlocks {
    DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LetFishLoveMod.MOD_ID);

    DeferredBlock<Block> TUNA_ROE_BLOCK = BLOCKS.register("tuna_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:tuna"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MACKEREL_ROE_BLOCK = BLOCKS.register("mackerel_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:mackerel"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SNOOK_ROE_BLOCK = BLOCKS.register("snook_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:snook"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ANGELFISH_ROE_BLOCK = BLOCKS.register("angelfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:angelfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MAHI_MAHI_ROE_BLOCK = BLOCKS.register("mahi_mahi_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:mahi_mahi"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SAILFISH_ROE_BLOCK = BLOCKS.register("sailfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:sailfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SWORDFISH_ROE_BLOCK = BLOCKS.register("swordfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:swordfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MANTA_RAY_ROE_BLOCK = BLOCKS.register("manta_ray_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:manta_ray"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> AQUATHORN_ROE_BLOCK = BLOCKS.register("aquathorn_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:aquathorn"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> RAINBOW_TROUT_ROE_BLOCK = BLOCKS.register("rainbow_trout_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:rainbow_trout"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BROOK_TROUT_ROE_BLOCK = BLOCKS.register("brook_trout_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:brook_trout"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> LARGEMOUTH_BASS_ROE_BLOCK = BLOCKS.register("largemouth_bass_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:largemouth_bass"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SMALLMOUTH_BASS_ROE_BLOCK = BLOCKS.register("smallmouth_bass_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:smallmouth_bass"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> WHITE_CRAPPIE_ROE_BLOCK = BLOCKS.register("white_crappie_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:white_crappie"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BLACK_CRAPPIE_ROE_BLOCK = BLOCKS.register("black_crappie_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:black_crappie"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> YELLOW_PERCH_ROE_BLOCK = BLOCKS.register("yellow_perch_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:yellow_perch"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CARP_ROE_BLOCK = BLOCKS.register("carp_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:carp"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> PIKE_ROE_BLOCK = BLOCKS.register("pike_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:pike"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> GUPPY_ROE_BLOCK = BLOCKS.register("guppy_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:guppy"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BLUEGILL_ROE_BLOCK = BLOCKS.register("bluegill_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:bluegill"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CATFISH_ROE_BLOCK = BLOCKS.register("catfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:catfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> WALLEYE_ROE_BLOCK = BLOCKS.register("walleye_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:walleye"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ARAPAIMA_ROE_BLOCK = BLOCKS.register("arapaima_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:arapaima"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MIRAGE_CATFISH_ROE_BLOCK = BLOCKS.register("mirage_catfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:mirage_catfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SAND_TIGER_SHARK_ROE_BLOCK = BLOCKS.register("sand_tiger_shark_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:sand_tiger_shark"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SLIMY_SALMON_ROE_BLOCK = BLOCKS.register("slimy_salmon_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:slimy_salmon"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> FROSTBITE_FLOUNDER_ROE_BLOCK = BLOCKS.register("frostbite_flounder_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:frostbite_flounder"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> STURGEON_ROE_BLOCK = BLOCKS.register("sturgeon_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:sturgeon"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BLOSSOM_BASS_ROE_BLOCK = BLOCKS.register("blossom_bass_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:blossom_bass"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SPORE_STALKER_ROE_BLOCK = BLOCKS.register("spore_stalker_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:spore_stalker"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MOONEYE_ROE_BLOCK = BLOCKS.register("mooneye_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:mooneye"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BULL_SHARK_ROE_BLOCK = BLOCKS.register("bull_shark_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:bull_shark"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> OCEAN_PERCH_ROE_BLOCK = BLOCKS.register("ocean_perch_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:ocean_perch"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> RED_SNAPPER_ROE_BLOCK = BLOCKS.register("red_snapper_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:red_snapper"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> FLOUNDER_ROE_BLOCK = BLOCKS.register("flounder_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:flounder"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ANCHOVY_ROE_BLOCK = BLOCKS.register("anchovy_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:anchovy"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DEVILS_HOLE_PUPFISH_ROE_BLOCK = BLOCKS.register("devils_hole_pupfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:devils_hole_pupfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MIDAS_FISH_ROE_BLOCK = BLOCKS.register("midas_fish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:midas_fish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> INCANDESCENT_LARVA_ROE_BLOCK = BLOCKS.register("incandescent_larva_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:incandescent_larva"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BEDROCK_BUG_ROE_BLOCK = BLOCKS.register("bedrock_bug_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:bedrock_bug"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SLEEPY_CARP_ROE_BLOCK = BLOCKS.register("sleepy_carp_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:sleepy_carp"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BLUE_NEONFISH_ROE_BLOCK = BLOCKS.register("blue_neonfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:blue_neonfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> JUDGMENT_FISH_ROE_BLOCK = BLOCKS.register("judgment_fish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:judgment_fish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DEEP_BLUE_ROE_BLOCK = BLOCKS.register("deep_blue_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:deep_blue"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> NEPHROSILU_ROE_BLOCK = BLOCKS.register("nephrosilu_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:nephrosilu"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> NEPTUNE_KOI_ROE_BLOCK = BLOCKS.register("neptune_koi_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:neptune_koi"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> PLUTO_SNAIL_ROE_BLOCK = BLOCKS.register("pluto_snail_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:pluto_snail"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SUN_EMBLEM_ROE_BLOCK = BLOCKS.register("sun_emblem_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:sun_emblem"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SATURN_CUTTLEFISH_ROE_BLOCK = BLOCKS.register("saturn_cuttlefish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:saturn_cuttlefish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MARSTILUS_ROE_BLOCK = BLOCKS.register("marstilus_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:marstilus"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> URANIAS_PISCES_ROE_BLOCK = BLOCKS.register("uranias_pisces_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:uranias_pisces"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> GREAT_WHITE_SHARK_ROE_BLOCK = BLOCKS.register("great_white_shark_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:great_white_shark"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SHOOTING_STARFISH_ROE_BLOCK = BLOCKS.register("shooting_starfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:shooting_starfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> COELACANTH_ROE_BLOCK = BLOCKS.register("coelacanth_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:coelacanth"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CAVE_EEL_ROE_BLOCK = BLOCKS.register("cave_eel_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:cave_eel"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CAVE_CRAWLER_ROE_BLOCK = BLOCKS.register("cave_crawler_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:cave_crawler"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DEEP_GROUPER_ROE_BLOCK = BLOCKS.register("deep_grouper_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:deep_grouper"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SHADOW_SNAPPER_ROE_BLOCK = BLOCKS.register("shadow_snapper_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:shadow_snapper"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> GLOWFISH_ROE_BLOCK = BLOCKS.register("glowfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:glowfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ANGLERFISH_ROE_BLOCK = BLOCKS.register("anglerfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:anglerfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ABYSS_ANGLER_ROE_BLOCK = BLOCKS.register("abyss_angler_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:abyss_angler"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> IRON_TETRA_ROE_BLOCK = BLOCKS.register("iron_tetra_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:iron_tetra"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> LAPIS_LANTERNFISH_ROE_BLOCK = BLOCKS.register("lapis_lanternfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:lapis_lanternfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CRYSTAL_SHRIMP_ROE_BLOCK = BLOCKS.register("crystal_shrimp_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:crystal_shrimp"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DRIPSTONE_DARTER_ROE_BLOCK = BLOCKS.register("dripstone_darter_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:dripstone_darter"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> LUMINESCENT_JELLYFISH_ROE_BLOCK = BLOCKS.register("luminescent_jellyfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:luminescent_jellyfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CRYSTALLINE_CARP_ROE_BLOCK = BLOCKS.register("crystalline_carp_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:crystalline_carp"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> GILDED_MINNOW_ROE_BLOCK = BLOCKS.register("gilded_minnow_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:gilded_minnow"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BEDROCK_TETRA_ROE_BLOCK = BLOCKS.register("bedrock_tetra_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:bedrock_tetra"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CHASM_EEL_ROE_BLOCK = BLOCKS.register("chasm_eel_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:chasm_eel"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ECHO_SNAPPER_ROE_BLOCK = BLOCKS.register("echo_snapper_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:echo_snapper"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> WINDBASS_ROE_BLOCK = BLOCKS.register("windbass_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:windbass"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SNATCHER_SQUID_ROE_BLOCK = BLOCKS.register("snatcher_squid_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:snatcher_squid"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> VOIDSEEKER_ROE_BLOCK = BLOCKS.register("voidseeker_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:voidseeker"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DRAGON_FISH_ROE_BLOCK = BLOCKS.register("dragon_fish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:dragon_fish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> VENGEANCE_ROE_BLOCK = BLOCKS.register("vengeance_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:vengeance"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> PENTAPUS_ROE_BLOCK = BLOCKS.register("pentapus_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:pentapus"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DARKNESS_EATER_ROE_BLOCK = BLOCKS.register("darkness_eater_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:darkness_eater"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SHADOW_SHARK_ROE_BLOCK = BLOCKS.register("shadow_shark_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:shadow_shark"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ALPHA_FISH_ROE_BLOCK = BLOCKS.register("alpha_fish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:alpha_fish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MAGMA_MACKEREL_ROE_BLOCK = BLOCKS.register("magma_mackerel_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:magma_mackerel"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> EMBER_KOI_ROE_BLOCK = BLOCKS.register("ember_koi_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:ember_koi"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ASH_PERCH_ROE_BLOCK = BLOCKS.register("ash_perch_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:ash_perch"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> OBSIDIAN_PIKE_ROE_BLOCK = BLOCKS.register("obsidian_pike_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:obsidian_pike"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> VOLCANO_TUNA_ROE_BLOCK = BLOCKS.register("volcano_tuna_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:volcano_tuna"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> INFERNO_GUPPY_ROE_BLOCK = BLOCKS.register("inferno_guppy_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:inferno_guppy"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> WARPED_GUPPY_ROE_BLOCK = BLOCKS.register("warped_guppy_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:warped_guppy"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CRIMSON_FANGJAW_ROE_BLOCK = BLOCKS.register("crimson_fangjaw_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:crimson_fangjaw"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> SOULSCALE_ROE_BLOCK = BLOCKS.register("soulscale_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:soulscale"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> WITHERFIN_ROE_BLOCK = BLOCKS.register("witherfin_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:witherfin"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> BLAZING_SWORDFISH_ROE_BLOCK = BLOCKS.register("blazing_swordfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:blazing_swordfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> PALE_CLUBFISH_ROE_BLOCK = BLOCKS.register("pale_clubfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:pale_clubfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> AMBER_ROCKFISH_ROE_BLOCK = BLOCKS.register("amber_rockfish_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:amber_rockfish"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ENDERFIN_ROE_BLOCK = BLOCKS.register("enderfin_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:enderfin"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> CHORUS_COD_ROE_BLOCK = BLOCKS.register("chorus_cod_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:chorus_cod"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ENDER_GLIDER_ROE_BLOCK = BLOCKS.register("ender_glider_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:ender_glider"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ENDERGAZER_ROE_BLOCK = BLOCKS.register("endergazer_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:endergazer"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> VIOLET_CARP_ROE_BLOCK = BLOCKS.register("violet_carp_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:violet_carp"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> RED_40_ROE_BLOCK = BLOCKS.register("red_40_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:red_40"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> DUTCHMAN_SOCK_ROE_BLOCK = BLOCKS.register("dutchman_sock_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:dutchman_sock"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> ELYTROUT_ROE_BLOCK = BLOCKS.register("elytrout_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:elytrout"), LFLProperties.roeBlockProperties()));
    DeferredBlock<Block> MANTYVERN_ROE_BLOCK = BLOCKS.register("mantyvern_roe_block", () -> new RoeBlock(() -> getTideEntityType("tide:mantyvern"), LFLProperties.roeBlockProperties()));

    static EntityType<?> getTideEntityType(String entityId) {
        return EntityType.byString(entityId).orElse(EntityType.COD);
    }

    String[] TIDE_FISH_IDS = {
            "tide:tuna", "tide:mackerel", "tide:snook", "tide:angelfish", "tide:mahi_mahi",
            "tide:sailfish", "tide:swordfish", "tide:manta_ray", "tide:aquathorn", "tide:rainbow_trout",
            "tide:brook_trout", "tide:largemouth_bass", "tide:smallmouth_bass", "tide:white_crappie", "tide:black_crappie",
            "tide:yellow_perch", "tide:carp", "tide:pike", "tide:guppy", "tide:bluegill",
            "tide:catfish", "tide:walleye", "tide:arapaima", "tide:mirage_catfish", "tide:sand_tiger_shark",
            "tide:slimy_salmon", "tide:frostbite_flounder", "tide:sturgeon", "tide:blossom_bass", "tide:spore_stalker",
            "tide:mooneye", "tide:bull_shark", "tide:ocean_perch", "tide:red_snapper", "tide:flounder",
            "tide:anchovy", "tide:devils_hole_pupfish", "tide:midas_fish", "tide:incandescent_larva", "tide:bedrock_bug",
            "tide:sleepy_carp", "tide:blue_neonfish", "tide:judgment_fish", "tide:deep_blue", "tide:nephrosilu",
            "tide:neptune_koi", "tide:pluto_snail", "tide:sun_emblem", "tide:saturn_cuttlefish", "tide:marstilus",
            "tide:uranias_pisces", "tide:great_white_shark", "tide:shooting_starfish", "tide:coelacanth", "tide:cave_eel",
            "tide:cave_crawler", "tide:deep_grouper", "tide:shadow_snapper", "tide:glowfish", "tide:anglerfish",
            "tide:abyss_angler", "tide:iron_tetra", "tide:lapis_lanternfish", "tide:crystal_shrimp", "tide:dripstone_darter",
            "tide:luminescent_jellyfish", "tide:crystalline_carp", "tide:gilded_minnow", "tide:bedrock_tetra", "tide:chasm_eel",
            "tide:echo_snapper", "tide:windbass", "tide:snatcher_squid", "tide:voidseeker", "tide:dragon_fish",
            "tide:vengeance", "tide:pentapus", "tide:darkness_eater", "tide:shadow_shark", "tide:alpha_fish",
            "tide:magma_mackerel", "tide:ember_koi", "tide:ash_perch", "tide:obsidian_pike", "tide:volcano_tuna",
            "tide:inferno_guppy", "tide:warped_guppy", "tide:crimson_fangjaw", "tide:soulscale", "tide:witherfin",
            "tide:blazing_swordfish", "tide:pale_clubfish", "tide:amber_rockfish", "tide:enderfin", "tide:chorus_cod",
            "tide:ender_glider", "tide:endergazer", "tide:violet_carp", "tide:red_40", "tide:dutchman_sock",
            "tide:elytrout", "tide:mantyvern"
    };
}