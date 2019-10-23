package com.trforcex.mods.wallpapercraft.util;

public class ModUtils
{
    public static String composeString(Object ... params)
    {
        final String delimiter = "_";
        StringBuilder string = new StringBuilder();

        for(int i = 0; i < params.length; i++)
        {
            string.append(params[i]);

            if(i != params.length - 1)
                string.append(delimiter); // Do not append delimiter when it's the last element
        }

        return string.toString();
    }
}
