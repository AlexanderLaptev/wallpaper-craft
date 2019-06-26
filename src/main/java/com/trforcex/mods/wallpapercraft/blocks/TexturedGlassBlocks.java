package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class TexturedGlassBlocks
{
    public static MetaBlockTypeA blockTexturedGlassRed;
    public static MetaBlockTypeA blockTexturedGlassBlue;
    public static MetaBlockTypeA blockTexturedGlassYellow;
    public static MetaBlockTypeA blockTexturedGlassGreen;
    public static MetaBlockTypeA blockTexturedGlassGray;
    public static MetaBlockTypeB blockTexturedGlassCyan;
    public static MetaBlockTypeA blockTexturedGlassBrown;
    public static MetaBlockTypeA blockTexturedGlassPurple;

    public static void instantiate()
    {
        blockTexturedGlassRed =  BlockHelper.createGlassBlockTypeA("textured_glass_red");
        blockTexturedGlassBlue = BlockHelper.createGlassBlockTypeA("textured_glass_blue");
        blockTexturedGlassYellow = BlockHelper.createGlassBlockTypeA("textured_glass_yellow");
        blockTexturedGlassGreen = BlockHelper.createGlassBlockTypeA("textured_glass_green");
        blockTexturedGlassGray= BlockHelper.createGlassBlockTypeA("textured_glass_gray");
        blockTexturedGlassCyan= BlockHelper.createGlassBlockTypeB("textured_glass_cyan");
        blockTexturedGlassBrown= BlockHelper.createGlassBlockTypeA("textured_glass_brown");
        blockTexturedGlassPurple = BlockHelper.createGlassBlockTypeA("textured_glass_purple");
    }
}
