package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockFrostedGlassRed =  BlockFactory.createGlassBlockTypeA("frosted_glass_red");
        blockFrostedGlassBlue = BlockFactory.createGlassBlockTypeA("frosted_glass_blue");
        blockFrostedGlassYellow = BlockFactory.createGlassBlockTypeA("frosted_glass_yellow");
        blockFrostedGlassGreen = BlockFactory.createGlassBlockTypeA("frosted_glass_green");
        blockFrostedGlassGray= BlockFactory.createGlassBlockTypeA("frosted_glass_gray");
        blockFrostedGlassCyan= BlockFactory.createGlassBlockTypeB("frosted_glass_cyan");
        blockFrostedGlassBrown= BlockFactory.createGlassBlockTypeA("frosted_glass_brown");
        blockFrostedGlassPurple = BlockFactory.createGlassBlockTypeA("frosted_glass_purple");
    }
}
