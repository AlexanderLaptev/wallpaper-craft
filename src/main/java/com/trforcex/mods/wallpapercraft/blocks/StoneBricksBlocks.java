package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockStoneBricksRed =  BlockHelper.createSolidBlockTypeA("stone_bricks_red");
        blockStoneBricksBlue = BlockHelper.createSolidBlockTypeA("stone_bricks_blue");
        blockStoneBricksYellow = BlockHelper.createSolidBlockTypeA("stone_bricks_yellow");
        blockStoneBricksGreen = BlockHelper.createSolidBlockTypeA("stone_bricks_green");
        blockStoneBricksGray= BlockHelper.createSolidBlockTypeA("stone_bricks_gray");
        blockStoneBricksCyan= BlockHelper.createSolidBlockTypeB("stone_bricks_cyan");
        blockStoneBricksBrown= BlockHelper.createSolidBlockTypeA("stone_bricks_brown");
        blockStoneBricksPurple = BlockHelper.createSolidBlockTypeA("stone_bricks_purple");
    }
}
