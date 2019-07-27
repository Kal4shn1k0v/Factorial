package com.kalashnikov.factorial.init;

import com.kalashnikov.factorial.Main;
import com.kalashnikov.factorial.entity.neutral.EntityTuskenMelee;
import com.kalashnikov.factorial.entity.neutral.EntityTuskenRange;
import com.kalashnikov.factorial.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
	public static void registerEntities() {
		registerEntity("tusken_melee", EntityTuskenMelee.class, Reference.ENTITY_TUSKEN_MELEE, 25, 4936480, 12759680);
		registerEntity("tusken_range", EntityTuskenRange.class, Reference.ENTITY_TUSKEN_RANGE, 25, 16777215, 12759680);

	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
