package io.github.fergoman123.fergoutil.interfaces;

import net.minecraft.inventory.IInventory;
import net.minecraft.world.LockCode;

public interface ILockableContainerFergo extends IInventory
{
    boolean isLocked();
    void setLockCode(LockCode code);
    LockCode getLockCode();
}
