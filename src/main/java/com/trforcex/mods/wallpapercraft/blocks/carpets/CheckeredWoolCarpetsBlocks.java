package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class CheckeredWoolCarpetsBlocks
{
    public static MetaBlockTypeA blockCheckeredWoolCarpetRed;
    public static MetaBlockTypeA blockCheckeredWoolCarpetBlue;
    public static MetaBlockTypeA blockCheckeredWoolCarpetYellow;
    public static MetaBlockTypeA blockCheckeredWoolCarpetGreen;
    public static MetaBlockTypeA blockCheckeredWoolCarpetGray;
    public static MetaBlockTypeB blockCheckeredWoolCarpetCyan;
    public static MetaBlockTypeA blockCheckeredWoolCarpetBrown;
    public static MetaBlockTypeA blockCheckeredWoolCarpetPurple;

    public static void instantiate()
    {
        blockCheckeredWoolCarpetRed =  BlockHelper.createCarpetBlockTypeA("checkered_carpet_red");
        blockCheckeredWoolCarpetBlue = BlockHelper.createCarpetBlockTypeA("checkered_carpet_blue");
        blockCheckeredWoolCarpetYellow = BlockHelper.createCarpetBlockTypeA("checkered_carpet_yellow");
        blockCheckeredWoolCarpetGreen = BlockHelper.createCarpetBlockTypeA("checkered_carpet_green");
        blockCheckeredWoolCarpetGray= BlockHelper.createCarpetBlockTypeA("checkered_carpet_gray");
        blockCheckeredWoolCarpetCyan= BlockHelper.createCarpetBlockTypeB("checkered_carpet_cyan");
        blockCheckeredWoolCarpetBrown= BlockHelper.createCarpetBlockTypeA("checkered_carpet_brown");
        blockCheckeredWoolCarpetPurple = BlockHelper.createCarpetBlockTypeA("checkered_carpet_purple");
    }
}
