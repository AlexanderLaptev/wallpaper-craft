package com.trforcex.mods.wallpapercraft.init;

import com.trforcex.mods.wallpapercraft.ModClass;
import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blockStates.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ModBlocks
{
    static
    {
        BLOCKS = new ArrayList<>(0);

        SolidBlocks.instantiate();
        CheckeredWoolBlocks.instantiate();
        ClayBlocks.instantiate();

        BricksBlocks.instantiate();

        DottedBlocks.instantiate();
        DiagonallyDottedBlocks.instantiate();

        StoneLampBlocks.instantiate();
        AuraLampBlocks.instantiate();
    }

    public static final ArrayList<Block> BLOCKS;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        for(Block block : BLOCKS)
            event.getRegistry().register(block);

        if(ModReference.debugMode)
            ModClass.logger.debug("ModBlocks - completed registering blocks!");
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        for(Block block : BLOCKS)
        {
            if(block instanceof IHasMetaItemBlock)
            {
                event.getRegistry().register(((IHasMetaItemBlock)block).getItemBlock());
            }
        }

        if(ModReference.debugMode)
            ModClass.logger.debug("ModBlocks - completed registering MetaItemBlocks!");
    }

    @SubscribeEvent
    public static void registerItemBlockModels(ModelRegistryEvent event)
    {
        for(Block block : BLOCKS)
        {
            if(block instanceof IHasMetaItemBlock)
            {
                ((IHasMetaItemBlock)block).getItemBlock().initModel();
            }
        }

        if(ModReference.debugMode)
            ModClass.logger.debug("ModBlocks - completed registering MetaItemBlock models!");
    }
}
