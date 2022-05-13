
package net.mcreator.bettermoneychinese.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bettermoneychinese.item.OneAngleOfCoinItem;
import net.mcreator.bettermoneychinese.BetterMoneyChineseModElements;

@BetterMoneyChineseModElements.ModElement.Tag
public class MoneyItemGroup extends BetterMoneyChineseModElements.ModElement {
	public MoneyItemGroup(BetterMoneyChineseModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmoney") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OneAngleOfCoinItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
