package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class RippledBlocks
{
    public static MetaBlockTypeA blockRippledRed;
    public static MetaBlockTypeA blockRippledBlue;
    public static MetaBlockTypeA blockRippledYellow;
    public static MetaBlockTypeA blockRippledGreen;
    public static MetaBlockTypeA blockRippledGray;
    public static MetaBlockTypeB blockRippledCyan;
    public static MetaBlockTypeA blockRippledBrown;
    public static MetaBlockTypeA blockRippledPurple;

    public static void instantiate()
    {
        blockRippledRed =  BlockFactory.createSolidBlockTypeA("rippled_red");
        blockRippledBlue = BlockFactory.createSolidBlockTypeA("rippled_blue");
        blockRippledYellow = BlockFactory.createSolidBlockTypeA("rippled_yellow");
        blockRippledGreen = BlockFactory.createSolidBlockTypeA("rippled_green");
        blockRippledGray= BlockFactory.createSolidBlockTypeA("rippled_gray");
        blockRippledCyan= BlockFactory.createSolidBlockTypeB("rippled_cyan");
        blockRippledBrown= BlockFactory.createSolidBlockTypeA("rippled_brown");
        blockRippledPurple = BlockFactory.createSolidBlockTypeA("rippled_purple");
    }
}
