package com.kalashnikov.factorial.util.compat;

import com.kalashnikov.factorial.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat {
	public static void registerOres() {
		OreDictionary.registerOre("gemStone", ModItems.RAW_STONE);
		OreDictionary.registerOre("gemIron", ModItems.RAW_IRON);
		OreDictionary.registerOre("gemCopper", ModItems.RAW_COPPER);
		OreDictionary.registerOre("gemUranium", ModItems.RAW_URANIUM);
		OreDictionary.registerOre("gemSulfur", ModItems.RAW_SULFUR);
		OreDictionary.registerOre("oreSteel", ModItems.RAW_STEEL);
		
		OreDictionary.registerOre("plateIron", ModItems.IRON_PLATE);
		OreDictionary.registerOre("plateCopper", ModItems.COPPER_PLATE);
		OreDictionary.registerOre("plateSteel", ModItems.STEEL_PLATE);
		OreDictionary.registerOre("platePlastic", ModItems.PLASTIC_PLATE);
		OreDictionary.registerOre("wireCopper", ModItems.COPPER_WIRE);
		OreDictionary.registerOre("rodIron", ModItems.IRON_STICK);
	}
}
