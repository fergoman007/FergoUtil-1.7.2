package io.github.fergoman123.fergoutil.inventory;

import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public abstract class SlotFuelFergo extends Slot implements ISlotFuelFergo
{
    public SlotFuelFergo(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public abstract boolean isItemValid(ItemStack stack);

    public static boolean isBucket(ItemStack stack)
    {
        return stack != null && stack.getItem() != null && stack.getItem() == Items.bucket;
    }
}
