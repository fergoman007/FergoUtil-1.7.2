package io.github.fergoman123.fergoutil.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;

public abstract class TileEntityFurnaceFergo extends TileEntityLockable
		implements IUpdatePlayerListBox, ISidedInventory {
	public static final int[] slotsTop = new int[] { 0 };
	public static final int[] slotsBottom = new int[] { 2, 1 };
	public static final int[] slotsSides = new int[] { 1 };

	public ItemStack[] slots = new ItemStack[3];

	public int burnTime;
	public int currentItemBurnTime;
	public int cookTime;
	public int totalCookTime;

	public String inventoryName;

	public int getSizeInventory() {
		return slots.length;
	}

	public ItemStack getStackInSlot(int index) {
		return slots[index];
	}

	public ItemStack decrStackSize(int index, int count) {
		if (slots[index] != null) {
			ItemStack stack;

			if (slots[index].stackSize <= count) {
				stack = slots[index];
				slots[index] = null;
				return stack;
			} else {
				stack = slots[index].splitStack(count);
				if (slots[index].stackSize == 0) {
					slots[index] = null;
				}

				return stack;
			}
		} else {
			return null;
		}
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int index) {
		if (slots[index] != null) {
			ItemStack stack = slots[index];
			slots[index] = null;
			return stack;
		} else {
			return null;
		}
	}

	public void setInventorySlotContents(int index, ItemStack stack) {
		boolean flag = stack != null && stack.isItemEqual(slots[index])
				&& ItemStack.areItemStackTagsEqual(stack, slots[index]);
		slots[index] = stack;

		if (stack != null && stack.stackSize > this.getInventoryStackLimit()) {
			stack.stackSize = this.getInventoryStackLimit();
		}

		if (index == 0 && !flag) {
			this.totalCookTime = this.getCookTime(stack);
			this.cookTime = 0;
			this.markDirty();
		}
	}

	public abstract String getCommandSenderName();

	public boolean hasCustomName() {
		return this.inventoryName != null && this.inventoryName.length() > 0;
	}

	public void setCustomInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short) this.burnTime);
		compound.setShort("Cook", (short) this.cookTime);
		compound.setShort("CookTimeTotal", (short) this.totalCookTime);
		NBTTagList list = new NBTTagList();

		for (int i = 0; i < slots.length; ++i) {
			if (slots[i] != null) {
				NBTTagCompound compound1 = new NBTTagCompound();
				compound1.setByte("Slot", (byte) i);
				slots[i].writeToNBT(compound1);
				list.appendTag(compound1);
			}
		}

		compound.setTag("Items", list);

		if (this.hasCustomName()) {
			compound.setString("CustomName", inventoryName);
		}
	}

	public int getInventoryStackLimit() {
		return 64;
	}

	public boolean isBurning() {
		return this.burnTime > 0;
	}

	public static boolean isBurning(IInventory inventory) {
		return inventory.getField(0) > 0;
	}

	public abstract void update();

	public abstract int getCookTime(ItemStack stack);

	public abstract boolean canSmelt();

	public abstract void smeltItem();

	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.pos) != this ? false
				: player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D,
						(double) this.pos.getZ() + 0.5D) <= 64.0D;
	}

	public void openInventory(EntityPlayer player) {
	}

	public void closeInventory(EntityPlayer player) {
	}

	public abstract boolean isItemValidForSlot(int index, ItemStack stack);

	public int[] getSlotsForFace(EnumFacing side) {
		return side == EnumFacing.DOWN ? slotsBottom : (side == EnumFacing.UP ? slotsTop : slotsSides);
	}

	public abstract boolean canInsertItem(int index, ItemStack stack, EnumFacing direction);

	public abstract boolean canExtractItem(int index, ItemStack stack, EnumFacing direction);

	public int getField(int id) {
		switch (id) {
		case 0:
			return this.burnTime;
		case 1:
			return this.currentItemBurnTime;
		case 2:
			return this.cookTime;
		case 3:
			return this.totalCookTime;
		default:
			return 0;
		}
	}

	public void setField(int id, int value) {
		switch (id) {
		case 0:
			this.burnTime = value;
		case 1:
			this.currentItemBurnTime = value;
		case 2:
			this.cookTime = value;
		case 3:
			this.totalCookTime = value;
		}
	}
	
	public int getFieldCount(){
		return 4;
	}
	
	public void clear(){
		for(int i = 0; i < slots.length; ++i){
			slots[i] = null;
		}
	}
	
	
}
