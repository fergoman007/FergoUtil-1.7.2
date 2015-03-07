package io.github.fergoman123.fergoutil.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    public abstract ItemStack transferStackInSlot(EntityPlayer player, int index);
}
