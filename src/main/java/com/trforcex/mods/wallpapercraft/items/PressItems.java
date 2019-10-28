package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.init.ModItems;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.item.Item;

public class PressItems
{
    public static Item itemPressBlank;

    public static BasePressItem itemPressGrassCloth;
    public static BasePressItem itemPressHoneycomb;
    public static BasePressItem itemPressLeafy;
    public static BasePressItem itemPressBeehiveTile;
    public static BasePressItem itemPressGlassStoneBricks;

    public static BasePressItem itemPressSolid;
    public static BasePressItem itemPressBricks;
    public static BasePressItem itemPressColoredBricks;
    public static BasePressItem itemPressStoneLamp;
    public static BasePressItem itemPressCheckeredWool;
    public static BasePressItem itemPressDotted;
    public static BasePressItem itemPressDiagonallyDotted;
    public static BasePressItem itemPressClay;
    public static BasePressItem itemPressAuraLamp;
    public static BasePressItem itemPressFancyTiles;
    public static BasePressItem itemPressFloral;
    public static BasePressItem itemPressDamask;
    public static BasePressItem itemPressJewel;
    public static BasePressItem itemPressRippled;
    public static BasePressItem itemPressStamp;
    public static BasePressItem itemPressFrostedGlass;
    public static BasePressItem itemPressTintedGlass;
    public static BasePressItem itemPressTexturedGlass;
    public static BasePressItem itemPressStriped;
    public static BasePressItem itemPressStoneBricks;
    public static BasePressItem itemPressWool;
    public static BasePressItem itemPressWoodPlanks;

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
