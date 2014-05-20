package fergoman123.mods.fergoutil;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fergoman123.mods.fergoutil.helper.LogHelper;
import fergoman123.mods.fergoutil.lib.ModInfo;

/**
 * Created by Fergoman123 on 28/04/2014.
 */
@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.mod_version)
public class FergoUtil {

    @Mod.Instance(ModInfo.modid)
    public static FergoUtil instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        LogHelper.info("Mod Pre-Initialising");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent evt)
    {
        LogHelper.info("Mod Initialising");
    }

    @Mod.EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        LogHelper.info("Mod Loaded");
    }
}
