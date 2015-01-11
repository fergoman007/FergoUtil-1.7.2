package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.enums.SwitchAxis;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Iterator;

public class BlockLogFergo extends BlockRPFergo
{
    public static final PropertyEnum LOG_AXIS = PropertyEnum.create("axis", BlockLogFergo.EnumAxis.class);

    public BlockLogFergo(int mod, CreativeTabs tab, String name) {
        super(Material.wood, mod, tab, 2.0F, 0.0F, name);
        this.setStepSound(soundTypeWood);
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        byte b0 = 4;
        int i = b0 + 1;

        if (worldIn.isAreaLoaded(pos.add(-i, -i, -i), pos.add(i, i, i)))
        {
            Iterator iterator = BlockPos.getAllInBox(pos.add(-b0, -b0, -b0), pos.add(b0, b0, b0)).iterator();

            while (iterator.hasNext())
            {
                BlockPos pos1 = (BlockPos)iterator.next();
                IBlockState state1 = worldIn.getBlockState(pos1);

                if (state1.getBlock().isLeaves(worldIn, pos1))
                {
                    state1.getBlock().beginLeavesDecay(worldIn, pos1);
                }
            }
        }
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(LOG_AXIS, BlockLogFergo.EnumAxis.fromFacingAxis(facing.getAxis()));
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, BlockPos pos) {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, BlockPos pos) {
        return true;
    }

    public static enum EnumAxis implements IStringSerializable
    {
        X("x"),
        Y("y"),
        Z("z"),
        NONE("none");
        private String name;

        private EnumAxis(String name)
        {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public static BlockLogFergo.EnumAxis fromFacingAxis(EnumFacing.Axis axis)
        {
            switch (SwitchAxis.AXIS_LOOKUP[axis.ordinal()])
            {
                case 1: return X;
                case 2: return Y;
                case 3: return Z;
                default: return NONE;
            }
        }

        public String getName()
        {
            return this.name;
        }
    }


}
