package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class WoodPlanksBlocks
{
    public static MetaBlockTypeA blockWoodPlanksRed;
    public static MetaBlockTypeA blockWoodPlanksBlue;
    public static MetaBlockTypeA blockWoodPlanksYellow;
    public static MetaBlockTypeA blockWoodPlanksGreen;
    public static MetaBlockTypeA blockWoodPlanksGray;
    public static MetaBlockTypeB blockWoodPlanksCyan;
    public static MetaBlockTypeA blockWoodPlanksBrown;
    public static MetaBlockTypeA blockWoodPlanksPurple;

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
