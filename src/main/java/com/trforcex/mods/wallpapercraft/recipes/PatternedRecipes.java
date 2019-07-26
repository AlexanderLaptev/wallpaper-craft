package com.trforcex.mods.wallpapercraft.recipes;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blocks.base.BaseMetaBlock;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

// TODO: extract Item.getItemFromBlock
public class PatternedRecipes
{

    private static final ResourceLocation woolGroup = new ResourceLocation(ModReference.MODID, "wool");
    private static final ResourceLocation checkeredWoolGroup = new ResourceLocation(ModReference.MODID, "checkered_wool");

    private static final ResourceLocation woolCarpetsGroup = new ResourceLocation(ModReference.MODID, "wool_carpets");
    private static final ResourceLocation checkeredCarpets = new ResourceLocation(ModReference.MODID, "checkered_carpets");

    private static final ResourceLocation texturedGroup = new ResourceLocation(ModReference.MODID, "textured_glass");
    private static final ResourceLocation tintedGroup = new ResourceLocation(ModReference.MODID, "tinted_glass");
    private static final ResourceLocation frostedGroup = new ResourceLocation(ModReference.MODID, "frosted_glass");

    private static final ResourceLocation woodPlanksGroup = new ResourceLocation(ModReference.MODID, "wood_planks");

    private static final ResourceLocation stoneLampsGroup = new ResourceLocation(ModReference.MODID, "stone_lamp");
    private static final ResourceLocation auraLampsGroup = new ResourceLocation(ModReference.MODID, "aura_lamp");

    public static void init()
    {
        initSolidRecipes();

        initWoolAndCarpetRecipes();
        initGlassRecipes();
        initPlanksRecipes();
        initLampsRecipes();
    }

    private static void initSolidRecipes() // PATTERNS_SOLID
    {
        for(String pattern : ModReference.SOLID_PATTERNS)
        {
            for(String color : ModReference.COLORS)
            {
                ModHelper.logDebug("Registering recipe for: [" + pattern + "_" + color + "]");

                // ===== PRESS =====
                ResourceLocation pressResourceLocation = new ResourceLocation(ModReference.MODID, "press_"+ pattern);
                Item pressItem = ForgeRegistries.ITEMS.getValue(pressResourceLocation);

                // ===== SOLID BLOCK =====
                ResourceLocation solidResourceLocation = new ResourceLocation(ModReference.MODID, "solid_" + color);
                Block solidBlock = ForgeRegistries.BLOCKS.getValue(solidResourceLocation);

                // ===== OUTPUT =====
                ResourceLocation outputResourceLocation = new ResourceLocation(ModReference.MODID, pattern + "_" + color);
                Block outputBlock = ForgeRegistries.BLOCKS.getValue(outputResourceLocation);
                ItemStack outputStack = new ItemStack(((BaseMetaBlock) outputBlock).getItemBlock(), 8, 0);

                // Validate that outputStack is not empty
                if(outputStack.isEmpty())
                    throw new IllegalArgumentException("outputStack [" + outputStack.toString() + "] is null! Recipe:" + outputResourceLocation);

                //Register recipe
                GameRegistry.addShapedRecipe(outputResourceLocation, new ResourceLocation(ModReference.MODID, pattern), outputStack, "SSS", "SPS", "SSS", 'S', solidBlock, 'P', pressItem);

                ModHelper.logDebug("Successfully registered " + outputStack.getUnlocalizedName() + " [" + pattern + "_" + color + "]");
            }
        }

        ModHelper.logDebug("Completed registering: PATTERNS_SOLID");
    }

    private static void initWoolAndCarpetRecipes()
    {
        initWoolRecipes();
        initCarpetRecipes();
    }

