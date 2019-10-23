package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockWoolCarpetRed =  BlockFactory.createCarpetBlockTypeA("wool_carpet_red");
        blockWoolCarpetBlue = BlockFactory.createCarpetBlockTypeA("wool_carpet_blue");
        blockWoolCarpetYellow = BlockFactory.createCarpetBlockTypeA("wool_carpet_yellow");
        blockWoolCarpetGreen = BlockFactory.createCarpetBlockTypeA("wool_carpet_green");
        blockWoolCarpetGray= BlockFactory.createCarpetBlockTypeA("wool_carpet_gray");
        blockWoolCarpetCyan= BlockFactory.createCarpetBlockTypeB("wool_carpet_cyan");
        blockWoolCarpetBrown= BlockFactory.createCarpetBlockTypeA("wool_carpet_brown");
        blockWoolCarpetPurple = BlockFactory.createCarpetBlockTypeA("wool_carpet_purple");
    }
}
