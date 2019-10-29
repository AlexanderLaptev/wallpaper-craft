package com.trforcex.mods.wallpapercraft.proxy;

import com.trforcex.mods.wallpapercraft.init.ModKeybinds;

public class ClientProxy implements IProxy
{
	@Override
	public void preInit()
	{
		ModKeybinds.register();
	}

	@Override
	public void init()
	{

	}

	@Override
	public void postInit()
	{

	}
}
