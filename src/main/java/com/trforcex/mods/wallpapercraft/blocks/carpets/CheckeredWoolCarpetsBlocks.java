package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class CheckeredWoolCarpetsBlocks
{
    private static ModBlockTypeA blockCheckeredWoolCarpetRed;
    private static ModBlockTypeA blockCheckeredWoolCarpetBlue;
    private static ModBlockTypeA blockCheckeredWoolCarpetYellow;
    private static ModBlockTypeA blockCheckeredWoolCarpetGreen;
    private static ModBlockTypeA blockCheckeredWoolCarpetGray;
    private static ModBlockTypeB blockCheckeredWoolCarpetCyan;
    private static ModBlockTypeA blockCheckeredWoolCarpetBrown;
    private static ModBlockTypeA blockCheckeredWoolCarpetPurple;

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
