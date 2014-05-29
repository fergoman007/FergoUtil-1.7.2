package fergoman123.mods.fergoutil.util;

import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by Fergoman123 on 23/05/2014.
 */
public interface IFurnaceTile {

    public void setGuiDisplayName(String displayName);

    public void readFromNBT(NBTTagCompound compound);

    public void writeToNBT(NBTTagCompound compound);

    public boolean canSmelt();

    public void smeltItem();
}
