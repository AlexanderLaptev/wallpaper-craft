package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeA;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeB;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

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
        blockWoodPlanksRed =  BlockHelper.createPlanksBlockTypeA("wood_planks_red");
        blockWoodPlanksBlue = BlockHelper.createPlanksBlockTypeA("wood_planks_blue");
        blockWoodPlanksYellow = BlockHelper.createPlanksBlockTypeA("wood_planks_yellow");
        blockWoodPlanksGreen = BlockHelper.createPlanksBlockTypeA("wood_planks_green");
        blockWoodPlanksGray= BlockHelper.createPlanksBlockTypeA("wood_planks_gray");
        blockWoodPlanksCyan= BlockHelper.createPlanksBlockTypeB("wood_planks_cyan");
        blockWoodPlanksBrown= BlockHelper.createPlanksBlockTypeA("wood_planks_brown");
        blockWoodPlanksPurple = BlockHelper.createPlanksBlockTypeA("wood_planks_purple");
    }
}