    private static void initWoolRecipes() // WOOL_AND_CHECKERED
    {
        for(int i = 0; i < ModReference.COLORS.length; i++)
        {
            final String color = ModReference.COLORS[i];
            final int blockMeta = ModReference.BLOCK_META_LOOKUP[i];

            ModHelper.logDebug("Registering recipe for: [wool_" + color + "] and [" + "checkered_wool_" + color + "]");

            ResourceLocation woolResourceLocation = new ResourceLocation(ModReference.MODID, "wool_" + color);
            ResourceLocation checkeredResourceLocation = new ResourceLocation(ModReference.MODID, "checkered_wool_" + color);

            Item woolPress = PressItems.itemPressWool;
            Item checkeredPress = PressItems.itemPressCheckered;

            ItemStack vanillaWoolStack = new ItemStack(Blocks.WOOL, 1, blockMeta); // Vanilla wool of corresponding color

            // === OUTPUT ===
            Block woolBlock = ForgeRegistries.BLOCKS.getValue(woolResourceLocation); // Output wool pattern block
            Block checkeredWoolBlock = ForgeRegistries.BLOCKS.getValue(checkeredResourceLocation); // Output checkered wool pattern block

            // Output stacks
            ItemStack outWoolStack = new ItemStack(woolBlock, 8);
            ItemStack outCheckeredStack = new ItemStack(checkeredWoolBlock, 8);

            // Validate item stacks
            if(outWoolStack.isEmpty() || outCheckeredStack.isEmpty())
                throw new IllegalArgumentException("ItemStack(s) is/are empty: [" + outWoolStack + "] and/or [" + outCheckeredStack + "]!");

            // Register recipes
            GameRegistry.addShapedRecipe(woolResourceLocation, woolGroup, outWoolStack, "WWW", "WPW", "WWW", 'W', vanillaWoolStack, 'P', woolPress);
            GameRegistry.addShapedRecipe(checkeredResourceLocation, checkeredWoolGroup, outCheckeredStack, "WWW", "WPW", "WWW", 'W', vanillaWoolStack, 'P', checkeredPress);
        }

        ModHelper.logDebug("Completed registration for: WOOL_AND_CHECKERED");
    }

    private static void initCarpetRecipes() // CARPETS
    {
        for(String color : ModReference.COLORS)
        {
            ModHelper.logDebug("Registering recipe for: [" + "wool_carpet_" + color + "] and [checkered_carpet_" + color + "]");

            // Wool blocks RLs
            ResourceLocation woolResourceLocation = new ResourceLocation(ModReference.MODID, "wool_" + color);
            ResourceLocation checkeredResourceLocation = new ResourceLocation(ModReference.MODID, "checkered_wool_" + color);

            // Carpet blocks RLs
            ResourceLocation carpetRL = new ResourceLocation(ModReference.MODID, "wool_carpet_" + color);
            ResourceLocation checkeredCarpetRL = new ResourceLocation(ModReference.MODID, "checkered_carpet_" + color);

            // Wool blocks
            Block woolBlock = ForgeRegistries.BLOCKS.getValue(woolResourceLocation);
            Block checkeredWoolBlock = ForgeRegistries.BLOCKS.getValue(checkeredResourceLocation);

            // Carpet blocks
            Block carpetBlock = ForgeRegistries.BLOCKS.getValue(carpetRL);
            Block checkeredCarpetBlock = ForgeRegistries.BLOCKS.getValue(checkeredCarpetRL);

            // Recipe output stacks
            ItemStack outCarpet = new ItemStack(carpetBlock, 3);
            ItemStack outCheckeredCarpet = new ItemStack(checkeredCarpetBlock, 3);

            // Validate item stacks
            if(outCarpet.isEmpty() || outCheckeredCarpet.isEmpty())
                throw new IllegalArgumentException("ItemStack(s) is/are empty: [" + outCarpet + "] and/ore [" + outCheckeredCarpet + "]!");

            // Register recipes
            GameRegistry.addShapedRecipe(carpetRL, woolCarpetsGroup, outCarpet, "WW", 'W', woolBlock);
            GameRegistry.addShapedRecipe(checkeredCarpetRL, checkeredCarpets, outCheckeredCarpet, "WW", 'W', checkeredWoolBlock);
        }

        ModHelper.logDebug("Completed registration for: CARPETS");
    }

