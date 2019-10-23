package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class StoneBricksBlocks
{
    public static MetaBlockTypeA blockStoneBricksRed;
    public static MetaBlockTypeA blockStoneBricksBlue;
    public static MetaBlockTypeA blockStoneBricksYellow;
    public static MetaBlockTypeA blockStoneBricksGreen;
    public static MetaBlockTypeA blockStoneBricksGray;
    public static MetaBlockTypeB blockStoneBricksCyan;
    public static MetaBlockTypeA blockStoneBricksBrown;
    public static MetaBlockTypeA blockStoneBricksPurple;

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
