package io.github.fergoman123.fergoutil.tileentity;

import io.github.fergoman123.fergoutil.interfaces.INBTTaggable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;

public abstract class TileFurnaceFergo extends TileEntityLockable implements IUpdatePlayerListBox, ISidedInventory, INBTTaggable
{
    public static final int[] slotsTop = new int[]{0};
    public static final int[] slotsBottom = new int[]{2, 1};
    public static final int[] slotsSides = new int[]{1};
    public ItemStack[] slots = new ItemStack[3];

    public int burnTime;
    public int currentItemBurnTime;
    public int cookTime;

    public int totalCookTime;

    public String customName;

    @Override
    public int getSizeInventory() {
        return this.slots.length;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return this.slots[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if (this.slots[index] != null)
        {
            ItemStack stack;

            if (this.slots[index].stackSize <= count)
            {
                stack = this.slots[index];
                this.slots[index] = null;
                return stack;
            }
            else
            {
                stack = this.slots[index].splitStack(count);

                if (this.slots[index].stackSize == 0)
                {
                    this.slots[index] = null;
                }

                return stack;
            }
        }
        else
        {
            return null;
        }
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        if (this.slots[index] != null)
        {
            ItemStack stack = this.slots[index] = null;
            this.slots[index] = null;
            return stack;
        }
        else
        {
            return null;
        }
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        boolean flag = stack != null && stack.isItemEqual(this.slots[index]) && ItemStack.areItemStackTagsEqual(stack, this.slots[index]);
        this.slots[index] = stack;

        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
        {
            stack.stackSize = this.getInventoryStackLimit();
        }

        if (index == 0 && !flag)
        {
            this.totalCookTime = this.getFurnaceSpeed(stack);
            this.cookTime = 0;
            this.markDirty();
        }
    }

    public abstract String getCommandSenderName();

    @Override
    public boolean hasCustomName() {
        return this.customName != null && this.customName.length() > 0;
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("BurnTime", (short)this.burnTime);
        compound.setShort("CookTime", (short)this.cookTime);
        compound.setShort("CookTimeTotal", (short)this.totalCookTime);
        NBTTagList list = new NBTTagList();

        for (int i = 0; i < this.slots.length; i++) {
            if (this.slots[i] != null)
            {
                NBTTagCompound compound1 = new NBTTagCompound();
                compound1.setByte("Slot", (byte)i);
                this.slots[i].writeToNBT(compound1);
                list.appendTag(compound1);
            }
        }

        compound.setTag("Items", list);

        if (this.hasCustomName())
        {
            compound.setString("CustomName", this.customName);
        }
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    public boolean isBurning()
    {
        return this.burnTime > 0;
    }

    public static boolean isBurning(IInventory inventory){
        return inventory.getField(0) > 0;
    }

    public abstract void update();

    public abstract int getFurnaceSpeed(ItemStack stack);

    public abstract boolean canSmelt();

    public abstract void smeltItem();

    public boolean isUseableByPlayer(EntityPlayer player)
    {
        return this.worldObj.getTileEntity(this.pos) == this && player.getDistanceSq((double) this.pos.getX() + 0.5D, (double) this.pos.getY() + 0.5D, (double) this.pos.getZ() + 0.5D) <= 64.0D;
    }

    public void openInventory(EntityPlayer player){}
    public void closeInventory(EntityPlayer player){}

    public abstract boolean isItemValidForSlot(int index, ItemStack stack);

    @Override
    public int[] getSlotsForFace(EnumFacing side) {
        return side == EnumFacing.DOWN ? slotsBottom : (side == EnumFacing.UP ? slotsTop : slotsSides);
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
        return this.isItemValidForSlot(index, itemStackIn);
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
        if (direction == EnumFacing.DOWN && index == 1)
        {
            Item item = stack.getItem();

            if (item != Items.water_bucket && item != Items.bucket)
            {
                return false;
            }
        }

        return true;
    }

    public abstract String getGuiID();

    public abstract Container createContainer(InventoryPlayer invPlayer, EntityPlayer player);

    public int getField(int id)
    {
        switch (id)
        {
            case 0:return this.burnTime;
            case 1:return this.currentItemBurnTime;
            case 2:return this.cookTime;
            case 3:return this.totalCookTime;
            default:return 0;
        }
    }

    public void setField(int id, int value)
    {
        switch (id)
        {
            case 0:this.burnTime = value;break;
            case 1:this.currentItemBurnTime = value;break;
            case 2:this.cookTime = value;break;
            case 3:this.totalCookTime = value;
        }
    }

    public int getFieldCount()
    {
        return 4;
    }

    public void clear()
    {
        for (ItemStack slot : slots)
        {
            slot = null;
        }
    }

    public void setCustomInventoryName(String customName)
    {
        this.customName = customName;
    }
}
