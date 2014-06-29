package fergoman123.mods.fergoutil.helper;

public class NameHelper {

    public static String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
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

    public static String getAssetsLocation(String modid)
    {
        return modid + ":";
    }
    public static String getAssetsLocationGui(String modid){return modid;}

    public static String getLogoFile(String modid)
    {
        return "/assets/" + modid + "/logo.png";
    }
}
