package com.trforcex.mods.wallpapercraft.blocks.base;

import com.trforcex.mods.wallpapercraft.blockstates.EnumTypeB;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

@SuppressWarnings("deprecation")
public class ModBlockTypeB extends BaseModBlock
{
    protected static final PropertyEnum<EnumTypeB> variantProperty = PropertyEnum.create("variant", EnumTypeB.class);

    public ModBlockTypeB(Material materialIn, float hardness, float resistance, String registryName)
    {
        super(materialIn, hardness, resistance, registryName); // Construct base
        
        setDefaultState(getDefaultState().withProperty(variantProperty, EnumTypeB.A)); // Set default state
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, variantProperty);
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        return state.getValue(variantProperty).getMeta();
    }

    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(variantProperty, EnumTypeB.withMeta(meta));
    }

    @Override
    public int getMaxMeta()
    {
        return EnumTypeB.MAX_META;
    }

    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for(int i = 0; i <= EnumTypeB.MAX_META; i++)
        {
            ItemStack newStack = new ItemStack(this, 1, i);
            items.add(newStack);
        }
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(this, 1, state.getValue(variantProperty).getMeta());
    }

    @Override
    public int damageDropped(IBlockState state)
    {
        return state.getValue(variantProperty).getMeta();
    }
}
