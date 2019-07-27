package com.kalashnikov.factorial.items.parts;

import com.kalashnikov.factorial.Main;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PartsBase extends Item implements IHasModel{
	public PartsBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.militarytab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0,"inventory");
	}
}