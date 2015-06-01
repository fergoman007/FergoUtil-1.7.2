package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.info.BlockInfo;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public abstract class BlockWorkbenchFergo extends BlockFergo
{
    public BlockWorkbenchFergo(int mod, CreativeTabs tab, BlockInfo info) {
        super(mod, tab, 2.5f, 0.0f, info);
    }

    public abstract boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ);
}
