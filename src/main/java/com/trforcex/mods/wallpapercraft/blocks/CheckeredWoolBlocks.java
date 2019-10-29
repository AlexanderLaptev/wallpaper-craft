package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class CheckeredWoolBlocks
{
    private static ModBlockTypeA blockCheckeredRed;
    private static ModBlockTypeA blockCheckeredBlue;
    private static ModBlockTypeA blockCheckeredYellow;
    private static ModBlockTypeA blockCheckeredGreen;
    private static ModBlockTypeA blockCheckeredGray;
    private static ModBlockTypeB blockCheckeredCyan;
    private static ModBlockTypeA blockCheckeredBrown;
    private static ModBlockTypeA blockCheckeredPurple;

    public static void instantiate()
    {
        blockCheckeredRed =  BlockFactory.createWoolBlockTypeA("checkered_wool_red");
        blockCheckeredBlue = BlockFactory.createWoolBlockTypeA("checkered_wool_blue");
        blockCheckeredYellow = BlockFactory.createWoolBlockTypeA("checkered_wool_yellow");
        blockCheckeredGreen = BlockFactory.createWoolBlockTypeA("checkered_wool_green");
        blockCheckeredGray= BlockFactory.createWoolBlockTypeA("checkered_wool_gray");
        blockCheckeredCyan= BlockFactory.createWoolBlockTypeB("checkered_wool_cyan");
        blockCheckeredBrown= BlockFactory.createWoolBlockTypeA("checkered_wool_brown");
        blockCheckeredPurple = BlockFactory.createWoolBlockTypeA("checkered_wool_purple");
    }
}
