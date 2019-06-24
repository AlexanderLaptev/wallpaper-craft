package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class DottedBlocks
{
    public static MetaBlockTypeA blockDottedRed;
    public static MetaBlockTypeA blockDottedBlue;
    public static MetaBlockTypeA blockDottedYellow;
    public static MetaBlockTypeA blockDottedGreen;
    public static MetaBlockTypeA blockDottedGray;
    public static MetaBlockTypeB blockDottedCyan;
    public static MetaBlockTypeA blockDottedBrown;
    public static MetaBlockTypeA blockDottedPurple;

    public static void instantiate()
    {
        blockDottedRed =  BlockHelper.createSolidBlockTypeA("dotted_red");
        blockDottedBlue = BlockHelper.createSolidBlockTypeA("dotted_blue");
        blockDottedYellow = BlockHelper.createSolidBlockTypeA("dotted_yellow");
        blockDottedGreen = BlockHelper.createSolidBlockTypeA("dotted_green");
        blockDottedGray= BlockHelper.createSolidBlockTypeA("dotted_gray");
        blockDottedCyan= BlockHelper.createSolidBlockTypeB("dotted_cyan");
        blockDottedBrown= BlockHelper.createSolidBlockTypeA("dotted_brown");
        blockDottedPurple = BlockHelper.createSolidBlockTypeA("dotted_purple");
    }
}
