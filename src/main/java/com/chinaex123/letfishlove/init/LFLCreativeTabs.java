package com.chinaex123.letfishlove.init;

import com.chinaex123.letfishlove.LetFishLoveMod;
import com.chinaex123.letfishlove.init.compat.tide.LFLTideItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LFLCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LetFishLoveMod.MOD_ID);

    public static final Supplier<CreativeModeTab> LETFISHLOVE_TAB =
            CREATIVE_MODE_TAB.register("letfishlove_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(LFLItems.COD_ROE.get()))
                    .title(Component.translatable("itemGroup.letfishlove_tab"))
                    .displayItems((parameters, output) -> {

                        // ==================== 原版 ====================
                        output.accept(LFLItems.COD_ROE.get());
                        output.accept(LFLItems.PUFFERFISH_ROE.get());
                        output.accept(LFLItems.SALMON_ROE.get());
                        output.accept(LFLItems.TROPICAL_FISH_ROE.get());

                        if (ModList.get().isLoaded("tide")) {
                            output.accept(LFLTideItems.TUNA_ROE.get());
                            output.accept(LFLTideItems.MACKEREL_ROE.get());
                            output.accept(LFLTideItems.SNOOK_ROE.get());
                            output.accept(LFLTideItems.ANGELFISH_ROE.get());
                            output.accept(LFLTideItems.MAHI_MAHI_ROE.get());
                            output.accept(LFLTideItems.SAILFISH_ROE.get());
                            output.accept(LFLTideItems.SWORDFISH_ROE.get());
                            output.accept(LFLTideItems.MANTA_RAY_ROE.get());
                            output.accept(LFLTideItems.AQUATHORN_ROE.get());
                            output.accept(LFLTideItems.RAINBOW_TROUT_ROE.get());
                            output.accept(LFLTideItems.BROOK_TROUT_ROE.get());
                            output.accept(LFLTideItems.LARGEMOUTH_BASS_ROE.get());
                            output.accept(LFLTideItems.SMALLMOUTH_BASS_ROE.get());
                            output.accept(LFLTideItems.WHITE_CRAPPIE_ROE.get());
                            output.accept(LFLTideItems.BLACK_CRAPPIE_ROE.get());
                            output.accept(LFLTideItems.YELLOW_PERCH_ROE.get());
                            output.accept(LFLTideItems.CARP_ROE.get());
                            output.accept(LFLTideItems.PIKE_ROE.get());
                            output.accept(LFLTideItems.GUPPY_ROE.get());
                            output.accept(LFLTideItems.BLUEGILL_ROE.get());
                            output.accept(LFLTideItems.CATFISH_ROE.get());
                            output.accept(LFLTideItems.WALLEYE_ROE.get());
                            output.accept(LFLTideItems.ARAPAIMA_ROE.get());
                            output.accept(LFLTideItems.MIRAGE_CATFISH_ROE.get());
                            output.accept(LFLTideItems.SAND_TIGER_SHARK_ROE.get());
                            output.accept(LFLTideItems.SLIMY_SALMON_ROE.get());
                            output.accept(LFLTideItems.FROSTBITE_FLOUNDER_ROE.get());
                            output.accept(LFLTideItems.STURGEON_ROE.get());
                            output.accept(LFLTideItems.BLOSSOM_BASS_ROE.get());
                            output.accept(LFLTideItems.SPORE_STALKER_ROE.get());
                            output.accept(LFLTideItems.MOONEYE_ROE.get());
                            output.accept(LFLTideItems.BULL_SHARK_ROE.get());
                            output.accept(LFLTideItems.OCEAN_PERCH_ROE.get());
                            output.accept(LFLTideItems.RED_SNAPPER_ROE.get());
                            output.accept(LFLTideItems.FLOUNDER_ROE.get());
                            output.accept(LFLTideItems.ANCHOVY_ROE.get());
                            output.accept(LFLTideItems.DEVILS_HOLE_PUPFISH_ROE.get());
                            output.accept(LFLTideItems.MIDAS_FISH_ROE.get());
                            output.accept(LFLTideItems.INCANDESCENT_LARVA_ROE.get());
                            output.accept(LFLTideItems.BEDROCK_BUG_ROE.get());
                            output.accept(LFLTideItems.SLEEPY_CARP_ROE.get());
                            output.accept(LFLTideItems.BLUE_NEONFISH_ROE.get());
                            output.accept(LFLTideItems.JUDGMENT_FISH_ROE.get());
                            output.accept(LFLTideItems.DEEP_BLUE_ROE.get());
                            output.accept(LFLTideItems.NEPHROSILU_ROE.get());
                            output.accept(LFLTideItems.NEPTUNE_KOI_ROE.get());
                            output.accept(LFLTideItems.PLUTO_SNAIL_ROE.get());
                            output.accept(LFLTideItems.SUN_EMBLEM_ROE.get());
                            output.accept(LFLTideItems.SATURN_CUTTLEFISH_ROE.get());
                            output.accept(LFLTideItems.MARSTILUS_ROE.get());
                            output.accept(LFLTideItems.URANIAS_PISCES_ROE.get());
                            output.accept(LFLTideItems.GREAT_WHITE_SHARK_ROE.get());
                            output.accept(LFLTideItems.SHOOTING_STARFISH_ROE.get());
                            output.accept(LFLTideItems.COELACANTH_ROE.get());
                            output.accept(LFLTideItems.CAVE_EEL_ROE.get());
                            output.accept(LFLTideItems.CAVE_CRAWLER_ROE.get());
                            output.accept(LFLTideItems.DEEP_GROUPER_ROE.get());
                            output.accept(LFLTideItems.SHADOW_SNAPPER_ROE.get());
                            output.accept(LFLTideItems.GLOWFISH_ROE.get());
                            output.accept(LFLTideItems.ANGLERFISH_ROE.get());
                            output.accept(LFLTideItems.ABYSS_ANGLER_ROE.get());
                            output.accept(LFLTideItems.IRON_TETRA_ROE.get());
                            output.accept(LFLTideItems.LAPIS_LANTERNFISH_ROE.get());
                            output.accept(LFLTideItems.CRYSTAL_SHRIMP_ROE.get());
                            output.accept(LFLTideItems.DRIPSTONE_DARTER_ROE.get());
                            output.accept(LFLTideItems.LUMINESCENT_JELLYFISH_ROE.get());
                            output.accept(LFLTideItems.CRYSTALLINE_CARP_ROE.get());
                            output.accept(LFLTideItems.GILDED_MINNOW_ROE.get());
                            output.accept(LFLTideItems.BEDROCK_TETRA_ROE.get());
                            output.accept(LFLTideItems.CHASM_EEL_ROE.get());
                            output.accept(LFLTideItems.ECHO_SNAPPER_ROE.get());
                            output.accept(LFLTideItems.WINDBASS_ROE.get());
                            output.accept(LFLTideItems.SNATCHER_SQUID_ROE.get());
                            output.accept(LFLTideItems.VOIDSEEKER_ROE.get());
                            output.accept(LFLTideItems.DRAGON_FISH_ROE.get());
                            output.accept(LFLTideItems.VENGEANCE_ROE.get());
                            output.accept(LFLTideItems.PENTAPUS_ROE.get());
                            output.accept(LFLTideItems.DARKNESS_EATER_ROE.get());
                            output.accept(LFLTideItems.SHADOW_SHARK_ROE.get());
                            output.accept(LFLTideItems.ALPHA_FISH_ROE.get());
                            output.accept(LFLTideItems.MAGMA_MACKEREL_ROE.get());
                            output.accept(LFLTideItems.EMBER_KOI_ROE.get());
                            output.accept(LFLTideItems.ASH_PERCH_ROE.get());
                            output.accept(LFLTideItems.OBSIDIAN_PIKE_ROE.get());
                            output.accept(LFLTideItems.VOLCANO_TUNA_ROE.get());
                            output.accept(LFLTideItems.INFERNO_GUPPY_ROE.get());
                            output.accept(LFLTideItems.WARPED_GUPPY_ROE.get());
                            output.accept(LFLTideItems.CRIMSON_FANGJAW_ROE.get());
                            output.accept(LFLTideItems.SOULSCALE_ROE.get());
                            output.accept(LFLTideItems.WITHERFIN_ROE.get());
                            output.accept(LFLTideItems.BLAZING_SWORDFISH_ROE.get());
                            output.accept(LFLTideItems.PALE_CLUBFISH_ROE.get());
                            output.accept(LFLTideItems.AMBER_ROCKFISH_ROE.get());
                            output.accept(LFLTideItems.ENDERFIN_ROE.get());
                            output.accept(LFLTideItems.CHORUS_COD_ROE.get());
                            output.accept(LFLTideItems.ENDER_GLIDER_ROE.get());
                            output.accept(LFLTideItems.ENDERGAZER_ROE.get());
                            output.accept(LFLTideItems.VIOLET_CARP_ROE.get());
                            output.accept(LFLTideItems.RED_40_ROE.get());
                            output.accept(LFLTideItems.DUTCHMAN_SOCK_ROE.get());
                            output.accept(LFLTideItems.ELYTROUT_ROE.get());
                            output.accept(LFLTideItems.MANTYVERN_ROE.get());
                        }

                    })
                    .build());
}
