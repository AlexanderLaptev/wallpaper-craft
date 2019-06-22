package com.trforcex.mods.wallpapercraft.items;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.init.ModCreativeTab;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
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
    public static Item itemPressBlank = new Item()
    {
        {
            setRegistryName("pressblank");
            setUnlocalizedName("pressblank");
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    public static Item itemPressBrick = new Item()
    {
        {
            setRegistryName("pressbrick");
            setUnlocalizedName("pressbrick");
            setCreativeTab(ModCreativeTab.WPC_TAB);
        }
    };

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        final IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(itemPressBlank);
        registry.register(itemPressBrick);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModelLoader.setCustomModelResourceLocation(itemPressBlank, 0, new ModelResourceLocation(itemPressBlank.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(itemPressBrick, 0, new ModelResourceLocation(itemPressBlank.getRegistryName(), "inventory"));
    }
}
