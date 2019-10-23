package com.trforcex.mods.wallpapercraft.items;

public interface IScrollable
{
    enum ScrollingType
    {
        Scrollable,
        ForestryCompatible
    }

    ScrollingType getScrollingType();
}
