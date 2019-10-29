package com.trforcex.mods.wallpapercraft.handler;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.network.ForestryCompatibleBlockScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.ForestryPlanksScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.MetaScrollingMessage;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

// A class which handles network packets
public class ModPacketHandler
{
    static final SimpleNetworkWrapper NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.MODID); // Mod network wrapper
    private static int id = 0; // Message ID

    static
    {
        NETWORK_WRAPPER.registerMessage(MetaScrollingMessage.Handler.class, MetaScrollingMessage.class, id++, Side.SERVER);
        if(Loader.isModLoaded("forestry"))
            NETWORK_WRAPPER.registerMessage(ForestryPlanksScrollingMessage.Handler.class, ForestryPlanksScrollingMessage.class, id++, Side.SERVER);
        NETWORK_WRAPPER.registerMessage(ForestryCompatibleBlockScrollingMessage.Handler.class, ForestryCompatibleBlockScrollingMessage.class, id++, Side.SERVER);
    }
}
