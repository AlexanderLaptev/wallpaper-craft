package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.blocks.base.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.init.ModKeybinds;
import com.trforcex.mods.wallpapercraft.util.ForestryDataManager;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

enum HintType
{
    General, Forestry
}

public class MetaItemBlock extends ItemBlock implements IScrollable
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
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName(stack) + "_" + stack.getMetadata();
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        if(ModConfig.enableTooltipHints)
        {
            tooltip.add(I18n.format("tooltip.wallpapercraft.part_1") + ModKeybinds.metaScrollKey.getDisplayName() + I18n.format("tooltip.wallpapercraft.part_2"));
            tooltip.add(I18n.format("tooltip.wallpapercraft.part_3"));
            if(getHintType(stack) == HintType.Forestry)
                tooltip.add(I18n.format("tooltip.wallpapercraft.forestry_hint"));
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

    @Override
    public ScrollingType getScrollingType()
    {
        String name = block.getRegistryName().getResourcePath();
        name = name.substring(0, name.length() - 2); // Get rid of last two characters ("_1" or "_2")

        final List<String> patterns = Arrays.asList(ForestryDataManager.PATTERNS); // Convert patterns to List
        if(patterns.contains(name)) // Check if name is in patterns
            return ScrollingType.ForestryCompatible;
        else
            return ScrollingType.Scrollable;
    }

    private static HintType getHintType(ItemStack stack)
    {
        if(((MetaItemBlock)stack.getItem()).getScrollingType() == ScrollingType.ForestryCompatible && stack.getMetadata() != 0)
            return HintType.Forestry;
        else
            return HintType.General;
    }
}
