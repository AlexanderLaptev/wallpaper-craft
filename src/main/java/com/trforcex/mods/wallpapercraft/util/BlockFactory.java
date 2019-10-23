package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockForestry;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeC;
import com.trforcex.mods.wallpapercraft.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import javax.annotation.Nonnull;
import java.util.Random;

@SuppressWarnings("deprecation")
public class BlockFactory
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
        return new MetaBlockTypeA(Material.ROCK, 1f, 1.5f, registryName)
        {
            {
                setLightLevel(1f);
            }
        };
    }

    public static MetaBlockTypeB createLampTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.ROCK, 1f, 1.5f, registryName)
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
            {
                setSoundType(SoundType.GLASS);
            }

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

                return block != this && super.shouldSideBeRendered(blockState, blockAccess, pos, side);
            }

            @Override
            protected boolean canSilkHarvest()
            {
                return true;
            }

            @Override
            public int quantityDropped(Random random)
            {
                return 0;
            }

            @Override
            public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
            {
                return false;
            }
        };
    }

    public static MetaBlockTypeB createGlassBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.GLASS, 0.3f, 1.5f, registryName)
        {
            {
                setSoundType(SoundType.GLASS);
            }

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

                return block != this && super.shouldSideBeRendered(blockState, blockAccess, pos, side);
            }

            @Override
            protected boolean canSilkHarvest()
            {
                return true;
            }

            @Override
            public int quantityDropped(Random random)
            {
                return 0;
            }

            @Override
            public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
            {
                return false;
            }
        };
    }
    //endregion

    //region ===== WOOL =====
    public static MetaBlockTypeA createWoolBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.CLOTH, 0.8f, 4f, registryName)
        {
            {
                setSoundType(SoundType.CLOTH);
                Blocks.FIRE.setFireInfo(this, 30, 60);
            }
        };
    }

    public static MetaBlockTypeB createWoolBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.CLOTH, 0.8f, 4f, registryName)
        {
            {
                setSoundType(SoundType.CLOTH);
                Blocks.FIRE.setFireInfo(this, 30, 60);
            }
        };
    }
    //endregion

    //region ===== PLANKS =====
    public static MetaBlockTypeA createPlanksBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.WOOD, 2f, 15f, registryName)
        {
            {
                setSoundType(SoundType.WOOD);
                Blocks.FIRE.setFireInfo(this, 5, 20);
            }
        };
    }

    public static MetaBlockTypeB createPlanksBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.WOOD, 2f, 15f, registryName)
        {
            {
                setSoundType(SoundType.WOOD);
                Blocks.FIRE.setFireInfo(this, 5, 20);
            }
        };
    }
    //endregion

    //region ===== CARPETS =====
    public static MetaBlockTypeA createCarpetBlockTypeA(String registryName)
    {
    return new MetaBlockTypeA(Material.CARPET, 0.1f, 0.5f, registryName)
    {
        {
            setSoundType(SoundType.CLOTH);
        }

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
            return side == EnumFacing.UP || (blockAccess.getBlockState(pos.offset(side)).getBlock() == this || super.shouldSideBeRendered(blockState, blockAccess, pos, side));
        }
    };
    }

    public static MetaBlockTypeB createCarpetBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.CARPET, 0.1f, 0.5f, registryName)
        {
            {
                setSoundType(SoundType.CLOTH);
            }

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
                return side == EnumFacing.UP || (blockAccess.getBlockState(pos.offset(side)).getBlock() == this || super.shouldSideBeRendered(blockState, blockAccess, pos, side));
            }
        };
    }
    //endregion

    //region ===== FORESTRY =====
    public static MetaBlockTypeC createForestryWoolBlock(String registryName)
    {
        return new MetaBlockTypeC(Material.CLOTH, 0.8f, 4f, registryName)
        {
            {
                setSoundType(SoundType.CLOTH);
                Blocks.FIRE.setFireInfo(this, 30, 60);
                ModBlocks.OREDICT_INIT.put(new ItemStack(this, 1, OreDictionary.WILDCARD_VALUE), "wool");
            }
        };
    }

    public static MetaBlockForestry createForestryWoolBlock2(String registryName) // 2 because these blocks are used for the other half of meta values
    {
        return new MetaBlockForestry(Material.CLOTH, 0.8f, 4f, registryName)
        {
            {
                setSoundType(SoundType.CLOTH);
                Blocks.FIRE.setFireInfo(this, 30, 60);
                ModBlocks.OREDICT_INIT.put(new ItemStack(this, 1, OreDictionary.WILDCARD_VALUE), "wool");
            }
        };
    }

    public static MetaBlockForestry createForestrySolidBlock2(String registryName)
    {
        return new MetaBlockForestry(Material.ROCK, 2f, 6f, registryName);
    }

    public static MetaBlockTypeC createForestryGlassBlock(String registryName)
    {
        return new MetaBlockTypeC(Material.GLASS, 0.3f, 1.5f, registryName)
        {
            {
                setSoundType(SoundType.GLASS);
            }

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

                return block != this && super.shouldSideBeRendered(blockState, blockAccess, pos, side);
            }

            @Override
            protected boolean canSilkHarvest()
            {
                return true;
            }

            @Override
            public int quantityDropped(Random random)
            {
                return 0;
            }

            @Override
            public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
            {
                return false;
            }
        };
    }

    public static MetaBlockForestry createForestryGlassBlock2(String registryName)
    {
        return new MetaBlockForestry(Material.GLASS, 0.3f, 1.5f, registryName)
        {
            {
                setSoundType(SoundType.GLASS);
            }

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

                return block != this && super.shouldSideBeRendered(blockState, blockAccess, pos, side);
            }

            @Override
            protected boolean canSilkHarvest()
            {
                return true;
            }

            @Override
            public int quantityDropped(Random random)
            {
                return 0;
            }

            @Override
            public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
            {
                return false;
            }
        };
    }

    public static MetaBlockTypeC createBeehiveLantern(String registryName)
    {
        return new MetaBlockTypeC(Material.ROCK, 2f, 6f, registryName)
        {
            {
                setLightLevel(0.53f);
            }
        };
    }

    public static MetaBlockForestry createBeehiveLantern2(String registryName)
    {
        return new MetaBlockForestry(Material.ROCK, 2f, 6f, registryName)
        {
            {
                setLightLevel(0.53f);
            }
        };
    }
    //endregion
}
