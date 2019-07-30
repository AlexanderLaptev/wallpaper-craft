package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.util.ConfigManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasePressItem extends Item
{
    private boolean hasDurability = false;
    private int maxDurability;

    public BasePressItem()
    {
        setMaxDamage(ConfigManager.getMaxPressDurability());

        maxDurability = ConfigManager.getMaxPressDurability();
        hasDurability = maxDurability != 0;

        if(hasDurability)
            setMaxStackSize(1);
        else
            setMaxStackSize(64);
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean hasContainerItem()
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if(hasDurability)
            if(itemStack.getItemDamage() < maxDurability)
                return new ItemStack(itemStack.getItem(), itemStack.getCount(), itemStack.getItemDamage() + 1); // Increase damage
            else
                return ItemStack.EMPTY; // Return nothing because press breaks.
        else
            return new ItemStack(this, itemStack.getCount(), itemStack.getMetadata());
    }
}
