package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class FloralBlocks
{
    public static ModBlockTypeA blockFloralRed;
    public static ModBlockTypeA blockFloralBlue;
    public static ModBlockTypeA blockFloralYellow;
    public static ModBlockTypeA blockFloralGreen;
    public static ModBlockTypeA blockFloralGray;
    public static ModBlockTypeB blockFloralCyan;
    public static ModBlockTypeA blockFloralBrown;
    public static ModBlockTypeA blockFloralPurple;

    public static void instantiate()
    {
        blockFloralRed =  BlockFactory.createSolidBlockTypeA("floral_red");
        blockFloralBlue = BlockFactory.createSolidBlockTypeA("floral_blue");
        blockFloralYellow = BlockFactory.createSolidBlockTypeA("floral_yellow");
        blockFloralGreen = BlockFactory.createSolidBlockTypeA("floral_green");
        blockFloralGray= BlockFactory.createSolidBlockTypeA("floral_gray");
        blockFloralCyan= BlockFactory.createSolidBlockTypeB("floral_cyan");
        blockFloralBrown= BlockFactory.createSolidBlockTypeA("floral_brown");
        blockFloralPurple = BlockFactory.createSolidBlockTypeA("floral_purple");
    }
}
