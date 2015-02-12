package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class BlockModelEntry extends ItemModelEntry
{
    public Block block;

    public BlockModelEntry(Block block, int metadata, String name) {
        super(Item.getItemFromBlock(block), metadata, name);
        this.block = block;
    }

    public Block getBlock()
    {
        return this.block;
    }
}
