package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public abstract class BlockOreFergo extends BlockFergo
{
    public BlockOreFergo(int mod, CreativeTabs tab, String name) {
        super(Material.rock, mod, tab, 3.0f, 5.0f, name);
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);

    public abstract int quantityDropped(Random random);
}
