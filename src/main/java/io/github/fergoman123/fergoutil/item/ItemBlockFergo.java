package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBlockFergo extends ItemBlock
{
    public Block block;
    public ItemBlockFergo(Block block) {
        super(block);
        this.block = block;
    }

    @Override
    public abstract void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced);
}
