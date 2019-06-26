package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockRippledRed =  BlockHelper.createSolidBlockTypeA("rippled_red");
        blockRippledBlue = BlockHelper.createSolidBlockTypeA("rippled_blue");
        blockRippledYellow = BlockHelper.createSolidBlockTypeA("rippled_yellow");
        blockRippledGreen = BlockHelper.createSolidBlockTypeA("rippled_green");
        blockRippledGray= BlockHelper.createSolidBlockTypeA("rippled_gray");
        blockRippledCyan= BlockHelper.createSolidBlockTypeB("rippled_cyan");
        blockRippledBrown= BlockHelper.createSolidBlockTypeA("rippled_brown");
        blockRippledPurple = BlockHelper.createSolidBlockTypeA("rippled_purple");
    }
}
