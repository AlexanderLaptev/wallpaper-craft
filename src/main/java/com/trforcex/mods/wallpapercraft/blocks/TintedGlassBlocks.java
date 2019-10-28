package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class TintedGlassBlocks
{
    public static ModBlockTypeA blockTintedGlassRed;
    public static ModBlockTypeA blockTintedGlassBlue;
    public static ModBlockTypeA blockTintedGlassYellow;
    public static ModBlockTypeA blockTintedGlassGreen;
    public static ModBlockTypeA blockTintedGlassGray;
    public static ModBlockTypeB blockTintedGlassCyan;
    public static ModBlockTypeA blockTintedGlassBrown;
    public static ModBlockTypeA blockTintedGlassPurple;

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
