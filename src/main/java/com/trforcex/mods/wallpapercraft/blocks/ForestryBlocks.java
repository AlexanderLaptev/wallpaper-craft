package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockForestry;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeC;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;

public class ForestryBlocks
{
    public static MetaBlockTypeC grassCloth1;
    public static MetaBlockTypeC honeyComb1;
    public static MetaBlockTypeC leafy1;
    public static MetaBlockTypeC beehiveTile1;
    public static MetaBlockTypeC stoneBrick1;
    public static MetaBlockTypeC glassBrick1;
    ////////////
    public static MetaBlockForestry grassCloth2;
    public static MetaBlockForestry honeyComb2;
    public static MetaBlockForestry leafy2;
    public static MetaBlockForestry beehiveTile2;
    public static MetaBlockForestry stoneBrick2;
    public static MetaBlockForestry glassBrick2;

    public static void instantiate()
    {
        grassCloth1 = BlockHelper.createForestryWoolBlock("grass_cloth_1");
        grassCloth2 = BlockHelper.createForestryWoolBlock2("grass_cloth_2");

        honeyComb1 = BlockHelper.createForestryWoolBlock("honey_comb_1");
        honeyComb2 = BlockHelper.createForestryWoolBlock2("honey_comb_2");

        leafy1 = BlockHelper.createForestryWoolBlock("leafy_1");
        leafy2 = BlockHelper.createForestryWoolBlock2("leafy_2");

        beehiveTile1 = BlockHelper.createSolidBlockTypeC("beehive_tile_1");
        beehiveTile2 = BlockHelper.createForestrySolidBlock2("beehive_tile_2");

        stoneBrick1 = BlockHelper.createSolidBlockTypeC("forestry_stone_bricks_1");
        stoneBrick2 = BlockHelper.createForestrySolidBlock2("forestry_stone_bricks_2");

        glassBrick1 = BlockHelper.createForestryGlassBlock("glass_bricks_1");
        glassBrick2 = BlockHelper.createForestryGlassBlock2("glass_bricks_2");
    }
}
