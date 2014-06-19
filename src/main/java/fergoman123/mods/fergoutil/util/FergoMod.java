package fergoman123.mods.fergoutil.util;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public abstract class FergoMod {

    @Mod.EventHandler
    public abstract void preInit(FMLPreInitializationEvent evt);

    @Mod.EventHandler
    public abstract void load(FMLInitializationEvent evt);

    @Mod.EventHandler
    public abstract void modsLoaded(FMLPostInitializationEvent evt);
}
