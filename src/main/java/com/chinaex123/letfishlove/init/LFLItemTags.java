package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface LFLItemTags {
    TagKey<Item> COD = mcFish("cod");
    TagKey<Item> SALMON = mcFish("salmon");
    TagKey<Item> PUFFERFISH = mcFish("pufferfish");
    TagKey<Item> TROPICAL_FISH = mcFish("tropical_fish");

    TagKey<Item> TUNA = tideFish("tuna");
    TagKey<Item> MACKEREL = tideFish("mackerel");
    TagKey<Item> SNOOK = tideFish("snook");
    TagKey<Item> ANGELFISH = tideFish("angelfish");
    TagKey<Item> MAHI_MAHI = tideFish("mahi_mahi");
    TagKey<Item> SAILFISH = tideFish("sailfish");
    TagKey<Item> SWORDFISH = tideFish("swordfish");
    TagKey<Item> MANTA_RAY = tideFish("manta_ray");
    TagKey<Item> AQUATHORN = tideFish("aquathorn");
    TagKey<Item> RAINBOW_TROUT = tideFish("rainbow_trout");
    TagKey<Item> BROOK_TROUT = tideFish("brook_trout");
    TagKey<Item> LARGEMOUTH_BASS = tideFish("largemouth_bass");
    TagKey<Item> SMALLMOUTH_BASS = tideFish("smallmouth_bass");
    TagKey<Item> WHITE_CRAPPIE = tideFish("white_crappie");
    TagKey<Item> BLACK_CRAPPIE = tideFish("black_crappie");
    TagKey<Item> YELLOW_PERCH = tideFish("yellow_perch");
    TagKey<Item> CARP = tideFish("carp");
    TagKey<Item> PIKE = tideFish("pike");
    TagKey<Item> GUPPY = tideFish("guppy");
    TagKey<Item> BLUEGILL = tideFish("bluegill");
    TagKey<Item> CATFISH = tideFish("catfish");
    TagKey<Item> WALLEYE = tideFish("walleye");
    TagKey<Item> ARAPAIMA = tideFish("arapaima");
    TagKey<Item> MIRAGE_CATFISH = tideFish("mirage_catfish");
    TagKey<Item> SAND_TIGER_SHARK = tideFish("sand_tiger_shark");
    TagKey<Item> SLIMY_SALMON = tideFish("slimy_salmon");
    TagKey<Item> FROSTBITE_FLOUNDER = tideFish("frostbite_flounder");
    TagKey<Item> STURGEON = tideFish("sturgeon");
    TagKey<Item> BLOSSOM_BASS = tideFish("blossom_bass");
    TagKey<Item> SPORE_STALKER = tideFish("spore_stalker");
    TagKey<Item> MOONEYE = tideFish("mooneye");
    TagKey<Item> BULL_SHARK = tideFish("bull_shark");
    TagKey<Item> OCEAN_PERCH = tideFish("ocean_perch");
    TagKey<Item> RED_SNAPPER = tideFish("red_snapper");
    TagKey<Item> FLOUNDER = tideFish("flounder");
    TagKey<Item> ANCHOVY = tideFish("anchovy");
    TagKey<Item> DEVILS_HOLE_PUPFISH = tideFish("devils_hole_pupfish");
    TagKey<Item> MIDAS_FISH = tideFish("midas_fish");
    TagKey<Item> INCANDESCENT_LARVA = tideFish("incandescent_larva");
    TagKey<Item> BEDROCK_BUG = tideFish("bedrock_bug");
    TagKey<Item> SLEEPY_CARP = tideFish("sleepy_carp");
    TagKey<Item> BLUE_NEONFISH = tideFish("blue_neonfish");
    TagKey<Item> JUDGMENT_FISH = tideFish("judgment_fish");
    TagKey<Item> DEEP_BLUE = tideFish("deep_blue");
    TagKey<Item> NEPHROSILU = tideFish("nephrosilu");
    TagKey<Item> NEPTUNE_KOI = tideFish("neptune_koi");
    TagKey<Item> PLUTO_SNAIL = tideFish("pluto_snail");
    TagKey<Item> SUN_EMBLEM = tideFish("sun_emblem");
    TagKey<Item> SATURN_CUTTLEFISH = tideFish("saturn_cuttlefish");
    TagKey<Item> MARSTILUS = tideFish("marstilus");
    TagKey<Item> URANIAS_PISCES = tideFish("uranias_pisces");
    TagKey<Item> GREAT_WHITE_SHARK = tideFish("great_white_shark");
    TagKey<Item> SHOOTING_STARFISH = tideFish("shooting_starfish");
    TagKey<Item> COELACANTH = tideFish("coelacanth");
    TagKey<Item> CAVE_EEL = tideFish("cave_eel");
    TagKey<Item> CAVE_CRAWLER = tideFish("cave_crawler");
    TagKey<Item> DEEP_GROUPER = tideFish("deep_grouper");
    TagKey<Item> SHADOW_SNAPPER = tideFish("shadow_snapper");
    TagKey<Item> GLOWFISH = tideFish("glowfish");
    TagKey<Item> ANGLERFISH = tideFish("anglerfish");
    TagKey<Item> ABYSS_ANGLER = tideFish("abyss_angler");
    TagKey<Item> IRON_TETRA = tideFish("iron_tetra");
    TagKey<Item> LAPIS_LANTERNFISH = tideFish("lapis_lanternfish");
    TagKey<Item> CRYSTAL_SHRIMP = tideFish("crystal_shrimp");
    TagKey<Item> DRIPSTONE_DARTER = tideFish("dripstone_darter");
    TagKey<Item> LUMINESCENT_JELLYFISH = tideFish("luminescent_jellyfish");
    TagKey<Item> CRYSTALLINE_CARP = tideFish("crystalline_carp");
    TagKey<Item> GILDED_MINNOW = tideFish("gilded_minnow");
    TagKey<Item> BEDROCK_TETRA = tideFish("bedrock_tetra");
    TagKey<Item> CHASM_EEL = tideFish("chasm_eel");
    TagKey<Item> ECHO_SNAPPER = tideFish("echo_snapper");
    TagKey<Item> WINDBASS = tideFish("windbass");
    TagKey<Item> SNATCHER_SQUID = tideFish("snatcher_squid");
    TagKey<Item> VOIDSEEKER = tideFish("voidseeker");
    TagKey<Item> DRAGON_FISH = tideFish("dragon_fish");
    TagKey<Item> VENGEANCE = tideFish("vengeance");
    TagKey<Item> PENTAPUS = tideFish("pentapus");
    TagKey<Item> DARKNESS_EATER = tideFish("darkness_eater");
    TagKey<Item> SHADOW_SHARK = tideFish("shadow_shark");
    TagKey<Item> ALPHA_FISH = tideFish("alpha_fish");
    TagKey<Item> MAGMA_MACKEREL = tideFish("magma_mackerel");
    TagKey<Item> EMBER_KOI = tideFish("ember_koi");
    TagKey<Item> ASH_PERCH = tideFish("ash_perch");
    TagKey<Item> OBSIDIAN_PIKE = tideFish("obsidian_pike");
    TagKey<Item> VOLCANO_TUNA = tideFish("volcano_tuna");
    TagKey<Item> INFERNO_GUPPY = tideFish("inferno_guppy");
    TagKey<Item> WARPED_GUPPY = tideFish("warped_guppy");
    TagKey<Item> CRIMSON_FANGJAW = tideFish("crimson_fangjaw");
    TagKey<Item> SOULSCALE = tideFish("soulscale");
    TagKey<Item> WITHERFIN = tideFish("witherfin");
    TagKey<Item> BLAZING_SWORDFISH = tideFish("blazing_swordfish");
    TagKey<Item> PALE_CLUBFISH = tideFish("pale_clubfish");
    TagKey<Item> AMBER_ROCKFISH = tideFish("amber_rockfish");
    TagKey<Item> ENDERFIN = tideFish("enderfin");
    TagKey<Item> CHORUS_COD = tideFish("chorus_cod");
    TagKey<Item> ENDER_GLIDER = tideFish("ender_glider");
    TagKey<Item> ENDERGAZER = tideFish("endergazer");
    TagKey<Item> VIOLET_CARP = tideFish("violet_carp");
    TagKey<Item> RED_40 = tideFish("red_40");
    TagKey<Item> DUTCHMAN_SOCK = tideFish("dutchman_sock");
    TagKey<Item> ELYTROUT = tideFish("elytrout");
    TagKey<Item> MANTYVERN = tideFish("mantyvern");

    TagKey<Item> SMALL_FISH = tideFish("small_fish");
    TagKey<Item> MEDIUM_FISH = tideFish("medium_fish");
    TagKey<Item> LARGE_FISH = tideFish("large_fish");

    static TagKey<Item> mcFish(String fishName) {
        return TagKey.create(Registries.ITEM, LetFishLoveMod.modPrefix("fish_food/minecraft/" + fishName));
    }

    static TagKey<Item> tideFish(String fishName) {
        return TagKey.create(Registries.ITEM, LetFishLoveMod.modPrefix("fish_food/tide/" + fishName));
    }
}
