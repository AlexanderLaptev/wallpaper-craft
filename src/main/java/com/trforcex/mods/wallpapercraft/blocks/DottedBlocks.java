package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockDottedRed =  BlockFactory.createSolidBlockTypeA("dotted_red");
        blockDottedBlue = BlockFactory.createSolidBlockTypeA("dotted_blue");
        blockDottedYellow = BlockFactory.createSolidBlockTypeA("dotted_yellow");
        blockDottedGreen = BlockFactory.createSolidBlockTypeA("dotted_green");
        blockDottedGray= BlockFactory.createSolidBlockTypeA("dotted_gray");
        blockDottedCyan= BlockFactory.createSolidBlockTypeB("dotted_cyan");
        blockDottedBrown= BlockFactory.createSolidBlockTypeA("dotted_brown");
        blockDottedPurple = BlockFactory.createSolidBlockTypeA("dotted_purple");
    }
}
