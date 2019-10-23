package com.trforcex.mods.wallpapercraft;

import com.trforcex.mods.wallpapercraft.compatibility.ChiselCompatibility;
import com.trforcex.mods.wallpapercraft.compatibility.OreDictCompatibility;
import com.trforcex.mods.wallpapercraft.proxy.IProxy;
import com.trforcex.mods.wallpapercraft.recipes.*;
import com.trforcex.mods.wallpapercraft.util.ExecCommand;
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
import org.apache.logging.log4j.Logger;
import team.chisel.api.ChiselAPIProps;

@Mod(modid = ModReference.MODID, name = ModReference.NAME, version = ModReference.VERSION, useMetadata = true)
@Mod.EventBusSubscriber
public class ModClass
{
	public static Logger logger;

	@Mod.Instance
	public static ModClass instance;

	@SidedProxy(clientSide = ModReference.CLIENT_PROXY, serverSide = ModReference.SERVER_PROXY)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Setup logger
		logger = event.getModLog();

		proxy.preInit(event);

		ModConfig.update();
		com.trforcex.mods.wallpapercraft.util.Logger.logDebug("preInit() – done");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// OreDict
		if(ModConfig.compatibility.registerVanillaWoolAndPlanksToOredict)
		{
			OreDictCompatibility.registerVanillaToOredict();
			OreDictCompatibility.registerModBlocksToOredict();
			com.trforcex.mods.wallpapercraft.util.Logger.logDebug("OreDict – done");
		}

		proxy.init(event);
		com.trforcex.mods.wallpapercraft.util.Logger.logDebug("init() – done");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		if(ModConfig.compatibility.enableChiselCompatibility && Loader.isModLoaded(ChiselAPIProps.MOD_ID))
			ChiselCompatibility.init();

		proxy.postInit(event);
		com.trforcex.mods.wallpapercraft.util.Logger.logDebug("postInit() – done");
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event)
    {
		if(ModConfig.debug.loggingLevel != 0 || ModReference.DEBUG)
		{
			event.registerServerCommand(new ExecCommand());
		}
	}

	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
	{
		initRecipes(event);
	}

	private static void initRecipes(final RegistryEvent.Register<IRecipe> event)
	{
		event.getRegistry().register(new ScrollingRecipe());
		event.getRegistry().register(new RecolorRecipe());
		event.getRegistry().register(new PatternRemovalRecipe());
		com.trforcex.mods.wallpapercraft.util.Logger.logDebug("Registered dynamic recipes");

        registerColoredPasteRecipes(); // Init colored paste recipes

		PatternedRecipes.init();
		ForestryRecipes.init();

		com.trforcex.mods.wallpapercraft.util.Logger.logDebug("Done registering mod recipes");
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

			// [Clay ball] + [Dye (oredict] = [Colored paste]
			RecipeHelper.addRecipe(recipeResLoc, coloredPasteGroup, pasteStack, Items.CLAY_BALL, dyeOreDict);
		}

		com.trforcex.mods.wallpapercraft.util.Logger.logDebug("Done registering recipes for colored paste");
	}


}
