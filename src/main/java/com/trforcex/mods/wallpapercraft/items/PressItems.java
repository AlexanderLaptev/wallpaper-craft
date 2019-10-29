package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.init.ModItems;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.item.Item;

public class PressItems
{
    private static Item itemPressBlank;

    private static BasePressItem itemPressGrassCloth;
    private static BasePressItem itemPressHoneycomb;
    private static BasePressItem itemPressLeafy;
    private static BasePressItem itemPressBeehiveTile;
    private static BasePressItem itemPressGlassStoneBricks;

    private static BasePressItem itemPressSolid;
    private static BasePressItem itemPressBricks;
    private static BasePressItem itemPressColoredBricks;
    private static BasePressItem itemPressStoneLamp;
    private static BasePressItem itemPressCheckeredWool;
    private static BasePressItem itemPressDotted;
    private static BasePressItem itemPressDiagonallyDotted;
    private static BasePressItem itemPressClay;
    private static BasePressItem itemPressAuraLamp;
    private static BasePressItem itemPressFancyTiles;
    private static BasePressItem itemPressFloral;
    private static BasePressItem itemPressDamask;
    private static BasePressItem itemPressJewel;
    private static BasePressItem itemPressRippled;
    private static BasePressItem itemPressStamp;
    private static BasePressItem itemPressFrostedGlass;
    private static BasePressItem itemPressTintedGlass;
    private static BasePressItem itemPressTexturedGlass;
    private static BasePressItem itemPressStriped;
    private static BasePressItem itemPressStoneBricks;
    private static BasePressItem itemPressWool;
    private static BasePressItem itemPressWoodPlanks;

    public static BasePressItem itemPressRemoval;

    public static void instantiate()
    {
        itemPressBlank = new Item();
        itemPressBlank.setRegistryName("press_blank");
        itemPressBlank.setUnlocalizedName(ModHelper.makeUnlocalizedName(itemPressBlank));
        itemPressBlank.setCreativeTab(ModCreativeTab.WPC_TAB);
        itemPressBlank.setMaxStackSize(64);
        ModItems.ITEMS.add(itemPressBlank);

        itemPressGrassCloth = new BasePressItem("press_grass_cloth");
        itemPressHoneycomb = new BasePressItem("press_honeycomb");
        itemPressLeafy = new BasePressItem("press_leafy");
        itemPressBeehiveTile = new BasePressItem("press_beehive_tile");
        itemPressGlassStoneBricks = new BasePressItem("press_stone_bricks_glass");

        itemPressSolid = new BasePressItem("press_solid");
        itemPressBricks = new BasePressItem("press_bricks");
        itemPressColoredBricks = new BasePressItem("press_colored_bricks");
        itemPressStoneLamp = new BasePressItem("press_stone_lamp");
        itemPressCheckeredWool = new BasePressItem("press_checkered_wool");
        itemPressDotted = new BasePressItem("press_dotted");
        itemPressDiagonallyDotted = new BasePressItem("press_diagonally_dotted");
        itemPressClay = new BasePressItem("press_clay");
        itemPressAuraLamp = new BasePressItem("press_aura_lamp");
        itemPressFancyTiles = new BasePressItem("press_fancy_tiles");
        itemPressFloral = new BasePressItem("press_floral");
        itemPressDamask = new BasePressItem("press_damask");
        itemPressJewel = new BasePressItem("press_jewel");
        itemPressRippled = new BasePressItem("press_rippled");
        itemPressStamp = new BasePressItem("press_stamp");
        itemPressFrostedGlass = new BasePressItem("press_frosted_glass");
        itemPressTintedGlass = new BasePressItem("press_tinted_glass");
        itemPressTexturedGlass = new BasePressItem("press_textured_glass");
        itemPressStriped = new BasePressItem("press_striped");
        itemPressStoneBricks = new BasePressItem("press_stone_bricks");
        itemPressWool = new BasePressItem("press_wool");
        itemPressWoodPlanks = new BasePressItem("press_wood_planks");

        itemPressRemoval = new BasePressItem("press_removal");
    }
}
