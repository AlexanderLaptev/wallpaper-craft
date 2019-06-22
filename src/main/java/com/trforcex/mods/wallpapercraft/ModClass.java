package com.trforcex.mods.wallpapercraft;

import com.trforcex.mods.wallpapercraft.proxy.IProxy;
import com.trforcex.mods.wallpapercraft.util.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import java.io.File;

@Mod(modid = ModReference.MODID, name = ModReference.NAME, version = ModReference.VERSION, useMetadata = true)
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
		config = new Configuration(new File(configDir.getPath(), "wallpaper-craft.cfg"));
		ConfigManager.tryReadConfig();

		proxy.preInit(event);

		if(ModReference.debugMode)
			logger.debug("ModClass - preInit complete");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);

		if(ModReference.debugMode)
			logger.debug("ModClass - init complete");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if(config.hasChanged())
			config.save();
		proxy.postInit(event);

		if(ModReference.debugMode)
			logger.debug("ModClass - postInit complete");
	}
}
