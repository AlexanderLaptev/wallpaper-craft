package com.trforcex.mods.wallpapercraft;

import com.trforcex.mods.wallpapercraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModReference.MODID, name = ModReference.NAME, version = ModReference.VERSION, useMetadata = true)
public class ModClass
{
	public static Logger logger;

	@Mod.Instance
	public static ModClass instance;

	@SidedProxy(clientSide = ModReference.CLIENT_PROXY, serverSide = ModReference.SERVER_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();
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
		proxy.postInit(event);

		if(ModReference.debugMode)
			logger.debug("ModClass - postInit complete");
	}
}
