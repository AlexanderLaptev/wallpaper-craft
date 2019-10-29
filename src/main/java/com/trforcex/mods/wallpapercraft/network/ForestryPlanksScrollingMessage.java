package com.trforcex.mods.wallpapercraft.network;

import com.trforcex.mods.wallpapercraft.util.ModHelper;
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

            ModHelper.ForestryCheckResult checkResult = ModHelper.checkIfForestryBlock(heldStack.getItem());
            if(!heldStack.isEmpty() && checkResult != ModHelper.ForestryCheckResult.NonForestry)
                serverPlayer.setHeldItem(EnumHand.MAIN_HAND, getOutputStack(message, heldStack, checkResult));

            return null; // No response packet
        }

        private static ItemStack getOutputStack(ForestryPlanksScrollingMessage message, ItemStack heldStack, ModHelper.ForestryCheckResult result)
        {
            final int stackMeta = heldStack.getMetadata();
            final int maxMeta = result == ModHelper.ForestryCheckResult.ForestryPlanks0 || result == ModHelper.ForestryCheckResult.ForestryFireproofPlanks0 ? 15 : 12;
            final int newMeta = MathHelper.clamp(stackMeta + (message.shouldIncreaseMeta ? 1 : -1), 0, maxMeta);

            Block outBlock = null;
            if(stackMeta == newMeta && (stackMeta == maxMeta || stackMeta == 0))
            {
                switch(result)
                {
                case ForestryPlanks0:
                    outBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.1"));
                    break;
                case ForestryPlanks1:
                    outBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.0"));
                    break;
                case ForestryFireproofPlanks0:
                    outBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.fireproof.1"));
                    break;
                case ForestryFireproofPlanks1:
                    outBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("forestry", "planks.fireproof.0"));
                    break;
                }
            }

            if(stackMeta == newMeta)
            {
                if(newMeta == maxMeta)
                    return new ItemStack(outBlock, heldStack.getCount(), 0);
                else if(newMeta == 0)
                    return new ItemStack(outBlock, heldStack.getCount(), maxMeta);
            }

            return new ItemStack(heldStack.getItem(), heldStack.getCount(), newMeta);
        }
    }
}
