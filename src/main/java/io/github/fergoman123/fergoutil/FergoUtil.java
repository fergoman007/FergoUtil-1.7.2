 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergoutil;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import io.github.fergoman123.fergoutil.lib.MetadataFU;
import io.github.fergoman123.fergoutil.lib.ModInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 @Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.versionMain)
public class FergoUtil {

    @Instance(ModInfo.modid)
    public static FergoUtil instance;

    public static final Logger logger = LogManager.getLogger(ModInfo.modid);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent evt)
    {
        MetadataFU.writeMetadata(evt.getModMetadata());
        logger.info("Mod Pre-Initialising");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent evt)
    {
        logger.info("Mod Initialising");
    }

    @Mod.EventHandler
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
        logger.info("Mod Loaded");
    }
}
