package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockDamaskRed =  BlockHelper.createSolidBlockTypeA("damask_red");
        blockDamaskBlue = BlockHelper.createSolidBlockTypeA("damask_blue");
        blockDamaskYellow = BlockHelper.createSolidBlockTypeA("damask_yellow");
        blockDamaskGreen = BlockHelper.createSolidBlockTypeA("damask_green");
        blockDamaskGray= BlockHelper.createSolidBlockTypeA("damask_gray");
        blockDamaskCyan= BlockHelper.createSolidBlockTypeB("damask_cyan");
        blockDamaskBrown= BlockHelper.createSolidBlockTypeA("damask_brown");
        blockDamaskPurple = BlockHelper.createSolidBlockTypeA("damask_purple");
    }
}
