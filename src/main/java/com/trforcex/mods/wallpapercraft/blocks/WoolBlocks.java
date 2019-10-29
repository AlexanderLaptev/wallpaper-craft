package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class WoolBlocks
{
    private static ModBlockTypeA blockWoolRed;
    private static ModBlockTypeA blockWoolBlue;
    private static ModBlockTypeA blockWoolYellow;
    private static ModBlockTypeA blockWoolGreen;
    private static ModBlockTypeA blockWoolGray;
    private static ModBlockTypeB blockWoolCyan;
    private static ModBlockTypeA blockWoolBrown;
    private static ModBlockTypeA blockWoolPurple;

    public static void instantiate()
    {
        blockWoolRed =  BlockFactory.createWoolBlockTypeA("wool_red");
        blockWoolBlue = BlockFactory.createWoolBlockTypeA("wool_blue");
        blockWoolYellow = BlockFactory.createWoolBlockTypeA("wool_yellow");
        blockWoolGreen = BlockFactory.createWoolBlockTypeA("wool_green");
        blockWoolGray= BlockFactory.createWoolBlockTypeA("wool_gray");
        blockWoolCyan= BlockFactory.createWoolBlockTypeB("wool_cyan");
        blockWoolBrown= BlockFactory.createWoolBlockTypeA("wool_brown");
        blockWoolPurple = BlockFactory.createWoolBlockTypeA("wool_purple");
    }
}
