package com.trforcex.mods.wallpapercraft.network;

import com.trforcex.mods.wallpapercraft.blocks.base.ScrollingType;
import com.trforcex.mods.wallpapercraft.items.IScrollable;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

//public class MetaScrollingMessage implements IMessage
//{
//    boolean shouldIncreaseMeta;
//
//    public MetaScrollingMessage(){}
//
//    public MetaScrollingMessage(boolean shouldIncreaseMeta)
//    {
//        this.shouldIncreaseMeta = shouldIncreaseMeta;
//    }
//
//    @Override
//    public void toBytes(ByteBuf buf)
//    {
//        buf.writeBoolean(shouldIncreaseMeta);
//    }
//
//    @Override
//    public void fromBytes(ByteBuf buf)
//    {
//        shouldIncreaseMeta = buf.readBoolean();
//    }
//
//    public static class Handler implements IMessageHandler<MetaScrollingMessage, IMessage>
//    {
//        public Handler(){}
//
//        @Override
//        public IMessage onMessage(MetaScrollingMessage message, MessageContext ctx)
//        {
//            EntityPlayer serverPlayer = ctx.getServerHandler().player;
//            ItemStack heldStack = serverPlayer.getHeldItemMainhand();
//
//            if(!heldStack.isEmpty() && heldStack.getItem() instanceof MetaItemBlock) // Ensure that the held item is MetaItemBlock and is not empty (not doing this can lead to networking errors
//            {
//                int stackMeta = heldStack.getMetadata(); // Get current meta
//                heldStack.setItemDamage(MathHelper.clamp(stackMeta + (message.shouldIncreaseMeta ? 1 : -1), 0, ModHelper.getMetaItemBlockMaxMeta(heldStack.getItem())));
//
//                if(stackMeta == heldStack.getMetadata()) // If meta has not changed because the new value is out of bounds
//                {
//                    if(heldStack.getMetadata() == 0)
//                        heldStack.setItemDamage(ModHelper.getMetaItemBlockMaxMeta(heldStack.getItem()));
//                    else if(heldStack.getMetadata() == ModHelper.getMetaItemBlockMaxMeta(heldStack.getItem()))
//                        heldStack.setItemDamage(0);
//                }
//            }
//
//            return null; // No response packet
//        }
//    }
//
//}

// Generic meta cycling message for non-FC blocks
public class MetaScrollingMessage extends BaseMetaScrollingMessage
{
    public MetaScrollingMessage(){}

    public MetaScrollingMessage(boolean shouldIncreaseMeta)
    {
        super(shouldIncreaseMeta);
    }

    public static class Handler implements IMessageHandler<MetaScrollingMessage, IMessage>
    {
        public Handler(){}

        @Override
        public IMessage onMessage(MetaScrollingMessage message, MessageContext ctx)
        {
            EntityPlayer serverPlayer = ctx.getServerHandler().player;
            ItemStack heldStack = serverPlayer.getHeldItemMainhand();

            if(heldStack.getItem() instanceof IScrollable && ((IScrollable)heldStack.getItem()).getScrollingType() == ScrollingType.Scrollable)
            {
                int stackMeta = heldStack.getMetadata(); // Get current meta
                heldStack.setItemDamage(MathHelper.clamp(stackMeta + (message.shouldIncreaseMeta ? 1 : -1), 0, ModHelper.getMetaItemBlockMaxMeta(heldStack.getItem())));

                if(stackMeta == heldStack.getMetadata()) // If meta has not changed because the new value is out of bounds
                {
                    if(heldStack.getMetadata() == 0)
                        heldStack.setItemDamage(ModHelper.getMetaItemBlockMaxMeta(heldStack.getItem()));
                    else if(heldStack.getMetadata() == ModHelper.getMetaItemBlockMaxMeta(heldStack.getItem()))
                        heldStack.setItemDamage(0);
                }
            }

            return null;
        }
    }
}