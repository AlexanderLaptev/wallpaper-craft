package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class WoolBlocks
{
    public static ModBlockTypeA blockWoolRed;
    public static ModBlockTypeA blockWoolBlue;
    public static ModBlockTypeA blockWoolYellow;
    public static ModBlockTypeA blockWoolGreen;
    public static ModBlockTypeA blockWoolGray;
    public static ModBlockTypeB blockWoolCyan;
    public static ModBlockTypeA blockWoolBrown;
    public static ModBlockTypeA blockWoolPurple;

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
