package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class PressItems
{
    // NOTE: region and endregion comments are for Intellij Idea folding only!
    //region Items anonymous classes
    public static Item itemPressBlank = new Item() // Blank
    {
        {
            setRegistryName("press_blank");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressBrick = new BasePressItem() // Bricks
    {
        {
            setRegistryName("press_bricks");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressCheckered = new BasePressItem() // Checkered
    {
        {
            setRegistryName("press_checkered");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressDotted = new BasePressItem() // Dotted
    {
        {
            setRegistryName("press_dotted");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressDiagonallyDotted = new BasePressItem() // Diagonally dotted
    {
        {
            setRegistryName("press_diagonally_dotted");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressClay = new BasePressItem() // Clay
    {
        {
            setRegistryName("press_clay");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressStoneLamp = new BasePressItem() // Stone lamp
    {
        {
            setRegistryName("press_stone_lamp");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressAuraLamp = new BasePressItem() // Aura lamp
    {
        {
            setRegistryName("press_aura_lamp");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressFancyTiles = new BasePressItem() // Fancy tiles
    {
        {
            setRegistryName("press_fancy_tiles");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressFloral = new BasePressItem() // Floral
    {
        {
            setRegistryName("press_floral");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressDamask = new BasePressItem() // Damask
    {
        {
            setRegistryName("press_damask");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressJewel = new BasePressItem() // Jewel
    {
        {
            setRegistryName("press_jewel");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressRippled = new BasePressItem() // Rippled
    {
        {
            setRegistryName("press_rippled");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressStamp = new BasePressItem() // Stamp
    {
        {
            setRegistryName("press_stamp");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressFrostedGlass = new BasePressItem() // Frosted glass
    {
        {
            setRegistryName("press_frosted_glass");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressTintedGlass = new BasePressItem() // Tinted glass
    {
        {
            setRegistryName("press_tinted_glass");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressTexturedGlass = new BasePressItem() // Textured glass
    {
        {
            setRegistryName("press_textured_glass");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressStriped = new BasePressItem() // Striped
    {
        {
            setRegistryName("press_striped");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressStoneBricks = new BasePressItem() // Stone bricks
    {
        {
            setRegistryName("press_stone_bricks");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressColoredBricks = new BasePressItem() // Colored bricks
    {
        {
            setRegistryName("press_colored_bricks");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    // No need in this press as now planks are created using dyes.
    // TODO: remove press recipe
    // TODO: remove press completely [?]
//    public static Item itemPressWoodPlanks = new BasePressItem() // Wood planks
//    {
//        {
//            setRegistryName("press_wood_planks");
//            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
//            setCreativeTab(ModCreativeTab.WPC_TAB);
//        }
//    };

    public static Item itemPressWool = new BasePressItem() // Wool
    {
        {
            setRegistryName("press_wool");
            setUnlocalizedName(ModHelper.makeUnlocalizedName(this));
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };
    //endregion

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(itemPressBlank);
        registry.register(itemPressBrick);
        registry.register(itemPressCheckered);
        registry.register(itemPressDotted);
        registry.register(itemPressDiagonallyDotted);
        registry.register(itemPressClay);
        registry.register(itemPressStoneLamp);
        registry.register(itemPressAuraLamp);
        registry.register(itemPressStoneBricks);
        registry.register(itemPressColoredBricks);
        registry.register(itemPressDamask);
        registry.register(itemPressFloral);
        registry.register(itemPressJewel);
        registry.register(itemPressStamp);
        registry.register(itemPressTexturedGlass);
        registry.register(itemPressTintedGlass);
        registry.register(itemPressFrostedGlass);
        registry.register(itemPressFancyTiles);
        //registry.register(itemPressWoodPlanks);
        registry.register(itemPressWool);
        registry.register(itemPressRippled);
        registry.register(itemPressStriped);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModelLoader.setCustomModelResourceLocation(itemPressBlank, 0, new ModelResourceLocation(itemPressBlank.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressBrick, 0, new ModelResourceLocation(itemPressBrick.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressCheckered, 0, new ModelResourceLocation(itemPressCheckered.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressDotted, 0, new ModelResourceLocation(itemPressDotted.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressDiagonallyDotted, 0, new ModelResourceLocation(itemPressDiagonallyDotted.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressClay, 0, new ModelResourceLocation(itemPressClay.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressStoneLamp, 0, new ModelResourceLocation(itemPressStoneLamp.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressAuraLamp, 0, new ModelResourceLocation(itemPressAuraLamp.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressStoneBricks, 0, new ModelResourceLocation(itemPressStoneBricks.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressColoredBricks, 0, new ModelResourceLocation(itemPressColoredBricks.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressDamask, 0, new ModelResourceLocation(itemPressDamask.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressFloral, 0, new ModelResourceLocation(itemPressFloral.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressJewel, 0, new ModelResourceLocation(itemPressJewel.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressStamp, 0, new ModelResourceLocation(itemPressStamp.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressTexturedGlass, 0, new ModelResourceLocation(itemPressTexturedGlass.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressTintedGlass, 0, new ModelResourceLocation(itemPressTintedGlass.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressFrostedGlass, 0, new ModelResourceLocation(itemPressFrostedGlass.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressFancyTiles, 0, new ModelResourceLocation(itemPressFancyTiles.getRegistryName(), "inventory"));
        //ModelLoader.setCustomModelResourceLocation(itemPressWoodPlanks, 0, new ModelResourceLocation(itemPressWoodPlanks.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressWool, 0, new ModelResourceLocation(itemPressWool.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressRippled, 0, new ModelResourceLocation(itemPressRippled.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressStriped, 0, new ModelResourceLocation(itemPressStriped.getRegistryName(), "inventory"));
    }
}
