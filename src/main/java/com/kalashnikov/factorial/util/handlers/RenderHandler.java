package com.kalashnikov.factorial.util.handlers;

import com.kalashnikov.factorial.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

public class RenderHandler {
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
