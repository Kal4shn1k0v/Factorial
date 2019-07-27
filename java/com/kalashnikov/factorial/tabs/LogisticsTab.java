package com.kalashnikov.factorial.tabs;

import com.kalashnikov.factorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class LogisticsTab extends CreativeTabs{
	public LogisticsTab(String label) {
		super("logistictab");
		this.setBackgroundImageName("logistic.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.BATTERY_CELL);
	}
}

