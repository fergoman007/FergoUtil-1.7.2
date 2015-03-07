package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockStateHelper
{
    public static IBlockState blockToState(Block block)
    {
        return block.getDefaultState();
    }

    public static Block stateToBlock(IBlockState state)
    {
        return state.getBlock();
    }

    public static IBlockState getStateWithProps(Block block, IProperty property, Comparable comparable)
    {
        return block.getDefaultState().withProperty(property, comparable);
    }

    public static boolean setBlockState(World world, BlockPos pos, IBlockState state, int flag)
    {
        return world.setBlockState(pos, state, flag);
    }
}
