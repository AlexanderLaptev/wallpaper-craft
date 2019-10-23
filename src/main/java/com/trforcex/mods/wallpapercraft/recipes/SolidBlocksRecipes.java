//package com.trforcex.mods.wallpapercraft.recipes;
//
//import com.trforcex.mods.wallpapercraft.util.ModDataManager;
//import com.trforcex.mods.wallpapercraft.ModReference;
//import com.trforcex.mods.wallpapercraft.init.ModItems;
//import net.minecraft.block.Block;
//import net.minecraft.init.Blocks;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.crafting.Ingredient;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.fml.common.registry.ForgeRegistries;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//
//import static com.trforcex.mods.wallpapercraft.util.RecipeHelper.*;
//
//// TO-DO: optimizations and clean-up
//public class SolidBlocksRecipes
//{
//    private static final ResourceLocation solidGroup = new ResourceLocation("solid");
//
//    public static void init()
//    {
//        initCraftingRecipes();
//        initConversionRecipes();
//    }
//
//    private static void initCraftingRecipes()
//    {
////        for(int i = 0; i < ModDataManager.COLORS.length; i++)
////        {
////            String color = ModDataManager.COLORS[i];
////            int meta = ModDataManager.BLOCK_META_LOOKUP[i]; // Corresponding color meta for hardened clay
////
////            ResourceLocation recipeResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color + "_1");
////            ResourceLocation solidResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color);
////
////            Block solidBlock = ForgeRegistries.BLOCKS.getValue(solidResourceLocation);
////            Item solidItemBlock = Item.getItemFromBlock(solidBlock);
////
////            ItemStack output = new ItemStack(solidItemBlock, 1, 0);
////
//////            GameRegistry.addShapedRecipe(recipeResourceLocation, solidGroup, output, "TTT", "T T", "TTT", 'T', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, meta));
//////            GameRegistry.addShapelessRecipe(recipeResourceLocation, solidGroup, output, Ingredient.fromItem(Item.getItemFromBlock(Blocks.HARDENED_CLAY)), Ingredient.fromStacks(new ItemStack(ModItems.itemColoredPaste, 1, i)));
////        }
//        for(String color : ModDataManager.COLORS)
//        {
//            ItemStack outputStack = getStack(getModBlock("solid"))
//        }
//    }
//
//    private static void initConversionRecipes()
//    {
//        int i = 2; // Conversion id (0 and 1 are already used)
//
//        for(String pattern : ModDataManager.SOLID_PATTERNS)
//        {
//            for(String color : ModDataManager.COLORS)
//            {
//                ResourceLocation recipeResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color + "_" + i);
//
//                ResourceLocation patternResourceLocation = new ResourceLocation(ModReference.MODID, pattern + "_" + color);
//                ResourceLocation solidResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color);
//
//                Block patternBlock = ForgeRegistries.BLOCKS.getValue(patternResourceLocation);
//                Block solidBlock = ForgeRegistries.BLOCKS.getValue(solidResourceLocation);
//
//                Item blankPress = PressItems.itemPressBlank;
//                Item solidItemBlock = Item.getItemFromBlock(solidBlock);
//
//                ItemStack outputStack = new ItemStack(solidItemBlock, 8);
//                GameRegistry.addShapedRecipe(recipeResourceLocation, solidGroup, outputStack, "BBB", "BPB", "BBB", 'B', patternBlock, 'P', blankPress);
//            }
//            i++; // Increase conversion id
//        }
//    }
//}
