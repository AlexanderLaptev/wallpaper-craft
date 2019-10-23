package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.blocks.SolidBlocks;
import com.trforcex.mods.wallpapercraft.items.IScrollable;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;

// Recipe that acts like scrolling
public class ScrollingRecipe implements IRecipe
{
    @Override
    public boolean matches(InventoryCrafting inv, World worldIn)
    {
        try
        {
            getMatchingSlot(inv);
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
        ItemStack _stack = inv.getStackInSlot(getMatchingSlot(inv));
        ItemStack stack = new ItemStack(_stack.getItem(), _stack.getCount(), _stack.getMetadata());
        MetaItemBlock metaItemBlock = (MetaItemBlock) stack.getItem();
        IScrollable.ScrollingType scrollingType = metaItemBlock.getScrollingType();
        
        switch(scrollingType)
        {
        case Scrollable:
            int newMeta = MathHelper.clamp(stack.getMetadata() + 1, 0, metaItemBlock.getMaxMeta());
            
            if(newMeta != stack.getMetadata())
                stack.setItemDamage(newMeta);
            else if(newMeta == metaItemBlock.getMaxMeta())
                stack.setItemDamage(0);
            break;
        case ForestryCompatible:
            String resourcePath = metaItemBlock.getRegistryName().getResourcePath();

            final String substring = resourcePath.substring(0, resourcePath.length() - 2);
            if(resourcePath.endsWith("_1")) // First group
            {
                newMeta = MathHelper.clamp(stack.getMetadata() + 1, 0, 15);
                if(newMeta == stack.getMetadata())
                    stack = RecipeHelper.getStack(substring + "_2", stack.getCount(), 0);
                else
                    stack.setItemDamage(newMeta);
            }
            else if(resourcePath.endsWith("_2"))
            {
                newMeta = MathHelper.clamp(stack.getMetadata() + 1, 0, 12);
                if(newMeta == stack.getMetadata())
                    stack = RecipeHelper.getStack(substring + "_1", stack.getCount(), 0);
                else
                    stack.setItemDamage(newMeta);
            }
            break;
        }

        stack.setCount(1);
        return stack;
    }

    @Override
    public boolean canFit(int width, int height)
    {
        return width == 1 && height == 1;
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
        return RecipeHelper.getModResLoc("color_change_recipe");
    }

    @Override
    public Class<IRecipe> getRegistryType()
    {
        return IRecipe.class;
    }

    private int getMatchingSlot(InventoryCrafting inv)
    {
        int matchingStacks = 0;
        int matchingSlot = -1;

        for(int slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            ItemStack slotStack = inv.getStackInSlot(slot);
            if(slotStack.getItem() instanceof MetaItemBlock)
            {
                matchingStacks++;
                matchingSlot = slot;
            }
            else if(!slotStack.isEmpty())
                throw new RecipeHelper.WrongIngredientsException();
        }

        if(matchingStacks != 1)
            throw new RecipeHelper.WrongIngredientsException();
        
        return matchingSlot;
    }
}
