package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModClass;
import net.minecraftforge.common.config.Configuration;

public class ConfigManager
{
	private static final String CATEGORY_COMPATIBILITY = "compatibility";
	private static final String CATEGORY_RECIPES = "recipes";
	private static final String CATEGORY_DEBUG = "debug";
	private static final String CATEGORY_GENERAL = "general";

	// ===== CONFIG DATA =====
	// Compatibility
	private static boolean enableChiselCompat;
	private static boolean enableForestryIntegration;

	// Debug
	private static boolean enableDebug;

	// Recipes
	private static int maxPressDurability;

	// General
	private static boolean enableScrollingHint;
	// ===== END OF CONFIG DATA =====

	public static void tryReadConfig()
	{
		Configuration config = ModClass.config;
		try
		{
			config.load();
			initOrReadConfig(config);

			ModHelper.logDebug("Reading config complete!");
		}
		catch(Exception e)
		{
			ModClass.logger.error("Cannot read Wallpapercraft config!");
		}
		finally
		{
			if(config.hasChanged())
				config.save();
		}
	}

	private static void initOrReadConfig(Configuration config)
	{
		enableChiselCompat = config.getBoolean("enableChiselCompatibility", CATEGORY_COMPATIBILITY, true, "Enable this if you want Chisel compatibility");
		enableForestryIntegration = config.getBoolean("enableForestryIntegration", CATEGORY_COMPATIBILITY, true, "Enable this if you want Forestry integration");

		enableDebug= config.getBoolean("enableDebug", CATEGORY_DEBUG, false, "Enable this for debugging purposes.");
		enableScrollingHint = config.getBoolean("enableScrollingHint", CATEGORY_GENERAL, true, "Whether to show the shades scrolling hint");

		maxPressDurability = config.getInt("maxPatternPressUses", CATEGORY_RECIPES, 0, 0, Integer.MAX_VALUE, "Defines how many times you can use pattern press before it breaks. Set to 0 to disable durability.");
		ModHelper.logDebug("initOrReadConfig done!");
	}

	public static boolean getEnableChiselCompat()
	{
		return enableChiselCompat;
	}

	public static boolean getEnableForestryIntegration()
	{
		return enableForestryIntegration;
	}

	public static boolean getEnableDebug()
	{
		return enableDebug;
	}

	public static int getMaxPressDurability()
	{
		return maxPressDurability;
	}

	public static boolean getEnableScrollingHint()
	{
		return enableScrollingHint;
	}
}
