package io.github.fergoman123.fergoutil.enums;

import net.minecraft.util.EnumFacing;

public class SwitchAxis
{
    public static final int[] AXIS_LOOKUP = new int[EnumFacing.Axis.values().length];
    private static final String __OBFID = "CL_00002101";

    static
    {
        try
        {
            AXIS_LOOKUP[EnumFacing.Axis.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError var3)
        {
            ;
        }

        try
        {
            AXIS_LOOKUP[EnumFacing.Axis.Y.ordinal()] = 2;
        }
        catch (NoSuchFieldError var2)
        {
            ;
        }

        try
        {
            AXIS_LOOKUP[EnumFacing.Axis.Z.ordinal()] = 3;
        }
        catch (NoSuchFieldError var1)
        {
            ;
        }
    }
}
