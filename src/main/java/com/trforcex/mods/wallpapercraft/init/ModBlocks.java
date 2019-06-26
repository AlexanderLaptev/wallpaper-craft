package com.trforcex.mods.wallpapercraft.init;

import com.trforcex.mods.wallpapercraft.ModClass;
import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.blockStates.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.blocks.*;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeC;
import com.trforcex.mods.wallpapercraft.blocks.carpets.CheckeredWoolCarpetsBlocks;
import com.trforcex.mods.wallpapercraft.blocks.carpets.WoolCarpetsBlocks;
import com.trforcex.mods.wallpapercraft.util.BlockHelper;
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
    public static MetaBlockTypeC blockJewel;
    public static MetaBlockTypeC blockStamp;

    static // Initialization
    {
        BLOCKS = new ArrayList<>(0);

        // ===== SOLID =====
        SolidBlocks.instantiate();
        CheckeredWoolBlocks.instantiate();
        ClayBlocks.instantiate();
        FancyTilesBlocks.instantiate();
        FloralBlocks.instantiate();
        DamaskBlocks.instantiate();
        RippledBlocks.instantiate();
        StripedBlocks.instantiate();

        // ===== NON-SOLID =====
        WoodPlanksBlocks.instantiate();
        WoolBlocks.instantiate();

        // ===== JEWEL AND STAMP =====
        blockJewel = BlockHelper.createSolidBlockTypeC("jewel");
        blockStamp = BlockHelper.createSolidBlockTypeC("stamp");

        // ===== BRICKS =====
        BricksBlocks.instantiate();
        StoneBricksBlocks.instantiate();
        ColoredBricksBlocks.instantiate();

        // ===== GLASS =====
        FrostedGlassBlocks.instantiate();
        TintedGlassBlocks.instantiate();
        TexturedGlassBlocks.instantiate();

        // ===== DOTTED =====
        DottedBlocks.instantiate();
        DiagonallyDottedBlocks.instantiate();

        // ===== LAMPS =====
        StoneLampBlocks.instantiate();
        AuraLampBlocks.instantiate();

        // ===== CARPETS =====
        WoolCarpetsBlocks.instantiate();
        CheckeredWoolCarpetsBlocks.instantiate();
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
