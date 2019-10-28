package com.trforcex.mods.wallpapercraft.util;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ModDataManager
{
    public static final List<String> COLORS = Arrays.asList("red", "yellow", "green", "cyan", "blue", "purple", "brown", "gray");

    // From colors to metas
    public static final int[] JEWEL_STAMP_LOOKUP = {1, 10, 8, 4, 5, 3, 12, 14};

    // UNUSED
//    public static final int[] BLOCK_META_LOOKUP = {14, 4, 13, 9, 11, 10, 12, 7};
//    public static final int[] DYE_META_LOOKUP = {1, 11, 2, 6, 4, 5, 3, 8};
//    public static final String[] VANILLA_COLORS = {"red", "orange", "yellow", "green", "light blue", "blue", "purple", "light gray", "gray", "black", "brown", "cyan", "pink", "lime", "magenta", "white"};

    public static final HashMap<String, Block> BASE_BLOCK = new HashMap<>();

    static
    {
        // Base blocks for solid blocks
        BASE_BLOCK.put("bricks", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("stone_bricks", Blocks.STONE);
        BASE_BLOCK.put("colored_bricks", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("dotted", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("diagonally_dotted", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("rippled", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("striped", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("damask", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("floral", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("fancy_tiles", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("clay", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("solid", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("jewel", Blocks.HARDENED_CLAY);
        BASE_BLOCK.put("stamp", Blocks.HARDENED_CLAY);

        BASE_BLOCK.put("leafy", Blocks.STONE);
        BASE_BLOCK.put("beehive_lantern", Blocks.HARDENED_CLAY);

        // Lamps
        BASE_BLOCK.put("stone_lamp", Blocks.STONE);
        BASE_BLOCK.put("aura_lamp", Blocks.HARDENED_CLAY);

        // Wool
        BASE_BLOCK.put("wool", Blocks.WOOL);
        BASE_BLOCK.put("checkered_wool", Blocks.WOOL);
        BASE_BLOCK.put("honeycomb", Blocks.WOOL);
        BASE_BLOCK.put("grass_cloth", Blocks.WOOL);

        // Stone
        BASE_BLOCK.put("forestry_stone_bricks", Blocks.STONE);
        BASE_BLOCK.put("beehive_tile", Blocks.STONE);

        // Wood
        BASE_BLOCK.put("wood", Blocks.PLANKS);
        BASE_BLOCK.put("wood_planks", Blocks.PLANKS);

        // Glass
        BASE_BLOCK.put("tinted_glass", Blocks.GLASS);
        BASE_BLOCK.put("textured_glass", Blocks.GLASS);
        BASE_BLOCK.put("frosted_glass", Blocks.GLASS);
        BASE_BLOCK.put("stone_bricks_glass", Blocks.GLASS);
    }
}
