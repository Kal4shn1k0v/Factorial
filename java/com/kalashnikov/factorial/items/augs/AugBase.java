package com.kalashnikov.factorial.items.augs;

import com.kalashnikov.factorial.Main;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class AugBase extends Item implements IHasModel{
	public AugBase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.productiontab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0,"inventory");
	}
}