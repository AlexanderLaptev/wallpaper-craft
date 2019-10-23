package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.blocks.SolidBlocks;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Arrays;

public class PatternRemovalRecipe implements IRecipe
{
    private class IngredientsWrapper
    {
        int blockSlot;
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn)
    {
        try
        {
            getWrapper(inv);
        }
        catch(RecipeHelper.WrongIngredientsException e)
        {
            return false;
        }

        return true;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv)
    {
        IngredientsWrapper wrapper = getWrapper(inv);

        String[] parts = inv.getStackInSlot(wrapper.blockSlot).getItem().getRegistryName().getResourcePath().split("_");

        String pattern;
        if(parts.length != 1)
            pattern = String.join("_", Arrays.copyOfRange(parts, 0, parts.length - 1));
        else
            pattern = parts[0];

        Block baseBlock = RecipeHelper.getBaseBlock(pattern);
        if(baseBlock != null)
            return new ItemStack(baseBlock, 1, 0);
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canFit(int width, int height)
    {
        return false;
    }

    @Override
    public ItemStack getRecipeOutput()
    {
        return new ItemStack(SolidBlocks.blockSolidRed, 1, 0);
    }

    @Override
    public IRecipe setRegistryName(ResourceLocation name)
    {
        return this;
    }

    @Override
    public boolean isDynamic()
    {
        return true;
    }

    @Nullable
    @Override
    public ResourceLocation getRegistryName()
    {
        return RecipeHelper.getModResLoc("pattern_removal_recipe");
    }

    @Override
    public Class<IRecipe> getRegistryType()
    {
        return IRecipe.class;
    }

    private IngredientsWrapper getWrapper(InventoryCrafting inv)
    {
        IngredientsWrapper wrapper = new IngredientsWrapper();
        int matchingBlockStacks = 0, matchingPressStacks = 0;

        for(int slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            Item slotItem = inv.getStackInSlot(slot).getItem();

            if(slotItem instanceof MetaItemBlock)
            {
                matchingBlockStacks++;
                wrapper.blockSlot = slot;
            }
            else if((slotItem.getRegistryName().getResourcePath().equals(PressItems.itemPressRemoval.getRegistryName().getResourcePath())) && !(inv.getStackInSlot(slot).isEmpty()))
            {
                matchingPressStacks++;
            }
            else if(!inv.getStackInSlot(slot).isEmpty())
                throw new RecipeHelper.WrongIngredientsException();
        }

        if(matchingBlockStacks != 1 || matchingPressStacks != 1)
            throw new RecipeHelper.WrongIngredientsException();

        return wrapper;
    }
}
