package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class StripedBlocks
{
    public static ModBlockTypeA blockStripedRed;
    public static ModBlockTypeA blockStripedBlue;
    public static ModBlockTypeA blockStripedYellow;
    public static ModBlockTypeA blockStripedGreen;
    public static ModBlockTypeA blockStripedGray;
    public static ModBlockTypeB blockStripedCyan;
    public static ModBlockTypeA blockStripedBrown;
    public static ModBlockTypeA blockStripedPurple;

    public static void instantiate()
    {
        blockStripedRed =  BlockFactory.createSolidBlockTypeA("striped_red");
        blockStripedBlue = BlockFactory.createSolidBlockTypeA("striped_blue");
        blockStripedYellow = BlockFactory.createSolidBlockTypeA("striped_yellow");
        blockStripedGreen = BlockFactory.createSolidBlockTypeA("striped_green");
        blockStripedGray= BlockFactory.createSolidBlockTypeA("striped_gray");
        blockStripedCyan= BlockFactory.createSolidBlockTypeB("striped_cyan");
        blockStripedBrown= BlockFactory.createSolidBlockTypeA("striped_brown");
        blockStripedPurple = BlockFactory.createSolidBlockTypeA("striped_purple");
    }
}
