package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.common.FMLLog;
import fergoman123.mods.fergoutil.lib.ModInfo;
import org.apache.logging.log4j.Level;

/**
 * Created by Fergoman123 on 12/05/2014.
 */
public class LogHelper {

    public static Level lev;

    public static void log(Level level, Object object) {
        FMLLog.log(ModInfo.name, level, "[" + ModInfo.modid + "] " + String.valueOf(object));
    }

    public static void all(Object o) {
        log(lev.ALL, o);
    }

    public static void debug(Object o) {
        log(lev.DEBUG, o);
    }

    public static void error(Object o) {
        log(lev.ERROR, o);
    }

    public static void fatal(Object o){
        log(lev.FATAL, o);
    }

    public static void info(Object o){
        log(lev.INFO, o);
    }

    public static void off(Object o)
    {
        log(lev.OFF, o);
    }

    public static void trace(Object o)
    {
        log(lev.TRACE, o);
    }

    public static void warn(Object o)
    {
        log(lev.WARN, o);
    }
}
