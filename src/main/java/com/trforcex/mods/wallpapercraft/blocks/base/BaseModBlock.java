package com.trforcex.mods.wallpapercraft.blocks.base;

import com.trforcex.mods.wallpapercraft.init.ModBlocks;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.util.ForestryDataManager;
import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

// Base class with common code for MetaBlocks
public abstract class BaseModBlock extends Block implements IHasMetaItemBlock
{
    private final MetaItemBlock itemBlock; // Every MetaBlock has corresponding MetaItemBlock

    private String pattern;
    private Block baseBlock;
    private String color;

    public String getPattern()
    {
        return pattern;
    }

    public Block getBaseBlock()
    {
        return baseBlock;
    }

    public String getColor()
    {
        return color;
    }

    // Constructor with common logic without setting default state (done in derived classes)
    public BaseModBlock(Material materialIn, float hardness, float resistance, String registryName)
    {
        super(materialIn);

        setHardness(hardness);
        setResistance(resistance);

        setRegistryName(registryName);
        setUnlocalizedName(ModHelper.makeUnlocalizedName(this));

        setCreativeTab(ModCreativeTab.WPC_TAB);

        // Set the associated itemBlock
        itemBlock = new MetaItemBlock(this);

        // Get pattern
        String[] parts = getRegistryName().getResourcePath().split("_");
        if(parts.length != 1)
            pattern = String.join("_", Arrays.copyOfRange(parts, 0, parts.length - 1));
        else
            pattern = parts[0];

        // Get color
        if(parts.length != 1 && getScrollingType() != ScrollingType.ForestryCompatible)
            color = parts[parts.length - 1]; // The last part is the color
        else if(parts.length != 1 && getScrollingType() == ScrollingType.ForestryCompatible)
            color = "f/c";
        else
            color = "j/s"; // Jewel/stamp

        // Get base block
        if(pattern.contains("carpet"))
            baseBlock = null;
        else
        {
            baseBlock = ModDataManager.BASE_BLOCK.get(pattern);
        }

        Validate.notNull(pattern, "Pattern for [" + registryName + "] is null!");
        Validate.notNull(color, "Color for [" + registryName + "] is null!");

        if(!pattern.contains("carpet"))
            Validate.notNull(baseBlock, "Base block for [" + registryName + "] is null!");

        ModBlocks.BLOCKS.add(this);
    }

    public ScrollingType getScrollingType()
    {
        String name = getRegistryName().getResourcePath();

        for(String pattern : ForestryDataManager.PATTERNS)
            if(name.contains(pattern))
                return ScrollingType.ForestryCompatible;

        return ScrollingType.Scrollable;
    }

    // Getter for itemBlock (since it's private)
    public MetaItemBlock getItemBlock()
    {
        return itemBlock;
    }
}
