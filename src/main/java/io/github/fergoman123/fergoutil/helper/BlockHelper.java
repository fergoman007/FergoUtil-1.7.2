package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;

public class BlockHelper
{
    public static Item getItemFromBlock(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        return item;
    }

    public static Block getBlockFromItem(Item item)
    {
        return Block.getBlockFromItem(item);
    }

    public static BlockPos getBlockPos(int x, int y, int z)
    {
        return new BlockPos(x, y, z);
    }

    public static String getClampedInt(ItemStack stack, String[] array)
    {
        return array[MathHelper.clamp_int(stack.getItemDamage(), 0, array.length - 1)];
    }
}
