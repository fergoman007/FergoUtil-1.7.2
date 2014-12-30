package io.github.fergoman123.fergoutil;

import io.github.fergoman123.fergoutil.reference.MetadataFU;
import io.github.fergoman123.fergoutil.reference.ModInfo;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version)
public class FergoUtil
{
    @Instance(ModInfo.modid)
    private static FergoUtil instance;

    public static final Logger logger = LogManager.getLogger(ModInfo.modid);

    public static FergoUtil getInstance()
    {
        return instance;
    }

    public static Logger getLogger()
    {
        return logger;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        MetadataFU.writeMetadata(evt.getModMetadata());
        getLogger().info("Pre-Loading!");
    }

    @EventHandler
    public void load(FMLInitializationEvent evt)
    {
        getLogger().info("Mod Loading!");
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        getLogger().info("Mod Loaded!");
    }


}
