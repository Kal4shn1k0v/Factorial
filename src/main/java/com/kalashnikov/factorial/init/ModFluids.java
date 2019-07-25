package com.kalashnikov.factorial.init;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import java.util.ArrayList;
import java.util.List;

import com.kalashnikov.factorial.fluids.FluidLiquid;

import net.minecraft.util.ResourceLocation;

public class ModFluids {
	//public static final List<Fluid> FLUIDS = new ArrayList<Fluid>();
	
	//public static final Block STRUCTURE_BLOCK = new BlockBase("structure_block", Material.IRON);
	public static final Fluid CRUDE_OIL = new FluidLiquid("crude_oil", new ResourceLocation("vfv:blocks/crude_oil_still"), new ResourceLocation("vfv:blocks/crude_oil_flow"));
	
	public static void registerFluids() {
		registerFluid(CRUDE_OIL);
	}
	
	public static void registerFluid(Fluid fluid) {
		FluidRegistry.registerFluid(fluid);
		FluidRegistry.addBucketForFluid(fluid);
	}
}
