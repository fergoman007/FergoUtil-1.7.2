package io.github.fergoman123.fergoutil.enums;

import net.minecraft.util.EnumFacing;

public class SwitchEnumFacing
{
    public static final int[] FACING_LOOKUP = new int[EnumFacing.values().length];
    private static final String __OBFID = "CL_00002111";

    static
    {
        try
        {
            FACING_LOOKUP[EnumFacing.WEST.ordinal()] = 1;
        }
        catch (NoSuchFieldError var4)
        {
            ;
        }

        try
        {
            FACING_LOOKUP[EnumFacing.EAST.ordinal()] = 2;
        }
        catch (NoSuchFieldError var3)
        {
            ;
        }

        try
        {
            FACING_LOOKUP[EnumFacing.NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError var2)
        {
            ;
        }

        try
        {
            FACING_LOOKUP[EnumFacing.SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError var1)
        {
            ;
        }
    }
}
