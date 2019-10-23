package com.trforcex.mods.wallpapercraft.init;

import com.trforcex.mods.wallpapercraft.blocks.*;
import com.trforcex.mods.wallpapercraft.blocks.base.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.blocks.base.MetaBlockTypeC;
import com.trforcex.mods.wallpapercraft.blocks.carpets.CheckeredWoolCarpetsBlocks;
import com.trforcex.mods.wallpapercraft.blocks.carpets.WoolCarpetsBlocks;
import com.trforcex.mods.wallpapercraft.util.BlockFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.HashMap;

@Mod.EventBusSubscriber
public class ModBlocks
{
    public static MetaBlockTypeC blockJewel;
    public static MetaBlockTypeC blockStamp;

    public static final HashMap<ItemStack, String> OREDICT_INIT; // Is used for registration of oredict entries

    static // Initialization
    {
        BLOCKS = new ArrayList<>(0);
        OREDICT_INIT = new HashMap<>();

        SolidBlocks.instantiate(); // SOLID BLOCKS

        // ===== SOLID_PATTERNS =====
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

        // ===== JEWEL, STAMP AND PLACEHOLDER =====
        blockJewel = BlockFactory.createSolidBlockTypeC("jewel");
        blockStamp = BlockFactory.createSolidBlockTypeC("stamp");

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

        // ===== FORESTRY =====
        ForestryBlocks.instantiate();
    }

    public static final ArrayList<Block> BLOCKS;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        for(Block block : BLOCKS)
            event.getRegistry().register(block);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
		final IForgeRegistry<Item> registry = event.getRegistry();

		for(Block block : BLOCKS)
        {
            if(block instanceof IHasMetaItemBlock)
			{
				registry.register(((IHasMetaItemBlock) block).getItemBlock());
			}
        }
    }

    @SubscribeEvent
    public static void registerItemBlockModels(ModelRegistryEvent event)
    {
        for(Block block : BLOCKS)
            if(block instanceof IHasMetaItemBlock)
                ((IHasMetaItemBlock)block).getItemBlock().initModel();
    }
}
