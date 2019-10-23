package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class TintedGlassBlocks
{
    public static MetaBlockTypeA blockTintedGlassRed;
    public static MetaBlockTypeA blockTintedGlassBlue;
    public static MetaBlockTypeA blockTintedGlassYellow;
    public static MetaBlockTypeA blockTintedGlassGreen;
    public static MetaBlockTypeA blockTintedGlassGray;
    public static MetaBlockTypeB blockTintedGlassCyan;
    public static MetaBlockTypeA blockTintedGlassBrown;
    public static MetaBlockTypeA blockTintedGlassPurple;

    public static void instantiate()
    {
        blockTintedGlassRed =  BlockFactory.createGlassBlockTypeA("tinted_glass_red");
        blockTintedGlassBlue = BlockFactory.createGlassBlockTypeA("tinted_glass_blue");
        blockTintedGlassYellow = BlockFactory.createGlassBlockTypeA("tinted_glass_yellow");
        blockTintedGlassGreen = BlockFactory.createGlassBlockTypeA("tinted_glass_green");
        blockTintedGlassGray= BlockFactory.createGlassBlockTypeA("tinted_glass_gray");
        blockTintedGlassCyan= BlockFactory.createGlassBlockTypeB("tinted_glass_cyan");
        blockTintedGlassBrown= BlockFactory.createGlassBlockTypeA("tinted_glass_brown");
        blockTintedGlassPurple = BlockFactory.createGlassBlockTypeA("tinted_glass_purple");
    }
}
