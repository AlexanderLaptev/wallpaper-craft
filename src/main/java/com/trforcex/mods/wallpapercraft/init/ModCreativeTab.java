package com.trforcex.mods.wallpapercraft.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ModCreativeTab
{
    public static final CreativeTabs WPC_TAB = new CreativeTabs("wallpapercraft_tab")
    {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Blocks.WOOL, 1, 0);
        }
    };
}
