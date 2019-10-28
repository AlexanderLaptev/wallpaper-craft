package com.trforcex.mods.wallpapercraft.util;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.oredict.OreDictionary;

public class ExecCommand extends CommandBase
{
    private static final String NAME = "wpc";
    private static final String USAGE = "wpc <exec>";

    @Override
    public String getName()
    {
        return NAME;
    }

    @Override
    public String getUsage(ICommandSender sender)
    {
        return USAGE;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        // If first argument is "exec" and max log level isn't zero (debugging enabled)
        if(Logger.getMaxLogLevel() != 0)
        {
            if(args[0].equals("exec"))
            {
                execCode(server, sender, args);
                Logger.logVerbose("Exec command executed!");
            }
            else if(args[0].equals("od"))
            {
                EntityPlayerMP player = getCommandSenderAsPlayer(sender); // Get player
                ItemStack heldStack = player.getHeldItemMainhand(); // Get held stack in main hand

                StringBuilder message = new StringBuilder("Ores for held stack:");
                if(!heldStack.isEmpty())
                {
                    int[] ores = OreDictionary.getOreIDs(heldStack); // Get array of ore IDs for held stack
                    String[] sOres = new String[ores.length]; // Array of string representations for ore IDs

                    for(int id = 0; id < ores.length; id++) // For each element in 'ores' array
                        sOres[id] = OreDictionary.getOreName(ores[id]); // Add name of ID to 'sOres' array

                    for(String ore : sOres)
                        message.append("\n   -" + ore); // Append list of ores
                }
                else
                    message.append("\n   N/A");

                player.sendMessage(new TextComponentString(message.toString()));
            }
            else
                throw new WrongUsageException(USAGE);
        }
        else
        {
            throw new WrongUsageException("Debugging is not enabled");
        }
    }

    // Function to exec custom code or evaluate expressions (place a breakpoint)
    private void execCode(MinecraftServer server, ICommandSender sender, String[] args)
    {

    }
}
