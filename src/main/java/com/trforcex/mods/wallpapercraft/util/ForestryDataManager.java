package com.trforcex.mods.wallpapercraft.util;

import java.util.ArrayList;
import java.util.HashMap;

public class ForestryDataManager
{
    public static final HashMap<String, Integer> METAS_1;
    //public static final HashMap<String, Integer> MOD_METAS_1;
    
    public static final HashMap<String, Integer> METAS_2;
    //public static final HashMap<String, Integer> MOD_METAS_2;

    public static final ArrayList<String> WOOD_TYPES;
    public static final ArrayList<String> WOOD_TYPES_1;
    public static final ArrayList<String> WOOD_TYPES_2;

    public static final String[] PATTERNS = {"grass_cloth", "honey_comb", "leafy", "beehive_tile", "forestry_stone_bricks", "glass_bricks"};

    static
    {
        METAS_1 = new HashMap<>();
        METAS_2 = new HashMap<>();
//        MOD_METAS_1 = new HashMap<>();
//        MOD_METAS_2 = new HashMap<>();

        //region === FORESTRY ===
        METAS_1.put("larch", 0);
        METAS_1.put("teak", 1);
        METAS_1.put("acacia", 2);
        METAS_1.put("lime", 3);
        METAS_1.put("chestnut", 4);
        METAS_1.put("wenge", 5);
        METAS_1.put("baobab", 6);
        METAS_1.put("sequoia", 7);
        METAS_1.put("kapok", 8);
        METAS_1.put("ebony", 9);
        METAS_1.put("mahogany", 10);
        METAS_1.put("balsa", 11);
        METAS_1.put("willow", 12);
        METAS_1.put("walnut", 13);
        METAS_1.put("greenheart", 14);
        METAS_1.put("cherry", 15);
        
        METAS_2.put("mahoe", 0);
        METAS_2.put("poplar", 1);
        METAS_2.put("palm", 2);
        METAS_2.put("papaya", 3);
        METAS_2.put("pine", 4);
        METAS_2.put("plum", 5);
        METAS_2.put("maple", 6);
        METAS_2.put("citrus", 7);
        METAS_2.put("giganteum", 8);
        METAS_2.put("ipe", 9);
        METAS_2.put("padauk", 10);
        METAS_2.put("cocobolo", 11);
        METAS_2.put("zebrawood", 12);
        //endregion

        //region === MOD ===
//        MOD_METAS_1.put("larch", 12);
//        MOD_METAS_2.put("teak", 8);
//        MOD_METAS_1.put("acacia", 0);
//        MOD_METAS_1.put("lime", 13);
//        MOD_METAS_1.put("chestnut", 4);
//        MOD_METAS_2.put("wenge", 10);
//        MOD_METAS_1.put("baobab", 2);
//        MOD_METAS_2.put("sequoia", 7);
//        MOD_METAS_1.put("kapok", 11);
//        MOD_METAS_1.put("ebony", 7);
//        MOD_METAS_1.put("mahogany", 15);
//        MOD_METAS_1.put("balsa", 1);
//        MOD_METAS_2.put("willow", 11);
//        MOD_METAS_2.put("walnut", 9);
//        MOD_METAS_1.put("greenheart", 9);
//        MOD_METAS_1.put("cherry", 3);
//
//        MOD_METAS_1.put("mahoe", 14);
//        MOD_METAS_2.put("poplar", 6);
//        MOD_METAS_2.put("palm", 2);
//        MOD_METAS_2.put("papaya", 3);
//        MOD_METAS_2.put("pine", 4);
//        MOD_METAS_2.put("plum", 5);
//        MOD_METAS_2.put("maple", 0);
//        MOD_METAS_1.put("citrus", 5);
//        MOD_METAS_1.put("giganteum", 8);
//        MOD_METAS_1.put("ipe", 10);
//        MOD_METAS_2.put("padauk", 1);
//        MOD_METAS_1.put("cocobolo", 16);
//        MOD_METAS_2.put("zebrawood", 12);
        //endregion

        // Populate WOOD_TYPES
        WOOD_TYPES = new ArrayList<>();
        WOOD_TYPES_1 = new ArrayList<>();
        WOOD_TYPES_2 = new ArrayList<>();

        WOOD_TYPES.addAll(METAS_1.keySet());
        WOOD_TYPES_1.addAll(METAS_1.keySet());

        WOOD_TYPES.addAll(METAS_2.keySet());
        WOOD_TYPES_2.addAll(METAS_2.keySet());
    }
}
