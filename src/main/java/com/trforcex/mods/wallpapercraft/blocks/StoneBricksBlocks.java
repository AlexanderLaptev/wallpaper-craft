package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class StoneBricksBlocks
{
    private static ModBlockTypeA blockStoneBricksRed;
    private static ModBlockTypeA blockStoneBricksBlue;
    private static ModBlockTypeA blockStoneBricksYellow;
    private static ModBlockTypeA blockStoneBricksGreen;
    private static ModBlockTypeA blockStoneBricksGray;
    private static ModBlockTypeB blockStoneBricksCyan;
    private static ModBlockTypeA blockStoneBricksBrown;
    private static ModBlockTypeA blockStoneBricksPurple;

    public static void instantiate()
    {
        blockStoneBricksRed =  BlockFactory.createSolidBlockTypeA("stone_bricks_red");
        blockStoneBricksBlue = BlockFactory.createSolidBlockTypeA("stone_bricks_blue");
        blockStoneBricksYellow = BlockFactory.createSolidBlockTypeA("stone_bricks_yellow");
        blockStoneBricksGreen = BlockFactory.createSolidBlockTypeA("stone_bricks_green");
        blockStoneBricksGray= BlockFactory.createSolidBlockTypeA("stone_bricks_gray");
        blockStoneBricksCyan= BlockFactory.createSolidBlockTypeB("stone_bricks_cyan");
        blockStoneBricksBrown= BlockFactory.createSolidBlockTypeA("stone_bricks_brown");
        blockStoneBricksPurple = BlockFactory.createSolidBlockTypeA("stone_bricks_purple");
    }
}
