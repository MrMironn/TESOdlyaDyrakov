
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeldacraft.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.theeldacraft.TheeldacraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheeldacraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheeldacraftMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheeldacraftModItems.ABOBUS_ARMOR_HELMET.get());
			tabData.accept(TheeldacraftModItems.ABOBUS_ARMOR_CHESTPLATE.get());
			tabData.accept(TheeldacraftModItems.ABOBUS_ARMOR_LEGGINGS.get());
			tabData.accept(TheeldacraftModItems.ABOBUS_ARMOR_BOOTS.get());
		}
	}
}
