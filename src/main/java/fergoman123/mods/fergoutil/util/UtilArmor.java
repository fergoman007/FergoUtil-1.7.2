package fergoman123.mods.fergoutil.util;

import fergoman123.mods.fergoutil.item.ArmorType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class UtilArmor
{

    public static final String helmet = "Helmet";
    public static final String chest = "Chest";
    public static final String legs = "Legs";
    public static final String boots = "Boots";

    public static final int HELMET = ArmorType.HELMET.ordinal();
    public static final int CHEST = ArmorType.CHEST.ordinal();
    public static final int LEGS = ArmorType.LEGS.ordinal();
    public static final int BOOTS = ArmorType.BOOTS.ordinal();

    public static String[] armorType = {helmet, chest, legs, boots};
    public static int[] armorNum = {0, 1, 2, 3};

    public static String getArmorTypeName(int slot)
    {
        if (slot == HELMET)
        {
            return helmet;
        }

        if (slot == CHEST)
        {
            return chest;
        }

        if (slot == LEGS)
        {
            return legs;
        }

        return boots;
    }

    public static String getArmorTypeName(Item item)
    {
        if (item instanceof ItemArmor)
        {
            ItemArmor armor = (ItemArmor)item;
            return getArmorTypeName(armor.armorType);
        }

        return "";
    }
}
