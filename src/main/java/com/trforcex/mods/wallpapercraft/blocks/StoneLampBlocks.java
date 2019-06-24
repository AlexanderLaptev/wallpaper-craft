package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockStoneLampsRed =  BlockHelper.createLampTypeA("stone_lamp_red");
        blockStoneLampsBlue = BlockHelper.createLampTypeA("stone_lamp_blue");
        blockStoneLampsYellow = BlockHelper.createLampTypeA("stone_lamp_yellow");
        blockStoneLampsGreen = BlockHelper.createLampTypeA("stone_lamp_green");
        blockStoneLampsGray= BlockHelper.createLampTypeA("stone_lamp_gray");
        blockStoneLampsCyan= BlockHelper.createLampTypeB("stone_lamp_cyan");
        blockStoneLampsBrown= BlockHelper.createLampTypeA("stone_lamp_brown");
        blockStoneLampsPurple = BlockHelper.createLampTypeA("stone_lamp_purple");
    }
}
