package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class SolidBlocks
{
    private static ModBlockTypeA blockSolidRed;
    private static ModBlockTypeA blockSolidBlue;
    private static ModBlockTypeA blockSolidYellow;
    private static ModBlockTypeA blockSolidGreen;
    private static ModBlockTypeA blockSolidGray;
    private static ModBlockTypeB blockSolidCyan;
    private static ModBlockTypeA blockSolidBrown;
    private static ModBlockTypeA blockSolidPurple;

    public static void instantiate()
    {
        blockSolidRed =  BlockFactory.createSolidBlockTypeA("solid_red");
        blockSolidBlue = BlockFactory.createSolidBlockTypeA("solid_blue");
        blockSolidYellow = BlockFactory.createSolidBlockTypeA("solid_yellow");
        blockSolidGreen = BlockFactory.createSolidBlockTypeA("solid_green");
        blockSolidGray= BlockFactory.createSolidBlockTypeA("solid_gray");
        blockSolidCyan= BlockFactory.createSolidBlockTypeB("solid_cyan");
        blockSolidBrown= BlockFactory.createSolidBlockTypeA("solid_brown");
        blockSolidPurple = BlockFactory.createSolidBlockTypeA("solid_purple");
    }
}
