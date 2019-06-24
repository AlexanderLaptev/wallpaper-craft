package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockClayRed =  BlockHelper.createSolidBlockTypeA("clay_red");
        blockClayBlue = BlockHelper.createSolidBlockTypeA("clay_blue");
        blockClayYellow = BlockHelper.createSolidBlockTypeA("clay_yellow");
        blockClayGreen = BlockHelper.createSolidBlockTypeA("clay_green");
        blockClayGray= BlockHelper.createSolidBlockTypeA("clay_gray");
        blockClayCyan= BlockHelper.createSolidBlockTypeB("clay_cyan");
        blockClayBrown= BlockHelper.createSolidBlockTypeA("clay_brown");
        blockClayPurple = BlockHelper.createSolidBlockTypeA("clay_purple");
    }
}
