package io.github.fergoman123.fergoutil.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorUtil
{
    public static ItemStack getArmorType(EntityPlayer player, int num)
    {
        if (num == 3)
        {
            return player.getCurrentArmor(num);
        }
        else if (num == 2)
        {
            return player.getCurrentArmor(num);
        }
        else if (num == 1)
        {
            return player.getCurrentArmor(num);
        }
        else if (num == 0)
        {
            return player.getCurrentArmor(num);
        }
        else
        {
            return null;
        }
    }

    public static Item getArmorItem(EntityPlayer player, int num)
    {
        return getArmorType(player, num).getItem();
    }
}
