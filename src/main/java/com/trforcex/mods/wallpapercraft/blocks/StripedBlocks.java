package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockStripedRed =  BlockFactory.createSolidBlockTypeA("striped_red");
        blockStripedBlue = BlockFactory.createSolidBlockTypeA("striped_blue");
        blockStripedYellow = BlockFactory.createSolidBlockTypeA("striped_yellow");
        blockStripedGreen = BlockFactory.createSolidBlockTypeA("striped_green");
        blockStripedGray= BlockFactory.createSolidBlockTypeA("striped_gray");
        blockStripedCyan= BlockFactory.createSolidBlockTypeB("striped_cyan");
        blockStripedBrown= BlockFactory.createSolidBlockTypeA("striped_brown");
        blockStripedPurple = BlockFactory.createSolidBlockTypeA("striped_purple");
    }
}
