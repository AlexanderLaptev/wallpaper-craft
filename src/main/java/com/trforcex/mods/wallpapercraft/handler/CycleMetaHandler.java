package com.trforcex.mods.wallpapercraft.handler;

import com.trforcex.mods.wallpapercraft.init.ModKeybinds;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.network.CycleMetaMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class CycleMetaHandler
{
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    @SuppressWarnings("unused")
    public static void handleMouseEvent(MouseEvent event)
    {
        int dWheel = event.getDwheel();
        EntityPlayer player = Minecraft.getMinecraft().player;

        ItemStack heldStack = player.getHeldItemMainhand();

        if(!heldStack.isEmpty() && heldStack.getItem() instanceof MetaItemBlock)
        {
            if(ModKeybinds.metaScrollKey.isKeyDown() && dWheel != 0)
            {
                ModPacketHandler.NETWORK_WRAPPER.sendToServer(new CycleMetaMessage(dWheel > 0));
                event.setCanceled(true);
            }
        }
    }
}
