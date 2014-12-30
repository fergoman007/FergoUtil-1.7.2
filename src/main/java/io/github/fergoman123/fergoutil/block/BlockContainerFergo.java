package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class BlockContainerFergo extends BlockFergo implements ITileEntityProvider
{

    public BlockContainerFergo(Material materialIn, int mod, CreativeTabs tab) {
        super(materialIn, mod, tab);
        this.isBlockContainer = true;
    }

    public int getRenderType()
    {
        return -1;
    }

    public void breakBlock(World world, BlockPos pos, IBlockState state)
    {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }

    public boolean onBlockEventReceived(World world, BlockPos pos, IBlockState state, int eventID, int eventParam)
    {
        super.onBlockEventReceived(world, pos, state, eventID, eventParam);
        TileEntity entity = world.getTileEntity(pos);
        return entity == null ? false : entity.receiveClientEvent(eventID, eventParam);
    }
}
