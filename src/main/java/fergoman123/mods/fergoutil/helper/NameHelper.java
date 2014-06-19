package fergoman123.mods.fergoutil.helper;

public class NameHelper {

    public static boolean isFalse()
    {
        return false;
    }

    public static boolean isTrue()
    {
        return true;
    }

    public static String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static String getFurnaceType(boolean isActive)
    {
        if (isTrue())
        {
            return "Active";
        }
        else if (isFalse())
        {
            return "Idle";
        }
        else
        {
            return null;
        }
    }
}
