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
        blockCheckeredRed =  BlockHelper.createSolidBlockTypeA("checkered_wool_red");
        blockCheckeredBlue = BlockHelper.createSolidBlockTypeA("checkered_wool_blue");
        blockCheckeredYellow = BlockHelper.createSolidBlockTypeA("checkered_wool_yellow");
        blockCheckeredGreen = BlockHelper.createSolidBlockTypeA("checkered_wool_green");
        blockCheckeredGray= BlockHelper.createSolidBlockTypeA("checkered_wool_gray");
        blockCheckeredCyan= BlockHelper.createSolidBlockTypeB("checkered_wool_cyan");
        blockCheckeredBrown= BlockHelper.createSolidBlockTypeA("checkered_wool_brown");
        blockCheckeredPurple = BlockHelper.createSolidBlockTypeA("checkered_wool_purple");
    }
}
