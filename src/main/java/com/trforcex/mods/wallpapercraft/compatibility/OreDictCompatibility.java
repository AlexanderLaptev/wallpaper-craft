package com.trforcex.mods.wallpapercraft.compatibility;

import com.trforcex.mods.wallpapercraft.util.Logger;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Collections;

public class OreDictCompatibility
{
    public static void registerModBlocksToOredict()
    {
        for(String color : ModDataManager.COLORS)
        {
            ItemStack woolStack = RecipeHelper.getStack(RecipeHelper.getModBlock("wool", color), 1, OreDictionary.WILDCARD_VALUE);
            ItemStack checkeredWoolStack = RecipeHelper.getStack(RecipeHelper.getModBlock("checkered_wool", color), 1, OreDictionary.WILDCARD_VALUE);
            ItemStack woodPlanksStack = RecipeHelper.getStack(RecipeHelper.getModBlock("wood_planks", color), 1, OreDictionary.WILDCARD_VALUE);
            ItemStack woolCarpetStack = RecipeHelper.getStack(RecipeHelper.getModBlock("wool_carpet", color), 1, OreDictionary.WILDCARD_VALUE);
            ItemStack checkeredWoolCarpetStack = RecipeHelper.getStack(RecipeHelper.getModBlock("checkered_carpet", color), 1, OreDictionary.WILDCARD_VALUE);

            OreDictionary.registerOre("blockWool", woolStack);
            OreDictionary.registerOre("blockWool", checkeredWoolStack);

            OreDictionary.registerOre("blockCarpet", woolCarpetStack);
            OreDictionary.registerOre("blockCarpet", checkeredWoolCarpetStack);

            OreDictionary.registerOre("plankWood", woodPlanksStack);
        }

        Logger.logDebug("Registered mod blocks to OreDict");
    }

    public static void registerVanillaToOredict()
    {
        final int WOOL_ID = OreDictionary.getOreID("blockWool");
        final int WOOD_ID = OreDictionary.getOreID("plankWood");
        final int HARDENED_CLAY_ID = OreDictionary.getOreID("hardenedClay");

        final ItemStack woolStack = new ItemStack(Blocks.WOOL, 1, OreDictionary.WILDCARD_VALUE);
        final ItemStack woodStack = new ItemStack(Blocks.PLANKS, 1, OreDictionary.WILDCARD_VALUE);
        final ItemStack clayStack = new ItemStack(Blocks.HARDENED_CLAY, 1, OreDictionary.WILDCARD_VALUE);

        if(!Collections.singletonList(OreDictionary.getOreIDs(woolStack)).contains(WOOL_ID))
            OreDictionary.registerOre("blockWool", woolStack);
        if(!Collections.singletonList(OreDictionary.getOreIDs(woodStack)).contains(WOOD_ID))
            OreDictionary.registerOre("plankWood", woodStack);
        if(!Collections.singletonList(OreDictionary.getOreIDs(clayStack)).contains(HARDENED_CLAY_ID))
            OreDictionary.registerOre("hardenedClay", clayStack);

        Logger.logDebug("Registered vanilla to OreDict");
    }
}
