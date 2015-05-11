package io.github.fergoman123.fergoutil.oredict;

import net.minecraft.block.Block;

public class OreDictBlock
{
    private String name;
    private Block block;

    public OreDictBlock(String name, Block block)
    {
        this.name = name;
        this.block = block;
    }

    public String getName() {
        return name;
    }

    public Block getBlock() {
        return block;
    }
}