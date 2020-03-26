package com.trforcex.mods.wallpapercraft.network;

import com.trforcex.mods.wallpapercraft.blocks.base.BaseModBlock;
import com.trforcex.mods.wallpapercraft.blocks.base.IHasMetaItemBlock;
import com.trforcex.mods.wallpapercraft.blocks.base.ScrollingType;
import com.trforcex.mods.wallpapercraft.items.MetaItemBlock;
import com.trforcex.mods.wallpapercraft.util.ModHelper;
import com.trforcex.mods.wallpapercraft.util.RecipeHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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
//            EntityPlayer serverPlayer = ctx.getServerHandler().player;
//            ItemStack heldStack = serverPlayer.getHeldItemMainhand();
//
//            if(!heldStack.isEmpty() && heldStack.getItem() instanceof IScrollable)
//            {
//                String resourcePath = heldStack.getItem().getRegistryName().getResourcePath();
//
//                if(((IScrollable) heldStack.getItem()).getScrollingType() == ScrollingType.ForestryCompatible)
//                    if(resourcePath.endsWith("_1"))
//                    {
//                        int stackMeta = heldStack.getMetadata();
//                        heldStack.setItemDamage(MathHelper.clamp(heldStack.getItemDamage() + (message.shouldIncreaseMeta ? 1 : -1), 0, 15));
//
//                        if(stackMeta == heldStack.getItemDamage())
//                        {
//                            final String substring = resourcePath.substring(0, resourcePath.length() - 2);
//                            if(stackMeta == 15) // Not changed because of limit
//                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_2", heldStack.getCount(), 0));
//                            else if(stackMeta == 0)
//                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_2", heldStack.getCount(), 12));
//                        }
//                    }
//                    else if(resourcePath.endsWith("_2"))
//                    {
//                        int stackMeta = heldStack.getMetadata();
//                        heldStack.setItemDamage(MathHelper.clamp(heldStack.getItemDamage() + (message.shouldIncreaseMeta ? 1 : -1), 0, 12));
//
//                        if(stackMeta == heldStack.getItemDamage())
//                        {
//                            final String substring = resourcePath.substring(0, resourcePath.length() - 2);
//                            if(stackMeta == 12) // Not changed because of limit
//                                //serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(heldStack.getCount(), 0, substring + "_1"));
//                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_1", heldStack.getCount(), 0));
//                            else if(stackMeta == 0)
//                                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, RecipeHelper.getStack(substring + "_1", heldStack.getCount(), 15));
//                        }
//                    }
//            }

            EntityPlayer serverPlayer = ctx.getServerHandler().player;
            ItemStack heldStack = serverPlayer.getHeldItemMainhand();

            if(!heldStack.isEmpty() && ((MetaItemBlock)heldStack.getItem()).getScrollingType() == ScrollingType.ForestryCompatible)
                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, getOutputStack(message, heldStack));

            return null;
        }

        static ItemStack getOutputStack(ForestryCompatibleBlockScrollingMessage message, ItemStack heldStack)
        {
            final BaseModBlock block = (BaseModBlock) Block.getBlockFromItem(heldStack.getItem());

            final int stackMeta = heldStack.getMetadata();
            final int maxMeta = block.getMaxMeta();
            final int newMeta = MathHelper.clamp(stackMeta + (message.shouldIncreaseMeta ? 1 : -1), 0, maxMeta);

            Block outBlock = null;
            if(stackMeta == newMeta && (stackMeta == maxMeta || stackMeta == 0))
            {
                switch(ModHelper.getGroupOfFcBlock(block))
                {
                case 1:
                    outBlock = ForgeRegistries.BLOCKS.getValue(RecipeHelper.getModResLoc(block.getPattern(), "2"));
                    break;
                case 2:
                    outBlock = ForgeRegistries.BLOCKS.getValue(RecipeHelper.getModResLoc(block.getPattern(), "1"));
                    break;
                }
            }

            if(stackMeta == newMeta)
            {
                if(newMeta == maxMeta)
                    return new ItemStack(outBlock, heldStack.getCount(), 0);
                else if(newMeta == 0)
                    return new ItemStack(outBlock, heldStack.getCount(), ((IHasMetaItemBlock) outBlock).getMaxMeta());
            }

            return new ItemStack(heldStack.getItem(), heldStack.getCount(), newMeta);
        }
    }
}