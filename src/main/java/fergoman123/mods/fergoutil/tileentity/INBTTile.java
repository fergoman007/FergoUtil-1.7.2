package fergoman123.mods.fergoutil.tileentity;

import net.minecraft.nbt.NBTTagCompound;

public interface INBTTile
{
    public void readFromNBT(NBTTagCompound compound);

    public void writeToNBT(NBTTagCompound compound);
}
