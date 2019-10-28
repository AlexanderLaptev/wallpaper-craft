package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class WoolCarpetsBlocks
{
    public static ModBlockTypeA blockWoolCarpetRed;
    public static ModBlockTypeA blockWoolCarpetBlue;
    public static ModBlockTypeA blockWoolCarpetYellow;
    public static ModBlockTypeA blockWoolCarpetGreen;
    public static ModBlockTypeA blockWoolCarpetGray;
    public static ModBlockTypeB blockWoolCarpetCyan;
    public static ModBlockTypeA blockWoolCarpetBrown;
    public static ModBlockTypeA blockWoolCarpetPurple;

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
