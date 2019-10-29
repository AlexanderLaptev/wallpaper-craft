package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class WoodPlanksBlocks
{
    private static ModBlockTypeA blockWoodPlanksRed;
    private static ModBlockTypeA blockWoodPlanksBlue;
    private static ModBlockTypeA blockWoodPlanksYellow;
    private static ModBlockTypeA blockWoodPlanksGreen;
    private static ModBlockTypeA blockWoodPlanksGray;
    private static ModBlockTypeB blockWoodPlanksCyan;
    private static ModBlockTypeA blockWoodPlanksBrown;
    private static ModBlockTypeA blockWoodPlanksPurple;

    public static void instantiate()
    {
        blockWoodPlanksRed =  BlockFactory.createPlanksBlockTypeA("wood_planks_red");
        blockWoodPlanksBlue = BlockFactory.createPlanksBlockTypeA("wood_planks_blue");
        blockWoodPlanksYellow = BlockFactory.createPlanksBlockTypeA("wood_planks_yellow");
        blockWoodPlanksGreen = BlockFactory.createPlanksBlockTypeA("wood_planks_green");
        blockWoodPlanksGray= BlockFactory.createPlanksBlockTypeA("wood_planks_gray");
        blockWoodPlanksCyan= BlockFactory.createPlanksBlockTypeB("wood_planks_cyan");
        blockWoodPlanksBrown= BlockFactory.createPlanksBlockTypeA("wood_planks_brown");
        blockWoodPlanksPurple = BlockFactory.createPlanksBlockTypeA("wood_planks_purple");
    }
}
