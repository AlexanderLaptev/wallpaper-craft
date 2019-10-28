package com.trforcex.mods.wallpapercraft.network;

import com.trforcex.mods.wallpapercraft.blocks.base.ScrollingType;
import com.trforcex.mods.wallpapercraft.items.IScrollable;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ForestryCompatibleBlockScrollingMessage extends BaseMetaScrollingMessage
{
    public ForestryCompatibleBlockScrollingMessage(){}

    public ForestryCompatibleBlockScrollingMessage(boolean shouldIncreaseMeta)
    {
        super(shouldIncreaseMeta);
    }

    public static class Handler implements IMessageHandler<ForestryCompatibleBlockScrollingMessage, IMessage>
    {
        public Handler(){}

        @Override
        public IMessage onMessage(ForestryCompatibleBlockScrollingMessage message, MessageContext ctx)
        {
            EntityPlayer serverPlayer = ctx.getServerHandler().player;
            ItemStack heldStack = serverPlayer.getHeldItemMainhand();

            if(!heldStack.isEmpty() && heldStack.getItem() instanceof IScrollable)
            {
                String resourcePath = heldStack.getItem().getRegistryName().getResourcePath();

                if(((IScrollable) heldStack.getItem()).getScrollingType() == ScrollingType.ForestryCompatible)
                    if(resourcePath.endsWith("_1"))
                    {
                        int stackMeta = heldStack.getMetadata();
                        heldStack.setItemDamage(MathHelper.clamp(heldStack.getItemDamage() + (message.shouldIncreaseMeta ? 1 : -1), 0, 15));

                        if(stackMeta == heldStack.getItemDamage())
                        {
                            final String substring = resourcePath.substring(0, resourcePath.length() - 2);
                            if(stackMeta == 15) // Not changed because of limit
                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_2", heldStack.getCount(), 0));
                            else if(stackMeta == 0)
                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_2", heldStack.getCount(), 12));
                        }
                    }
                    else if(resourcePath.endsWith("_2"))
                    {
                        int stackMeta = heldStack.getMetadata();
                        heldStack.setItemDamage(MathHelper.clamp(heldStack.getItemDamage() + (message.shouldIncreaseMeta ? 1 : -1), 0, 12));

                        if(stackMeta == heldStack.getItemDamage())
                        {
                            final String substring = resourcePath.substring(0, resourcePath.length() - 2);
                            if(stackMeta == 12) // Not changed because of limit
                                //serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(heldStack.getCount(), 0, substring + "_1"));
                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_1", heldStack.getCount(), 0));
                            else if(stackMeta == 0)
                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_1", heldStack.getCount(), 15));
                        }
                    }
            }

            return null;
        }
    }
}