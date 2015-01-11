package io.github.fergoman123.fergoutil.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public abstract class ContainerFurnaceFergo extends Container
{
    public int playerInvRows = 3;
    public int playerInvCols = 9;

    public ContainerFurnaceFergo()
    {

        this.addInventorySlots();
        this.addPlayerInv();
    }

    public abstract void addInventorySlots();

    public abstract void addPlayerInv();

    @Override
    public abstract void updateProgressBar(int id, int data);

    @Override
    public abstract boolean canInteractWith(EntityPlayer playerIn);

    public abstract ItemStack transferStackInSlot(EntityPlayer player, int index);
}
