package com.trforcex.mods.wallpapercraft.blockStates;

import net.minecraft.util.IStringSerializable;

// Type B has 10 variants
// Used for: COLOR-CYAN
public enum EnumTypeB implements IStringSerializable
{
    A(0), B(1), C(2), D(3), E(4),
    F(5), G(6), H(7), I(8), J(9);

    private final int meta;

    public static final int MAX_META = 9;

    EnumTypeB(int meta)
    {
        this.meta = meta;
    }

    public static EnumTypeB withMeta(int metaIn)
    {
        for(EnumTypeB variant : EnumTypeB.values())
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
