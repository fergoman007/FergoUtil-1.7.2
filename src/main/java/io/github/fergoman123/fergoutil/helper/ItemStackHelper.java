package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemStackHelper
{

    public static ItemStack getItemStack(Block block)
    {
        return new ItemStack(block);
    }

    public static ItemStack getItemStack(Block block, int quantity)
    {
        return new ItemStack(block, quantity);
    }

    public static ItemStack getItemStack(Block block, int quantity, int metadata)
    {
        return new ItemStack(block, quantity, metadata);
    }

    public static ItemStack getItemStack(Item item)
    {
        return new ItemStack(item);
    }

    public static ItemStack getItemStack(Item item, int quantity)
    {
        return new ItemStack(item, quantity);
    }

    public static ItemStack getItemStack(Item item, int quantity, int metadata)
    {
        return new ItemStack(item, quantity, metadata);
    }
}
