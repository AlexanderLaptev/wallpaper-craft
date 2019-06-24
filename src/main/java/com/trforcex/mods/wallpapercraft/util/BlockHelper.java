package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import net.minecraft.block.material.Material;

public class BlockHelper
{
    public static MetaBlockTypeA createSolidBlockTypeA(String registryName)
    {
        return new MetaBlockTypeA(Material.ROCK, 2f, 6f, registryName);
    }

    public static MetaBlockTypeB createSolidBlockTypeB(String registryName)
    {
        return new MetaBlockTypeB(Material.ROCK, 2f, 6f, registryName);
    }

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
}
