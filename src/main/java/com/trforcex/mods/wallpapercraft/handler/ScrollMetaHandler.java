package com.trforcex.mods.wallpapercraft.handler;

import com.trforcex.mods.wallpapercraft.ModConfig;
import com.trforcex.mods.wallpapercraft.init.ModKeybinds;
import com.trforcex.mods.wallpapercraft.items.IScrollable;
import com.trforcex.mods.wallpapercraft.network.ForestryCompatibleBlockScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.ForestryPlanksScrollingMessage;
import com.trforcex.mods.wallpapercraft.network.MetaScrollingMessage;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
// Handler of mouse events which sends meta scrolling messages to the server
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
            else if(Loader.isModLoaded("forestry"))
            {
                Block block = Block.getBlockFromItem(heldStack.getItem());
                ModHelper.ForestryCheckResult checkResult = ModHelper.checkIfForestryBlock(block);
                if(dWheel != 0 && ModConfig.compatibility.enableForestryWoodPlanksScrolling && ModKeybinds.metaScrollKey.isKeyDown())
                    if(checkResult != ModHelper.ForestryCheckResult.NonForestry)
                    {
                        ModPacketHandler.NETWORK_WRAPPER.sendToServer(new ForestryPlanksScrollingMessage(dWheel > 0));
                        event.setCanceled(true);
                    }
            }
    }
}
