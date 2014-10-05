package fergoman123.mods.fergoutil.inventory;

import net.minecraft.inventory.ICrafting;

public interface IFergoContainer
{
    public void addCraftingToCrafters(ICrafting crafting);

    public void detectAndSendChanges();

}
