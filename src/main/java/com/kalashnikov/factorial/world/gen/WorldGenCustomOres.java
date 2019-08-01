package com.kalashnikov.factorial.world.gen;

import java.util.Random;

import com.kalashnikov.factorial.blocks.ores.OreBase;
import com.kalashnikov.factorial.init.ModBlocks;
import com.kalashnikov.factorial.init.ModItems;
import com.kalashnikov.factorial.util.handlers.EnumHandler;

import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator{
	private WorldGenerator ore_nether_copper;
	private WorldGenerator ore_overworld_copper;
	private WorldGenerator ore_nether_iron;
	private WorldGenerator ore_overworld_iron;
	
	public WorldGenCustomOres() {
		ore_nether_copper = new WorldGenMinable(ModBlocks.ORE_NETHER.getDefaultState().withProperty(OreBase.VARIANT, EnumHandler.EnumType.COPPER), 600, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_nether_iron = new WorldGenMinable(ModBlocks.ORE_NETHER.getDefaultState().withProperty(OreBase.VARIANT, EnumHandler.EnumType.IRON), 600, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_overworld_copper = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(OreBase.VARIANT, EnumHandler.EnumType.COPPER), 600, BlockMatcher.forBlock(Blocks.GRASS));
		ore_overworld_iron = new WorldGenMinable(ModBlocks.ORE_OVERWORLD.getDefaultState().withProperty(OreBase.VARIANT, EnumHandler.EnumType.IRON), 600, BlockMatcher.forBlock(Blocks.GRASS));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
			case -1:
				runGenerator(ore_nether_copper, world, random, chunkX, chunkZ, 20, 10, 150);
				runGenerator(ore_nether_iron, world, random, chunkX, chunkZ, 20, 10, 150);
				break;
			case 0:
				runGenerator(ore_overworld_copper, world, random, chunkX, chunkZ, 20, 62, 150);
				runGenerator(ore_overworld_iron, world, random, chunkX, chunkZ, 20, 62, 150);
				break;
		}
	}
	
/*	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
			case -1:
				runGenerator(ore_nether_iron, world, random, chunkX, chunkZ, 20, 10, 150);
				break;
			case 0:
				runGenerator(ore_overworld_iron, world, random, chunkX, chunkZ, 20, 62, 150);
				break;
		}
	} */
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) {
			throw new IllegalArgumentException("Ore generated out of bounds.");
		}
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
