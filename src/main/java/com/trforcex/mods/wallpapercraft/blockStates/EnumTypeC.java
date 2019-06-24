package com.trforcex.mods.wallpapercraft.blockStates;

import net.minecraft.util.IStringSerializable;

// Type C has 16 variants
// Used for: TYPE-JEWEL, TYPE-STAMP, TYPE-FORESTRY
public enum EnumTypeC implements IStringSerializable
{
    A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7),
    I(8), J(9), K(10), L(11), M(12), N(13), O(14), P(15);

    private final int meta;

    public static final int MAX_META = 15;

    EnumTypeC(int meta)
    {
        this.meta = meta;
    }

    public static EnumTypeC withMeta(int metaIn)
    {
        for(EnumTypeC variant : EnumTypeC.values())
            if(variant.meta == metaIn)
                return variant;

            throw new IllegalArgumentException("Meta " + metaIn + " does not exist for type A!");
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
