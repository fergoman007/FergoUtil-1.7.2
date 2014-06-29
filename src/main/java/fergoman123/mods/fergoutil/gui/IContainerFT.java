package fergoman123.mods.fergoutil.gui;

import net.minecraft.inventory.ICrafting;

public interface IContainerFT {

    public void detectAndSendChanges();

    public void addCraftingToCrafters(ICrafting crafting);
}
