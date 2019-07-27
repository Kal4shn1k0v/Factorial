package com.kalashnikov.factorial;

import com.kalashnikov.factorial.init.ModFluids;
import com.kalashnikov.factorial.proxy.CommonProxy;
import com.kalashnikov.factorial.tabs.IntermediateProductsTab;
import com.kalashnikov.factorial.tabs.LogisticsTab;
import com.kalashnikov.factorial.tabs.MilitaryTab;
import com.kalashnikov.factorial.tabs.ProductionTab;
import com.kalashnikov.factorial.tabs.ToolsTab;
import com.kalashnikov.factorial.util.Reference;
import com.kalashnikov.factorial.util.compat.OreDictionaryCompat;
import com.kalashnikov.factorial.util.handlers.RegistryHandler;
import com.kalashnikov.factorial.util.handlers.RenderHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {
	@Instance
	public static Main instance;
	
	//TABS
	public static final CreativeTabs militarytab = new MilitaryTab("militarytab");
	public static final CreativeTabs productiontab = new ProductionTab("productiontab");
	public static final CreativeTabs intermediatetab = new IntermediateProductsTab("intermediate");
	public static final CreativeTabs logistictab = new LogisticsTab("logistictab");
	public static final CreativeTabs toolstab = new ToolsTab("toolstab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		ModFluids.registerFluids();
		RenderHandler.regiterCustomMeshesAndStates();
		
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) {
		OreDictionaryCompat.registerOres();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		
	}
}
