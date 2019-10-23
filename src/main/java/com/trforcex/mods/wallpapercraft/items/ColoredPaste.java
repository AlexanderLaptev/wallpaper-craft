package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.init.ModItems;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

import static com.trforcex.mods.wallpapercraft.init.ModCreativeTab.WPC_TAB;

/**
 * An item as replacement of expensive vanilla dyes
 */
public class ColoredPaste extends Item
{
    public static final int MAX_USES = ModConfig.crafting.maxColoredPasteUsages - 1;

    public ColoredPaste()
    {
        setRegistryName("colored_paste");

        setMaxDamage(0);
        setHasSubtypes(true);
        setMaxStackSize(1);

        setCreativeTab(WPC_TAB);
        ModItems.ITEMS.add(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ArrayList<ModelResourceLocation> modelsResLocs = new ArrayList<>(); // Init a new list to store MRLs

        for(int i = 0; i < 8; i++) // For each meta value
        {
            String color = ModDataManager.COLORS.get(i); // Get corresponding color
            ModelResourceLocation modelResLoc = new ModelResourceLocation(RecipeHelper.getModResLoc("colored_paste", color), "inventory"); // "wallpapercraft:colored_paste_red#inventory"
            modelsResLocs.add(modelResLoc); // Add MRL to the list
        }

        final ModelResourceLocation[] names = modelsResLocs.toArray(new ModelResourceLocation[0]); // Convert list to array
        ModelLoader.registerItemVariants(this, names); // Register MRLs as item variants

        ModelLoader.setCustomMeshDefinition(this, stack -> names[stack.getMetadata()]);
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        int usesLeft = getUsesLeft(itemStack);
        if(usesLeft == 0)
            return ItemStack.EMPTY;
        else
        {
            NBTTagCompound nbt = itemStack.getTagCompound();
            if(nbt != null)
                nbt.setInteger("usesLeft", usesLeft - 1);
            else
            {
                nbt = new NBTTagCompound();
                nbt.setInteger("usesLeft", usesLeft - 1);
            }
            final ItemStack stack = new ItemStack(itemStack.getItem(), itemStack.getCount(), itemStack.getMetadata());
            stack.setTagCompound(nbt);
            return stack;
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean hasContainerItem()
    {
        return true;
    }

    @Override
    public int getDamage(ItemStack stack)
    {
        if(stack.getTagCompound() != null && stack.getTagCompound().hasKey("usesLeft"))
            return MAX_USES - stack.getTagCompound().getInteger("usesLeft");

        return 0;
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public boolean isDamaged(ItemStack stack)
    {
        return getUsesLeft(stack) == MAX_USES;
    }

    @Override
    public double getDurabilityForDisplay(ItemStack stack)
    {
        return 1.0 - ((double) getUsesLeft(stack) / MAX_USES);
    }

    @Override
    public boolean showDurabilityBar(ItemStack stack)
    {
        return getUsesLeft(stack) != MAX_USES;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) // e.g. "item.wallpapercraft.colored_paste_0.name"
    {
        return "item.wallpapercraft.colored_paste_" + stack.getMetadata();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Uses left: " + (getUsesLeft(stack) + 1));
        if(ModConfig.enableTooltipHints)
            tooltip.add(I18n.format("tooltip.wallpapercraft.paste_hint"));
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        if(isInCreativeTab(tab))
        {
            for(int i = 0; i < 8; i++)
            {
                ItemStack stack = new ItemStack(this, 1, i);
                items.add(stack);
            }
        }
    }

    private int getUsesLeft(ItemStack stack)
    {
        NBTTagCompound nbt = stack.getTagCompound();
        if(nbt != null && nbt.hasKey("usesLeft"))
            return nbt.getInteger("usesLeft");

        return MAX_USES;
    }
}
