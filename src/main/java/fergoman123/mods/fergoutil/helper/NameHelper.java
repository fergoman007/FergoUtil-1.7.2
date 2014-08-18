package fergoman123.mods.fergoutil.helper;

import net.minecraft.util.StatCollector;

public class NameHelper {

    public static String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static String format(String text, Object... args)
    {
        return String.format(text, args);
    }

    public static String getFurnaceType(boolean isActive)
    {
        if (isActive)
        {
            return "Active";
        }
        else
        {
            return "Idle";
        }
    }

    public static String translateToLocal(String locale)
    {
        return StatCollector.translateToLocal(locale);
    }

    public static String getAssetsLocation(String modid)
    {
        return modid + ":";
    }
    public static String getAssetsLocationGui(String modid){return modid.toLowerCase();}

    public static String getLogoFile(String modid)
    {
        return "/assets/" + modid + "/logo.png";
    }

    public static String getTooltip(){return "tooltip.";}

    public static String getContainer(){return "container.";}

    public static String getInventory()
    {
        return "inventory";
    }
}
