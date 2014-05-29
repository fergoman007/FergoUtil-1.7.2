package fergoman123.mods.fergoutil.helper;

/**
 * Created by Fergoman123 on 29/05/2014.
 */
public class NameHelper {

    public String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
