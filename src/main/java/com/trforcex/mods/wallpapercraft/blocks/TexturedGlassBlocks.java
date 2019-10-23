package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockTexturedGlassRed =  BlockFactory.createGlassBlockTypeA("textured_glass_red");
        blockTexturedGlassBlue = BlockFactory.createGlassBlockTypeA("textured_glass_blue");
        blockTexturedGlassYellow = BlockFactory.createGlassBlockTypeA("textured_glass_yellow");
        blockTexturedGlassGreen = BlockFactory.createGlassBlockTypeA("textured_glass_green");
        blockTexturedGlassGray= BlockFactory.createGlassBlockTypeA("textured_glass_gray");
        blockTexturedGlassCyan= BlockFactory.createGlassBlockTypeB("textured_glass_cyan");
        blockTexturedGlassBrown= BlockFactory.createGlassBlockTypeA("textured_glass_brown");
        blockTexturedGlassPurple = BlockFactory.createGlassBlockTypeA("textured_glass_purple");
    }
}
