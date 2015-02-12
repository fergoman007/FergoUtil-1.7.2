package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockOreFergoBlock extends BlockOreFergo
{
    public Block droppedBlock;

    public BlockOreFergoBlock(int mod, CreativeTabs tab, Block droppedBlock, String name) {
        super(mod, tab, name);
        this.droppedBlock = droppedBlock;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this.droppedBlock);
    }
}
