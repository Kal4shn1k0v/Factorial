package com.kalashnikov.factorial.tabs;

import com.kalashnikov.factorial.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ToolsTab extends CreativeTabs{
	public ToolsTab(String label) {
		super("toolstab");
		this.setBackgroundImageName("tools.png");
	}
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.MULTI_TOOL_STEEL_TOOL);
	}
}
