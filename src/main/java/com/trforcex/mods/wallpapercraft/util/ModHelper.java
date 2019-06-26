package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModHelper
{
    public static String makeUnlocalizedName(Item item)
    {
        return ModReference.MODID + "." + item.getRegistryName().getResourcePath();
    }

    public static String makeUnlocalizedName(Block block)
    {
        return ModReference.MODID + "." + block.getRegistryName().getResourcePath();
    }

    public static int getMetaItemBlockMaxMeta(Item item)
    {
        if(item instanceof MetaItemBlock)
            return ((MetaItemBlock)item).getMaxMeta();

        throw new IllegalArgumentException("Cannot get maxMeta for non-MetaItemBlock item " + item.getUnlocalizedName());
    }
}
