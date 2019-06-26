package com.trforcex.mods.wallpapercraft.handler;

import com.trforcex.mods.wallpapercraft.ModReference;
import com.trforcex.mods.wallpapercraft.network.CycleMetaMessage;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class ModPacketHandler
{
    public static final SimpleNetworkWrapper NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.MODID);
    private static int id = 0;

    static
    {
        NETWORK_WRAPPER.registerMessage(CycleMetaMessage.Handler.class, CycleMetaMessage.class, id++, Side.SERVER);
    }
}
