package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockFurnaceFergo extends BlockContainer implements IBlockFurnaceFergo{

	protected BlockFurnaceFergo(Material arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
