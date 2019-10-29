package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class FloralBlocks
{
    private static ModBlockTypeA blockFloralRed;
    private static ModBlockTypeA blockFloralBlue;
    private static ModBlockTypeA blockFloralYellow;
    private static ModBlockTypeA blockFloralGreen;
    private static ModBlockTypeA blockFloralGray;
    private static ModBlockTypeB blockFloralCyan;
    private static ModBlockTypeA blockFloralBrown;
    private static ModBlockTypeA blockFloralPurple;

    public static void instantiate()
    {
        blockFloralRed =  BlockFactory.createSolidBlockTypeA("floral_red");
        blockFloralBlue = BlockFactory.createSolidBlockTypeA("floral_blue");
        blockFloralYellow = BlockFactory.createSolidBlockTypeA("floral_yellow");
        blockFloralGreen = BlockFactory.createSolidBlockTypeA("floral_green");
        blockFloralGray= BlockFactory.createSolidBlockTypeA("floral_gray");
        blockFloralCyan= BlockFactory.createSolidBlockTypeB("floral_cyan");
        blockFloralBrown= BlockFactory.createSolidBlockTypeA("floral_brown");
        blockFloralPurple = BlockFactory.createSolidBlockTypeA("floral_purple");
    }
}
