package com.kalashnikov.factorial.tabs;

import com.kalashnikov.factorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MilitaryTab extends CreativeTabs{
	public MilitaryTab(String label) {
		super("militarytab");
		this.setBackgroundImageName("military.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.RIFLE_ADVANCED);
	}
}
