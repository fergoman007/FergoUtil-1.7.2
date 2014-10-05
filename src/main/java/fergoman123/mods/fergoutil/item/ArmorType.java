package fergoman123.mods.fergoutil.item;

public enum ArmorType
{
    HELMET,CHEST,LEGS,BOOTS;

    public static final ArmorType[] types = ArmorType.values();

    public static int helmet = ArmorType.HELMET.ordinal();
    public static int chestplate = ArmorType.CHEST.ordinal();
    public static int leggings = ArmorType.LEGS.ordinal();
    public static int boots = ArmorType.BOOTS.ordinal();
}
