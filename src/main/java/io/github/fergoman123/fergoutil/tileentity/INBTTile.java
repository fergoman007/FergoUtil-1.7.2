package io.github.fergoman123.fergoutil.tileentity;

import net.minecraft.nbt.NBTTagCompound;

public interface INBTTile
{
    public void readFromNBT(NBTTagCompound compound);

    public void writeToNBT(NBTTagCompound compound);
}
