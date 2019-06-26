package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class FloralBlocks
{
    public static MetaBlockTypeA blockFloralRed;
    public static MetaBlockTypeA blockFloralBlue;
    public static MetaBlockTypeA blockFloralYellow;
    public static MetaBlockTypeA blockFloralGreen;
    public static MetaBlockTypeA blockFloralGray;
    public static MetaBlockTypeB blockFloralCyan;
    public static MetaBlockTypeA blockFloralBrown;
    public static MetaBlockTypeA blockFloralPurple;

    public static void instantiate()
    {
        blockFloralRed =  BlockHelper.createSolidBlockTypeA("floral_red");
        blockFloralBlue = BlockHelper.createSolidBlockTypeA("floral_blue");
        blockFloralYellow = BlockHelper.createSolidBlockTypeA("floral_yellow");
        blockFloralGreen = BlockHelper.createSolidBlockTypeA("floral_green");
        blockFloralGray= BlockHelper.createSolidBlockTypeA("floral_gray");
        blockFloralCyan= BlockHelper.createSolidBlockTypeB("floral_cyan");
        blockFloralBrown= BlockHelper.createSolidBlockTypeA("floral_brown");
        blockFloralPurple = BlockHelper.createSolidBlockTypeA("floral_purple");
    }
}
