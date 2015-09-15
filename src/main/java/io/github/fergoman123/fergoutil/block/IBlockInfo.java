package io.github.fergoman123.fergoutil.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface IBlockInfo {
    void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced);
}
