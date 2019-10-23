package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.init.ModItems;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BasePressItem extends Item
{
    private final boolean HAS_DURABILITY = ModConfig.crafting.maxPatternPressUses != 0;

    public BasePressItem(String registryName)
    {
        setRegistryName(registryName);
        setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
        setCreativeTab(ModCreativeTab.WPC_TAB);

        setMaxDamage(ModConfig.crafting.maxPatternPressUses);

        if(HAS_DURABILITY)
            setMaxStackSize(1);
        else
            setMaxStackSize(64);

        ModItems.ITEMS.add(this);
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean hasContainerItem()
    {
        return true;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if(HAS_DURABILITY)
            if(itemStack.getItemDamage() < getMaxDamage())
                return new ItemStack(itemStack.getItem(), itemStack.getCount(), itemStack.getItemDamage() + 1); // Increase damage
            else
                return ItemStack.EMPTY; // Return nothing because press breaks.
        else
            return new ItemStack(this, itemStack.getCount(), itemStack.getMetadata());
    }
}
