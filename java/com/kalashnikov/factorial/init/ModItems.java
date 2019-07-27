package com.kalashnikov.factorial.init;

import java.util.ArrayList;
import java.util.List;

import com.kalashnikov.factorial.items.ItemBase;
import com.kalashnikov.factorial.items.armor.PowerArmorEin;
import com.kalashnikov.factorial.items.augs.AugBase;
import com.kalashnikov.factorial.items.electronics.ElecBase;
import com.kalashnikov.factorial.items.military.MilBase;
import com.kalashnikov.factorial.items.parts.PartsBase;
import com.kalashnikov.factorial.items.processed.IronStick;
import com.kalashnikov.factorial.items.processed.ProcessedBase;
import com.kalashnikov.factorial.items.resources.ResourceBase;
import com.kalashnikov.factorial.items.tools.MultiToolIron;
import com.kalashnikov.factorial.items.tools.MultiToolSteel;
import com.kalashnikov.factorial.items.tools.ToolBase;
import com.kalashnikov.factorial.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//RAW RESOURCES
	public static final Item RAW_STONE = new ResourceBase("raw_stone");
	public static final Item RAW_IRON = new ResourceBase("raw_iron");
	public static final Item RAW_COPPER = new ResourceBase("raw_copper");
	public static final Item RAW_URANIUM = new ResourceBase("raw_uranium");
	public static final Item RAW_SULFUR = new ResourceBase("raw_sulfur");
	public static final Item RAW_STEEL = new ResourceBase("raw_steel"); 
	
