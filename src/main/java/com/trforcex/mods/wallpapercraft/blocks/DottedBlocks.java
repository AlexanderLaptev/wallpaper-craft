package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class DottedBlocks
{
    public static ModBlockTypeA blockDottedRed;
    public static ModBlockTypeA blockDottedBlue;
    public static ModBlockTypeA blockDottedYellow;
    public static ModBlockTypeA blockDottedGreen;
    public static ModBlockTypeA blockDottedGray;
    public static ModBlockTypeB blockDottedCyan;
    public static ModBlockTypeA blockDottedBrown;
    public static ModBlockTypeA blockDottedPurple;

    public static void instantiate()
    {
        blockDottedRed =  BlockFactory.createSolidBlockTypeA("dotted_red");
        blockDottedBlue = BlockFactory.createSolidBlockTypeA("dotted_blue");
        blockDottedYellow = BlockFactory.createSolidBlockTypeA("dotted_yellow");
        blockDottedGreen = BlockFactory.createSolidBlockTypeA("dotted_green");
        blockDottedGray= BlockFactory.createSolidBlockTypeA("dotted_gray");
        blockDottedCyan= BlockFactory.createSolidBlockTypeB("dotted_cyan");
        blockDottedBrown= BlockFactory.createSolidBlockTypeA("dotted_brown");
        blockDottedPurple = BlockFactory.createSolidBlockTypeA("dotted_purple");
    }
}
