package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;

public class BlockVariant
{
    private Block block;
    private String name;

    public BlockVariant(Block block, String name) {
        this.block = block;
        this.name = name;
    }

    public Block getBlock() {
        return block;
    }

    public String getName() {
        return name;
    }
}
