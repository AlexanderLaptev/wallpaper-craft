package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockForestry;
import com.trforcex.mods.wallpapercraft.blocks.base.ModBlockTypeC;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class ForestryBlocks
{
    private static ModBlockTypeC grassCloth1;
    private static ModBlockTypeC honeyComb1;
    private static ModBlockTypeC leafy1;
    private static ModBlockTypeC beehiveLantern1;
    private static ModBlockTypeC stoneBrick1;
    private static ModBlockTypeC glassBrick1;
    ////////////
    private static ModBlockForestry grassCloth2;
    private static ModBlockForestry honeyComb2;
    private static ModBlockForestry leafy2;
    private static ModBlockForestry beehiveLantern2;
    private static ModBlockForestry stoneBrick2;
    private static ModBlockForestry glassBrick2;

    public static void instantiate()
    {
        grassCloth1 = BlockFactory.createForestryWoolBlock("grass_cloth_1");
        grassCloth2 = BlockFactory.createForestryWoolBlock2("grass_cloth_2");

        honeyComb1 = BlockFactory.createForestryWoolBlock("honeycomb_1");
        honeyComb2 = BlockFactory.createForestryWoolBlock2("honeycomb_2");

        leafy1 = BlockFactory.createForestryWoolBlock("leafy_1");
        leafy2 = BlockFactory.createForestryWoolBlock2("leafy_2");

        beehiveLantern1 = BlockFactory.createBeehiveLantern("beehive_tile_1");
        beehiveLantern2 = BlockFactory.createBeehiveLantern2("beehive_tile_2");

        stoneBrick1 = BlockFactory.createSolidBlockTypeC("forestry_stone_bricks_1");
        stoneBrick2 = BlockFactory.createForestrySolidBlock2("forestry_stone_bricks_2");

        glassBrick1 = BlockFactory.createForestryGlassBlock("stone_bricks_glass_1");
        glassBrick2 = BlockFactory.createForestryGlassBlock2("stone_bricks_glass_2");
    }
}
