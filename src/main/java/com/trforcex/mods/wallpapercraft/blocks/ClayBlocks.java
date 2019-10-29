package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class ClayBlocks
{
    private static ModBlockTypeA blockClayRed;
    private static ModBlockTypeA blockClayBlue;
    private static ModBlockTypeA blockClayYellow;
    private static ModBlockTypeA blockClayGreen;
    private static ModBlockTypeA blockClayGray;
    private static ModBlockTypeB blockClayCyan;
    private static ModBlockTypeA blockClayBrown;
    private static ModBlockTypeA blockClayPurple;

    public static void instantiate()
    {
        blockClayRed =  BlockFactory.createSolidBlockTypeA("clay_red");
        blockClayBlue = BlockFactory.createSolidBlockTypeA("clay_blue");
        blockClayYellow = BlockFactory.createSolidBlockTypeA("clay_yellow");
        blockClayGreen = BlockFactory.createSolidBlockTypeA("clay_green");
        blockClayGray= BlockFactory.createSolidBlockTypeA("clay_gray");
        blockClayCyan= BlockFactory.createSolidBlockTypeB("clay_cyan");
        blockClayBrown= BlockFactory.createSolidBlockTypeA("clay_brown");
        blockClayPurple = BlockFactory.createSolidBlockTypeA("clay_purple");
    }
}
