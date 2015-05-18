package io.github.fergoman123.fergoutil.util;

import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorUtil
{
    public static ItemStack getArmorType(EntityPlayer player, ArmorType type)
    {
        if (type == ArmorType.helmet)//3)
        {
            return player.getCurrentArmor(3);
        }
        else if (type == ArmorType.chestplate)//2)
        {
            return player.getCurrentArmor(2);
        }
        else if (type == ArmorType.leggings)//1)
        {
            return player.getCurrentArmor(1);
        }
        else if (type == ArmorType.boots)
        {
            return player.getCurrentArmor(0);
        }
        else
        {
            return null;
        }
    }

    public static Item getArmorItem(EntityPlayer player, ArmorType type)
    {
        return getArmorType(player, type).getItem();
    }
}
