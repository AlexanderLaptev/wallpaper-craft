package com.trforcex.mods.wallpapercraft.compatibility;

import com.trforcex.mods.wallpapercraft.util.ModDataManager;
import com.trforcex.mods.wallpapercraft.util.ModUtils;
import org.apache.commons.lang3.Validate;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingRegistry;

public class ChiselCompatibility
{
    private static final String[] PATTERNS =    {"bricks", "stone_bricks", "colored_bricks", "dotted", "diagonally_dotted",
                                                "rippled", "striped", "damask", "floral", "fancy_tiles", "clay", "wool", "checkered_wool",
                                                "wool_carpet", "checkered_carpet", "wood_planks", "stone_lamp", "aura_lamp",
                                                "tinted_glass", "textured_glass", "frosted_glass", "solid"};
    private static ICarvingRegistry chisel;

    public static void init()
    {
        chisel = CarvingUtils.getChiselRegistry();
        Validate.notNull(chisel, "Carving registry mustn't be null at this point!");

        registerPatterns();
    }

//    private static void registerPatterns()
//    {
//        for(String pattern : PATTERNS)
//        {
//            for(String color : ModDataManager.COLORS)
//            {
//                ICarvingGroup group = CarvingUtils.getDefaultGroupFor(pattern + "_" + color);
//                chisel.addGroup(group);
//
//                BaseMetaBlock patternedBlock = (BaseMetaBlock) RecipeHelper.getModBlock(pattern, color);
//                Validate.notNull(patternedBlock, "Registries are not initialized: patternedBlock is null");
//
//                for(int meta = 0; meta <= patternedBlock.getMaxMeta(); meta++)
//                {
//                    ItemStack stack = RecipeHelper.getStack(patternedBlock, 1, meta);
//                    ICarvingVariation variation = CarvingUtils.variationFor(stack, 0);
//
//                    chisel.addVariation(group.getName(), variation);
//                }
//            }
//        }
//
//        // Register Jewel and Stamp blocks
//        ICarvingGroup jewelGroup = CarvingUtils.getDefaultGroupFor("jewel");
//        ICarvingGroup stampGroup = CarvingUtils.getDefaultGroupFor("stamp");
//
//        chisel.addGroup(jewelGroup);
//        chisel.addGroup(stampGroup);
//
//        Block jewelBlock = ModBlocks.blockJewel;
//        Block stampBlock = ModBlocks.blockStamp;
//        Validate.notNull(jewelBlock, "Registries are not initialized: jewelBlock is null");
//        Validate.notNull(stampBlock, "Registries are not initialized: stampBlock is null");
//
//        for(int meta = 0; meta <= 15; meta++)
//        {
//            ItemStack jewelStack = RecipeHelper.getStack(jewelBlock, 1, meta);
//            ICarvingVariation jewelVariation = CarvingUtils.variationFor(jewelStack, 0);
//
//            ItemStack stampStack = RecipeHelper.getStack(stampBlock, 1, meta);
//            ICarvingVariation stampVariation = CarvingUtils.variationFor(stampStack, 0);
//
//            chisel.addVariation(jewelGroup.getName(), jewelVariation);
//            chisel.addVariation(stampGroup.getName(), stampVariation);
//        }
//
//    }

    private static void registerPatterns()
    {
        for(String color : ModDataManager.COLORS)
            for(String pattern : ModDataManager.COLORS)
            {
                ICarvingGroup carvingGroup = CarvingUtils.getDefaultGroupFor(ModUtils.composeString(pattern, color));
            }
    }
}
