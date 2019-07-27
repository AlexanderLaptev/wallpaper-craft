package com.trforcex.mods.wallpapercraft;

import com.trforcex.mods.wallpapercraft.compatibility.ChiselCompatibility;
import com.trforcex.mods.wallpapercraft.proxy.IProxy;
import com.trforcex.mods.wallpapercraft.recipes.PatternedRecipes;
import com.trforcex.mods.wallpapercraft.recipes.SolidBlocksRecipes;
import com.trforcex.mods.wallpapercraft.util.ConfigManager;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import team.chisel.api.ChiselAPIProps;

import java.io.File;

@Mod(modid = ModReference.MODID, name = ModReference.NAME, version = ModReference.VERSION, useMetadata = true)
@Mod.EventBusSubscriber
public class ModClass
{
	public static Logger logger;
	public static Configuration config;

	@Mod.Instance
	public static ModClass instance;

	@SidedProxy(clientSide = ModReference.CLIENT_PROXY, serverSide = ModReference.SERVER_PROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();

		File configDir = event.getModConfigurationDirectory();
		config = new Configuration(new File(configDir.getPath(), "wallpapercraft.cfg"));
		ConfigManager.tryReadConfig();

		proxy.preInit(event);

		ModHelper.logDebug("ModClass - preInit complete");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		ModHelper.logDebug("Initializing Chisel support");
		if(ConfigManager.enableChiselCompat && Loader.isModLoaded(ChiselAPIProps.MOD_ID))
			ChiselCompatibility.init();

		proxy.init(event);

		ModHelper.logDebug("ModClass - init complete");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if(config.hasChanged())
			config.save();
		proxy.postInit(event);

		ModHelper.logDebug("ModClass - postInit complete");
	}

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
		initRecipes();
	}

	private static void initRecipes()
	{
		SolidBlocksRecipes.init();
		PatternedRecipes.init();

		ModHelper.logDebug("The mod has " + (SolidBlocksRecipes.count + PatternedRecipes.count));
	}
}
