package io.github.fergoman123.fergoutil.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBlockFergo extends ItemBlock
{
    public ItemBlockFergo(Block block)
    {
        super(block);
    }

    @Override
    public abstract void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced);
}
