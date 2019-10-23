package com.trforcex.mods.wallpapercraft.util;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;

// A command to inject code through evaluating expression.
public class ExecCommand extends CommandBase
{
    @Override
    public String getName()
    {
        return "wpc";
    }

    @Override
    public String getUsage(ICommandSender sender)
    {
        return "wpc <exec>";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if(args[0].equals("exec"))
            execCode(server, sender, args);
        else
            throw new WrongUsageException("wpc <exec>");
    }

    private void execCode(MinecraftServer server, ICommandSender sender, String[] args)
    {

    }
}
