package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class WoolCarpetsBlocks
{
    public static MetaBlockTypeA blockWoolCarpetRed;
    public static MetaBlockTypeA blockWoolCarpetBlue;
    public static MetaBlockTypeA blockWoolCarpetYellow;
    public static MetaBlockTypeA blockWoolCarpetGreen;
    public static MetaBlockTypeA blockWoolCarpetGray;
    public static MetaBlockTypeB blockWoolCarpetCyan;
    public static MetaBlockTypeA blockWoolCarpetBrown;
    public static MetaBlockTypeA blockWoolCarpetPurple;

    public static void instantiate()
    {
        blockWoolCarpetRed =  BlockHelper.createCarpetBlockTypeA("wool_carpet_red");
        blockWoolCarpetBlue = BlockHelper.createCarpetBlockTypeA("wool_carpet_blue");
        blockWoolCarpetYellow = BlockHelper.createCarpetBlockTypeA("wool_carpet_yellow");
        blockWoolCarpetGreen = BlockHelper.createCarpetBlockTypeA("wool_carpet_green");
        blockWoolCarpetGray= BlockHelper.createCarpetBlockTypeA("wool_carpet_gray");
        blockWoolCarpetCyan= BlockHelper.createCarpetBlockTypeB("wool_carpet_cyan");
        blockWoolCarpetBrown= BlockHelper.createCarpetBlockTypeA("wool_carpet_brown");
        blockWoolCarpetPurple = BlockHelper.createCarpetBlockTypeA("wool_carpet_purple");
    }
}
