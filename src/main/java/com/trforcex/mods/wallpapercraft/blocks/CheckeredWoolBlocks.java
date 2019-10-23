package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockCheckeredRed =  BlockFactory.createWoolBlockTypeA("checkered_wool_red");
        blockCheckeredBlue = BlockFactory.createWoolBlockTypeA("checkered_wool_blue");
        blockCheckeredYellow = BlockFactory.createWoolBlockTypeA("checkered_wool_yellow");
        blockCheckeredGreen = BlockFactory.createWoolBlockTypeA("checkered_wool_green");
        blockCheckeredGray= BlockFactory.createWoolBlockTypeA("checkered_wool_gray");
        blockCheckeredCyan= BlockFactory.createWoolBlockTypeB("checkered_wool_cyan");
        blockCheckeredBrown= BlockFactory.createWoolBlockTypeA("checkered_wool_brown");
        blockCheckeredPurple = BlockFactory.createWoolBlockTypeA("checkered_wool_purple");
    }
}
