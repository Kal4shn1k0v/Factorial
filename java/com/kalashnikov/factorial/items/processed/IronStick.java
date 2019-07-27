package com.kalashnikov.factorial.items.processed;

import com.kalashnikov.factorial.Main;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.IHasModel;

import net.minecraft.item.Item;

public class IronStick extends Item implements IHasModel{
	public IronStick(String name) {
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