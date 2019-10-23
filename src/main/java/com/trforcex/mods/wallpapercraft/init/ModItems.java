package com.trforcex.mods.wallpapercraft.init;

import com.trforcex.mods.wallpapercraft.items.ColoredPaste;
import com.trforcex.mods.wallpapercraft.items.PressItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ModItems
{
    public static final ArrayList<Item> ITEMS = new ArrayList<>();

    public static ColoredPaste itemColoredPaste = new ColoredPaste();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        PressItems.instantiate();
        for(Item item : ITEMS)
            event.getRegistry().register(item);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        for(Item item : ITEMS)
        {
            if(item.getRegistryName().getResourcePath().equals("colored_paste"))
                ((ColoredPaste)item).initModel();
            else
            {
                ModelResourceLocation modelResLoc = new ModelResourceLocation(item.getRegistryName(), "inventory");
                ModelLoader.setCustomModelResourceLocation(item, 0, modelResLoc);
            }
        }
    }
}
