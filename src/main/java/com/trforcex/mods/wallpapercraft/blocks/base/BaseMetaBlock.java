package com.trforcex.mods.wallpapercraft.blocks.base;

import com.trforcex.mods.wallpapercraft.init.ModBlocks;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

// Base class with common code for MetaBlocks
public abstract class BaseMetaBlock extends Block implements IHasMetaItemBlock
{
    private final MetaItemBlock itemBlock; // Every MetaBlock has corresponding MetaItemBlock

    // Constructor with common logic without setting default state (done in derived classes)
    public BaseMetaBlock(Material materialIn, float hardness, float resistance, String registryName)
    {
        super(materialIn);

        setHardness(hardness);
        setResistance(resistance);

        setRegistryName(registryName);
        setUnlocalizedName(ModHelper.makeUnlocalizedName(this));

        setCreativeTab(ModCreativeTab.WPC_TAB);

        itemBlock = new MetaItemBlock(this);
        ModBlocks.BLOCKS.add(this);
    }

    // Getter for itemBlock (since it's private)
    @Override
    public MetaItemBlock getItemBlock()
    {
        return itemBlock;
    }
}
