package com.kalashnikov.factorial.items.tools;

import java.util.Set;

import com.google.common.collect.Sets;
import com.kalashnikov.factorial.Main;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class MultiToolSteel extends ItemTool implements IHasModel {
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.LOG, Blocks.LOG2, Blocks.BED,Blocks.COBBLESTONE, Blocks.END_STONE, Blocks.AIR, Blocks.ANVIL, Blocks.BARRIER, Blocks.BEDROCK, Blocks.MAGMA, Blocks.STONE);
	
	public MultiToolSteel(String name, ToolMaterial material) {
		super(material, EFFECTIVE_ON);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.toolstab);
		
		ModItems.ITEMS.add(this);
	}
	
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		Material material = state.getMaterial();
		return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE && material != Material.ROCK ? super.getDestroySpeed(stack, state) : this.efficiency;  
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0,"inventory");		
	}
}
