package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockDiagonallyDottedRed =  BlockHelper.createSolidBlockTypeA("diagonally_dotted_red");
        blockDiagonallyDottedBlue = BlockHelper.createSolidBlockTypeA("diagonally_dotted_blue");
        blockDiagonallyDottedYellow = BlockHelper.createSolidBlockTypeA("diagonally_dotted_yellow");
        blockDiagonallyDottedGreen = BlockHelper.createSolidBlockTypeA("diagonally_dotted_green");
        blockDiagonallyDottedGray= BlockHelper.createSolidBlockTypeA("diagonally_dotted_gray");
        blockDiagonallyDottedCyan= BlockHelper.createSolidBlockTypeB("diagonally_dotted_cyan");
        blockDiagonallyDottedBrown= BlockHelper.createSolidBlockTypeA("diagonally_dotted_brown");
        blockDiagonallyDottedPurple = BlockHelper.createSolidBlockTypeA("diagonally_dotted_purple");
    }
}
