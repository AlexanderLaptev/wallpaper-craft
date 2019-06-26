package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class FrostedGlassBlocks
{
    public static MetaBlockTypeA blockFrostedGlassRed;
    public static MetaBlockTypeA blockFrostedGlassBlue;
    public static MetaBlockTypeA blockFrostedGlassYellow;
    public static MetaBlockTypeA blockFrostedGlassGreen;
    public static MetaBlockTypeA blockFrostedGlassGray;
    public static MetaBlockTypeB blockFrostedGlassCyan;
    public static MetaBlockTypeA blockFrostedGlassBrown;
    public static MetaBlockTypeA blockFrostedGlassPurple;

    public static void instantiate()
    {
        blockFrostedGlassRed =  BlockHelper.createGlassBlockTypeA("frosted_glass_red");
        blockFrostedGlassBlue = BlockHelper.createGlassBlockTypeA("frosted_glass_blue");
        blockFrostedGlassYellow = BlockHelper.createGlassBlockTypeA("frosted_glass_yellow");
        blockFrostedGlassGreen = BlockHelper.createGlassBlockTypeA("frosted_glass_green");
        blockFrostedGlassGray= BlockHelper.createGlassBlockTypeA("frosted_glass_gray");
        blockFrostedGlassCyan= BlockHelper.createGlassBlockTypeB("frosted_glass_cyan");
        blockFrostedGlassBrown= BlockHelper.createGlassBlockTypeA("frosted_glass_brown");
        blockFrostedGlassPurple = BlockHelper.createGlassBlockTypeA("frosted_glass_purple");
    }
}
