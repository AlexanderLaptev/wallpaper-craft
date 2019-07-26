package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.util.ConfigManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasePressItem extends Item
{
    public BasePressItem()
    {
        setMaxDamage(ConfigManager.maxPressDurability);
        setMaxStackSize(1);
    }

    @Override
    public boolean hasContainerItem()
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        System.out.println("Getting container item for " + itemStack.getUnlocalizedName());

        if(itemStack.getItemDamage() < ConfigManager.maxPressDurability)
            return new ItemStack(itemStack.getItem(), itemStack.getCount(), itemStack.getItemDamage() + 1); // Increase damage
        else
            return ItemStack.EMPTY; // Return nothing because press breaks.
    }
}
