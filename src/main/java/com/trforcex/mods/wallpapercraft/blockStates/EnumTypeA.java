package com.trforcex.mods.wallpapercraft.blockStates;

import net.minecraft.util.IStringSerializable;

// Type A has 15 variants
// Used for: COLOR-ALL-EXCEPT-CYAN
public enum EnumTypeA implements IStringSerializable
{
    A(0), B(1), C(2), D(3), E(4), F(5), G(6),
    H(7), I(8), J(9), K(10), L(11), M(12), N(13), O(14);

    private final int meta;

    public static final int MAX_META = 14;

    EnumTypeA(int meta)
    {
        this.meta = meta;
    }

    public static EnumTypeA withMeta(int metaIn)
    {
        for(EnumTypeA variant : EnumTypeA.values())
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
