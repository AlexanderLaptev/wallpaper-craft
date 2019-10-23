package com.trforcex.mods.wallpapercraft.blocks;

import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockForestry;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeC;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;

public class ForestryBlocks
{
    public static MetaBlockTypeC grassCloth1;
    public static MetaBlockTypeC honeyComb1;
    public static MetaBlockTypeC leafy1;
    public static MetaBlockTypeC beehiveLantern1;
    public static MetaBlockTypeC stoneBrick1;
    public static MetaBlockTypeC glassBrick1;
    ////////////
    public static MetaBlockForestry grassCloth2;
    public static MetaBlockForestry honeyComb2;
    public static MetaBlockForestry leafy2;
    public static MetaBlockForestry beehiveLantern2;
    public static MetaBlockForestry stoneBrick2;
    public static MetaBlockForestry glassBrick2;

    public static void instantiate()
    {
        grassCloth1 = BlockFactory.createForestryWoolBlock("grass_cloth_1");
        grassCloth2 = BlockFactory.createForestryWoolBlock2("grass_cloth_2");

        honeyComb1 = BlockFactory.createForestryWoolBlock("honey_comb_1");
        honeyComb2 = BlockFactory.createForestryWoolBlock2("honey_comb_2");

        leafy1 = BlockFactory.createForestryWoolBlock("leafy_1");
        leafy2 = BlockFactory.createForestryWoolBlock2("leafy_2");

        beehiveLantern1 = BlockFactory.createBeehiveLantern("beehive_tile_1");
        beehiveLantern2 = BlockFactory.createBeehiveLantern2("beehive_tile_2");

        stoneBrick1 = BlockFactory.createSolidBlockTypeC("forestry_stone_bricks_1");
        stoneBrick2 = BlockFactory.createForestrySolidBlock2("forestry_stone_bricks_2");

        glassBrick1 = BlockFactory.createForestryGlassBlock("glass_bricks_1");
        glassBrick2 = BlockFactory.createForestryGlassBlock2("glass_bricks_2");
    }
}
