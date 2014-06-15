package fergoman123.mods.fergoutil.util;

import net.minecraft.nbt.NBTTagCompound;

public interface INBTTaggable {

    void readFromNBT(NBTTagCompound compound);

    void writeToNBT(NBTTagCompound compound);
}
