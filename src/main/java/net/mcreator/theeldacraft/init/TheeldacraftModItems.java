
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theeldacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.theeldacraft.item.ABOBUSArmorItem;
import net.mcreator.theeldacraft.TheeldacraftMod;

public class TheeldacraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheeldacraftMod.MODID);
	public static final RegistryObject<Item> ABOBUS_ARMOR_HELMET = REGISTRY.register("abobus_armor_helmet", () -> new ABOBUSArmorItem.Helmet());
	public static final RegistryObject<Item> ABOBUS_ARMOR_CHESTPLATE = REGISTRY.register("abobus_armor_chestplate", () -> new ABOBUSArmorItem.Chestplate());
	public static final RegistryObject<Item> ABOBUS_ARMOR_LEGGINGS = REGISTRY.register("abobus_armor_leggings", () -> new ABOBUSArmorItem.Leggings());
	public static final RegistryObject<Item> ABOBUS_ARMOR_BOOTS = REGISTRY.register("abobus_armor_boots", () -> new ABOBUSArmorItem.Boots());
	// Start of user code block custom items
	// End of user code block custom items
}
