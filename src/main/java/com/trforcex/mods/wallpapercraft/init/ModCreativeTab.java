package com.trforcex.mods.wallpapercraft.init;

import com.trforcex.mods.wallpapercraft.items.PressItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ModCreativeTab
{
    public static final CreativeTabs WPC_TAB = new CreativeTabs("WallpaperCraft"){
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Blocks.WOOL, 1, 0);
        }
    };
}
