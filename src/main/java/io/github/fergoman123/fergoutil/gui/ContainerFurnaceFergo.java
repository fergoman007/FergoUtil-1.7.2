package io.github.fergoman123.fergoutil.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

public abstract class ContainerFurnaceFergo extends Container implements IContainerFurnaceFergo
{
    public final IInventory furnace;
    public final InventoryPlayer invPlayer;
    public int lastCookTime;
    public int lastTotalCookTime;
    public int lastBurnTime;
    public int lastItemBurnTime;

    public int playerInvRows = 3;
    public int playerInvCols = 9;

    public ContainerFurnaceFergo(InventoryPlayer invPlayer, IInventory furnace)
    {
        this.invPlayer = invPlayer;
        this.furnace = furnace;
        this.addInventorySlots();
        this.addPlayerInventory();
    }

    @Override
    public void addCraftingToCrafters(ICrafting listener) {
        super.addCraftingToCrafters(listener);
        listener.func_175173_a(this, this.furnace);
    }

    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for (int i = 0; i < this.crafters.size(); ++i)
        {
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if (this.lastCookTime != this.furnace.getField(2))
            {
                icrafting.sendProgressBarUpdate(this, 2, this.furnace.getField(2));
            }

            if (this.lastBurnTime != this.furnace.getField(0))
            {
                icrafting.sendProgressBarUpdate(this, 0, this.furnace.getField(0));
            }

            if (this.lastItemBurnTime != this.furnace.getField(1))
            {
                icrafting.sendProgressBarUpdate(this, 1, this.furnace.getField(1));
            }

            if (this.lastTotalCookTime != this.furnace.getField(3))
            {
                icrafting.sendProgressBarUpdate(this, 3, this.furnace.getField(3));
            }
        }

        this.lastCookTime = this.furnace.getField(2);
        this.lastBurnTime = this.furnace.getField(0);
        this.lastItemBurnTime = this.furnace.getField(1);
        this.lastTotalCookTime = this.furnace.getField(3);
    }

    @Override
    public void updateProgressBar(int id, int data) {
        this.furnace.setField(id, data);
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return this.furnace.isUseableByPlayer(playerIn);
    }

    public abstract ItemStack transferStackInSlot(EntityPlayer player, int index);
}
