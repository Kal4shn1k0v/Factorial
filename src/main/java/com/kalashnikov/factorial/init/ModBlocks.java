package com.kalashnikov.factorial.init;

import java.util.ArrayList;
import java.util.List;

import com.kalashnikov.factorial.blocks.BlockBase;
import com.kalashnikov.factorial.blocks.BlockBasicFurnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block STRUCTURE_BLOCK = new BlockBase("structure_block", Material.IRON);
	public static final Block BASIC_FURNACE = new BlockBasicFurnace("basic_furnace", Material.GROUND);
}
