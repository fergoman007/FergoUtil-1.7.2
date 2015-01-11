package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;

public abstract class BlockRPFergo extends BlockFergo
{
    public static final PropertyEnum AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class);

    public BlockRPFergo(Material materialIn, int mod, CreativeTabs tab, float hardness, float resistance, String name) {
        super(materialIn, mod, tab, hardness, resistance, name);
    }
}
