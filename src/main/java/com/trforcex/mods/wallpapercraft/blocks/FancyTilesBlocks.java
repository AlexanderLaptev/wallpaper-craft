package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockFancyTilesRed =  BlockFactory.createSolidBlockTypeA("fancy_tiles_red");
        blockFancyTilesBlue = BlockFactory.createSolidBlockTypeA("fancy_tiles_blue");
        blockFancyTilesYellow = BlockFactory.createSolidBlockTypeA("fancy_tiles_yellow");
        blockFancyTilesGreen = BlockFactory.createSolidBlockTypeA("fancy_tiles_green");
        blockFancyTilesGray= BlockFactory.createSolidBlockTypeA("fancy_tiles_gray");
        blockFancyTilesCyan= BlockFactory.createSolidBlockTypeB("fancy_tiles_cyan");
        blockFancyTilesBrown= BlockFactory.createSolidBlockTypeA("fancy_tiles_brown");
        blockFancyTilesPurple = BlockFactory.createSolidBlockTypeA("fancy_tiles_purple");
    }
}
