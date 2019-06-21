package com.trforcex.mods.wallpapercraft.proxy;

import com.trforcex.mods.wallpapercraft.util.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class CommonProxy
{
	public static Configuration config;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		File configDir = event.getModConfigurationDirectory();
		config = new Configuration(new File(configDir.getPath(), "wallpaper-craft.cfg"));
		ConfigManager.tryReadConfig();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if(config.hasChanged())
			config.save();
	}
}
