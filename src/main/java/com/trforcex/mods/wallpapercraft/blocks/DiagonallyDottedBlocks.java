package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class DiagonallyDottedBlocks
{
    private static ModBlockTypeA blockDiagonallyDottedRed;
    private static ModBlockTypeA blockDiagonallyDottedBlue;
    private static ModBlockTypeA blockDiagonallyDottedYellow;
    private static ModBlockTypeA blockDiagonallyDottedGreen;
    private static ModBlockTypeA blockDiagonallyDottedGray;
    private static ModBlockTypeB blockDiagonallyDottedCyan;
    private static ModBlockTypeA blockDiagonallyDottedBrown;
    private static ModBlockTypeA blockDiagonallyDottedPurple;

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
