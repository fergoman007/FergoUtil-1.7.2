package io.github.fergoman123.fergoutil.proxy;

import net.minecraft.block.Block;

public interface IProxy
{
    abstract void registerTileEntities();

    abstract void registerRenderers();

    abstract void registerEventHandlers();
}