    private static void initGlassRecipes() // GLASS
    {
        for(int i = 0; i < ModReference.COLORS.length; i++)
        {
            final String color = ModReference.COLORS[i];
            final int blockMeta = ModReference.BLOCK_META_LOOKUP[i];

            ModHelper.logDebug("Registering recipe for: GLASS-" + color);

            // Recipe resource locations
            ResourceLocation texturedRL = new ResourceLocation(ModReference.MODID, "textured_glass_" + color);
            ResourceLocation tintedRL = new ResourceLocation(ModReference.MODID, "tinted_glass_" + color);
            ResourceLocation frostedRL = new ResourceLocation(ModReference.MODID, "frosted_glass_" + color);

            // Vanilla glass stack
            Block vanillaGlass = Blocks.STAINED_GLASS;
            ItemStack vanillaGlassStack = new ItemStack(vanillaGlass, 1, blockMeta);

            // Pattern presses
            Item texturedPress = PressItems.itemPressTexturedGlass;
            Item tintedPress = PressItems.itemPressTintedGlass;
            Item frostedPress = PressItems.itemPressFrostedGlass;

            // Output stacks
            ItemStack outTexturedStack = RecipeHelper.validStack(RecipeHelper.getModBlockFromRegistry("textured_glass_" + color), 8);
            ItemStack outTintedStack = RecipeHelper.validStack(RecipeHelper.getModBlockFromRegistry("tinted_glass_" + color), 8);
            ItemStack outFrostedStack = RecipeHelper.validStack(RecipeHelper.getModBlockFromRegistry("frosted_glass_" + color), 8);

            // Register recipes
            GameRegistry.addShapedRecipe(texturedRL, texturedGroup, outTexturedStack, "GGG", "GPG", "GGG", 'G', vanillaGlassStack, 'P', texturedPress);
            GameRegistry.addShapedRecipe(tintedRL, tintedGroup, outTintedStack, "GGG", "GPG", "GGG", 'G', vanillaGlassStack, 'P', tintedPress);
            GameRegistry.addShapedRecipe(frostedRL, frostedGroup, outFrostedStack, "GGG", "GPG", "GGG", 'G', vanillaGlassStack, 'P', frostedPress);
        }

        ModHelper.logDebug("Completed registration for: GLASS");
    }

    private static void initPlanksRecipes() // PLANKS
    {
        for(int i = 0; i < ModReference.COLORS.length; i++)
        {
            final String color = ModReference.COLORS[i];
            final int dyeMeta = ModReference.DYE_META_LOOKUP[i];

            ModHelper.logDebug("Registering recipe for: [wood_planks_" + color + "]");

            // Recipe resource location
            ResourceLocation recipeResLoc = new ResourceLocation(ModReference.MODID, RecipeHelper.getPatternPath("wood_planks", color));

            // Vanilla stuff
            Block vanillaPlanks = Blocks.PLANKS;
            ItemStack vanillaPlanksStack = new ItemStack(vanillaPlanks, 1, Short.MAX_VALUE); // Any meta accepted
            ItemStack dyeStack = new ItemStack(Items.DYE, 1, dyeMeta);

            // Output stack
            ItemStack outStack = RecipeHelper.validStack(RecipeHelper.getModBlockFromRegistry("wood_planks_" + color), 8);

            // Register recipe
            GameRegistry.addShapedRecipe(recipeResLoc, woodPlanksGroup, outStack, "PPP", "PDP", "PPP", 'P', vanillaPlanksStack, 'D', dyeStack);
        }

        ModHelper.logDebug("Completed registration for: PLANKS");
    }

    private static void initLampsRecipes() // LAMPS
    {
        for(int i = 0; i < ModReference.COLORS.length; i++)
        {
            final String color = ModReference.COLORS[i];
            final int dyeMeta = ModReference.DYE_META_LOOKUP[i];

            // Recipes resource locations
            ResourceLocation stoneLampResLoc = new ResourceLocation(ModReference.MODID, "stone_lamp_" + color);
            ResourceLocation auraLampResLoc = new ResourceLocation(ModReference.MODID, "aura_lamp_" + color);

            // Vanilla
            Block glowstoneBlock = Blocks.GLOWSTONE;
            ItemStack dyeStack = new ItemStack(Items.DYE, 1, dyeMeta);

            // Pattern presses
            Item stoneLampPress = PressItems.itemPressStoneLamp;
            Item auraLampPress = PressItems.itemPressAuraLamp;

            // Output stacks
            ItemStack outStoneLamp = RecipeHelper.validStack(RecipeHelper.getModBlockFromRegistry("stone_lamp_" + color), 8);
            ItemStack outAuraLamp = RecipeHelper.validStack(RecipeHelper.getModBlockFromRegistry("aura_lamp_" + color), 8);

            GameRegistry.addShapedRecipe(stoneLampResLoc, stoneLampsGroup, outStoneLamp, "P", "G", "D", 'P', stoneLampPress, 'G', glowstoneBlock, 'D', dyeStack);
            GameRegistry.addShapedRecipe(auraLampResLoc, auraLampsGroup, outAuraLamp, "P", "G", "D", 'P', auraLampPress, 'G', glowstoneBlock, 'D', dyeStack);

            ModHelper.logDebug("Registering recipe for: LAMPS-" + color);
        }

        ModHelper.logDebug("Completed registration for: LAMPS");
    }
}
