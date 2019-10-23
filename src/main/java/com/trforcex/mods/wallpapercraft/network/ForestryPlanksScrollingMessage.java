package com.trforcex.mods.wallpapercraft.network;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ForestryPlanksScrollingMessage extends BaseMetaScrollingMessage
{
    public ForestryPlanksScrollingMessage(){}

    public ForestryPlanksScrollingMessage(boolean shouldIncreaseMeta)
    {
        super(shouldIncreaseMeta);
    }

    public static class Handler implements IMessageHandler<ForestryPlanksScrollingMessage, IMessage>
    {
        public Handler(){}

        @Override
        public IMessage onMessage(ForestryPlanksScrollingMessage message, MessageContext ctx)
        {
            EntityPlayer serverPlayer = ctx.getServerHandler().player;
            ItemStack heldStack = serverPlayer.getHeldItemMainhand();

            if(!heldStack.isEmpty())
            {
                ResourceLocation registryName = Block.getBlockFromItem(heldStack.getItem()).getRegistryName();
                if(registryName.getResourceDomain().equals("forestry") && registryName.getResourcePath().equals("planks.0"))
                {
                    int stackMeta = heldStack.getMetadata();
                    heldStack.setItemDamage(MathHelper.clamp(heldStack.getItemDamage() + (message.shouldIncreaseMeta ? 1 : -1), 0, 15));

                    if(stackMeta == heldStack.getItemDamage())
                    {
                        if(stackMeta == 15) // Not changed because of limit
                            serverPlayer.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.1")), heldStack.getCount(), 0));
                        else if(stackMeta == 0)
                            serverPlayer.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.1")), heldStack.getCount(), 12));
                    }
                }
                else if(registryName.getResourceDomain().equals("forestry") && registryName.getResourcePath().equals("planks.1"))
                {
                    int stackMeta = heldStack.getMetadata();
                    heldStack.setItemDamage(MathHelper.clamp(heldStack.getItemDamage() + (message.shouldIncreaseMeta ? 1 : -1), 0, 12));

                    if(stackMeta == heldStack.getItemDamage())
                    {
                        if(stackMeta == 12) // Not changed because of limit
                            serverPlayer.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.0")), heldStack.getCount(), 0));
                        else if(stackMeta == 0)
                            serverPlayer.setHeldItem(EnumHand.MAIN_HAND, new ItemStack(ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.0")), heldStack.getCount(), 15));
                    }
                }
            }

            return null; // No response packet
        }
    }
}
