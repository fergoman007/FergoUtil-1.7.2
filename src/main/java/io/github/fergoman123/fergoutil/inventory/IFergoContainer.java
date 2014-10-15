package io.github.fergoman123.fergoutil.inventory;

import net.minecraft.inventory.ICrafting;

public interface IFergoContainer
{
    public void addCraftingToCrafters(ICrafting crafting);

    public void detectAndSendChanges();

}
