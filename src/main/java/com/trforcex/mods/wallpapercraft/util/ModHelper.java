package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blocks.base.BaseModBlock;
import com.trforcex.mods.wallpapercraft.blocks.base.ScrollingType;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModHelper
{
    public enum ForestryCheckResult
    {
        ForestryPlanks0, ForestryPlanks1, ForestryFireproofPlanks0, ForestryFireproofPlanks1, NonForestry
    }

    public static String makeUnlocalizedName(Item item)
    {
        return ModReference.MODID + "." + item.getRegistryName().getResourcePath();
    }

    public static String makeUnlocalizedName(Block block)
    {
        return ModReference.MODID + "." + block.getRegistryName().getResourcePath();
    }

    public static int getMetaItemBlockMaxMeta(Item item)
    {
        if(item instanceof MetaItemBlock)
            return ((MetaItemBlock)item).getMaxMeta();

        throw new IllegalArgumentException("Cannot get maxMeta for non-MetaItemBlock item " + item.getUnlocalizedName());
    }

    public static ForestryCheckResult checkIfForestryBlock(Item item)
    {
        String domain = item.getRegistryName().getResourceDomain();
        String path = item.getRegistryName().getResourcePath();

        if("forestry".equals(domain))
        {
            if("planks.1".equals(path))
            {
                return ForestryCheckResult.ForestryPlanks1;
            }
            else if("planks.0".equals(path))
            {
                return ForestryCheckResult.ForestryPlanks0;
            }
            else
            {
                if("planks.fireproof.0".equals(path))
                {
                    return ForestryCheckResult.ForestryFireproofPlanks0;
                }
                else if("planks.fireproof.1".equals(path))
                {
                    return ForestryCheckResult.ForestryFireproofPlanks1;
                }
            }
        }

        return ForestryCheckResult.NonForestry;
    }
    public static ForestryCheckResult checkIfForestryBlock(Block block)
    {
        String domain = block.getRegistryName().getResourceDomain();
        String path = block.getRegistryName().getResourcePath();

        if("forestry".equals(domain))
        {
            if("planks.1".equals(path))
            {
                return ForestryCheckResult.ForestryPlanks1;
            }
            else if("planks.0".equals(path))
            {
                return ForestryCheckResult.ForestryPlanks0;
            }
            else
            {
                if("planks.fireproof.0".equals(path))
                {
                    return ForestryCheckResult.ForestryFireproofPlanks0;
                }
                else if("planks.fireproof.1".equals(path))
                {
                    return ForestryCheckResult.ForestryFireproofPlanks1;
                }
            }
        }

        return ForestryCheckResult.NonForestry;
    }

    // FC stands for "forestry compatible"
    public static int getGroupOfFcBlock(Block block)
    {
        if(block instanceof BaseModBlock && ((BaseModBlock) block).getScrollingType() == ScrollingType.ForestryCompatible)
        {
            String path = block.getRegistryName().getResourcePath();
            String[] parts = path.split("_");
            return Integer.parseInt(parts[parts.length - 1]);
        }

        throw new IllegalArgumentException("Given block is not a FC block!");
    }
}
