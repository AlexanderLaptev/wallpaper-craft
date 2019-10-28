package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class BricksBlocks
{
    public static ModBlockTypeA blockBricksRed;
    public static ModBlockTypeA blockBricksBlue;
    public static ModBlockTypeA blockBricksYellow;
    public static ModBlockTypeA blockBricksGreen;
    public static ModBlockTypeA blockBricksGray;
    public static ModBlockTypeB blockBricksCyan;
    public static ModBlockTypeA blockBricksBrown;
    public static ModBlockTypeA blockBricksPurple;

    public static void instantiate()
    {
        blockBricksRed =  BlockFactory.createSolidBlockTypeA("bricks_red");
        blockBricksBlue = BlockFactory.createSolidBlockTypeA("bricks_blue");
        blockBricksYellow = BlockFactory.createSolidBlockTypeA("bricks_yellow");
        blockBricksGreen = BlockFactory.createSolidBlockTypeA("bricks_green");
        blockBricksGray= BlockFactory.createSolidBlockTypeA("bricks_gray");
        blockBricksCyan= BlockFactory.createSolidBlockTypeB("bricks_cyan");
        blockBricksBrown= BlockFactory.createSolidBlockTypeA("bricks_brown");
        blockBricksPurple = BlockFactory.createSolidBlockTypeA("bricks_purple");
    }
}
