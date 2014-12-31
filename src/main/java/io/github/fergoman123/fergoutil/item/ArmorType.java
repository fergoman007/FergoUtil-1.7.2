package io.github.fergoman123.fergoutil.item;

public enum ArmorType
{
    helmet,
    chestplate,
    leggings,
    boots;

    public static final ArmorType[] types = ArmorType.values();

    public static ArmorType getHelmet()
    {
        return helmet;
    }

    public static ArmorType getChestplate()
    {
        return chestplate;
    }

    public static ArmorType getLeggings()
    {
        return leggings;
    }

    public static ArmorType getBoots()
    {
        return boots;
    }
}
