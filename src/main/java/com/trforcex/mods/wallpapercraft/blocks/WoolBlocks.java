package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockWoolRed =  BlockFactory.createWoolBlockTypeA("wool_red");
        blockWoolBlue = BlockFactory.createWoolBlockTypeA("wool_blue");
        blockWoolYellow = BlockFactory.createWoolBlockTypeA("wool_yellow");
        blockWoolGreen = BlockFactory.createWoolBlockTypeA("wool_green");
        blockWoolGray= BlockFactory.createWoolBlockTypeA("wool_gray");
        blockWoolCyan= BlockFactory.createWoolBlockTypeB("wool_cyan");
        blockWoolBrown= BlockFactory.createWoolBlockTypeA("wool_brown");
        blockWoolPurple = BlockFactory.createWoolBlockTypeA("wool_purple");
    }
}
