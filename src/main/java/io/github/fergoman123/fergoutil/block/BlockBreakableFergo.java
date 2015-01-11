package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

public class BlockBreakableFergo extends BlockFergo
{
    public boolean ignoreSimilarity;

    public BlockBreakableFergo(Material materialIn, int mod, CreativeTabs tab, float hardness, float resistance, String name, boolean ignoreSimilarity) {
        super(materialIn, mod, tab, hardness, resistance, name);
        this.ignoreSimilarity = ignoreSimilarity;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        IBlockState state = worldIn.getBlockState(pos);
        Block block = state.getBlock();
        if (worldIn.getBlockState(pos.offset(side.getOpposite())) != state)
        {
            return true;
        }

        if (block == this)
        {
            return false;
        }

        return !(!this.ignoreSimilarity && block == this) && super.shouldSideBeRendered(worldIn, pos, side);
    }
}
