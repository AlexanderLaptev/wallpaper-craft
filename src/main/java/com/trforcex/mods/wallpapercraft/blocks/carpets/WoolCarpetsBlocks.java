package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class WoolCarpetsBlocks
{
    private static ModBlockTypeA blockWoolCarpetRed;
    private static ModBlockTypeA blockWoolCarpetBlue;
    private static ModBlockTypeA blockWoolCarpetYellow;
    private static ModBlockTypeA blockWoolCarpetGreen;
    private static ModBlockTypeA blockWoolCarpetGray;
    private static ModBlockTypeB blockWoolCarpetCyan;
    private static ModBlockTypeA blockWoolCarpetBrown;
    private static ModBlockTypeA blockWoolCarpetPurple;

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
