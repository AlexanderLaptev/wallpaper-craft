package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class ClayBlocks
{
    public static MetaBlockTypeA blockClayRed;
    public static MetaBlockTypeA blockClayBlue;
    public static MetaBlockTypeA blockClayYellow;
    public static MetaBlockTypeA blockClayGreen;
    public static MetaBlockTypeA blockClayGray;
    public static MetaBlockTypeB blockClayCyan;
    public static MetaBlockTypeA blockClayBrown;
    public static MetaBlockTypeA blockClayPurple;

    public static void instantiate()
    {
        blockClayRed =  BlockFactory.createSolidBlockTypeA("clay_red");
        blockClayBlue = BlockFactory.createSolidBlockTypeA("clay_blue");
        blockClayYellow = BlockFactory.createSolidBlockTypeA("clay_yellow");
        blockClayGreen = BlockFactory.createSolidBlockTypeA("clay_green");
        blockClayGray= BlockFactory.createSolidBlockTypeA("clay_gray");
        blockClayCyan= BlockFactory.createSolidBlockTypeB("clay_cyan");
        blockClayBrown= BlockFactory.createSolidBlockTypeA("clay_brown");
        blockClayPurple = BlockFactory.createSolidBlockTypeA("clay_purple");
    }
}
