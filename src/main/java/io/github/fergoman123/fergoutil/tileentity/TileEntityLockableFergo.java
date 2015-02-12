package io.github.fergoman123.fergoutil.tileentity;

import io.github.fergoman123.fergoutil.interfaces.ILockableContainerFergo;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IWorldNameable;
import net.minecraft.world.LockCode;

public abstract class TileEntityLockableFergo extends TileEntity implements ILockableContainerFergo, IWorldNameable
{
    private LockCode code;

    public TileEntityLockableFergo()
    {
        this.code = LockCode.EMPTY_CODE;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.code = LockCode.fromNBT(compound);
    }

    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        if (this.code != null)
        {
            this.code.toNBT(compound);
        }
    }

    @Override
    public boolean isLocked() {
        return this.code != null && !this.code.isEmpty();
    }

    @Override
    public LockCode getLockCode() {
        return this.code;
    }

    @Override
    public void setLockCode(LockCode code) {
        this.code = code;
    }

    @Override
    public IChatComponent getDisplayName() {
        return (IChatComponent)(this.hasCustomName() ? new ChatComponentText(this.getName()) : new ChatComponentTranslation(this.getName(), new Object[0]));
    }
}
