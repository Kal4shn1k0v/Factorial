package com.kalashnikov.factorial.util.handlers;

import com.kalashnikov.factorial.entity.neutral.EntityTuskenMelee;
import com.kalashnikov.factorial.entity.neutral.EntityTuskenRange;
import com.kalashnikov.factorial.entity.render.RenderTuskenMelee;
import com.kalashnikov.factorial.entity.render.RenderTuskenRange;
import com.kalashnikov.factorial.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	public static void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityTuskenMelee.class, new IRenderFactory<EntityTuskenMelee>() {
			public Render<? super EntityTuskenMelee> createRenderFor(RenderManager manager){
				return new RenderTuskenMelee(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTuskenRange.class, new IRenderFactory<EntityTuskenRange>() {
			public Render<? super EntityTuskenRange> createRenderFor(RenderManager manager){
				return new RenderTuskenRange(manager);
			}
		});
	}
	
	public static void regiterCustomMeshesAndStates() {
		ModelLoader.setCustomMeshDefinition(Item.getItemFromBlock(ModBlocks.CRUDE_OIL_BLOCK), new ItemMeshDefinition(){
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return new ModelResourceLocation("tutorial:crude_oil", "fluid");
			}
		});
		
		ModelLoader.setCustomStateMapper(ModBlocks.CRUDE_OIL_BLOCK, new StateMapperBase(){
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return new ModelResourceLocation("tutorial:crude_oil", "fluid");
			}
		});
	}
}