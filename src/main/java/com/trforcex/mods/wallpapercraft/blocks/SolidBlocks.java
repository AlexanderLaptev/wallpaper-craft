package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockSolidRed =  BlockFactory.createSolidBlockTypeA("solid_red");
        blockSolidBlue = BlockFactory.createSolidBlockTypeA("solid_blue");
        blockSolidYellow = BlockFactory.createSolidBlockTypeA("solid_yellow");
        blockSolidGreen = BlockFactory.createSolidBlockTypeA("solid_green");
        blockSolidGray= BlockFactory.createSolidBlockTypeA("solid_gray");
        blockSolidCyan= BlockFactory.createSolidBlockTypeB("solid_cyan");
        blockSolidBrown= BlockFactory.createSolidBlockTypeA("solid_brown");
        blockSolidPurple = BlockFactory.createSolidBlockTypeA("solid_purple");
    }
}
