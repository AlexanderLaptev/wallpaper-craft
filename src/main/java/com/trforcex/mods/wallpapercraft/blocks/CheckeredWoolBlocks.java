package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class CheckeredWoolBlocks
{
    public static MetaBlockTypeA blockCheckeredRed;
    public static MetaBlockTypeA blockCheckeredBlue;
    public static MetaBlockTypeA blockCheckeredYellow;
    public static MetaBlockTypeA blockCheckeredGreen;
    public static MetaBlockTypeA blockCheckeredGray;
    public static MetaBlockTypeB blockCheckeredCyan;
    public static MetaBlockTypeA blockCheckeredBrown;
    public static MetaBlockTypeA blockCheckeredPurple;

    public static void instantiate()
    {
        blockCheckeredRed =  BlockHelper.createWoolBlockTypeA("checkered_wool_red");
        blockCheckeredBlue = BlockHelper.createWoolBlockTypeA("checkered_wool_blue");
        blockCheckeredYellow = BlockHelper.createWoolBlockTypeA("checkered_wool_yellow");
        blockCheckeredGreen = BlockHelper.createWoolBlockTypeA("checkered_wool_green");
        blockCheckeredGray= BlockHelper.createWoolBlockTypeA("checkered_wool_gray");
        blockCheckeredCyan= BlockHelper.createWoolBlockTypeB("checkered_wool_cyan");
        blockCheckeredBrown= BlockHelper.createWoolBlockTypeA("checkered_wool_brown");
        blockCheckeredPurple = BlockHelper.createWoolBlockTypeA("checkered_wool_purple");
    }
}
