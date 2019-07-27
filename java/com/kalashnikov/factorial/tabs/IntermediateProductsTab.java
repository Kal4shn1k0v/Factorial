package com.kalashnikov.factorial.tabs;

import com.kalashnikov.factorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class IntermediateProductsTab extends CreativeTabs{
	public IntermediateProductsTab(String label) {
		super("intermediatetab");
		this.setBackgroundImageName("intermediate.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.BATTERY_CELL);
	}
}


//intermediate