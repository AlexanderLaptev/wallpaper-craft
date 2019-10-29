package com.trforcex.mods.wallpapercraft.crafting;

import com.trforcex.mods.wallpapercraft.ModClass;
import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.init.ModItems;
import com.trforcex.mods.wallpapercraft.items.ColoredPaste;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class PasteCombinationRecipe implements IRecipe
{
    public static final PasteCombinationRecipe INSTANCE = new PasteCombinationRecipe();
    private static final int maxDurability = ModConfig.crafting.maxColoredPasteUsages - 1;

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn)
    {
        int pasteStacks = 0;
        int durabilityA, durabilityB;
        ItemStack stackA = ItemStack.EMPTY, stackB = ItemStack.EMPTY;

        for(int slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            ItemStack slotStack = inv.getStackInSlot(slot);
            if(slotStack.getItem() instanceof ColoredPaste)
            {
                pasteStacks++;

                if(stackA.isEmpty())
                    stackA = slotStack;
                else
                    stackB = slotStack;
            }
            else if(!slotStack.isEmpty())
                return false;
        }

        try
        {
            durabilityA = stackA.hasTagCompound() ? stackA.getTagCompound().getInteger(ColoredPaste.KEY) : maxDurability;
            durabilityB = stackB.hasTagCompound() ? stackB.getTagCompound().getInteger(ColoredPaste.KEY) : maxDurability;
        }
        catch(NullPointerException e)
        {
            ModClass.logger.error("Cannot get durability of colored paste paste stack", e);
            return false;
        }
        boolean colorMatch = ColoredPaste.getColor(stackA).equals(ColoredPaste.getColor(stackB));

        return pasteStacks == 2 && colorMatch && durabilityA + durabilityB <= maxDurability;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv)
    {
        ItemStack pasteStack1 = ItemStack.EMPTY, pasteStack2 = ItemStack.EMPTY;

        for(int slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            ItemStack slotStack = inv.getStackInSlot(slot);
            if(slotStack.getItem() instanceof ColoredPaste)
                if(pasteStack1.isEmpty())
                    pasteStack1 = slotStack;
                else
                    pasteStack2 = slotStack;
        }

        if(!(pasteStack1.isEmpty() || pasteStack2.isEmpty()))
        {
            int usesLeft = MathHelper.clamp(pasteStack1.getTagCompound().getInteger(ColoredPaste.KEY) + pasteStack2.getTagCompound().getInteger(ColoredPaste.KEY) + 1, 0, maxDurability);

            NBTTagCompound nbt = new NBTTagCompound();
            nbt.setInteger(ColoredPaste.KEY, usesLeft);

            return RecipeHelper.getStack(ModItems.itemColoredPaste, 1, pasteStack1.getMetadata(), nbt);
        }

        return ItemStack.EMPTY;
    }

    @Override
    public boolean canFit(int width, int height)
    {
        return width * height >= 2;
    }

    @Override
    public ItemStack getRecipeOutput()
    {
        return ItemStack.EMPTY;
    }

    @Override
    public IRecipe setRegistryName(ResourceLocation name)
    {
        return this;
    }

    @Nullable
    @Override
    public ResourceLocation getRegistryName()
    {
        return RecipeHelper.getModResLoc("paste_combine_recipe");
    }

    @Override
    public Class<IRecipe> getRegistryType()
    {
        return IRecipe.class;
    }

    @Override
    public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv)
    {
        return NonNullList.withSize(inv.getSizeInventory(), ItemStack.EMPTY);
    }
}
