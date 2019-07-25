package com.kalashnikov.factorial.tabs;

import com.kalashnikov.factorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ProductionTab extends CreativeTabs{
	public ProductionTab(String label) {
		super("productiontab");
		this.setBackgroundImageName("production.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.BASIC_CIRCUIT);
	}
}
