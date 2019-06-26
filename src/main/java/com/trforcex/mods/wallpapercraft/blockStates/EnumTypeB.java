package com.trforcex.mods.wallpapercraft.blockStates;

import net.minecraft.util.IStringSerializable;

// Type B has 10 variants
// Used for: COLOR-CYAN
public enum EnumTypeB implements IStringSerializable
{
    A(0), B(1), C(2), D(3), E(4),
    F(5), G(6), H(7), I(8), J(9);

    private final int meta;
    private static final EnumTypeB[] META_LOOKUP = new EnumTypeB[values().length];
    public static final int MAX_META = 9;

    static
    {
        for(EnumTypeB variant : values())
            META_LOOKUP[variant.getMeta()] = variant;
    }

    EnumTypeB(int meta)
    {
        this.meta = meta;
    }

    public static EnumTypeB withMeta(int metaIn)
    {
        if(metaIn < 0 || metaIn > MAX_META) // If not found, return first variant
            metaIn = 0;

        return META_LOOKUP[metaIn];
    }

    @Override
    public String getName()
    {
        return Integer.toString(meta);
    }

    public int getMeta()
    {
        return meta;
    }
}
