package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class RippledBlocks
{
    public static ModBlockTypeA blockRippledRed;
    public static ModBlockTypeA blockRippledBlue;
    public static ModBlockTypeA blockRippledYellow;
    public static ModBlockTypeA blockRippledGreen;
    public static ModBlockTypeA blockRippledGray;
    public static ModBlockTypeB blockRippledCyan;
    public static ModBlockTypeA blockRippledBrown;
    public static ModBlockTypeA blockRippledPurple;

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
