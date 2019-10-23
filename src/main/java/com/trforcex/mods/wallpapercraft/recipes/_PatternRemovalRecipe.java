//package com.trforcex.mods.wallpapercraft.recipes;
//
//import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
//import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
//import net.minecraft.inventory.InventoryCrafting;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.crafting.IRecipe;
//import net.minecraft.util.NonNullList;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.world.World;
//
//import javax.annotation.Nullable;
//
//public class PatternRemovalRecipe implements IRecipe
//{
//    @Override
//    public boolean matches(InventoryCrafting inv, World worldIn)
//    {
//        try
//        {
//            getIngredientsList(inv); // If exception is not thrown, recipe matches
//        }
//        catch(RecipeHelper.WrongIngredientsException exception)
//        {
//            return false;
//        }
//
//        return true;
//    }
//
//    @Override
//    public ItemStack getCraftingResult(InventoryCrafting inv)
//    {
//        return null;
//    }
//
//    @Override
//    public boolean canFit(int width, int height)
//    {
//        return false;
//    }
//
//    @Override
//    public ItemStack getRecipeOutput()
//    {
//        return null;
//    }
//
//    @Override
//    public IRecipe setRegistryName(ResourceLocation name)
//    {
//        return this;
//    }
//
//    @Nullable
//    @Override
//    public ResourceLocation getRegistryName()
//    {
//        return RecipeHelper.getModResLoc("pattern_removal");
//    }
//
//    @Override
//    public Class<IRecipe> getRegistryType()
//    {
//        return null;
//    }
//
//    private NonNullList<ItemStack> getIngredientsList(InventoryCrafting inv)
//    {
//        NonNullList<ItemStack> returnStacks = NonNullList.create();
//        int acceptableStacks = 0, acceptablePresses = 0;
//
//        for(int slot = 0; slot < inv.getSizeInventory(); slot++)
//        {
//            ItemStack slotStack = inv.getStackInSlot(slot);
//
//            if(slotStack.getItem() instanceof MetaItemBlock)
//            {
//                acceptableStacks++;
//                returnStacks.add(slotStack);
//            }
//            else if(slotStack.getItem().getRegistryName().equals(RecipeHelper.getModResLoc("press_blank")))
//            {
//                acceptablePresses++;
//                returnStacks.add(slotStack);
//            }
//        }
//
//        if(acceptableStacks != 1 || acceptablePresses != 1)
//            throw new RecipeHelper.WrongIngredientsException();
//
//        return returnStacks;
//    }
//}
