package fergoman123.mods.fergoutil.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

public abstract class FergoContainer extends Container implements IFergoContainer
{
    public abstract void updateProgressBar(int par1, int par2);

    public abstract boolean canInteractWith(EntityPlayer player);

    public abstract ItemStack transferStackInSlot(EntityPlayer player, int par2);
}
