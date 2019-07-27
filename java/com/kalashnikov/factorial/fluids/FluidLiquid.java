package com.kalashnikov.factorial.fluids;

import net.minecraftforge.fluids.Fluid;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.util.ResourceLocation;

public class FluidLiquid extends Fluid {

	
	public FluidLiquid(String name, ResourceLocation still, ResourceLocation flow) {
		super(name, still, flow);
		this.setUnlocalizedName(name);
	}
}
