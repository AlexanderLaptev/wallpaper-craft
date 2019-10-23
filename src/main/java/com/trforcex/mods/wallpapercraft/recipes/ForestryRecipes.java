package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import com.trforcex.mods.wallpapercraft.util.ForestryDataManager;
import com.trforcex.mods.wallpapercraft.util.Logger;
import com.trforcex.mods.wallpapercraft.util.ModUtils;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import static com.trforcex.mods.wallpapercraft.util.RecipeHelper.getStack;

public class ForestryRecipes
{
    private static ResourceLocation grassClothGroup = new ResourceLocation(ModReference.MODID, "grass_cloth");
    private static ResourceLocation honeycombGroup = new ResourceLocation(ModReference.MODID, "honeycomb");
    private static ResourceLocation leafyGroup = new ResourceLocation(ModReference.MODID, "leafy");
    private static ResourceLocation beehiveLantern = new ResourceLocation(ModReference.MODID, "beehive_tile");
    private static ResourceLocation forestryStoneBricksGroup = new ResourceLocation(ModReference.MODID, "forestry_stone_bricks");
    private static ResourceLocation glassBricksGroup = new ResourceLocation(ModReference.MODID, "glass_bricks");

    public static void init()
    {
        for(final String pattern : ForestryDataManager.PATTERNS)
        {
            // Output
            final ItemStack outStack = getStack(ModUtils.composeString(pattern, "1"), 1, 0);

            // Forestry recipe resource location
            final ResourceLocation recipeResLoc = RecipeHelper.getModResLoc(pattern);

            switch(pattern) // Choose recipe layout based on pattern
            {
            case "grass_cloth":
                RecipeHelper.addRecipe(recipeResLoc, grassClothGroup, outStack, Blocks.WOOL, PressItems.itemPressGrassCloth);
                break;
            case "honey_comb":
                RecipeHelper.addRecipe(recipeResLoc, honeycombGroup, outStack, Blocks.WOOL, PressItems.itemPressHoneycomb);
                break;
            case "leafy":
                RecipeHelper.addRecipe(recipeResLoc, leafyGroup, outStack, Blocks.WOOL, PressItems.itemPressLeafy);
                break;
            case "beehive_tile":
                RecipeHelper.addRecipe(recipeResLoc, beehiveLantern, outStack, new ItemStack(Blocks.STONE, 1, 0), PressItems.itemPressBeehiveTile);
                break;
            case "forestry_stone_bricks":
                RecipeHelper.addRecipe(recipeResLoc, forestryStoneBricksGroup, outStack, new ItemStack(Blocks.STONE, 1, 0), PressItems.itemPressStoneBricks);
                break;
            case "glass_bricks":
                RecipeHelper.addRecipe(recipeResLoc, glassBricksGroup, outStack, "blockGlass", PressItems.itemPressGlassStoneBricks);
                break;
            }

            Logger.logVerbose("Registered recipe for [" + recipeResLoc + "]");
        }

        Logger.logDebug("Done registering Forestry recipes");
    }
}