/*	//FLUIDS
	public static final Item  = new ItemBase("");
	public static final Item  = new ItemBase("");
	public static final Item  = new ItemBase("");
	public static final Item  = new ItemBase("");
	public static final Item  = new ItemBase("");
	public static final Item  = new ItemBase("");
	public static final Item  = new ItemBase(""); */
	
	//PROCESSED RESOURCES
	public static final Item IRON_PLATE = new ProcessedBase("iron_plate");
	public static final Item COPPER_PLATE = new ProcessedBase("copper_plate");
	public static final Item STEEL_PLATE = new ProcessedBase("steel_plate");
	public static final Item PLASTIC_PLATE = new ProcessedBase("plastic_plate");
	public static final Item COPPER_WIRE = new ProcessedBase("copper_wire");
	public static final Item IRON_STICK = new IronStick("iron_stick");
	public static final Item SOLID_FUEL = new ProcessedBase("solid_fuel");
	public static final Item ROCKET_FUEL = new ProcessedBase("rocket_fuel");
	public static final Item NUCLEAR_FUEL = new ProcessedBase("nuclear_fuel");
	public static final Item NUCLEAR_CELL = new ProcessedBase("nuclear_cell");
	public static final Item NUCLEAR_CELL_SPENT = new ProcessedBase("nuclear_cell_spent");
	
	
	//ELECTRONICS
	public static final Item BASIC_CIRCUIT = new ElecBase("basic_circuit");
	public static final Item INTERMEDIATE_CIRCUIT = new ElecBase("intermediate_circuit");
	public static final Item ADVANCED_CIRCUIT = new ElecBase("advanced_circuit");
	public static final Item BATTERY_CELL = new ElecBase("battery_cell");
	
	//MACHINE PARTS
	public static final Item ENGINE_UNIT = new PartsBase("engine_unit");
	public static final Item ELECTRIC_ENGINE_UNIT = new PartsBase("electric_engine_unit");
	public static final Item DROID_PARTS = new PartsBase("droid_parts");
	public static final Item ROCKET_PARTS = new PartsBase("rocket_parts");
	public static final Item ROCKET_CONTROL_UNIT = new PartsBase("rocket_control_unit");
	public static final Item LOW_DENSITY_STRUCTURE = new PartsBase("low_density_structure");
	
	//MILITARY
	public static final Item PISTOL_AMMO_STANDARD = new MilBase("pistol_ammo_standard");
	public static final Item PISTOL_AMMO_PIERCING = new MilBase("pistol_ammo_piercing");
	public static final Item PISTOL_STANDARD = new MilBase("pistol_standard");
	public static final Item PISTOL_ADVANCED = new MilBase("pistol_advanced");
	public static final Item RIFLE_AMMO_STANDARD = new MilBase("rilfe_ammo_standard");
	public static final Item RIFLE_AMMO_PIERCING = new MilBase("rilfe_ammo_piercing");
	public static final Item RIFLE_AMMO_DEPLETED = new MilBase("rilfe_ammo_depleted");
	public static final Item RIFLE_STANDARD = new MilBase("rifle_standard");
	public static final Item RIFLE_ADVANCED = new MilBase("rifle_advanced");
	public static final Item SHOTGUN_SHELL_STANDARD = new MilBase("shotgun_shell_standard");
	public static final Item SHOTGUN_SHELL_PIERCING = new MilBase("shotgun_shell_piercing");
	public static final Item SHOTGUN_STANDARD = new MilBase("shotgun_standard");
	public static final Item SHOTGUN_ADVANCED = new MilBase("shotgun_advanced");
	public static final Item ROCKET_AMMO_BASIC = new MilBase("rocket_ammo_basic");
	public static final Item ROCKET_AMMO_HE = new MilBase("rocket_ammo_he");
	public static final Item ROCKET_AMMO_NUCLEAR = new MilBase("rocket_ammo_nuclear");
	public static final Item LAUNCHER_BASIC = new MilBase("launcher_basic");
	public static final Item LAUNCHER_ADVANCED = new MilBase("launcher_advanced");
	public static final Item FLAMMENWERFER_FUEL = new MilBase("flammenwerfer_fuel");
	public static final Item FLAMMENWERFER = new MilBase("flammenwerfer");
	//public static final Item LANDMINE = new MilBase("landmine");
	public static final Item GRENADE_BASIC = new MilBase("grenade_basic");
	public static final Item GRENADE_ADVANCED = new MilBase("grenade_advanced");
	
	//ARMOR
	public static final ArmorMaterial ARMOR_COAXIUM = EnumHelper.addArmorMaterial("tool_coaxium", Reference.MOD_ID + ":coaxium", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static final ArmorMaterial ARMOR_CORTIUM = EnumHelper.addArmorMaterial("armor_cortium", Reference.MOD_ID + ":cortium", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
	//public static final Item BASIC_CHESTPLATE = new ItemBase("");
	//public static final Item HELMET = new ItemBase("");
	//public static final Item ADVANCED_CHESTPLATE = new ItemBase("");
	//public static final Item WORKBOOTS = new ItemBase("");
	public static final Item POWER_ARMOR_1_HELMET = new PowerArmorEin("power_armor_1_helmet", ARMOR_CORTIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item POWER_ARMOR_1_CHESTPLATE = new PowerArmorEin("power_armor_1_chestplate", ARMOR_CORTIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item POWER_ARMOR_1_LEGGINS = new PowerArmorEin("power_armor_1_leggins", ARMOR_CORTIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item POWER_ARMOR_1_BOOTS = new PowerArmorEin("power_armor_1_boots", ARMOR_CORTIUM, 1, EntityEquipmentSlot.FEET);
	//public static final Item POWER_ARMOR_2_HELMET = new ItemBase("");
	//public static final Item POWER_ARMOR_2_CHESTPLATE = new ItemBase("");
	//public static final Item POWER_ARMOR_2_LEGGINS = new ItemBase("");
	//public static final Item POWER_ARMOR_2_BOOTS = new ItemBase("");
	//public static final Item POWER_ARMOR_3_HELMET = new ItemBase("");
	//public static final Item POWER_ARMOR_3_CHESTPLATE = new ItemBase("");
	//public static final Item POWER_ARMOR_3_LEGGINS = new ItemBase("");
	//public static final Item POWER_ARMOR_3_BOOTS = new ItemBase("");
	
	//AUGMENTATIONS
	public static final Item MODULE_SPEED_1 = new AugBase("module_speed_1");
	public static final Item MODULE_SPEED_2 = new AugBase("module_speed_2");
	public static final Item MODULE_SPEED_3 = new AugBase("module_speed_3");
	public static final Item MODULE_EFFICIENCY_1 = new AugBase("module_efficiency_1");
	public static final Item MODULE_EFFICIENCY_2 = new AugBase("module_efficiency_2");
	public static final Item MODULE_EFFICIENCY_3 = new AugBase("module_efficiency_3");
	public static final Item MODULE_PRODUCTIVTY_1 = new AugBase("module_productivity_1");
	public static final Item MODULE_PRODUCTIVTY_2 = new AugBase("module_productivity_2");
	public static final Item MODULE_PRODUCTIVTY_3 = new AugBase("module_productivity_3");
	
	//TOOLS
	public static final ToolMaterial TOOL_IRON = EnumHelper.addToolMaterial("tool_iron", 2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 3, 1561, 8.0F, 3.0F, 10);
	
	public static final Item MULTI_TOOL_IRON_TOOL = new MultiToolIron("multi_tool_iron_tool", TOOL_IRON);
	public static final Item MULTI_TOOL_STEEL_TOOL = new MultiToolSteel("multi_tool_steel_tool", TOOL_STEEL);
	public static final Item MULTI_TOOL_WRENCH = new ToolBase("multi_tool_wrench");
	public static final Item PRINT_BLUE = new ToolBase("print_blue");
	public static final Item PRINT_RED = new ToolBase("print_red");
	public static final Item PRINT_GREEN = new ToolBase("print_green");
}
