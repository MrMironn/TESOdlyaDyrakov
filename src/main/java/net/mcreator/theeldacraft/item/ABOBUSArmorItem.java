
package net.mcreator.theeldacraft.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

public abstract class ABOBUSArmorItem extends ArmorItem {
	public ABOBUSArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 6;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{1, 2, 2, 1}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 4;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.AMETHYST_CLUSTER));
			}

			@Override
			public String getName() {
				return "abobus_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends ABOBUSArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "theeldacraft:textures/models/armor/abobus_layer_1.png";
		}
	}

	public static class Chestplate extends ABOBUSArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "theeldacraft:textures/models/armor/abobus_layer_1.png";
		}
	}

	public static class Leggings extends ABOBUSArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "theeldacraft:textures/models/armor/abobus_layer_2.png";
		}
	}

	public static class Boots extends ABOBUSArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "theeldacraft:textures/models/armor/abobus_layer_1.png";
		}
	}
}
