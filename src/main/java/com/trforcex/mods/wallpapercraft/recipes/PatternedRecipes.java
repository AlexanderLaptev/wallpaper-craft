package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import com.trforcex.mods.wallpapercraft.util.Logger;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.trforcex.mods.wallpapercraft.util.ModUtils.composeString;
import static com.trforcex.mods.wallpapercraft.util.RecipeHelper.*;

public class PatternedRecipes
{
    private static final ResourceLocation woolGroup = new ResourceLocation(ModReference.MODID, "wool");
    private static final ResourceLocation checkeredWoolGroup = new ResourceLocation(ModReference.MODID, "checkered_wool");

    private static final ResourceLocation woolCarpetsGroup = new ResourceLocation(ModReference.MODID, "wool_carpets");
    private static final ResourceLocation checkeredCarpets = new ResourceLocation(ModReference.MODID, "checkered_carpets");

    private static final ResourceLocation texturedGroup = new ResourceLocation(ModReference.MODID, "textured_glass");
    private static final ResourceLocation tintedGroup = new ResourceLocation(ModReference.MODID, "tinted_glass");
    private static final ResourceLocation frostedGroup = new ResourceLocation(ModReference.MODID, "frosted_glass");

    private static final ResourceLocation woodPlanksGroup = new ResourceLocation(ModReference.MODID, "wood_planks");

    private static final ResourceLocation stoneLampsGroup = new ResourceLocation(ModReference.MODID, "stone_lamp");
    private static final ResourceLocation auraLampsGroup = new ResourceLocation(ModReference.MODID, "aura_lamp");

    public static void init()
    {
        initSolidRecipes();

        initWoolAndCarpetRecipes();
        initGlassRecipes();
        initPlanksRecipes();
        initLampsRecipes();

        Logger.logDebug("Done registering patterned recipes");
    }

    private static void initSolidRecipes() // PATTERNS_SOLID
    {
        for(final String pattern : ModDataManager.SOLID_PATTERNS) // General blocks
        {
            for(final String color : ModDataManager.COLORS)
            {
                final ResourceLocation recipeResLoc = getModResLoc(pattern, color);

                final Item pressItem = getModItem("press", pattern);

                final Ingredient baseBlock = getBaseBlockIngredient(pattern);
                final ItemStack pasteStack = getColoredPasteStack(color);

                final ItemStack outputStack = getStack(composeString(pattern, color), 1, 0);

                addRecipe(recipeResLoc, getModResLoc(pattern), outputStack, pressItem, baseBlock, pasteStack);

                Logger.logVerbose("Registered recipe for [" + recipeResLoc + "]");
            }

            Logger.logDebug("Done registering solid recipes");
        }

        // Jewel and stamp
        for(int i = 0; i < ModDataManager.COLORS.size(); i++)
        {
            final String color = ModDataManager.COLORS.get(i);
            final int blockMeta = ModDataManager.JEWEL_STAMP_LOOKUP[i]; // 'color' to 'meta' lookup

            final ResourceLocation jewelResLoc = getModResLoc("jewel" + i);
            final ResourceLocation stampResLoc = getModResLoc("stamp" + i);

            final ItemStack jewelStack = getStack("jewel", 1, blockMeta);
            final ItemStack stampStack = getStack("stamp", 1, blockMeta);
            final ItemStack pasteStack = getColoredPasteStack(color);

            // No group because each one will have only one recipe
            addRecipe(jewelResLoc, null, jewelStack, Blocks.CLAY, PressItems.itemPressJewel, pasteStack);
            addRecipe(stampResLoc, null, stampStack, Blocks.CLAY, PressItems.itemPressStamp, pasteStack);

            Logger.logVerbose("Registered recipe for [" + jewelResLoc + "]; [" + stampResLoc + "]");
        }

        Logger.logDebug("Done registering solid recipes");
    }

    private static void initWoolAndCarpetRecipes()
    {
        initWoolRecipes();
        initCarpetRecipes();
    }

    private static void initWoolRecipes()
    {
        for(String color : ModDataManager.COLORS)
        {
            final ResourceLocation woolResLoc = getModResLoc("wool", color);
            final ResourceLocation checkeredWoolResLoc = getModResLoc("checkered_wool", color);

            final ItemStack pasteStack = getColoredPasteStack(color);

            final ItemStack outWoolStack = getStack(woolResLoc, 1, 0);
            final ItemStack outCheckeredWoolStack = getStack(checkeredWoolResLoc, 1, 0);

            addRecipe(woolResLoc, woolGroup, outWoolStack, "blockWool", PressItems.itemPressWool, pasteStack);

            addRecipe(checkeredWoolResLoc, checkeredWoolGroup, outCheckeredWoolStack, "blockWool", PressItems.itemPressCheckeredWool, pasteStack);

            Logger.logVerbose("Registered recipe for [" + woolResLoc + "]; [" + checkeredWoolResLoc + "]");
        }

        Logger.logDebug("Done registering wool recipes");
    }

