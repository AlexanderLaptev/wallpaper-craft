package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
