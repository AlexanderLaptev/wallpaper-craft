package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class RippledBlocks
{
    private static ModBlockTypeA blockRippledRed;
    private static ModBlockTypeA blockRippledBlue;
    private static ModBlockTypeA blockRippledYellow;
    private static ModBlockTypeA blockRippledGreen;
    private static ModBlockTypeA blockRippledGray;
    private static ModBlockTypeB blockRippledCyan;
    private static ModBlockTypeA blockRippledBrown;
    private static ModBlockTypeA blockRippledPurple;

    public static void instantiate()
    {
        blockRippledRed =  BlockFactory.createSolidBlockTypeA("rippled_red");
        blockRippledBlue = BlockFactory.createSolidBlockTypeA("rippled_blue");
        blockRippledYellow = BlockFactory.createSolidBlockTypeA("rippled_yellow");
        blockRippledGreen = BlockFactory.createSolidBlockTypeA("rippled_green");
        blockRippledGray= BlockFactory.createSolidBlockTypeA("rippled_gray");
        blockRippledCyan= BlockFactory.createSolidBlockTypeB("rippled_cyan");
        blockRippledBrown= BlockFactory.createSolidBlockTypeA("rippled_brown");
        blockRippledPurple = BlockFactory.createSolidBlockTypeA("rippled_purple");
    }
}
