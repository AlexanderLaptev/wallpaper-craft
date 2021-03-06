package com.trforcex.mods.wallpapercraft.crafting;

import com.trforcex.mods.wallpapercraft.blocks.base.BaseModBlock;
import com.trforcex.mods.wallpapercraft.init.ModBlocks;
import com.trforcex.mods.wallpapercraft.items.BasePressItem;
import com.trforcex.mods.wallpapercraft.util.Logger;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.trforcex.mods.wallpapercraft.util.RecipeHelper.*;

public class ModRecipes
{
    public static void init()
    {
        Logger.logDebug("Registering general recipes");
        for(Block block : ModBlocks.BLOCKS)
        {
            if(block instanceof BaseModBlock)
            {
                if(!((BaseModBlock) block).getPattern().contains("carpet"))
                {
                    BaseModBlock modBlock = (BaseModBlock) block;
                    registerRecipeForModBlock(modBlock);
                }
                else
                {
                    BaseModBlock modBlock = (BaseModBlock) block;
                    registerRecipeForCarpet(modBlock);
                }
            }
        }
        Logger.logDebug("Done registering general recipes");
    }

    private static void registerRecipeForCarpet(BaseModBlock modBlock)
    {
        final ResourceLocation recipeResLoc = modBlock.getRegistryName(); // Recipe registry name is same as blocks
        final ResourceLocation group = getModResLoc(modBlock.getPattern());

        final ItemStack outputStack = new ItemStack(modBlock, 1, 0);

        final Block woolBlock;
        if(modBlock.getPattern().equals("checkered_wool"))
            woolBlock = getModBlock("checkered_wool", modBlock.getColor());
        else
            woolBlock = getModBlock("wool", modBlock.getColor());

        GameRegistry.addShapedRecipe(recipeResLoc, group, outputStack, "WW", 'W', woolBlock);
    }

    private static void registerRecipeForModBlock(BaseModBlock modBlock)
    {
        Logger.logVerbose("Registering recipe for [" + modBlock.getRegistryName() + "]");

        final String resPath = modBlock.getRegistryName().getResourcePath();
        if("jewel".equals(resPath) || "stamp".equals(resPath))
        {
            registerRecipeForJewelOrStamp(modBlock); // If jewel or stamp, handle differently.
            return; // Don't do the rest of the method
        }

        // Get the press
        final BasePressItem pressItem = getPressFor(modBlock);

        // Out stack
        final ItemStack outputStack = getStack(modBlock, 1, 0);

        // Local variables
        final String color = modBlock.getColor();
        final String pattern = modBlock.getPattern();
        final Block baseBlock = modBlock.getBaseBlock();
        final String oreName = getOreName(baseBlock);

        // Get input stacks
        final ItemStack pasteStack = getColoredPasteStack(color);

        // Resource locations
        final ResourceLocation recipeResLoc = modBlock.getRegistryName(); // Recipe registry name is same as blocks
        final ResourceLocation group = getModResLoc(pattern);

        if(!oreName.isEmpty())
            addRecipe(recipeResLoc, group, outputStack, pressItem, pasteStack, oreName);
        else
            addRecipe(recipeResLoc, group, outputStack, pressItem, pasteStack, baseBlock);
    }

    private static void registerRecipeForJewelOrStamp(BaseModBlock jewelOrStampBlock)
    {
        // Get the press
        final BasePressItem pressItem = getPressFor(jewelOrStampBlock);

        // Local variables
        final String pattern = jewelOrStampBlock.getPattern();
        final Block baseBlock = jewelOrStampBlock.getBaseBlock();
        final String oreName = getOreName(baseBlock);

        for(int i = 0; i < ModDataManager.COLORS.size(); i++)
        {
            final String color = ModDataManager.COLORS.get(i); // Color for paste
            final int stackMeta = ModDataManager.JEWEL_STAMP_LOOKUP[i]; // Jewel/stamp block meta from color

            // Out stack
            final ItemStack outputStack = getStack(jewelOrStampBlock, 1, stackMeta);

            final ResourceLocation jewelRecipeResLoc = getModResLoc("jewel", color);
            final ResourceLocation stampRecipeResLoc = getModResLoc("stamp", color);

            final ItemStack pasteStack = getColoredPasteStack(color);

            if("jewel".equals(pattern))
                if(!oreName.isEmpty())
                    addRecipe(jewelRecipeResLoc, null, outputStack, pressItem, pasteStack, oreName);
                else
                    addRecipe(jewelRecipeResLoc, null, outputStack, pressItem, pasteStack, baseBlock);
            else if("stamp".equals(pattern))
                if(!oreName.isEmpty())
                    addRecipe(stampRecipeResLoc, null, outputStack, pressItem, pasteStack, oreName);
                else
                    addRecipe(stampRecipeResLoc, null, outputStack, pressItem, pasteStack, baseBlock);
            else
                throw new IllegalArgumentException("jewelOrStampBlock is not block of jewel or stamp pattern");
        }
    }
}
