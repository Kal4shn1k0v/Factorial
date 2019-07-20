package com.kalashnikov.factorial.init;

import java.util.ArrayList;
import java.util.List;
import com.kalashnikov.factorial.items.ItemBase;
import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item IRON_PLATE = new ItemBase("iron_plate");
	public static final Item COPPER_PLATE = new ItemBase("copper_plate");
}
