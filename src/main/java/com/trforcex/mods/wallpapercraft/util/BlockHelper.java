package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

@SuppressWarnings("deprecation")
public class BlockHelper
{
    //region ===== SOLID =====
    public static MetaBlockTypeA createSolidBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.ROCK, 2f, 6f, registryName);
    }

    public static MetaBlockTypeB createSolidBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.ROCK, 2f, 6f, registryName);
    }

    public static MetaBlockTypeC createSolidBlockTypeC(String registryName)
    {
        return new MetaBlockTypeC(Material.ROCK, 2f, 6f, registryName);
    }
    //endregion

    //region ===== LAMPS =====
    public static MetaBlockTypeA createLampTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.ROCK, 2f, 6f, registryName)
        {
            {
                setLightLevel(1f);
            }
        };
    }

    public static MetaBlockTypeB createLampTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.ROCK, 2f, 6f, registryName)
        {
            {
                setLightLevel(1f);
            }
        };
    }
    //endregion

    //region ===== GLASS =====
    public static MetaBlockTypeA createGlassBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.GLASS, 0.3f, 1.5f, registryName)
        {
            @Override
            public BlockRenderLayer getBlockLayer()
            {
                return BlockRenderLayer.TRANSLUCENT; // All (mod) glass blocks are translucent
            }

            @Override
            public boolean isFullCube(IBlockState state)
            {
                return false;
            }

            @Override
            public boolean isOpaqueCube(IBlockState state)
            {
                return false;
            }

            @Override
            public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
            {
                IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
                Block block = iblockstate.getBlock();

                if (blockState != iblockstate)
                {
                    return true;
                }

                if (block == this)
                {
                    return false;
                }

                return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
            }
        };
    }

    public static MetaBlockTypeB createGlassBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.GLASS, 0.3f, 1.5f, registryName)
        {
            @Override
            public BlockRenderLayer getBlockLayer()
            {
                return BlockRenderLayer.TRANSLUCENT; // All (mod) glass blocks are translucent
            }

            @Override
            public boolean isFullCube(IBlockState state)
            {
                return false;
            }

            @Override
            public boolean isOpaqueCube(IBlockState state)
            {
                return false;
            }

            @Override
            public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
            {
                IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
                Block block = iblockstate.getBlock();

                if (blockState != iblockstate)
                {
                    return true;
                }

                if (block == this)
                {
                    return false;
                }

                return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
            }
        };
    }
    //endregion

    //region ===== WOOL =====
    public static MetaBlockTypeA createWoolBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.CLOTH, 0.8f, 4f, registryName);
    }

    public static MetaBlockTypeB createWoolBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.CLOTH, 0.8f, 4f, registryName);
    }
    //endregion

    //region ===== PLANKS =====
    public static MetaBlockTypeA createPlanksBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.WOOD, 2f, 15f, registryName);
    }

    public static MetaBlockTypeB createPlanksBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.WOOD, 2f, 15f, registryName);
    }
    //endregion

    //region ===== CARPETS =====
    public static MetaBlockTypeA createCarpetBlockTypeA(String registryName)
    {
    return new MetaBlockTypeA(Material.CARPET, 0.1f, 0.5f, registryName)
    {
        private final AxisAlignedBB CARPET_AABB = new AxisAlignedBB(0d, 0d, 0d, 1d, 0.0625d, 1d);

        @Override
        public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
        {
            return CARPET_AABB;
        }

        @Override
        public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
        {
            return false;
        }

        @Override
        public boolean isFullCube(IBlockState state)
        {
            return false;
        }

        private boolean canBlockStay(World worldIn, BlockPos pos)
        {
            return !worldIn.isAirBlock(pos.down());
        }

        @Override
        public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
        {
            return super.canPlaceBlockAt(worldIn, pos) && this.canBlockStay(worldIn, pos);
        }

        private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
        {
            if (!this.canBlockStay(worldIn, pos))
            {
                this.dropBlockAsItem(worldIn, pos, state, 0);
                worldIn.setBlockToAir(pos);
                return false;
            }
            else
            {
                return true;
            }
        }

        @Override
        public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
        {
            this.checkForDrop(worldIn, pos, state);
        }

        @Override
        public boolean isOpaqueCube(IBlockState state)
        {
            return false;
        }

        @Override
        @Nonnull
        @SideOnly(Side.CLIENT)
        public BlockRenderLayer getBlockLayer() {
            return BlockRenderLayer.CUTOUT_MIPPED;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
        {
            return side == EnumFacing.UP ? true : (blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side));
        }

        @Override
        public int damageDropped(IBlockState state)
        {
            return state.getValue(variantProperty).getMeta();
        }
    };
    }

    public static MetaBlockTypeB createCarpetBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.CARPET, 0.1f, 0.5f, registryName)
        {
            private final AxisAlignedBB CARPET_AABB = new AxisAlignedBB(0d, 0d, 0d, 1d, 0.0625d, 1d);

            @Override
            public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
            {
                return CARPET_AABB;
            }

            @Override
            public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
            {
                return false;
            }

            @Override
            public boolean isFullCube(IBlockState state)
            {
                return false;
            }

            private boolean canBlockStay(World worldIn, BlockPos pos)
            {
                return !worldIn.isAirBlock(pos.down());
            }

            @Override
            public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
            {
                return super.canPlaceBlockAt(worldIn, pos) && this.canBlockStay(worldIn, pos);
            }

            private boolean checkForDrop(World worldIn, BlockPos pos, IBlockState state)
            {
                if (!this.canBlockStay(worldIn, pos))
                {
                    this.dropBlockAsItem(worldIn, pos, state, 0);
                    worldIn.setBlockToAir(pos);
                    return false;
                }
                else
                {
                    return true;
                }
            }

            @Override
            public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
            {
                this.checkForDrop(worldIn, pos, state);
            }

            @Override
            public boolean isOpaqueCube(IBlockState state)
            {
                return false;
            }

            @Override
            @Nonnull
            @SideOnly(Side.CLIENT)
            public BlockRenderLayer getBlockLayer() {
                return BlockRenderLayer.CUTOUT_MIPPED;
            }

            @Override
            @SideOnly(Side.CLIENT)
            public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
            {
                return side == EnumFacing.UP ? true : (blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side));
            }

            @Override
            public int damageDropped(IBlockState state)
            {
                return state.getValue(variantProperty).getMeta();
            }
        };
    }
    //endregion
}
