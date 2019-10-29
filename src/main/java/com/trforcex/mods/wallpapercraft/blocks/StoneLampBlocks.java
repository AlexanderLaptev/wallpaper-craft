package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class StoneLampBlocks
{
    private static ModBlockTypeA blockStoneLampsRed;
    private static ModBlockTypeA blockStoneLampsBlue;
    private static ModBlockTypeA blockStoneLampsYellow;
    private static ModBlockTypeA blockStoneLampsGreen;
    private static ModBlockTypeA blockStoneLampsGray;
    private static ModBlockTypeB blockStoneLampsCyan;
    private static ModBlockTypeA blockStoneLampsBrown;
    private static ModBlockTypeA blockStoneLampsPurple;

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
