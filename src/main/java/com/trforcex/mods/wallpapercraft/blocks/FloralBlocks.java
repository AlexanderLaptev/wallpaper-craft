package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
