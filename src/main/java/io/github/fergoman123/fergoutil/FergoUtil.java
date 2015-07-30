package io.github.fergoman123.fergoutil;

import io.github.fergoman123.fergoutil.command.CommandFergoDebug;
import io.github.fergoman123.fergoutil.log.LoggerFU;
import io.github.fergoman123.fergoutil.reference.MetadataFU;
import io.github.fergoman123.fergoutil.reference.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version)
public class FergoUtil
{
    @Instance(ModInfo.modid)
    public static FergoUtil instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        MetadataFU.writeMetadata(evt.getModMetadata());
        LoggerFU.info("Pre-Loading!");
    }

    @EventHandler
    public void load(FMLInitializationEvent evt)
    {
        LoggerFU.info("Mod Loading!");
    }

    @EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        LoggerFU.info("Mod Loaded!");
    }

    @EventHandler
    public void serverStarting(FMLServerStartingEvent evt){
    	evt.registerServerCommand(new CommandFergoDebug());
    }


}
