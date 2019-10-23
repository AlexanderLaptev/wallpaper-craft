package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class BricksBlocks
{
    public static MetaBlockTypeA blockBricksRed;
    public static MetaBlockTypeA blockBricksBlue;
    public static MetaBlockTypeA blockBricksYellow;
    public static MetaBlockTypeA blockBricksGreen;
    public static MetaBlockTypeA blockBricksGray;
    public static MetaBlockTypeB blockBricksCyan;
    public static MetaBlockTypeA blockBricksBrown;
    public static MetaBlockTypeA blockBricksPurple;

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
