package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockSaplingFergo extends BlockBushFergo implements IGrowable
{
    public static final PropertyInteger stage = PropertyInteger.create("stage", 0, 1);

    public BlockSaplingFergo(int mod, CreativeTabs tab, String name) {
        super(mod, tab, 0f, 0f, name);
        this.setDefaultState(this.blockState.getBaseState().withProperty(stage, Integer.valueOf(0)));
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (((Integer)state.getValue(stage)).intValue() == 0)
        {
            worldIn.setBlockState(pos, state.cycleProperty(stage), 4);
        }
        else
        {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    public abstract void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand);

    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        this.grow(worldIn, pos, state, rand);
    }

    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState();
    }

    public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0;
        i |= ((Integer)state.getValue(stage)).intValue() << 3;
        return i;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {stage});
    }
}
