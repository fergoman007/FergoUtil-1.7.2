package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockOreFergo extends BlockFergo
{
    public int amountDropped;
    public BlockOreFergo(int mod, CreativeTabs tab, String name, int amountDropped) {
        super(Material.rock, mod, tab, 2.5f, 50f, name);
        this.amountDropped = amountDropped;
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);

    public int quantityDropped(Random random)
    {
        return this.amountDropped;
    }
}
