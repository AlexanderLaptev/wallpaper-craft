package com.trforcex.mods.wallpapercraft.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ModDataManager
{
    public enum BaseBlock
    {
        Clay, Stone, Glass, Wood, Wool
    }

    public static final List<String> COLORS = Arrays.asList("red", "yellow", "green", "cyan", "blue", "purple", "brown", "gray");

    // From colors to metas
    public static final int[] JEWEL_STAMP_LOOKUP = {1, 10, 8, 4, 5, 3, 12, 14};

    // UNUSED
//    public static final int[] BLOCK_META_LOOKUP = {14, 4, 13, 9, 11, 10, 12, 7};
//    public static final int[] DYE_META_LOOKUP = {1, 11, 2, 6, 4, 5, 3, 8};
//    public static final String[] VANILLA_COLORS = {"red", "orange", "yellow", "green", "light blue", "blue", "purple", "light gray", "gray", "black", "brown", "cyan", "pink", "lime", "magenta", "white"};

    public static final String[] SOLID_PATTERNS = {"solid", "bricks", "stone_bricks", "colored_bricks", "dotted", "diagonally_dotted", "rippled", "striped", "damask", "floral", "fancy_tiles", "clay"};

    public static final HashMap<String, BaseBlock> BASE_BLOCK = new HashMap<>();

    static
    {
        // Base blocks for solid blocks
        BASE_BLOCK.put("bricks", BaseBlock.Clay);
        BASE_BLOCK.put("stone_bricks", BaseBlock.Stone);
        BASE_BLOCK.put("colored_bricks", BaseBlock.Clay);
        BASE_BLOCK.put("dotted", BaseBlock.Clay);
        BASE_BLOCK.put("diagonally_dotted", BaseBlock.Clay);
        BASE_BLOCK.put("rippled", BaseBlock.Clay);
        BASE_BLOCK.put("striped", BaseBlock.Clay);
        BASE_BLOCK.put("damask", BaseBlock.Clay);
        BASE_BLOCK.put("floral", BaseBlock.Clay);
        BASE_BLOCK.put("fancy_tiles", BaseBlock.Clay);
        BASE_BLOCK.put("clay", BaseBlock.Clay);
        BASE_BLOCK.put("solid", BaseBlock.Clay);
        BASE_BLOCK.put("jewel", BaseBlock.Clay);
        BASE_BLOCK.put("stamp", BaseBlock.Clay);

        BASE_BLOCK.put("leafy", BaseBlock.Stone);
        BASE_BLOCK.put("beehive_lantern", BaseBlock.Clay);

        // Lamps
        BASE_BLOCK.put("stone_lamp", BaseBlock.Stone);
        BASE_BLOCK.put("aura_lamp", BaseBlock.Clay);

        // Wool
        BASE_BLOCK.put("wool", BaseBlock.Wool);
        BASE_BLOCK.put("checkered_wool", BaseBlock.Wool);
        //BASE_BLOCK.put("honeycomb", BaseBlock.Wool); // TODO: check me!
        BASE_BLOCK.put("honey_comb", BaseBlock.Wool);
        BASE_BLOCK.put("grass_cloth", BaseBlock.Wool);

        // Stone
        BASE_BLOCK.put("forestry_stone_bricks", BaseBlock.Stone);
        BASE_BLOCK.put("beehive_tile", BaseBlock.Stone);

        // Wood
        BASE_BLOCK.put("wood", BaseBlock.Wood);
        BASE_BLOCK.put("wood_planks", BaseBlock.Wood);

        // Glass
        BASE_BLOCK.put("tinted_glass", BaseBlock.Glass);
        BASE_BLOCK.put("textured_glass", BaseBlock.Glass);
        BASE_BLOCK.put("frosted_glass", BaseBlock.Glass);
        BASE_BLOCK.put("glass_bricks", BaseBlock.Glass);
    }
}
