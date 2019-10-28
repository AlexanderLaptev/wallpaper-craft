package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class CheckeredWoolBlocks
{
    public static ModBlockTypeA blockCheckeredRed;
    public static ModBlockTypeA blockCheckeredBlue;
    public static ModBlockTypeA blockCheckeredYellow;
    public static ModBlockTypeA blockCheckeredGreen;
    public static ModBlockTypeA blockCheckeredGray;
    public static ModBlockTypeB blockCheckeredCyan;
    public static ModBlockTypeA blockCheckeredBrown;
    public static ModBlockTypeA blockCheckeredPurple;

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
