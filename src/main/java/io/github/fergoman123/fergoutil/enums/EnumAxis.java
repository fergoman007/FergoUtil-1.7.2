package io.github.fergoman123.fergoutil.enums;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;

public enum EnumAxis implements IStringSerializable
{
    X("x"),
    Y("y"),
    Z("z"),
    NONE("none");

    private final String name;

    private EnumAxis(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static EnumAxis fromFacingAxis(EnumFacing.Axis axis)
    {
        switch (SwitchAxis.AXIS_LOOKUP[axis.ordinal()])
        {
            case 1: return X;
            case 2: return Y;
            case 3: return Z;
            default: return NONE;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
