package io.github.fergoman123.fergoutil.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ContainerFurnaceFergo extends Container implements IContainerFergo{
	
	public final InventoryPlayer invPlayer;
	public final IInventory furnace;
	private int lastCookTime;
    private int lastTotalCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
	
	public ContainerFurnaceFergo(InventoryPlayer invPlayer, IInventory furnace) {
		this.invPlayer = invPlayer;
		this.furnace = furnace;
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.furnace.isUseableByPlayer(playerIn);
	}
	
	public void onCraftGuiOpened(ICrafting crafting){
		super.onCraftGuiOpened(crafting);
		crafting.func_175173_a(this, this.furnace);
	}
	
	public void detectAndSendChanges()
    {
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
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int id, int data){
		this.furnace.setField(id, data);
	}
	
	public abstract ItemStack transferStackInSlot(EntityPlayer player, int index);
}
