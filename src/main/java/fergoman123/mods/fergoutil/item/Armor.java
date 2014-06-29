package fergoman123.mods.fergoutil.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Armor {

    public static interface IArmor
    {
        public void onArmorTick(World world, EntityPlayer player, ItemStack armor);
    }

    public static enum EnumArmorType
    {
        HELMET, CHEST, LEGS, BOOTS;

        public static final EnumArmorType[] types = EnumArmorType.values();
    }

    public static int getHelmet()
    {
        return EnumArmorType.HELMET.ordinal();
    }

    public static int getChestplate()
    {
        return EnumArmorType.CHEST.ordinal();
    }

    public static int getLeggings()
    {
        return EnumArmorType.LEGS.ordinal();
    }

    public static int getBoots()
    {
        return EnumArmorType.BOOTS.ordinal();
    }
}
