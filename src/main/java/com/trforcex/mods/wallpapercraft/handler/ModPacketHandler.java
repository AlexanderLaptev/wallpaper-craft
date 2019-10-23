package com.trforcex.mods.wallpapercraft.handler;

import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.network.ForestryCompatibleBlockScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.ForestryPlanksScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.MetaScrollingMessage;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModPacketHandler
{
    static final SimpleNetworkWrapper NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.MODID);
    private static int id = 0;

    static
    {
        NETWORK_WRAPPER.registerMessage(MetaScrollingMessage.Handler.class, MetaScrollingMessage.class, id++, Side.SERVER);

        if(ModConfig.compatibility.enableForestryWoodPlanksScrolling)
            NETWORK_WRAPPER.registerMessage(ForestryPlanksScrollingMessage.Handler.class, ForestryPlanksScrollingMessage.class, id++, Side.SERVER);

        NETWORK_WRAPPER.registerMessage(ForestryCompatibleBlockScrollingMessage.Handler.class, ForestryCompatibleBlockScrollingMessage.class, id++, Side.SERVER);
    }
}
