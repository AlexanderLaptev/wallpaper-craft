package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class ColoredBricksBlocks
{
    public static MetaBlockTypeA blockColoredBricksRed;
    public static MetaBlockTypeA blockColoredBricksBlue;
    public static MetaBlockTypeA blockColoredBricksYellow;
    public static MetaBlockTypeA blockColoredBricksGreen;
    public static MetaBlockTypeA blockColoredBricksGray;
    public static MetaBlockTypeB blockColoredBricksCyan;
    public static MetaBlockTypeA blockColoredBricksBrown;
    public static MetaBlockTypeA blockColoredBricksPurple;

    public static void instantiate()
    {
        blockColoredBricksRed =  BlockHelper.createSolidBlockTypeA("colored_bricks_red");
        blockColoredBricksBlue = BlockHelper.createSolidBlockTypeA("colored_bricks_blue");
        blockColoredBricksYellow = BlockHelper.createSolidBlockTypeA("colored_bricks_yellow");
        blockColoredBricksGreen = BlockHelper.createSolidBlockTypeA("colored_bricks_green");
        blockColoredBricksGray= BlockHelper.createSolidBlockTypeA("colored_bricks_gray");
        blockColoredBricksCyan= BlockHelper.createSolidBlockTypeB("colored_bricks_cyan");
        blockColoredBricksBrown= BlockHelper.createSolidBlockTypeA("colored_bricks_brown");
        blockColoredBricksPurple = BlockHelper.createSolidBlockTypeA("colored_bricks_purple");
    }
}
