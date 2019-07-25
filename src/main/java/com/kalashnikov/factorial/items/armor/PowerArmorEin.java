package com.kalashnikov.factorial.items.armor;

import com.kalashnikov.factorial.Main;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class PowerArmorEin extends ItemArmor implements IHasModel{
	public PowerArmorEin(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
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
