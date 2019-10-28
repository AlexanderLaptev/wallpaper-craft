package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class FancyTilesBlocks
{
    public static ModBlockTypeA blockFancyTilesRed;
    public static ModBlockTypeA blockFancyTilesBlue;
    public static ModBlockTypeA blockFancyTilesYellow;
    public static ModBlockTypeA blockFancyTilesGreen;
    public static ModBlockTypeA blockFancyTilesGray;
    public static ModBlockTypeB blockFancyTilesCyan;
    public static ModBlockTypeA blockFancyTilesBrown;
    public static ModBlockTypeA blockFancyTilesPurple;

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
