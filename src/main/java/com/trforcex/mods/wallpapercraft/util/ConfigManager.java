package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModClass;
import com.trforcex.mods.wallpapercraft.ModReference;
import net.minecraftforge.common.config.Configuration;

public class ConfigManager
{
	private static final String CATEGORY_COMPATIBILITY = "compatibility";
	private static final String CATEGORY_RECIPES = "recipes";

	// ===== CONFIG DATA =====
	// Compatibility
	public static boolean enableJeiCompat;
	public static boolean enableChiselCompat;

	// Recipes
	public static int maxPressDurability;
	public static int solidBlocksCraftingAmount;
	// ===== END OF CONFIG DATA =====

	public static void tryReadConfig()
	{
		Configuration config = ModClass.config;
		try
		{
			config.load();
			initOrReadConfig(config);

			if(ModReference.debugMode)
				ModClass.logger.debug("Reading config complete!");
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
		enableJeiCompat = config.getBoolean("enableJeiCompatibility", CATEGORY_COMPATIBILITY, true, "Enable this if you want JEI compatibility");
		enableChiselCompat = config.getBoolean("enableChiselCompatibility", CATEGORY_COMPATIBILITY, true, "Enable this if you want Chisel compatibility");

		maxPressDurability = config.getInt("maxPatternPressUses", CATEGORY_RECIPES, 10, 0, Integer.MAX_VALUE, "Defines how many times you can use pattern press before it breaks. Set to 0 to disable durability.");
		solidBlocksCraftingAmount = config.getInt("solidBlockCraftingAmount", CATEGORY_RECIPES, 9, 1, 64, "Defines how many solid blocks you get after crafting");

		if(ModReference.debugMode)
			ModClass.logger.debug("initOrReadConfig done!");
	}
}
