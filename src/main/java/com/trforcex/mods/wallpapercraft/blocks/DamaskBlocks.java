package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class DamaskBlocks
{
    public static MetaBlockTypeA blockDamaskRed;
    public static MetaBlockTypeA blockDamaskBlue;
    public static MetaBlockTypeA blockDamaskYellow;
    public static MetaBlockTypeA blockDamaskGreen;
    public static MetaBlockTypeA blockDamaskGray;
    public static MetaBlockTypeB blockDamaskCyan;
    public static MetaBlockTypeA blockDamaskBrown;
    public static MetaBlockTypeA blockDamaskPurple;

    public static void instantiate()
    {
        blockDamaskRed =  BlockFactory.createSolidBlockTypeA("damask_red");
        blockDamaskBlue = BlockFactory.createSolidBlockTypeA("damask_blue");
        blockDamaskYellow = BlockFactory.createSolidBlockTypeA("damask_yellow");
        blockDamaskGreen = BlockFactory.createSolidBlockTypeA("damask_green");
        blockDamaskGray= BlockFactory.createSolidBlockTypeA("damask_gray");
        blockDamaskCyan= BlockFactory.createSolidBlockTypeB("damask_cyan");
        blockDamaskBrown= BlockFactory.createSolidBlockTypeA("damask_brown");
        blockDamaskPurple = BlockFactory.createSolidBlockTypeA("damask_purple");
    }
}
