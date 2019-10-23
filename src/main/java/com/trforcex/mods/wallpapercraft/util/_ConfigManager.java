//package com.trforcex.mods.wallpapercraft.util;
//
//import com.trforcex.mods.wallpapercraft.ModClass;
//import com.trforcex.mods.wallpapercraft.ModReference;
//import net.minecraftforge.common.config.Config;
//import net.minecraftforge.common.config.Configuration;
//
//@Config(modid = ModReference.MODID, name = "wallpapercraft")
//public class ConfigManager
//{
//	@Config.Ignore
//	private static final String CATEGORY_COMPATIBILITY = "compatibility";
//	@Config.Ignore
//	private static final String CATEGORY_CRAFTING = "crafting";
//	@Config.Ignore
//	private static final String CATEGORY_DEBUG = "debug";
//	@Config.Ignore
//	private static final String CATEGORY_GENERAL = "general";
//
//	// ===== CONFIG DATA =====
//	// Compatibility
//	@Config.RequiresMcRestart
//	private static boolean enableChiselCompat;
//	@Config.RequiresMcRestart
//	private static boolean registerVanillaBlocksToOredict;
//
//	private static boolean enableForestryWoodScrolling;
//
//	// Recipes
//	@Config.RequiresMcRestart
//	private static int maxPressDurability;
//	@Config.RequiresMcRestart
//	private static int maxColoredPasteUses;
//
//	// General
//	private static boolean enableHints;
//	// ===== END OF CONFIG DATA =====
//
//	public static void tryReadConfig()
//	{
//		Configuration config = ModClass.config;
//		try
//		{
//			config.load();
//			initOrReadConfig(config, false);
//		}
//		catch(Exception e)
//		{
//			ModClass.logger.error("Cannot read Wallpapercraft config!");
//		}
//		finally
//		{
//			if(config.hasChanged())
//				config.save();
//		}
//	}
//
//	private static void initOrReadConfig(Configuration config, boolean isReloading)
//	{
//		if(!isReloading)
//		{
//			enableChiselCompat = config.getBoolean("enableChiselCompatibility", CATEGORY_COMPATIBILITY, true, "Enable this if you want Chisel compatibility");
//			registerVanillaBlocksToOredict = config.getBoolean("registerVanillaBlocksToOredict", CATEGORY_COMPATIBILITY, true, "Enable to register vanilla wool and planks to oredictionary");
//		}
//
//		enableForestryWoodScrolling = config.getBoolean("enableForestryWoodPlanksScrolling", CATEGORY_COMPATIBILITY, false, "Enable this if you want the Forestry wood planks to be scrollable");
//
//		enableHints = config.getBoolean("enableHints", CATEGORY_GENERAL, true, "Disable this if you don't want to see tooltip hints");
//
//		maxPressDurability = config.getInt("maxPatternPressUses", CATEGORY_CRAFTING, 0, 0, Short.MAX_VALUE, "Defines how many times you can use pattern press before it breaks. Set to 0 to disable durability.");
//		maxColoredPasteUses = config.getInt("maxColoredPasteUses", CATEGORY_CRAFTING, 64, 1, Integer.MAX_VALUE, "Defines how many times colored paste can be used before it breaks.");
//
//		int logLevel = config.getInt("logLevel", CATEGORY_DEBUG, 0, 0, 2, "0 - disable logging, 1 - [debug] level, 2 - [verbose] level");
//		boolean useInfo = config.getBoolean("useLogInfoInsteadOfLogDebug", CATEGORY_DEBUG, false, "Use this to make logs go to 'latest.log' instead of 'debug.log'");
//		Logger.setMaxLogLevel(logLevel);
//		Logger.setUseInfoInsteadOfDebug(useInfo);
//	}
//
//	public static boolean getEnableChiselCompat()
//	{
//		return enableChiselCompat;
//	}
//
//	public static int getMaxPressDurability()
//	{
//		return maxPressDurability;
//	}
//
//	public static boolean getEnableHints()
//	{
//		return enableHints;
//	}
//
//	public static boolean getEnableForestryWoodScrolling()
//	{
//		return enableForestryWoodScrolling;
//	}
//
//	public static int getMaxColoredPasteUses()
//	{
//		return maxColoredPasteUses - 1;
//	}
//
//	public static boolean getRegisterVanillaBlocksToOredict()
//	{
//		return registerVanillaBlocksToOredict;
//	}
//
//    public static boolean reloadConfig()
//    {
//    	Configuration config = ModClass.config;
//
//		try
//		{
//			config.load();
//			initOrReadConfig(config, true);
//		}
//		catch(Exception e)
//		{
//			return false;
//		}
//		finally
//		{
//			config.save();
//		}
//
//		return true;
//    }
//}
