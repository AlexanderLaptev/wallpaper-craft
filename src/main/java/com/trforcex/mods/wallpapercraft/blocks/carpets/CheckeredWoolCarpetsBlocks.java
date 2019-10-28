package com.trforcex.mods.wallpapercraft.blocks.carpets;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class CheckeredWoolCarpetsBlocks
{
    public static ModBlockTypeA blockCheckeredWoolCarpetRed;
    public static ModBlockTypeA blockCheckeredWoolCarpetBlue;
    public static ModBlockTypeA blockCheckeredWoolCarpetYellow;
    public static ModBlockTypeA blockCheckeredWoolCarpetGreen;
    public static ModBlockTypeA blockCheckeredWoolCarpetGray;
    public static ModBlockTypeB blockCheckeredWoolCarpetCyan;
    public static ModBlockTypeA blockCheckeredWoolCarpetBrown;
    public static ModBlockTypeA blockCheckeredWoolCarpetPurple;

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
