package com.trforcex.mods.wallpapercraft.handler;

import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.init.ModKeybinds;
import com.trforcex.mods.wallpapercraft.items.IScrollable;
import com.trforcex.mods.wallpapercraft.network.ForestryCompatibleBlockScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.ForestryPlanksScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.MetaScrollingMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ScrollMetaHandler
{
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void handleMouseEvent(MouseEvent event)
    {
        int dWheel = event.getDwheel();
        ItemStack heldStack = Minecraft.getMinecraft().player.getHeldItemMainhand();

        if(!heldStack.isEmpty())
            if(ModKeybinds.metaScrollKey.isKeyDown() && heldStack.getItem() instanceof IScrollable && dWheel != 0)
            {
                switch(((IScrollable) heldStack.getItem()).getScrollingType())
                {
                case Scrollable:
                    ModPacketHandler.NETWORK_WRAPPER.sendToServer(new MetaScrollingMessage(dWheel > 0));
                    break;
                case ForestryCompatible:
                    ModPacketHandler.NETWORK_WRAPPER.sendToServer(new ForestryCompatibleBlockScrollingMessage(dWheel > 0));
                    break;
                }

                event.setCanceled(true);
            }
            else
            {
                ResourceLocation registryName = heldStack.getItem().getRegistryName();
                if(dWheel != 0 && ModConfig.compatibility.enableForestryWoodPlanksScrolling)
                    //TODO: add fireproof wood support
                    if(ModKeybinds.metaScrollKey.isKeyDown() && registryName.getResourceDomain().equals("forestry") && (registryName.getResourcePath().equals("planks.0") || registryName.getResourcePath().equals("planks.1")))
                    {
                        ModPacketHandler.NETWORK_WRAPPER.sendToServer(new ForestryPlanksScrollingMessage(dWheel > 0));
                        event.setCanceled(true);
                    }
            }
    }
}
