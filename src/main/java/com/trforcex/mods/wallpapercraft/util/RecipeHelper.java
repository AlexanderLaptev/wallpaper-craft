package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModReference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RecipeHelper
{
    /** Tries to get any mod block from its registry name (without domain).
     *
     * @return Returns block if found. Throws exception if not found.
     * @throws IllegalArgumentException
     */
    public static Block getModBlockFromRegistry(String registryName)
    {
        ResourceLocation resourceLocation = new ResourceLocation(ModReference.MODID, registryName);
        Block block = ForgeRegistries.BLOCKS.getValue(resourceLocation);

        if(block != null)
            return block;

        throw new IllegalArgumentException("Cannot get block from " + registryName);
    }

    /** Tries to get any mod item from its registry name (without domain).
     *
     * @return Returns item if found. Throws exception if not found.
     * @throws IllegalArgumentException
     */
    public static Item getModItemFromRegistry(String registryName)
    {
        ResourceLocation resLoc = new ResourceLocation(ModReference.MODID, registryName);
        Item item = ForgeRegistries.ITEMS.getValue(resLoc);

        if(item != null)
            return item;

        throw new IllegalArgumentException("Cannot get item from " + registryName);
    }

    /** Creates and validates ItemStack. Throws an exception if stack is empty.
     *
     * @return ItemStack if is not empty.
     * @throws IllegalArgumentException
     */
    public static ItemStack validStack(Item item, int amount, int meta)
    {
        ItemStack newStack = new ItemStack(item, amount, meta);

        if(newStack.isEmpty())
            throw new IllegalArgumentException("ItemStack" + newStack + "is empty, but is not supposed to be");

        return newStack;
    }

    public static String getPatternPath(String pattern, String color)
    {
        return pattern + "_" + color;
    }

    public static ItemStack validStack(Item item, int amount)
    {
        return validStack(item, amount, 0);
    }

    public static ItemStack validStack(Item item)
    {
        return validStack(item, 1, 0);
    }

    public static ItemStack validStack(Block block, int amount, int meta)
    {
        Item itemBlock = Item.getItemFromBlock(block);
        return validStack(itemBlock, amount, meta);
    }

    public static ItemStack validStack(Block block, int amount)
    {
        Item itemBlock = Item.getItemFromBlock(block);
        return validStack(itemBlock, amount, 0);
    }

    public static ItemStack validStack(Block block)
    {
        Item itemBlock = Item.getItemFromBlock(block);
        return validStack(itemBlock, 1, 0);
    }
}
