//package com.trforcex.mods.wallpapercraft.util;
//
//import com.trforcex.mods.wallpapercraft.ModReference;
//import net.minecraft.block.Block;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.crafting.Ingredient;
//import net.minecraft.nbt.NBTTagCompound;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.fml.common.registry.ForgeRegistries;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//import net.minecraftforge.oredict.OreDictionary;
//import net.minecraftforge.oredict.OreIngredient;
//
//import javax.annotation.Nullable;
//
//public class RecipeHelper
//{
//    /** Tries to get any mod block from its registry name (without domain).
//     *
//     * @return Returns block if found. Throws exception if not found.
//     * @throws IllegalArgumentException
//     */
//    public static Block getModBlockFromRegistry(String registryName)
//    {
//        ResourceLocation resourceLocation = new ResourceLocation(ModReference.MODID, registryName);
//        Block block = ForgeRegistries.BLOCKS.getValue(resourceLocation);
//
//        if(block != null)
//            return block;
//
//        throw new IllegalArgumentException("Cannot get mod block from " + registryName);
//    }
//
//    /** Tries to get any mod item from its registry name (without domain).
//     *
//     * @return Returns item if found. Throws exception if not found.
//     * @throws IllegalArgumentException
//     */
//    public static Item getModItemFromRegistry(String registryName)
//    {
//        ResourceLocation resLoc = new ResourceLocation(ModReference.MODID, registryName);
//        Item item = ForgeRegistries.ITEMS.getValue(resLoc);
//
//        if(item != null)
//            return item;
//
//        throw new IllegalArgumentException("Cannot get item from " + registryName);
//    }
//
//    public static String getPatternPath(String pattern, String color)
//    {
//        return pattern + "_" + color;
//    }
//
//    /** Creates and validates ItemStack. Throws an exception if stack is empty.
//     *
//     * @return ItemStack if is not empty.
//     * @throws IllegalArgumentException
//     */
//    private static ItemStack validStack(Item item, int amount, int meta)
//    {
//        ItemStack newStack = new ItemStack(item, amount, meta);
//
//        if(newStack.isEmpty())
//            throw new IllegalArgumentException("ItemStack" + newStack + "is empty, but is not supposed to be");
//
//        return newStack;
//    }
//    public static ItemStack validStack(Block block, int amount, int meta)
//    {
//        ItemStack newStack = new ItemStack(block, amount, meta);
//
//        if(newStack.isEmpty())
//            throw new IllegalArgumentException("ItemStack" + newStack + "is empty, but is not supposed to be");
//
//        return newStack;
//    }
//    public static ItemStack validStack(Block block, int amount)
//    {
//        Item itemBlock = Item.getItemFromBlock(block);
//        return validStack(itemBlock, amount, 0);
//    }
//
//    public static ResourceLocation modResourceLocation(String path)
//    {
//        return new ResourceLocation(ModReference.MODID, path);
//    }
//
//    public static void validateStack(ItemStack stack)
//    {
//        if(stack == null || stack.isEmpty())
//            throw new NullPointerException(stack.getCount() + "x of [" + stack.getDisplayName() + "] is null!");
//    }
//
//    public static ResourceLocation modResLocSeparated(Object ... params)
//    {
//        String buffer[] = new String[params.length];
//        for(int i = 0; i < params.length; i++)
//            buffer[i] = params[i].toString();
//        String string = ModUtils.composeString(false, buffer);
//
//        return modResourceLocation(string);
//    }
//
////    public static ItemStack makeOutputStack(int amount, int meta, String path) { return makeOutputStack(amount, meta, path, ModReference.MODID); }
////    public static ItemStack makeOutputStack(int amount, int meta, String path, String domain)
////    {
////        return makeOutputStack(amount, meta, new ResourceLocation(domain, path));
////    }
////    public static ItemStack makeOutputStack(int amount, int meta, ResourceLocation resourceLocation)
////    {
////        Block outBlock = ForgeRegistries.BLOCKS.getValue(resourceLocation);
////
////        if(outBlock == null)
////            throw new NullPointerException("outBlock for [" + resourceLocation + "] is null!");
////
////        ItemStack outputStack = new ItemStack(outBlock, amount, meta);
////
////        Logger.logVerbose(Logger.getStackInfo(outputStack));
////        validateStack(outputStack);
////
////        return outputStack;
////    }
//
//    public static ItemStack getStack(Object obj, int amount, int meta, @Nullable NBTTagCompound tagCompound)
//    {
//        ItemStack returnStack;
//        if(obj instanceof Block)
//        {
//            returnStack = new ItemStack((Block) obj, amount, meta);
//            if(tagCompound != null)
//                returnStack.setTagCompound(tagCompound);
//
//            return returnStack;
//        }
//        else if(obj instanceof Item)
//        {
//            returnStack = new ItemStack((Item) obj, amount, meta);
//            if(tagCompound != null)
//                returnStack.setTagCompound(tagCompound);
//
//            return returnStack;
//        }
//        else if(obj instanceof String)
//        {
//            Item stackItem = getModItemFromRegistry((String) obj);
//            returnStack = new ItemStack(stackItem, amount, meta);
//            if(tagCompound != null)
//                returnStack.setTagCompound(tagCompound);
//
//            return returnStack;
//        }
//
//        throw new IllegalArgumentException("Unknown type of object: [" + obj.getClass().getName() + "]");
//    }
//
//    private static Ingredient ingredientFrom(Item item)
//    {
//        return Ingredient.fromItem(item);
//    }
//    private static Ingredient ingredientFrom(Block block)
//    {
//        return Ingredient.fromStacks(new ItemStack(block, 1, OreDictionary.WILDCARD_VALUE));
//    }
//    private static Ingredient ingredientFrom(ItemStack stack)
//    {
//        return Ingredient.fromStacks(stack);
//    }
//    private static Ingredient ingredientFrom(String oreName)
//    {
//        return new OreIngredient(oreName);
//    }
//
//    public static void addRecipe(ResourceLocation name, ResourceLocation group, ItemStack outputStack, Object ... params)
//    {
//        // Convert params to ingredients
//        Ingredient[] ingredients = new Ingredient[params.length];
//        for(int i = 0; i < params.length; i++)
//        {
//            Object obj = params[i];
//            if(obj instanceof Item)
//                ingredients[i] = ingredientFrom((Item) obj);
//            else if(obj instanceof ItemStack)
//                ingredients[i] = ingredientFrom((ItemStack) obj);
//            else if(obj instanceof Block)
//                ingredients[i] = ingredientFrom((Block) obj);
//            else if(obj instanceof String)
//                ingredients[i] = ingredientFrom((String) obj);
//            else if(obj instanceof Ingredient)
//                ingredients[i] = (Ingredient) obj;
//            else
//                throw new IllegalArgumentException("Unknown type of ingredient: [" + obj.getClass().getName() + "]");
//        }
//
//        GameRegistry.addShapelessRecipe(name, group, outputStack, ingredients);
//    }
//}
