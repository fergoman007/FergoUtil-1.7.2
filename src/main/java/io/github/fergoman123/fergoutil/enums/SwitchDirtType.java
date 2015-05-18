package io.github.fergoman123.fergoutil.enums;

import net.minecraft.block.BlockDirt;

public final class SwitchDirtType
{
    public static final int[] TYPE_LOOKUP = new int[BlockDirt.DirtType.values().length];

    static
    {
        try
        {
            TYPE_LOOKUP[BlockDirt.DirtType.DIRT.ordinal()] = 1;
        }
        catch (NoSuchFieldError var2)
        {
            ;
        }

        try
        {
            TYPE_LOOKUP[BlockDirt.DirtType.COARSE_DIRT.ordinal()] = 2;
        }
        catch (NoSuchFieldError var1)
        {
            ;
        }
    }
}
