package com.trforcex.mods.wallpapercraft.blockStates;

import net.minecraft.util.IStringSerializable;

// Type A has 15 variants
// Used for: COLOR-ALL-EXCEPT-CYAN
public enum EnumTypeA implements IStringSerializable
{
    A(0), B(1), C(2), D(3), E(4), F(5), G(6),
    H(7), I(8), J(9), K(10), L(11), M(12), N(13), O(14);

    private final int meta;
    private static final EnumTypeA[] META_LOOKUP = new EnumTypeA[values().length];
    public static final int MAX_META = 14;

    static
    {
        for(EnumTypeA variant : values())
            META_LOOKUP[variant.getMeta()] = variant;
    }

    EnumTypeA(int meta)
    {
        this.meta = meta;
    }

    public static EnumTypeA withMeta(int metaIn)
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
