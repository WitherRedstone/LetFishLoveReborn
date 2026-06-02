package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public interface LFLBlockTags {
    TagKey<Block> COD = mcFish("cod");
    TagKey<Block> SALMON = mcFish("salmon");
    TagKey<Block> PUFFERFISH = mcFish("pufferfish");
    TagKey<Block> TROPICAL_FISH = mcFish("tropical_fish");

    TagKey<Block> TUNA = tideFish("tuna");
    TagKey<Block> MACKEREL = tideFish("mackerel");
    TagKey<Block> SNOOK = tideFish("snook");
    TagKey<Block> ANGELFISH = tideFish("angelfish");
    TagKey<Block> MAHI_MAHI = tideFish("mahi_mahi");
    TagKey<Block> SAILFISH = tideFish("sailfish");
    TagKey<Block> SWORDFISH = tideFish("swordfish");
    TagKey<Block> MANTA_RAY = tideFish("manta_ray");
    TagKey<Block> AQUATHORN = tideFish("aquathorn");
    TagKey<Block> RAINBOW_TROUT = tideFish("rainbow_trout");
    TagKey<Block> BROOK_TROUT = tideFish("brook_trout");
    TagKey<Block> LARGEMOUTH_BASS = tideFish("largemouth_bass");
    TagKey<Block> SMALLMOUTH_BASS = tideFish("smallmouth_bass");
    TagKey<Block> WHITE_CRAPPIE = tideFish("white_crappie");
    TagKey<Block> BLACK_CRAPPIE = tideFish("black_crappie");
    TagKey<Block> YELLOW_PERCH = tideFish("yellow_perch");
    TagKey<Block> CARP = tideFish("carp");
    TagKey<Block> PIKE = tideFish("pike");
    TagKey<Block> GUPPY = tideFish("guppy");
    TagKey<Block> BLUEGILL = tideFish("bluegill");
    TagKey<Block> CATFISH = tideFish("catfish");
    TagKey<Block> WALLEYE = tideFish("walleye");
    TagKey<Block> ARAPAIMA = tideFish("arapaima");
    TagKey<Block> MIRAGE_CATFISH = tideFish("mirage_catfish");
    TagKey<Block> SAND_TIGER_SHARK = tideFish("sand_tiger_shark");
    TagKey<Block> SLIMY_SALMON = tideFish("slimy_salmon");
    TagKey<Block> FROSTBITE_FLOUNDER = tideFish("frostbite_flounder");
    TagKey<Block> STURGEON = tideFish("sturgeon");
    TagKey<Block> BLOSSOM_BASS = tideFish("blossom_bass");
    TagKey<Block> SPORE_STALKER = tideFish("spore_stalker");
    TagKey<Block> MOONEYE = tideFish("mooneye");
    TagKey<Block> BULL_SHARK = tideFish("bull_shark");
    TagKey<Block> OCEAN_PERCH = tideFish("ocean_perch");
    TagKey<Block> RED_SNAPPER = tideFish("red_snapper");
    TagKey<Block> FLOUNDER = tideFish("flounder");
    TagKey<Block> ANCHOVY = tideFish("anchovy");
    TagKey<Block> DEVILS_HOLE_PUPFISH = tideFish("devils_hole_pupfish");
    TagKey<Block> MIDAS_FISH = tideFish("midas_fish");
    TagKey<Block> INCANDESCENT_LARVA = tideFish("incandescent_larva");
    TagKey<Block> BEDROCK_BUG = tideFish("bedrock_bug");
    TagKey<Block> SLEEPY_CARP = tideFish("sleepy_carp");
    TagKey<Block> BLUE_NEONFISH = tideFish("blue_neonfish");
    TagKey<Block> JUDGMENT_FISH = tideFish("judgment_fish");
    TagKey<Block> DEEP_BLUE = tideFish("deep_blue");
    TagKey<Block> NEPHROSILU = tideFish("nephrosilu");
    TagKey<Block> NEPTUNE_KOI = tideFish("neptune_koi");
    TagKey<Block> PLUTO_SNAIL = tideFish("pluto_snail");
    TagKey<Block> SUN_EMBLEM = tideFish("sun_emblem");
    TagKey<Block> SATURN_CUTTLEFISH = tideFish("saturn_cuttlefish");
    TagKey<Block> MARSTILUS = tideFish("marstilus");
    TagKey<Block> URANIAS_PISCES = tideFish("uranias_pisces");
    TagKey<Block> GREAT_WHITE_SHARK = tideFish("great_white_shark");
    TagKey<Block> SHOOTING_STARFISH = tideFish("shooting_starfish");
    TagKey<Block> COELACANTH = tideFish("coelacanth");
    TagKey<Block> CAVE_EEL = tideFish("cave_eel");
    TagKey<Block> CAVE_CRAWLER = tideFish("cave_crawler");
    TagKey<Block> DEEP_GROUPER = tideFish("deep_grouper");
    TagKey<Block> SHADOW_SNAPPER = tideFish("shadow_snapper");
    TagKey<Block> GLOWFISH = tideFish("glowfish");
    TagKey<Block> ANGLERFISH = tideFish("anglerfish");
    TagKey<Block> ABYSS_ANGLER = tideFish("abyss_angler");
    TagKey<Block> IRON_TETRA = tideFish("iron_tetra");
    TagKey<Block> LAPIS_LANTERNFISH = tideFish("lapis_lanternfish");
    TagKey<Block> CRYSTAL_SHRIMP = tideFish("crystal_shrimp");
    TagKey<Block> DRIPSTONE_DARTER = tideFish("dripstone_darter");
    TagKey<Block> LUMINESCENT_JELLYFISH = tideFish("luminescent_jellyfish");
    TagKey<Block> CRYSTALLINE_CARP = tideFish("crystalline_carp");
    TagKey<Block> GILDED_MINNOW = tideFish("gilded_minnow");
    TagKey<Block> BEDROCK_TETRA = tideFish("bedrock_tetra");
    TagKey<Block> CHASM_EEL = tideFish("chasm_eel");
    TagKey<Block> ECHO_SNAPPER = tideFish("echo_snapper");
    TagKey<Block> WINDBASS = tideFish("windbass");
    TagKey<Block> SNATCHER_SQUID = tideFish("snatcher_squid");
    TagKey<Block> VOIDSEEKER = tideFish("voidseeker");
    TagKey<Block> DRAGON_FISH = tideFish("dragon_fish");
    TagKey<Block> VENGEANCE = tideFish("vengeance");
    TagKey<Block> PENTAPUS = tideFish("pentapus");
    TagKey<Block> DARKNESS_EATER = tideFish("darkness_eater");
    TagKey<Block> SHADOW_SHARK = tideFish("shadow_shark");
    TagKey<Block> ALPHA_FISH = tideFish("alpha_fish");
    TagKey<Block> MAGMA_MACKEREL = tideFish("magma_mackerel");
    TagKey<Block> EMBER_KOI = tideFish("ember_koi");
    TagKey<Block> ASH_PERCH = tideFish("ash_perch");
    TagKey<Block> OBSIDIAN_PIKE = tideFish("obsidian_pike");
    TagKey<Block> VOLCANO_TUNA = tideFish("volcano_tuna");
    TagKey<Block> INFERNO_GUPPY = tideFish("inferno_guppy");
    TagKey<Block> WARPED_GUPPY = tideFish("warped_guppy");
    TagKey<Block> CRIMSON_FANGJAW = tideFish("crimson_fangjaw");
    TagKey<Block> SOULSCALE = tideFish("soulscale");
    TagKey<Block> WITHERFIN = tideFish("witherfin");
    TagKey<Block> BLAZING_SWORDFISH = tideFish("blazing_swordfish");
    TagKey<Block> PALE_CLUBFISH = tideFish("pale_clubfish");
    TagKey<Block> AMBER_ROCKFISH = tideFish("amber_rockfish");
    TagKey<Block> ENDERFIN = tideFish("enderfin");
    TagKey<Block> CHORUS_COD = tideFish("chorus_cod");
    TagKey<Block> ENDER_GLIDER = tideFish("ender_glider");
    TagKey<Block> ENDERGAZER = tideFish("endergazer");
    TagKey<Block> VIOLET_CARP = tideFish("violet_carp");
    TagKey<Block> RED_40 = tideFish("red_40");
    TagKey<Block> DUTCHMAN_SOCK = tideFish("dutchman_sock");
    TagKey<Block> ELYTROUT = tideFish("elytrout");
    TagKey<Block> MANTYVERN = tideFish("mantyvern");

    static TagKey<Block> mcFish(String fishName) {
        return TagKey.create(Registries.BLOCK, LetFishLoveMod.modPrefix("fish_roe/minecraft/" + fishName));
    }

    static TagKey<Block> tideFish(String fishName) {
        return TagKey.create(Registries.BLOCK, LetFishLoveMod.modPrefix("fish_roe/tide/" + fishName));
    }

}
