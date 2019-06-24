package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class AuraLampBlocks
{
    public static MetaBlockTypeA blockAuraLampRed;
    public static MetaBlockTypeA blockAuraLampBlue;
    public static MetaBlockTypeA blockAuraLampYellow;
    public static MetaBlockTypeA blockAuraLampGreen;
    public static MetaBlockTypeA blockAuraLampGray;
    public static MetaBlockTypeB blockAuraLampCyan;
    public static MetaBlockTypeA blockAuraLampBrown;
    public static MetaBlockTypeA blockAuraLampPurple;

    public static void instantiate()
    {
        blockAuraLampRed =  BlockHelper.createLampTypeA("aura_lamp_red");
        blockAuraLampBlue = BlockHelper.createLampTypeA("aura_lamp_blue");
        blockAuraLampYellow = BlockHelper.createLampTypeA("aura_lamp_yellow");
        blockAuraLampGreen = BlockHelper.createLampTypeA("aura_lamp_green");
        blockAuraLampGray= BlockHelper.createLampTypeA("aura_lamp_gray");
        blockAuraLampCyan= BlockHelper.createLampTypeB("aura_lamp_cyan");
        blockAuraLampBrown= BlockHelper.createLampTypeA("aura_lamp_brown");
        blockAuraLampPurple = BlockHelper.createLampTypeA("aura_lamp_purple");
    }
}
