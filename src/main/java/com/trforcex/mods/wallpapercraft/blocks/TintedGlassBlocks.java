package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockTintedGlassRed =  BlockHelper.createGlassBlockTypeA("tinted_glass_red");
        blockTintedGlassBlue = BlockHelper.createGlassBlockTypeA("tinted_glass_blue");
        blockTintedGlassYellow = BlockHelper.createGlassBlockTypeA("tinted_glass_yellow");
        blockTintedGlassGreen = BlockHelper.createGlassBlockTypeA("tinted_glass_green");
        blockTintedGlassGray= BlockHelper.createGlassBlockTypeA("tinted_glass_gray");
        blockTintedGlassCyan= BlockHelper.createGlassBlockTypeB("tinted_glass_cyan");
        blockTintedGlassBrown= BlockHelper.createGlassBlockTypeA("tinted_glass_brown");
        blockTintedGlassPurple = BlockHelper.createGlassBlockTypeA("tinted_glass_purple");
    }
}
