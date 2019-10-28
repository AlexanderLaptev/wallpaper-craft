package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class AuraLampBlocks
{
    public static ModBlockTypeA blockAuraLampRed;
    public static ModBlockTypeA blockAuraLampBlue;
    public static ModBlockTypeA blockAuraLampYellow;
    public static ModBlockTypeA blockAuraLampGreen;
    public static ModBlockTypeA blockAuraLampGray;
    public static ModBlockTypeB blockAuraLampCyan;
    public static ModBlockTypeA blockAuraLampBrown;
    public static ModBlockTypeA blockAuraLampPurple;

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
