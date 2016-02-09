package io.github.fergoman123.fergoutil.info;

import net.minecraft.block.Block;

public abstract class BlockInfo implements IBlockInfo{
    private Block block;

    public BlockInfo(Block block){
        this.block = block;
    }

    public Block getBlock(){
        return this.block;
    }
}
