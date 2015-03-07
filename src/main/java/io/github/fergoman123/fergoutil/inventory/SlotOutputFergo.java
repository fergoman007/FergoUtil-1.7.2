package io.github.fergoman123.fergoutil.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public abstract class SlotOutputFergo extends Slot implements ISlotOutputFergo
{
    public SlotOutputFergo(IInventory inventoryIn, int index, int xPosition, int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
    }

    public abstract void onCrafting(ItemStack stack, int amount);

    public abstract void onCrafting(ItemStack stack);
}
