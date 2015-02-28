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
    public BlockContainerFergo(Material material, int mod, CreativeTabs tab, float hardness, float resistance, String name) {
        super(material, mod, tab, hardness, resistance, name);
    }

    @Override
    public int getRenderType() {
        return -1;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        super.breakBlock(worldIn, pos, state);
        worldIn.removeTileEntity(pos);
    }

    @Override
    public boolean onBlockEventReceived(World worldIn, BlockPos pos, IBlockState state, int eventID, int eventParam) {
        super.onBlockEventReceived(worldIn, pos, state, eventID, eventParam);
        TileEntity tile = worldIn.getTileEntity(pos);
        return tile == null ? false : tile.receiveClientEvent(eventID, eventParam);
    }
}
