package io.github.fergoman123.fergoutil.proxy;

public interface IProxy
{
    void registerTileEntities();

    void registerRenderers();

    void registerEventHandlers();

    void registerForMeshing(ModelEntry entry);
}
