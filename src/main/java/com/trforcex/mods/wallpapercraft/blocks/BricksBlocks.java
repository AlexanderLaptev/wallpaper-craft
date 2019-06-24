package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockBricksRed =  BlockHelper.createSolidBlockTypeA("bricks_red");
        blockBricksBlue = BlockHelper.createSolidBlockTypeA("bricks_blue");
        blockBricksYellow = BlockHelper.createSolidBlockTypeA("bricks_yellow");
        blockBricksGreen = BlockHelper.createSolidBlockTypeA("bricks_green");
        blockBricksGray= BlockHelper.createSolidBlockTypeA("bricks_gray");
        blockBricksCyan= BlockHelper.createSolidBlockTypeB("bricks_cyan");
        blockBricksBrown= BlockHelper.createSolidBlockTypeA("bricks_brown");
        blockBricksPurple = BlockHelper.createSolidBlockTypeA("bricks_purple");
    }
}
