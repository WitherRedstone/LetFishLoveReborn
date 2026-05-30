//package com.chinaex123.letfishlove.client;
//
//import com.chinaex123.letfishlove.LetFishLoveMod;
//import com.chinaex123.letfishlove.init.LFLBlocks;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.world.item.*;
//import net.neoforged.api.distmarker.Dist;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.common.EventBusSubscriber;
//import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
//
//@EventBusSubscriber(modid = LetFishLoveMod.MOD_ID, value = Dist.CLIENT)
//public class ClientSetup {
//
//    @SubscribeEvent
//    public static void buildTabContents(BuildCreativeModeTabContentsEvent event) {
//        ResourceKey<CreativeModeTab> tabKey = event.getTabKey();
//        if (tabKey == CreativeModeTabs.NATURAL_BLOCKS) {
//            ItemStack frogspawnStack = new ItemStack(Items.FROGSPAWN);
//
//            LFLBlocks.BLOCKS.getEntries().forEach(blockRegistryObject -> {
//                ItemStack blockStack = new ItemStack(blockRegistryObject.value().asItem());
//                event.insertAfter(frogspawnStack, blockStack, CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
//            });
//        }
//    }
//}
