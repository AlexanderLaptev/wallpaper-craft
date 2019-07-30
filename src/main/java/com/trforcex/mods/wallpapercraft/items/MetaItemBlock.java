package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.blockStates.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.init.ModKeybinds;
import com.trforcex.mods.wallpapercraft.util.ConfigManager;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nullable;
import java.util.List;

public class MetaItemBlock extends ItemBlock
{
    public MetaItemBlock(Block block)
    {
        super(block);

        if(!(block instanceof IHasMetaItemBlock))
            throw new IllegalArgumentException("Block \"" + block.getUnlocalizedName() + "\" is not supposed to have MetaItemBlock!");

        setMaxDamage(0);
        setHasSubtypes(true);
        setRegistryName(block.getRegistryName());
        setUnlocalizedName(ModHelper.makeUnlocalizedName(this));

        setCreativeTab(ModCreativeTab.WPC_TAB);
    }

    public void initModel()
    {
        for(int i = 0; i <= ((IHasMetaItemBlock)block).getMaxMeta(); i++) // For each meta value
        {
            ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "variant=" + i);
            ModelLoader.setCustomModelResourceLocation(this, i, model);
        }

        ModHelper.logDebug("MetaItemBlock [initModel] - initialized model for " + getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName(stack) + "_" + stack.getMetadata();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(ConfigManager.getEnableScrollingHint())
        {
            tooltip.add(TextFormatting.GREEN + "Hold the " + TextFormatting.WHITE + "[" + ModKeybinds.metaScrollKey.getDisplayName() + "] " + TextFormatting.GREEN + "key and scroll the mouse");
            tooltip.add(TextFormatting.GREEN + "wheel to change the shade of the color");
        }
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        for(int i = 0; i <= ((IHasMetaItemBlock)block).getMaxMeta(); i++)
        {
            ItemStack newStack = new ItemStack(this, 1, i);

            if(isInCreativeTab(tab))
                items.add(newStack);
        }

        ModHelper.logDebug("MetaItemBlock [getSubItems] - complete");
    }

    @Override
    public int getMetadata(int damage)
    {
        return damage;
    }

    public int getMaxMeta()
    {
        return ((IHasMetaItemBlock)block).getMaxMeta();
    }
}
