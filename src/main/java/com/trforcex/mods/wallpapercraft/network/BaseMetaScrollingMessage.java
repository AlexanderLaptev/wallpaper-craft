package com.trforcex.mods.wallpapercraft.network;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public abstract class BaseMetaScrollingMessage implements IMessage
{
    boolean shouldIncreaseMeta;

    public BaseMetaScrollingMessage(){}

    public BaseMetaScrollingMessage(boolean shouldIncreaseMeta)
    {
        this.shouldIncreaseMeta = shouldIncreaseMeta;
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeBoolean(shouldIncreaseMeta);
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        shouldIncreaseMeta = buf.readBoolean();
    }
}
