package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class TexturedGlassBlocks
{
    private static ModBlockTypeA blockTexturedGlassRed;
    private static ModBlockTypeA blockTexturedGlassBlue;
    private static ModBlockTypeA blockTexturedGlassYellow;
    private static ModBlockTypeA blockTexturedGlassGreen;
    private static ModBlockTypeA blockTexturedGlassGray;
    private static ModBlockTypeB blockTexturedGlassCyan;
    private static ModBlockTypeA blockTexturedGlassBrown;
    private static ModBlockTypeA blockTexturedGlassPurple;

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
