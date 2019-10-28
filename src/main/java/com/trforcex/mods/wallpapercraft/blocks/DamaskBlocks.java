package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class DamaskBlocks
{
    public static ModBlockTypeA blockDamaskRed;
    public static ModBlockTypeA blockDamaskBlue;
    public static ModBlockTypeA blockDamaskYellow;
    public static ModBlockTypeA blockDamaskGreen;
    public static ModBlockTypeA blockDamaskGray;
    public static ModBlockTypeB blockDamaskCyan;
    public static ModBlockTypeA blockDamaskBrown;
    public static ModBlockTypeA blockDamaskPurple;

    public static void instantiate()
    {
        blockDamaskRed =  BlockFactory.createSolidBlockTypeA("damask_red");
        blockDamaskBlue = BlockFactory.createSolidBlockTypeA("damask_blue");
        blockDamaskYellow = BlockFactory.createSolidBlockTypeA("damask_yellow");
        blockDamaskGreen = BlockFactory.createSolidBlockTypeA("damask_green");
        blockDamaskGray= BlockFactory.createSolidBlockTypeA("damask_gray");
        blockDamaskCyan= BlockFactory.createSolidBlockTypeB("damask_cyan");
        blockDamaskBrown= BlockFactory.createSolidBlockTypeA("damask_brown");
        blockDamaskPurple = BlockFactory.createSolidBlockTypeA("damask_purple");
    }
}
