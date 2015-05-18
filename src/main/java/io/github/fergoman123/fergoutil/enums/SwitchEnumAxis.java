package io.github.fergoman123.fergoutil.enums;

import net.minecraft.block.BlockLog.EnumAxis;

public class SwitchEnumAxis
{
    public static final int[] AXIS_LOOKUP = new int[EnumAxis.values().length];

    static
    {
        try
        {
            AXIS_LOOKUP[EnumAxis.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError var3)
        {
            ;
        }

        try
        {
            AXIS_LOOKUP[EnumAxis.Z.ordinal()] = 2;
        }
        catch (NoSuchFieldError var2)
        {
            ;
        }

        try
        {
            AXIS_LOOKUP[EnumAxis.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError var1)
        {
            ;
        }
    }
}
