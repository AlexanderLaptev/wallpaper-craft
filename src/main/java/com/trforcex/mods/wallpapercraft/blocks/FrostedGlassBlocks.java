package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class FrostedGlassBlocks
{
    private static ModBlockTypeA blockFrostedGlassRed;
    private static ModBlockTypeA blockFrostedGlassBlue;
    private static ModBlockTypeA blockFrostedGlassYellow;
    private static ModBlockTypeA blockFrostedGlassGreen;
    private static ModBlockTypeA blockFrostedGlassGray;
    private static ModBlockTypeB blockFrostedGlassCyan;
    private static ModBlockTypeA blockFrostedGlassBrown;
    private static ModBlockTypeA blockFrostedGlassPurple;

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
