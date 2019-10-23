package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

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
        blockAuraLampRed =  BlockFactory.createLampTypeA("aura_lamp_red");
        blockAuraLampBlue = BlockFactory.createLampTypeA("aura_lamp_blue");
        blockAuraLampYellow = BlockFactory.createLampTypeA("aura_lamp_yellow");
        blockAuraLampGreen = BlockFactory.createLampTypeA("aura_lamp_green");
        blockAuraLampGray= BlockFactory.createLampTypeA("aura_lamp_gray");
        blockAuraLampCyan= BlockFactory.createLampTypeB("aura_lamp_cyan");
        blockAuraLampBrown= BlockFactory.createLampTypeA("aura_lamp_brown");
        blockAuraLampPurple = BlockFactory.createLampTypeA("aura_lamp_purple");
    }
}
