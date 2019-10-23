package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class DiagonallyDottedBlocks
{
    public static MetaBlockTypeA blockDiagonallyDottedRed;
    public static MetaBlockTypeA blockDiagonallyDottedBlue;
    public static MetaBlockTypeA blockDiagonallyDottedYellow;
    public static MetaBlockTypeA blockDiagonallyDottedGreen;
    public static MetaBlockTypeA blockDiagonallyDottedGray;
    public static MetaBlockTypeB blockDiagonallyDottedCyan;
    public static MetaBlockTypeA blockDiagonallyDottedBrown;
    public static MetaBlockTypeA blockDiagonallyDottedPurple;

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
