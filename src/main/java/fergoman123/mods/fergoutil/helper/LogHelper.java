package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.common.FMLLog;
import fergoman123.mods.fergoutil.lib.ModInfo;
import org.apache.logging.log4j.Level;
public class LogHelper {

    public static void log(Level level, Object o)
    {
        FMLLog.log(level, "[" + ModInfo.modid + "] " + String.valueOf(o));
    }

    public static void all(Object o)
    {
        log(Level.ALL, o);
    }

    public static void debug(Object o)
    {
        log(Level.DEBUG, o);
    }

    public static void error(Object o)
    {
        log(Level.ERROR, o);
    }

    public static void fatal(Object o)
    {
        log(Level.FATAL, o);
    }

    public static void info(Object o)
    {
        log(Level.INFO, o);
    }

    public static void off(Object o) {
        log(Level.OFF, o);
    }

    public static void trace(Object o) {
        log(Level.TRACE, o);
    }

    public static void warn(Object o) {
        log(Level.WARN, o);
    }
}
