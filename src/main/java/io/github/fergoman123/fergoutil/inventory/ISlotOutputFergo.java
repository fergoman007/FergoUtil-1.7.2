package io.github.fergoman123.fergoutil.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public interface ISlotOutputFergo
{
     abstract ItemStack decrStackSize(int amount);

    abstract void onPickupFromSlot(EntityPlayer player, ItemStack stack);
}
