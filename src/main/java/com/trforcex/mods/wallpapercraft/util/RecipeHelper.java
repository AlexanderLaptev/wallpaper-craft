package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blocks.base.BaseModBlock;
import com.trforcex.mods.wallpapercraft.init.ModItems;
import com.trforcex.mods.wallpapercraft.items.BasePressItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreIngredient;
import org.apache.commons.lang3.Validate;

import javax.annotation.Nullable;

public class RecipeHelper
{
    public static class WrongIngredientsException extends RuntimeException {}

    public static BasePressItem getPressFor(BaseModBlock modBlock)
    {
        BasePressItem item;
        if(modBlock.getPattern().equals("forestry_stone_bricks"))
            item = (BasePressItem) ForgeRegistries.ITEMS.getValue(getModResLoc("press_stone_bricks"));
        else
            item = (BasePressItem) ForgeRegistries.ITEMS.getValue(getModResLoc("press", modBlock.getPattern()));

        Validate.notNull(item, "Press for [" + getModResLoc("press", modBlock.getPattern()) + "] is null!");
        return item;
    }

    public static ResourceLocation getModResLoc(String ... params)
    {
        return new ResourceLocation(ModReference.MODID, ModUtils.composeString((Object[]) params));
    }

    public static void addRecipe(ResourceLocation name, ResourceLocation group, ItemStack output, Object ... ingredients)
    {
        Validate.noNullElements(ingredients);

        Ingredient[] arrIngredients = new Ingredient[ingredients.length];

        for(int i = 0; i < ingredients.length; i++)
        {
            arrIngredients[i] = getIngredientFrom(ingredients[i]);
        }

        validate(output);

        for(Ingredient ingredient : arrIngredients)
            if(ingredient.equals(Ingredient.EMPTY))
                throw new NullPointerException("Ingredient [" + ingredient + "] is empty, but is not supposed to be");

        GameRegistry.addShapelessRecipe(name, group, output, arrIngredients);
    }

    //region Ingredients
    public static Ingredient getIngredientFrom(Object obj)
    {
        if(obj instanceof Item)
            return Ingredient.fromItem((Item) obj);
        else if(obj instanceof ItemStack)
            return Ingredient.fromStacks((ItemStack) obj);
        else if(obj instanceof Block)
            return Ingredient.fromStacks(new ItemStack((Block) obj, 1, OreDictionary.WILDCARD_VALUE));
        else if(obj instanceof String)
            return new OreIngredient((String) obj);
        else if(obj instanceof Ingredient)
            return (Ingredient) obj;
        else
            throw new IllegalArgumentException("Unknown type of ingredient: [" + obj.getClass().getName() + "]");
    }
    //endregion

    //region Items and blocks
    public static Item getModItem(String ... params)
    {
        return getModItem(getModResLoc(params));
    }
    public static Item getModItem(ResourceLocation registryName)
    {
        Item item = ForgeRegistries.ITEMS.getValue(registryName);
        Validate.notNull(item, "Item [" + registryName + "] is null, but is not supposed to be");
        return item;
    }

    public static Block getModBlock(String ... params)
    {
        return getModBlock(getModResLoc(params));
    }
    public static Block getModBlock(ResourceLocation registryName)
    {
        Block block = ForgeRegistries.BLOCKS.getValue(registryName);
        Validate.notNull(block, "Block [" + registryName + "] is null, but is not supposed to be");
        return block;
    }
    //endregion

    //region Stacks
    public static ItemStack getStack(Object obj, int amount, int meta)
    {
        return getStack(obj, amount, meta, null);
    }
    public static ItemStack getStack(Object obj, int amount, int meta, @Nullable NBTTagCompound tagCompound)
    {
        ItemStack returnStack;
        if(obj instanceof Block)
        {
            returnStack = new ItemStack((Block) obj, amount, meta);
            if(tagCompound != null)
                returnStack.setTagCompound(tagCompound);

            validate(returnStack);
            return returnStack;
        }
        else if(obj instanceof Item)
        {
            returnStack = new ItemStack((Item) obj, amount, meta);
            if(tagCompound != null)
                returnStack.setTagCompound(tagCompound);

            validate(returnStack);
            return returnStack;
        }
        else if(obj instanceof String)
        {
            Item stackItem = getModItem((String) obj);
            returnStack = new ItemStack(stackItem, amount, meta);
            if(tagCompound != null)
                returnStack.setTagCompound(tagCompound);

            validate(returnStack);
            return returnStack;
        }
        else if(obj instanceof ResourceLocation)
        {
            Item stackItem = ForgeRegistries.ITEMS.getValue((ResourceLocation) obj);
            returnStack = new ItemStack(stackItem, amount, meta);
            if(tagCompound != null)
                returnStack.setTagCompound(tagCompound);

            validate(returnStack);
            return returnStack;
        }

        throw new IllegalArgumentException("Unknown type of object: [" + obj.getClass().getName() + "]");
    }

    public static void validate(ItemStack stack)
    {
        if(stack == null || stack.isEmpty())
            throw new IllegalArgumentException("ItemStack : x" + stack.getCount() + " of " + stack.getDisplayName() + ", meta:" + stack.getMetadata() + "is empty, but is not supposed to be");
    }

    public static ItemStack getColoredPasteStack(String color)
    {
        final ItemStack stack = new ItemStack(ModItems.itemColoredPaste, 1, ModDataManager.COLORS.indexOf(color));
        validate(stack);
        return stack;
    }
    //endregion

    public static Block recolorBlock(BaseModBlock block, ItemStack pasteStack)
    {
        // Get paste color
        String pasteColor = ModDataManager.COLORS.get(pasteStack.getMetadata());

        // Replace block color with paste color
        String[] parts = block.getRegistryName().getResourcePath().split("_"); // Split registry name by "_" symbol
        parts[parts.length - 1] = pasteColor; // Replace the last part with new color ["damask_red"] -> ["damask_blue"]

        return getModBlock(parts);
    }
}
