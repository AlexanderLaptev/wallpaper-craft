package com.trforcex.mods.wallpapercraft.proxy;

import com.trforcex.mods.wallpapercraft.init.ModKeybinds;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		ModKeybinds.register();
	}

	@Override
	public void init(FMLInitializationEvent event)
	{

	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
