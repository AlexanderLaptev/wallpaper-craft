package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class DiagonallyDottedBlocks
{
    public static ModBlockTypeA blockDiagonallyDottedRed;
    public static ModBlockTypeA blockDiagonallyDottedBlue;
    public static ModBlockTypeA blockDiagonallyDottedYellow;
    public static ModBlockTypeA blockDiagonallyDottedGreen;
    public static ModBlockTypeA blockDiagonallyDottedGray;
    public static ModBlockTypeB blockDiagonallyDottedCyan;
    public static ModBlockTypeA blockDiagonallyDottedBrown;
    public static ModBlockTypeA blockDiagonallyDottedPurple;

    public static void instantiate()
    {
        blockDiagonallyDottedRed =  BlockFactory.createSolidBlockTypeA("diagonally_dotted_red");
        blockDiagonallyDottedBlue = BlockFactory.createSolidBlockTypeA("diagonally_dotted_blue");
        blockDiagonallyDottedYellow = BlockFactory.createSolidBlockTypeA("diagonally_dotted_yellow");
        blockDiagonallyDottedGreen = BlockFactory.createSolidBlockTypeA("diagonally_dotted_green");
        blockDiagonallyDottedGray= BlockFactory.createSolidBlockTypeA("diagonally_dotted_gray");
        blockDiagonallyDottedCyan= BlockFactory.createSolidBlockTypeB("diagonally_dotted_cyan");
        blockDiagonallyDottedBrown= BlockFactory.createSolidBlockTypeA("diagonally_dotted_brown");
        blockDiagonallyDottedPurple = BlockFactory.createSolidBlockTypeA("diagonally_dotted_purple");
    }
}
