package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockPlankFergo extends BlockFergo
{
    public BlockPlankFergo(int mod, CreativeTabs tab, String name) {
        super(Material.wood, mod, tab, 2.0f, 5.0f, name);
    }

    @Override
    public boolean isWood(IBlockAccess world, BlockPos pos) {
        return true;
    }
}
