package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModClass;
import net.minecraftforge.common.config.Configuration;

public class ConfigManager
{
	private static final String CATEGORY_COMPATIBILITY = "compatibility";
	private static final String CATEGORY_RECIPES = "recipes";

	// ===== CONFIG DATA =====
	// Compatibility
	public static boolean enableChiselCompat;
	public static boolean enableDebug;

	// Recipes
	public static int maxPressDurability;
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
		enableDebug= config.getBoolean("enableDebug", "debug", false, "Enable this for debugging purposes.");

		maxPressDurability = config.getInt("maxPatternPressUses", CATEGORY_RECIPES, 7, 0, Integer.MAX_VALUE, "Defines how many times you can use pattern press before it breaks. Set to 0 to disable durability.");

		ModHelper.logDebug("initOrReadConfig done!");
	}
}
