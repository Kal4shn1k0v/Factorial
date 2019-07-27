package com.kalashnikov.factorial.util.handlers;

import com.kalashnikov.factorial.init.ModBlocks;
import com.kalashnikov.factorial.init.ModEntities;
import com.kalashnikov.factorial.init.ModFluids;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.IHasModel;
import com.kalashnikov.factorial.world.gen.WorldGenCustomOres;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler {
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	//@SubscribeEvent
	//public static void onFluidRegister(RegistryEvent.Register<Fluid> event) {
		//event.getRegistry().registerAll(ModFluids.FLUIDS.toArray(new Block[0]));
	//}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void otherRegistries() {
		//ORES
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		
		//ENTITIES
		ModEntities.registerEntities();
		RenderHandler.registerEntityRenders();
	}
}