    private static void initCarpetRecipes() // CARPETS
    {
        for(String color : ModDataManager.COLORS)
        {
            final ResourceLocation woolCarpetResLoc = getModResLoc("wool_carpet", color);
            final ResourceLocation checkeredWoolCarpetResLoc = getModResLoc("checkered_carpet", color);

            final Block woolBlock = getModBlock("wool", color);
            final Block checkeredWoolBlock = getModBlock("checkered_wool", color);

            final ItemStack outWoolCarpet = getStack(woolCarpetResLoc, 3, 0);
            final ItemStack outCheckeredWoolCarpet = getStack(checkeredWoolCarpetResLoc, 3, 0);

            GameRegistry.addShapedRecipe(woolCarpetResLoc, woolCarpetsGroup, outWoolCarpet, "WW", 'W', woolBlock);
            GameRegistry.addShapedRecipe(checkeredWoolCarpetResLoc, checkeredCarpets, outCheckeredWoolCarpet, "WW", 'W', checkeredWoolBlock);

            Logger.logVerbose("Registered recipe for [" + woolCarpetResLoc + "]; [" + checkeredWoolCarpetResLoc + "]");
        }

        Logger.logDebug("Done registering carpets recipes");
    }

    private static void initGlassRecipes() // GLASS
    {
        for(String color : ModDataManager.COLORS)
        {
            final ResourceLocation texturedGlassResLoc = new ResourceLocation(ModReference.MODID, "textured_glass_" + color);
            final ResourceLocation tintedGlassResLoc = new ResourceLocation(ModReference.MODID, "tinted_glass_" + color);
            final ResourceLocation frostedGlassResLoc = new ResourceLocation(ModReference.MODID, "frosted_glass_" + color);

            final ItemStack pasteStack = getColoredPasteStack(color);

            final ItemStack outTexturedStack = getStack(getModBlock("textured_glass_" + color), 1, 0);
            final ItemStack outTintedStack = getStack(getModBlock("tinted_glass_" + color), 1, 0);
            final ItemStack outFrostedStack = getStack(getModBlock("frosted_glass_" + color), 1, 0);

            addRecipe(texturedGlassResLoc, texturedGroup, outTexturedStack, "blockGlass", PressItems.itemPressTexturedGlass, pasteStack);
            addRecipe(tintedGlassResLoc, tintedGroup, outTintedStack, "blockGlass", PressItems.itemPressTintedGlass, pasteStack);
           addRecipe(frostedGlassResLoc, frostedGroup, outFrostedStack, "blockGlass", PressItems.itemPressFrostedGlass, pasteStack);

            Logger.logVerbose("Registered recipe for [" + texturedGlassResLoc + "]; [" + tintedGlassResLoc + "]" + "; [" + frostedGlassResLoc + "]");
        }

        Logger.logDebug("Done registering glass recipes");
    }

    private static void initPlanksRecipes() // PLANKS
    {
        for(String color : ModDataManager.COLORS)
        {
            final ResourceLocation recipeResLoc = getModResLoc("wood_planks", color);

            final ItemStack pasteStack = getColoredPasteStack(color);

            final ItemStack outputStack = getStack(composeString("wood_planks", color), 1, 0);

            addRecipe(recipeResLoc, woodPlanksGroup, outputStack, "plankWood", pasteStack, PressItems.itemPressWoodPlanks);

            Logger.logVerbose("Registered recipe for [" + recipeResLoc + "]");
        }

        Logger.logDebug("Done registering planks recipes");
    }

    private static void initLampsRecipes() // LAMPS
    {
        for(String color : ModDataManager.COLORS)
        {
            final ResourceLocation stoneLampResLoc = getModResLoc("stone_lamp", color);
            final ResourceLocation auraLampResLoc = getModResLoc("aura_lamp", color);

            final ItemStack outStoneLamp = getStack(stoneLampResLoc, 1, 0);
            final ItemStack outAuraLamp = getStack(auraLampResLoc, 1, 0);

            final ItemStack pasteStack = getColoredPasteStack(color);

            addRecipe(stoneLampResLoc, stoneLampsGroup, outStoneLamp, new ItemStack(Blocks.STONE, 1, 0), PressItems.itemPressStoneLamp, pasteStack);
            addRecipe(auraLampResLoc, auraLampsGroup, outAuraLamp, Blocks.CLAY, PressItems.itemPressAuraLamp, pasteStack);

            Logger.logVerbose("Registered recipe for [" + stoneLampResLoc + "]; [" + auraLampResLoc + "]");
        }

        Logger.logDebug("Done registering lamps recipes");
    }

}
