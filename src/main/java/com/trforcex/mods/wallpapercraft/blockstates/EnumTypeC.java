package com.trforcex.mods.wallpapercraft.blockstates;

import net.minecraft.util.IStringSerializable;

// Type C has 16 variants
// Used for: TYPE-JEWEL, TYPE-STAMP, TYPE-FORESTRY
public enum EnumTypeC implements IStringSerializable
{
    A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7),
    I(8), J(9), K(10), L(11), M(12), N(13), O(14), P(15);

    private final int meta;
    private static final EnumTypeC[] META_LOOKUP = new EnumTypeC[values().length];
    public static final int MAX_META = 15;

    static
    {
        for(EnumTypeC variant : values())
            META_LOOKUP[variant.getMeta()] = variant;
    }

    EnumTypeC(int meta)
    {
        this.meta = meta;
    }

    public static EnumTypeC withMeta(int metaIn)
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
