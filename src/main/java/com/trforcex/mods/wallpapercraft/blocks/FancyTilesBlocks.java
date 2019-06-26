package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class FancyTilesBlocks
{
    public static MetaBlockTypeA blockFancyTilesRed;
    public static MetaBlockTypeA blockFancyTilesBlue;
    public static MetaBlockTypeA blockFancyTilesYellow;
    public static MetaBlockTypeA blockFancyTilesGreen;
    public static MetaBlockTypeA blockFancyTilesGray;
    public static MetaBlockTypeB blockFancyTilesCyan;
    public static MetaBlockTypeA blockFancyTilesBrown;
    public static MetaBlockTypeA blockFancyTilesPurple;

    public static void instantiate()
    {
        blockFancyTilesRed =  BlockHelper.createSolidBlockTypeA("fancy_tiles_red");
        blockFancyTilesBlue = BlockHelper.createSolidBlockTypeA("fancy_tiles_blue");
        blockFancyTilesYellow = BlockHelper.createSolidBlockTypeA("fancy_tiles_yellow");
        blockFancyTilesGreen = BlockHelper.createSolidBlockTypeA("fancy_tiles_green");
        blockFancyTilesGray= BlockHelper.createSolidBlockTypeA("fancy_tiles_gray");
        blockFancyTilesCyan= BlockHelper.createSolidBlockTypeB("fancy_tiles_cyan");
        blockFancyTilesBrown= BlockHelper.createSolidBlockTypeA("fancy_tiles_brown");
        blockFancyTilesPurple = BlockHelper.createSolidBlockTypeA("fancy_tiles_purple");
    }
}
