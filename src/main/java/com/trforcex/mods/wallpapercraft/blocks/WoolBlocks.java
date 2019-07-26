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
        blockWoolRed =  BlockHelper.createWoolBlockTypeA("wool_red");
        blockWoolBlue = BlockHelper.createWoolBlockTypeA("wool_blue");
        blockWoolYellow = BlockHelper.createWoolBlockTypeA("wool_yellow");
        blockWoolGreen = BlockHelper.createWoolBlockTypeA("wool_green");
        blockWoolGray= BlockHelper.createWoolBlockTypeA("wool_gray");
        blockWoolCyan= BlockHelper.createWoolBlockTypeB("wool_cyan");
        blockWoolBrown= BlockHelper.createWoolBlockTypeA("wool_brown");
        blockWoolPurple = BlockHelper.createWoolBlockTypeA("wool_purple");
    }
}
