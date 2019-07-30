package com.trforcex.mods.wallpapercraft.blocks.base;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class MetaBlockForestry extends BaseMetaBlock // Used for wood 17-29
{
    protected static final PropertyInteger variantProperty = PropertyInteger.create("variant", 0, 12); // 13 wood types

    public MetaBlockForestry(Material materialIn, float hardness, float resistance, String registryName)
    {
        super(materialIn, hardness, resistance, registryName);
        setDefaultState(getDefaultState().withProperty(variantProperty, 0));
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, variantProperty);
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(variantProperty, meta);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(variantProperty);
    }

    @Override
    public int getMaxMeta()
    {
        return 12;
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for(int i = 0; i <= 12; i++)
        {
            ItemStack newStack = new ItemStack(this, 1, i);
            items.add(newStack);
        }
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return state.getValue(variantProperty);
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(this, 1, state.getValue(variantProperty));
    }
}
