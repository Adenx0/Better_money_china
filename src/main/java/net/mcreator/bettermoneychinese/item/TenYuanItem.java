
package net.mcreator.bettermoneychinese.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.bettermoneychinese.itemgroup.MoneyItemGroup;
import net.mcreator.bettermoneychinese.BetterMoneyChineseModElements;

@BetterMoneyChineseModElements.ModElement.Tag
public class TenYuanItem extends BetterMoneyChineseModElements.ModElement {
	@ObjectHolder("better_money_chinese:ten_yuan")
	public static final Item block = null;

	public TenYuanItem(BetterMoneyChineseModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoneyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("ten_yuan");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
