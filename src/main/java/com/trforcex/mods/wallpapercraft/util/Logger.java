package com.trforcex.mods.wallpapercraft.util;

import com.trforcex.mods.wallpapercraft.ModClass;
import com.trforcex.mods.wallpapercraft.ModReference;
import net.minecraft.item.ItemStack;

public class Logger
{
//    private static int recipesCount = 0;
//    private static ArrayList<String> patterns = new ArrayList<>();

    private static int maxLogLevel = 0;

    private static boolean useInfoInsteadOfDebug = false;

    public static void setMaxLogLevel(int newLogLevel)
    {
        if(maxLogLevel == 1 || maxLogLevel == 2 || maxLogLevel == 0)
            maxLogLevel = newLogLevel;
    }

    public static int getMaxLogLevel()
    {
        return maxLogLevel;
    }

    public static boolean getUseInfoInsteadOfDebug()
    {
        return useInfoInsteadOfDebug;
    }

    public static void setUseInfoInsteadOfDebug(boolean useInfoInsteadOfDebug)
    {
        Logger.useInfoInsteadOfDebug = useInfoInsteadOfDebug;
    }

    public static void logDebug(String message){ log(1, message); }
    public static void logVerbose(String message){ log(2, message); }
    private static void log(int level, String message)
    {
        if(maxLogLevel != 0)
            if(level == 1 && maxLogLevel > 0)
                if(useInfoInsteadOfDebug)
                    ModClass.logger.info("[debug]: " + message);
                else
                    ModClass.logger.debug(": " + message);
            else if(level == 2 && maxLogLevel > 1)
                if(useInfoInsteadOfDebug)
                    ModClass.logger.info("[verbose]: " + message);
                else
                    ModClass.logger.debug("[verbose]: " + message);
    }

    public static void logDev(int level, int type, String message)
    {
        if(ModReference.DEBUG)
        {
            switch(type)
            {
            case 1: // INFO
                switch(level)
                {
                case 1: // Debug
                    ModClass.logger.info("[debug]: " + message);
                case 2: // Verbose
                    ModClass.logger.info("[verbose]: " + message);
                }
            case 2: // WARN
                switch(level)
                {
                case 1: // Debug
                    ModClass.logger.warn("[debug]: " + message);
                case 2: // Verbose
                    ModClass.logger.warn("[verbose]: " + message);
                }
            case 3: // ERROR
                switch(level)
                {
                case 1: // Debug
                    ModClass.logger.error("[debug]: " + message);
                case 2: // Verbose
                    ModClass.logger.error("[verbose]: " + message);
                }
            case 4: // DEBUG
                switch(level)
                {
                case 1: // Debug
                    ModClass.logger.debug("[debug]: " + message);
                case 2: // Verbose
                    ModClass.logger.debug("[verbose]: " + message);
                }
            }
        }
    }

    public static String getStackInfo(ItemStack stack)
    {
        return "x" + stack.getCount() + " of " + stack.getDisplayName() +"[" + stack.getItem().getRegistryName() + "]" + ", meta: " + stack.getMetadata() + " (damage: " + stack.getItemDamage() + ");";
    }

    // A method to call when breakpoint needed
    public static void stubMethod()
    {

    }
}
