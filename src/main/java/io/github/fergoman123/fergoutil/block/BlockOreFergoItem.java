package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockOreFergoItem extends BlockOreFergo
{
    public Item droppedItem;

    public BlockOreFergoItem(int mod, CreativeTabs tab, Item droppedItem, String name) {
        super(mod, tab, name);
        this.droppedItem = droppedItem;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.droppedItem;
    }
}
