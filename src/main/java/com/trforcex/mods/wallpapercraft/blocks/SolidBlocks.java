package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class SolidBlocks
{
    public static MetaBlockTypeA blockSolidRed;
    public static MetaBlockTypeA blockSolidBlue;
    public static MetaBlockTypeA blockSolidYellow;
    public static MetaBlockTypeA blockSolidGreen;
    public static MetaBlockTypeA blockSolidGray;
    public static MetaBlockTypeB blockSolidCyan;
    public static MetaBlockTypeA blockSolidBrown;
    public static MetaBlockTypeA blockSolidPurple;

    public static void instantiate()
    {
        blockSolidRed =  BlockHelper.createSolidBlockTypeA("solid_red");
        blockSolidBlue = BlockHelper.createSolidBlockTypeA("solid_blue");
        blockSolidYellow = BlockHelper.createSolidBlockTypeA("solid_yellow");
        blockSolidGreen = BlockHelper.createSolidBlockTypeA("solid_green");
        blockSolidGray= BlockHelper.createSolidBlockTypeA("solid_gray");
        blockSolidCyan= BlockHelper.createSolidBlockTypeB("solid_cyan");
        blockSolidBrown= BlockHelper.createSolidBlockTypeA("solid_brown");
        blockSolidPurple = BlockHelper.createSolidBlockTypeA("solid_purple");
    }
}
