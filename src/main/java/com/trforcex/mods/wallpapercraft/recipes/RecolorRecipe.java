package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.blocks.SolidBlocks;
import com.trforcex.mods.wallpapercraft.blocks.base.BaseMetaBlock;
import com.trforcex.mods.wallpapercraft.items.ColoredPaste;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.block.Block;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import javax.annotation.Nullable;

// Change block color using a piece of coloring paste
public class RecolorRecipe implements IRecipe
{
    private static class IngredientsWrapper
    {
        int blockSlot, pasteSlot;
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn)
    {
        try
        {
            getIngredientsWrapper(inv);
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
        IngredientsWrapper wrapper = getIngredientsWrapper(inv);

        ItemStack pasteStack = inv.getStackInSlot(wrapper.pasteSlot);

        ItemStack blockStack = inv.getStackInSlot(wrapper.blockSlot);
        BaseMetaBlock block = (BaseMetaBlock) Block.getBlockFromItem(blockStack.getItem());

        Block newBlock = RecipeHelper.recolorBlock(block, pasteStack);
        return new ItemStack(newBlock, 1, blockStack.getMetadata());
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
    public boolean isDynamic()
    {
        return true;
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
        return RecipeHelper.getModResLoc("recolor_recipe");
    }

    @Override
    public Class<IRecipe> getRegistryType()
    {
        return IRecipe.class;
    }

    private static IngredientsWrapper getIngredientsWrapper(InventoryCrafting inv)
    {
        IngredientsWrapper wrapper = new IngredientsWrapper();
        int matchingPasteSlots = 0, matchingBlockSlots = 0;

        for(int slot = 0; slot < inv.getSizeInventory(); slot++)
        {
            Item slotItem = inv.getStackInSlot(slot).getItem();
            if(slotItem instanceof ColoredPaste)
            {
                matchingPasteSlots++;
                wrapper.pasteSlot = slot;
            }
            else if(slotItem instanceof MetaItemBlock)
            {
                matchingBlockSlots++;
                wrapper.blockSlot = slot;
            }
            else if(!inv.getStackInSlot(slot).isEmpty())
                throw new RecipeHelper.WrongIngredientsException();
        }

        if(matchingPasteSlots != 1 || matchingBlockSlots != 1)
            throw new RecipeHelper.WrongIngredientsException();

        String pasteColor = ModDataManager.COLORS.get(inv.getStackInSlot(wrapper.pasteSlot).getMetadata());

        String[] parts = inv.getStackInSlot(wrapper.blockSlot).getItem().getRegistryName().getResourcePath().split("_");
        if(pasteColor.equals(parts[parts.length - 1]))
            throw new RecipeHelper.WrongIngredientsException();

        return wrapper;
    }
}
