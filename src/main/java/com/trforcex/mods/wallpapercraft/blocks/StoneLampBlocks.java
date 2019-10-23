package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class StoneLampBlocks
{
    public static MetaBlockTypeA blockStoneLampsRed;
    public static MetaBlockTypeA blockStoneLampsBlue;
    public static MetaBlockTypeA blockStoneLampsYellow;
    public static MetaBlockTypeA blockStoneLampsGreen;
    public static MetaBlockTypeA blockStoneLampsGray;
    public static MetaBlockTypeB blockStoneLampsCyan;
    public static MetaBlockTypeA blockStoneLampsBrown;
    public static MetaBlockTypeA blockStoneLampsPurple;

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
