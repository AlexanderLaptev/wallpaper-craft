package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class StoneLampBlocks
{
    public static ModBlockTypeA blockStoneLampsRed;
    public static ModBlockTypeA blockStoneLampsBlue;
    public static ModBlockTypeA blockStoneLampsYellow;
    public static ModBlockTypeA blockStoneLampsGreen;
    public static ModBlockTypeA blockStoneLampsGray;
    public static ModBlockTypeB blockStoneLampsCyan;
    public static ModBlockTypeA blockStoneLampsBrown;
    public static ModBlockTypeA blockStoneLampsPurple;

    public static void instantiate()
    {
        blockStoneLampsRed =  BlockFactory.createLampTypeA("stone_lamp_red");
        blockStoneLampsBlue = BlockFactory.createLampTypeA("stone_lamp_blue");
        blockStoneLampsYellow = BlockFactory.createLampTypeA("stone_lamp_yellow");
        blockStoneLampsGreen = BlockFactory.createLampTypeA("stone_lamp_green");
        blockStoneLampsGray= BlockFactory.createLampTypeA("stone_lamp_gray");
        blockStoneLampsCyan= BlockFactory.createLampTypeB("stone_lamp_cyan");
        blockStoneLampsBrown= BlockFactory.createLampTypeA("stone_lamp_brown");
        blockStoneLampsPurple = BlockFactory.createLampTypeA("stone_lamp_purple");
    }
}
