package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class ColoredBricksBlocks
{
    public static ModBlockTypeA blockColoredBricksRed;
    public static ModBlockTypeA blockColoredBricksBlue;
    public static ModBlockTypeA blockColoredBricksYellow;
    public static ModBlockTypeA blockColoredBricksGreen;
    public static ModBlockTypeA blockColoredBricksGray;
    public static ModBlockTypeB blockColoredBricksCyan;
    public static ModBlockTypeA blockColoredBricksBrown;
    public static ModBlockTypeA blockColoredBricksPurple;

    public static void instantiate()
    {
        blockColoredBricksRed =  BlockFactory.createSolidBlockTypeA("colored_bricks_red");
        blockColoredBricksBlue = BlockFactory.createSolidBlockTypeA("colored_bricks_blue");
        blockColoredBricksYellow = BlockFactory.createSolidBlockTypeA("colored_bricks_yellow");
        blockColoredBricksGreen = BlockFactory.createSolidBlockTypeA("colored_bricks_green");
        blockColoredBricksGray= BlockFactory.createSolidBlockTypeA("colored_bricks_gray");
        blockColoredBricksCyan= BlockFactory.createSolidBlockTypeB("colored_bricks_cyan");
        blockColoredBricksBrown= BlockFactory.createSolidBlockTypeA("colored_bricks_brown");
        blockColoredBricksPurple = BlockFactory.createSolidBlockTypeA("colored_bricks_purple");
    }
}
