package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockCheckeredWoolCarpetRed =  BlockFactory.createCarpetBlockTypeA("checkered_carpet_red");
        blockCheckeredWoolCarpetBlue = BlockFactory.createCarpetBlockTypeA("checkered_carpet_blue");
        blockCheckeredWoolCarpetYellow = BlockFactory.createCarpetBlockTypeA("checkered_carpet_yellow");
        blockCheckeredWoolCarpetGreen = BlockFactory.createCarpetBlockTypeA("checkered_carpet_green");
        blockCheckeredWoolCarpetGray= BlockFactory.createCarpetBlockTypeA("checkered_carpet_gray");
        blockCheckeredWoolCarpetCyan= BlockFactory.createCarpetBlockTypeB("checkered_carpet_cyan");
        blockCheckeredWoolCarpetBrown= BlockFactory.createCarpetBlockTypeA("checkered_carpet_brown");
        blockCheckeredWoolCarpetPurple = BlockFactory.createCarpetBlockTypeA("checkered_carpet_purple");
    }
}
