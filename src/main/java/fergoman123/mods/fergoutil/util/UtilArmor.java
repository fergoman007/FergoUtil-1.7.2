package fergoman123.mods.fergoutil.util;

import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.item.ItemArmor;

/**
 * Created by Fergoman123 on 17/05/2014.
 */
public class UtilArmor
{

    public static ItemArmor armor;

    public static final String helmet = "helmet";
    public static final String chest = "chest";
    public static final String legs = "legs";
    public static final String boots = "boots";

    public static final int HELMET = ArmorType.HELMET.ordinal();
    public static final int CHEST = ArmorType.CHEST.ordinal();
    public static final int LEGS = ArmorType.LEGS.ordinal();
    public static final int BOOTS = ArmorType.BOOTS.ordinal();

    public static String[] armorType = {helmet, chest, legs, boots};
    public static int[] armorNum = {0, 1, 2, 3};
}
