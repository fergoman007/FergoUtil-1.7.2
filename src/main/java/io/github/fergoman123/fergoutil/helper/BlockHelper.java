package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;

public class BlockHelper
{
    public static Item getItemFromBlock(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        return item;
    }

    public static Block getBlockForItem(Item item)
    {
        Block block = Block.getBlockFromItem(item);
        return block;
    }

    public static BlockPos getBlockPos(int x, int y, int z)
    {
        return new BlockPos(x, y, z);
    }
}
