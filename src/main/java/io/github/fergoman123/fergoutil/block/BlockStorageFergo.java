package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.Random;

public class BlockStorageFergo extends BlockFergo
{
    public BlockStorageFergo(int mod, CreativeTabs tab, ItemBlock itemBlock, String name)
    {
        super(Material.iron, mod, tab, 5.0f, 10.0f, name);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
