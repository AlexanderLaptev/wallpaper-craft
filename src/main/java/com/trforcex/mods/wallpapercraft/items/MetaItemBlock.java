package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.ModClass;
import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blockStates.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;

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
        for(int i = 0; i <= ((IHasMetaItemBlock)block).getMaxMeta(); i++)
        {
            ModelResourceLocation model = new ModelResourceLocation(block.getRegistryName(), "variant=" + i);
            ModelLoader.setCustomModelResourceLocation(this, i, model);
        }

        if(ModReference.debugMode)
            ModClass.logger.debug("MetaItemBlock [initModel] - initialized model for " + getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName(stack) + "_" + stack.getMetadata();
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        for(int i = 0; i <= ((IHasMetaItemBlock)block).getMaxMeta(); i++)
        {
            ItemStack newStack = new ItemStack(this, 1, i);

            if(isInCreativeTab(tab))
                items.add(newStack);

            if(ModReference.debugMode)
                ModClass.logger.debug("SubItem for: " + newStack.getDisplayName());
        }

        if(ModReference.debugMode)
            ModClass.logger.debug("MetaItemBlock [getSubItems] - complete");
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
