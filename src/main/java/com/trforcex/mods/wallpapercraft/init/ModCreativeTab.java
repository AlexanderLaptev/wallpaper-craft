package com.trforcex.mods.wallpapercraft.init;

import com.trforcex.mods.wallpapercraft.blocks.DottedBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTab
{
    public static final CreativeTabs WPC_TAB = new CreativeTabs("wallpapercraft_tab")
    {
        @Override
        public ItemStack getTabIconItem()
        {
            return new ItemStack(DottedBlocks.blockDottedGreen, 1, 0);
        }
    };
}
