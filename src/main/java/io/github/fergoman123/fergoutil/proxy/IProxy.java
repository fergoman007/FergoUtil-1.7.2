package io.github.fergoman123.fergoutil.proxy;

import net.minecraft.tileentity.TileEntity;

public interface IProxy
{
    abstract void registerTileEntity(Class<? extends TileEntity> cls, String id);

    abstract void registerTileEntities();
}
