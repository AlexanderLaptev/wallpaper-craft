package com.trforcex.mods.wallpapercraft.compatibility;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blocks.base.BaseMetaBlock;
import com.trforcex.mods.wallpapercraft.init.ModBlocks;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import org.apache.commons.lang3.Validate;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingRegistry;
import team.chisel.api.carving.ICarvingVariation;

public class ChiselCompatibility
{
    private static final String[] PATTERNS =    {"bricks", "stone_bricks", "colored_bricks", "dotted", "diagonally_dotted",
                                                "rippled", "striped", "damask", "floral", "fancy_tiles", "clay", "wool", "checkered_wool",
                                                "wool_carpet", "checkered_carpet", "wood_planks", "stone_lamp", "aura_lamp",
                                                "tinted_glass", "textured_glass", "frosted_glass", "solid"};
    private static ICarvingRegistry chisel;

//    public static void init() // Now only initializes solid blocks
////    {
////        ICarvingRegistry chisel = CarvingUtils.getChiselRegistry();
////        Validate.notNull(chisel, "Carving registry mustn't be null!"); // Carving registry should not be null at this point
////
////        for(String color : ModReference.COLORS)
////        {
////            ICarvingGroup group = CarvingUtils.getDefaultGroupFor("solid_" + color);
////            chisel.addGroup(group);
////
////            BaseMetaBlock solidBlock = (BaseMetaBlock) RecipeHelper.getModBlockFromRegistry("solid_" + color);
////            Validate.notNull(solidBlock, "Solid block is null!");
////
////            for(int i = 0; i <= solidBlock.getMaxMeta(); i++)
////            {
////                ItemStack stack = RecipeHelper.validStack(solidBlock, 1, i);
////                ICarvingVariation variation = CarvingUtils.variationFor(stack, 0);
////
////                chisel.addVariation("solid_" + color, variation);
////            }
////        }
////    }

    public static void init()
    {
        chisel = CarvingUtils.getChiselRegistry();
        Validate.notNull(chisel, "Carving registry mustn't be null at this point!");

        registerPatterns();
    }

    private static void registerPatterns()
    {
        for(String pattern : PATTERNS)
        {
            for(String color : ModReference.COLORS)
            {
                ICarvingGroup group = CarvingUtils.getDefaultGroupFor(pattern + "_" + color);
                chisel.addGroup(group);

                BaseMetaBlock patternedBlock = (BaseMetaBlock) RecipeHelper.getModBlockFromRegistry(pattern + "_" + color);
                Validate.notNull(patternedBlock, "Registries are not initialized: patternedBlock is null");

                for(int meta = 0; meta <= patternedBlock.getMaxMeta(); meta++)
                {
                    ItemStack stack = RecipeHelper.validStack(patternedBlock, 1, meta);
                    ICarvingVariation variation = CarvingUtils.variationFor(stack, 0);

                    chisel.addVariation(group.getName(), variation);
                }
            }
        }

        // Register Jewel and Stamp blocks
        ICarvingGroup jewelGroup = CarvingUtils.getDefaultGroupFor("jewel");
        ICarvingGroup stampGroup = CarvingUtils.getDefaultGroupFor("stamp");

        chisel.addGroup(jewelGroup);
        chisel.addGroup(stampGroup);

        Block jewelBlock = ModBlocks.blockJewel;
        Block stampBlock = ModBlocks.blockStamp;
        Validate.notNull(jewelBlock, "Registries are not initialized: jewelBlock is null");
        Validate.notNull(stampBlock, "Registries are not initialized: stampBlock is null");

        for(int meta = 0; meta <= 15; meta++)
        {
            ItemStack jewelStack = RecipeHelper.validStack(jewelBlock, 1, meta);
            ICarvingVariation jewelVariation = CarvingUtils.variationFor(jewelStack, 0);

            ItemStack stampStack = RecipeHelper.validStack(stampBlock, 1, meta);
            ICarvingVariation stampVariation = CarvingUtils.variationFor(stampStack, 0);

            chisel.addVariation(jewelGroup.getName(), jewelVariation);
            chisel.addVariation(stampGroup.getName(), stampVariation);
        }

    }
}
