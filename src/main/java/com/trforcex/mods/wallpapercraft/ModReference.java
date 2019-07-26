package com.trforcex.mods.wallpapercraft;

public class ModReference
{
	// ===== MOD INFO =====
	public static final String MODID = "wallpapercraft";
	public static final String NAME = "WallpaperCraft";
	public static final String VERSION = "0.0.1-indev";

	//public static final String UNLOCALIZED_NAME_PREFIX = MODID + ".";
	// ===== END OF MOD INFO =====

	// ===== PROXIES =====
	public static final String CLIENT_PROXY = "com.trforcex.mods.wallpapercraft.proxy.ClientProxy";
	public static final String SERVER_PROXY = "com.trforcex.mods.wallpapercraft.proxy.ServerProxy";
	// ===== END OF PROXIES =====

	// ===== DEBUG =====
	public static final boolean debugMode = true;

//	static
//	{
//		debugMode = ConfigManager.enableDebug;
//	}
	// ===== END OF DEBUG =====

	// Terracotta metas (RYGCBPBG): 14 4 13 9 11 12 7 10
	// RED, YELLOW, GREEN, CYAN, BLUE, PURPLE, BROWN, GRAY
	public static final String[] COLORS = {"red", "yellow", "green", "cyan", "blue", "purple", "brown", "gray"};
	public static final int[] BLOCK_META_LOOKUP = {14, 4, 13, 9, 11, 10, 12, 7};
	public static final int[] DYE_META_LOOKUP = {1, 11, 2, 6, 4, 5, 3, 8};

	public static final String[] SOLID_PATTERNS = {"bricks", "stone_bricks", "colored_bricks", "dotted", "diagonally_dotted", "rippled", "striped", "damask", "floral", "fancy_tiles", "clay"};
}
