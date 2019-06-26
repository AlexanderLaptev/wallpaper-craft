package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class StripedBlocks
{
    public static MetaBlockTypeA blockStripedRed;
    public static MetaBlockTypeA blockStripedBlue;
    public static MetaBlockTypeA blockStripedYellow;
    public static MetaBlockTypeA blockStripedGreen;
    public static MetaBlockTypeA blockStripedGray;
    public static MetaBlockTypeB blockStripedCyan;
    public static MetaBlockTypeA blockStripedBrown;
    public static MetaBlockTypeA blockStripedPurple;

    public static void instantiate()
    {
        blockStripedRed =  BlockHelper.createSolidBlockTypeA("striped_red");
        blockStripedBlue = BlockHelper.createSolidBlockTypeA("striped_blue");
        blockStripedYellow = BlockHelper.createSolidBlockTypeA("striped_yellow");
        blockStripedGreen = BlockHelper.createSolidBlockTypeA("striped_green");
        blockStripedGray= BlockHelper.createSolidBlockTypeA("striped_gray");
        blockStripedCyan= BlockHelper.createSolidBlockTypeB("striped_cyan");
        blockStripedBrown= BlockHelper.createSolidBlockTypeA("striped_brown");
        blockStripedPurple = BlockHelper.createSolidBlockTypeA("striped_purple");
    }
}
