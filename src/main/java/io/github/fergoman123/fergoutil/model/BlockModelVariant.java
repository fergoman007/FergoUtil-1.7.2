package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class BlockModelVariant extends ItemModelVariant
{
    public Block block;

    public BlockModelVariant(Block block, String variant) {
        super(Item.getItemFromBlock(block), variant);
        this.block = block;
    }

    public Block getBlock()
    {
        return this.block;
    }
}
