package io.github.fergoman123.fergoutil.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface IProxy
{
    void preInit(FMLPreInitializationEvent evt);
    void init(FMLInitializationEvent evt);
    void postInit(FMLPostInitializationEvent evt);
}
