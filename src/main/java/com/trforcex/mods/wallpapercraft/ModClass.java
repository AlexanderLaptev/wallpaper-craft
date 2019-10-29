package com.trforcex.mods.wallpapercraft;

import com.trforcex.mods.wallpapercraft.compatibility.ChiselCompatibility;
import com.trforcex.mods.wallpapercraft.compatibility.OreDictCompatibility;
import com.trforcex.mods.wallpapercraft.crafting.DynamicRecipes;
import com.trforcex.mods.wallpapercraft.crafting.ModRecipes;
import com.trforcex.mods.wallpapercraft.crafting.PasteCombinationRecipe;
import com.trforcex.mods.wallpapercraft.proxy.IProxy;
import com.trforcex.mods.wallpapercraft.util.DebugCommand;
import com.trforcex.mods.wallpapercraft.util.Logger;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import team.chisel.api.ChiselAPIProps;

@Mod(modid = ModReference.MODID, name = ModReference.NAME, version = ModReference.VERSION, useMetadata = true, updateJSON = "https://dl.dropboxusercontent.com/s/edouros9o00gyui/wpcraft_update.json?dl=0")
@Mod.EventBusSubscriber
public class ModClass
{
	public static org.apache.logging.log4j.Logger logger; // Mod logger

	@Mod.Instance
	public static ModClass instance; // Instance of this mod, used by Forge

	@SidedProxy(clientSide = ModReference.CLIENT_PROXY, serverSide = ModReference.SERVER_PROXY)
	private static IProxy proxy; // Mod proxy

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Setup logger
		logger = event.getModLog();

		// Pre-init proxy
		proxy.preInit();

		ModConfig.update(); // Update config
		Logger.logDebug("preInit() – done");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// OreDict
		if(ModConfig.compatibility.registerVanillaWoolAndPlanksToOredict)
			OreDictCompatibility.registerVanillaToOredict();

		OreDictCompatibility.registerModBlocksToOredict();
		Logger.logDebug("OreDict – done");

		proxy.init();
		Logger.logDebug("init() – done");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		// Init chisel support
		if(ModConfig.compatibility.enableChiselCompatibility && Loader.isModLoaded(ChiselAPIProps.MOD_ID))
			ChiselCompatibility.init();

		proxy.postInit();
		Logger.logDebug("postInit() – done");
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event)
    {
    	// Register exec command anyway
    	event.registerServerCommand(new DebugCommand());
		Logger.logDebug("Registered debug command");
	}

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
		initRecipes(event); // Init mod recipes
	}

	private static void initRecipes(final RegistryEvent.Register<IRecipe> event)
	{
		// Register paste combination recipe
		event.getRegistry().register(PasteCombinationRecipe.INSTANCE);
		Logger.logDebug("Paste combination recipe registered");
        registerColoredPasteRecipes(); // Init colored paste recipes
		Logger.logDebug("Colored paste recipes registered");

		ModRecipes.init();
		DynamicRecipes.init();

		Logger.logDebug("Done registering mod recipes");
	}

	private static void registerColoredPasteRecipes()
	{
		final ResourceLocation coloredPasteGroup = RecipeHelper.getModResLoc("colored_paste");

		for(String color : ModDataManager.COLORS)
		{
			final ResourceLocation recipeResLoc = RecipeHelper.getModResLoc("colored_paste" + color);
			// 'dye' + color capitalized
			final String dyeOreDict = "dye" + String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);

			// Output stack
			final ItemStack pasteStack = RecipeHelper.getColoredPasteStack(color);

			// [Clay ball] + [Dye (oredict)] = [Colored paste]
			RecipeHelper.addRecipe(recipeResLoc, coloredPasteGroup, pasteStack, Items.CLAY_BALL, dyeOreDict);
		}

		Logger.logDebug("Done registering recipes for colored paste");
	}


}
