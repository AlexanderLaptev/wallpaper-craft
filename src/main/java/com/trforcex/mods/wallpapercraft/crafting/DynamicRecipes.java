package com.trforcex.mods.wallpapercraft.crafting;

import com.trforcex.mods.wallpapercraft.blocks.base.BaseModBlock;
import com.trforcex.mods.wallpapercraft.blocks.base.ScrollingType;
import com.trforcex.mods.wallpapercraft.init.ModBlocks;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import com.trforcex.mods.wallpapercraft.util.Logger;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import static com.trforcex.mods.wallpapercraft.util.RecipeHelper.*;

// A crutch to dynamic recipes (will be properly implemented someday)
public class DynamicRecipes
{
    public static void init()
    {
        Logger.logDebug("Initializing \"dynamic\" recipes");
        for(Block block : ModBlocks.BLOCKS)
            if(block instanceof BaseModBlock)
            {
                BaseModBlock modBlock = (BaseModBlock)block;

                registerScrollingRecipeFor(modBlock);
                registerRecolorRecipesFor(modBlock);

                if(!block.getRegistryName().getResourcePath().contains("carpet"))
                    registerPatternRemovalRecipeFor(modBlock);
            }
        Logger.logDebug("Done initializing \"dynamic\" recipes");
    }

    private static void registerScrollingRecipeFor(BaseModBlock block)
    {
        Logger.logVerbose("Registering scrolling recipe for: [" + block.getRegistryName() + "]");
        if(block.getScrollingType() == ScrollingType.Scrollable)
        {
            for(int meta = 0; meta <= block.getMaxMeta(); meta++)
            {
                if(block.getPattern().equals("solid"))
                    Logger.stubMethod();

                ResourceLocation resLoc = getModResLoc(block.getPattern(), block.getColor(), "scrolling", String.valueOf(meta));

                ItemStack inputStack = new ItemStack(block, 1, meta);

                ItemStack outputStack;
                if(meta < block.getMaxMeta())
                    outputStack = new ItemStack(block, 1, meta+1);
                else
                    outputStack = new ItemStack(block, 1, 0);

                addRecipe(resLoc, null, outputStack, inputStack);
            }
        }
        else
        {
            if(block.getRegistryName().getResourcePath().endsWith("_1")) // First group
            {
                for(int meta = 0; meta <= block.getMaxMeta(); meta++)
                {
                    ResourceLocation resLoc = getModResLoc(block.getPattern(), "scrolling_1", String.valueOf(meta));

                    ItemStack inputStack = new ItemStack(block, 1, meta);

                    ItemStack outputStack;
                    if(meta < block.getMaxMeta())
                        outputStack = new ItemStack(block, 1, meta+1);
                    else
                    {
                        BaseModBlock outBlock = (BaseModBlock) getModBlock(block.getPattern(), "2");
                        outputStack = new ItemStack(outBlock, 1, 0);
                    }

                    addRecipe(resLoc, null, outputStack, inputStack);
                }
            }
            else if(block.getRegistryName().getResourcePath().endsWith("_2")) // Second group
            {
                for(int meta = 0; meta <= block.getMaxMeta(); meta++)
                {
                    ResourceLocation resLoc = getModResLoc(block.getPattern(), "scrolling_2", String.valueOf(meta));

                    ItemStack inputStack = new ItemStack(block, 1, meta);

                    ItemStack outputStack;
                    if(meta < block.getMaxMeta())
                        outputStack = new ItemStack(block, 1, meta+1);
                    else
                    {
                        BaseModBlock outBlock = (BaseModBlock) getModBlock(block.getPattern(), "1");
                        outputStack = new ItemStack(outBlock, 1, 0);
                    }

                    addRecipe(resLoc, null, outputStack, inputStack);
                }
            }
        }
    }

    private static void registerRecolorRecipesFor(BaseModBlock block)
    {
        Logger.logVerbose("Registering recolor recipes for [" + block.getRegistryName() + "]");
        if(!block.getColor().equals("f/c")) // If not a forestry block
        {
            for(String color : ModDataManager.COLORS)
            {
                if(color.equals(block.getColor()))
                {
                    Logger.logVerbose("Recoloring in the same color, skipping");
                    continue; // Don't recolor in the same color
                }

                if(!block.getColor().equals("j/s")) // If not jewel or stamp
                    for(int meta = 0; meta <= block.getMaxMeta(); meta++)
                    {
                        if(block.getPattern().equals("jewel") || block.getPattern().equals("stamp"))
                            Logger.stubMethod();

                        ResourceLocation resLoc = getModResLoc(block.getPattern(), block.getColor(), String.valueOf(meta), "recolor", color);

                        ItemStack inputStack = new ItemStack(block, 1, meta);
                        ItemStack pasteStack = getColoredPasteStack(color);

                        BaseModBlock outputBlock = (BaseModBlock) getModBlock(block.getPattern(), color);

                        int newMeta = MathHelper.clamp(meta, 0, outputBlock.getMaxMeta());
                        ItemStack outputStack = new ItemStack(outputBlock, 1, newMeta);

                        addRecipe(resLoc, null, outputStack, inputStack, pasteStack);
                    }
                else
                    Logger.logVerbose("Recoloring for jewel or stamp, skipping");
            }
        }
        else
            Logger.logVerbose("Forestry block found, skipping");
    }

    private static void registerPatternRemovalRecipeFor(BaseModBlock block)
    {
        Logger.logVerbose("Registering pattern removal recipe for [" + block.getRegistryName() + "]");
        ResourceLocation resLoc = getModResLoc(block.getPattern(), block.getColor(), "removal");
        ItemStack outputStack = new ItemStack(block.getBaseBlock(), 1, 0);
        addRecipe(resLoc, null, outputStack, block, PressItems.itemPressRemoval);
    }
}
