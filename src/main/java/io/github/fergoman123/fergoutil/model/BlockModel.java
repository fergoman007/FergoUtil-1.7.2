package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;

public class BlockModel
{
    public Block block;
    public int meta;
    public String name;

    public BlockModel(Block block, int meta, String name)
    {
        this.block = block;
        this.meta = meta;
        this.name = name;
    }

    public BlockModel(Block block, String name)
    {
        this(block, 0, name);
    }

    public Block getBlock() {
        return block;
    }

    public int getMeta() {
        return meta;
    }

    public String getName() {
        return name;
    }
}
