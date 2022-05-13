
package net.mcreator.bettermoneychinese.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.bettermoneychinese.itemgroup.MoneyItemGroup;
import net.mcreator.bettermoneychinese.BetterMoneyChineseModElements;

import java.util.List;

@BetterMoneyChineseModElements.ModElement.Tag
public class OldOneYuanBanknotesItem extends BetterMoneyChineseModElements.ModElement {
	@ObjectHolder("better_money_chinese:old_one_yuan_banknotes")
	public static final Item block = null;

	public OldOneYuanBanknotesItem(BetterMoneyChineseModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MoneyItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("old_one_yuan_banknotes");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\u65B0\u7248\u4E00\u5143\u7EB8\u5E01\u6CA1\u627E\u5230"));
			list.add(new StringTextComponent("\u5C31\u5148\u7528\u8FD9\u4E2A\u5427"));
		}
	}
}
