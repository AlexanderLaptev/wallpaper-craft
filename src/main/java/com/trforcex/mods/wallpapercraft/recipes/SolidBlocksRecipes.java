package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SolidBlocksRecipes
{

    private static final ResourceLocation solidGroup = new ResourceLocation("solid");

    public static void init()
    {
        initCraftingRecipes();
        initConversionRecipes();
    }

    private static void initCraftingRecipes()
    {
        for(int i = 0; i < ModReference.COLORS.length; i++)
        {
            String color = ModReference.COLORS[i];
            int meta = ModReference.BLOCK_META_LOOKUP[i]; // Corresponding color meta for hardened clay

            ResourceLocation recipeResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color + "_1");
            ResourceLocation solidResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color);

            Block solidBlock = ForgeRegistries.BLOCKS.getValue(solidResourceLocation);
            Item solidItemBlock = Item.getItemFromBlock(solidBlock);

            ItemStack output = new ItemStack(solidItemBlock, 8, 0);

            GameRegistry.addShapedRecipe(recipeResourceLocation, solidGroup, output, "TTT", "T T", "TTT", 'T', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, meta));
        }

        ModHelper.logDebug("Initialized recipes for solid blocks.");
    }

    private static void initConversionRecipes()
    {
        int i = 2;

        for(String pattern : ModReference.SOLID_PATTERNS)
        {
            for(String color : ModReference.COLORS)
            {

                ResourceLocation recipeResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color + "_" + i);

                ResourceLocation patternResourceLocation = new ResourceLocation(ModReference.MODID, pattern + "_" + color);
                ResourceLocation solidResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color);

                Block patternBlock = ForgeRegistries.BLOCKS.getValue(patternResourceLocation);
                Block solidBlock = ForgeRegistries.BLOCKS.getValue(solidResourceLocation);

                Item blankPress = PressItems.itemPressBlank;
                Item solidItemBlock = Item.getItemFromBlock(solidBlock);

                ItemStack outputStack = new ItemStack(solidItemBlock, 8);
                GameRegistry.addShapedRecipe(recipeResourceLocation, solidGroup, outputStack, "PPP", "PBP", "PPP", 'P', patternBlock, 'B', blankPress);
            }

            i++;
        }
    }
}
