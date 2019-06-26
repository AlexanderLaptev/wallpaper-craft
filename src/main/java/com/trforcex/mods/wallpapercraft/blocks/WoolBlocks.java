package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class WoolBlocks
{
    public static MetaBlockTypeA blockWoolRed;
    public static MetaBlockTypeA blockWoolBlue;
    public static MetaBlockTypeA blockWoolYellow;
    public static MetaBlockTypeA blockWoolGreen;
    public static MetaBlockTypeA blockWoolGray;
    public static MetaBlockTypeB blockWoolCyan;
    public static MetaBlockTypeA blockWoolBrown;
    public static MetaBlockTypeA blockWoolPurple;

    public static void instantiate()
    {
        blockWoolRed =  BlockHelper.createSolidBlockTypeA("wool_red");
        blockWoolBlue = BlockHelper.createSolidBlockTypeA("wool_blue");
        blockWoolYellow = BlockHelper.createSolidBlockTypeA("wool_yellow");
        blockWoolGreen = BlockHelper.createSolidBlockTypeA("wool_green");
        blockWoolGray= BlockHelper.createSolidBlockTypeA("wool_gray");
        blockWoolCyan= BlockHelper.createSolidBlockTypeB("wool_cyan");
        blockWoolBrown= BlockHelper.createSolidBlockTypeA("wool_brown");
        blockWoolPurple = BlockHelper.createSolidBlockTypeA("wool_purple");
    }
}
