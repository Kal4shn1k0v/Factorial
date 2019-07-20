package com.kalashnikov.factorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockBasicFurnace extends BlockBase {

	public BlockBasicFurnace(String name) {
		super(name, Material.CLAY);		
	}
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}
