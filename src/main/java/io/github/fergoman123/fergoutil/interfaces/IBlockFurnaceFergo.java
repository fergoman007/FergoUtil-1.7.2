package io.github.fergoman123.fergoutil.interfaces;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public interface IBlockFurnaceFergo {
    void breakBlock(World world, BlockPos pos, IBlockState state);
}
