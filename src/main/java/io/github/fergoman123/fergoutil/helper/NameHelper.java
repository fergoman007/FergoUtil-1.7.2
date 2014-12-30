package io.github.fergoman123.fergoutil.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.Objects;

public final class NameHelper
{
    public static String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static String getUnwrappedUnlocalizedNameForRegistry(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
    }

    public static String translate(String locale)
    {
        return StatCollector.translateToLocal(locale);
    }

    public static String getAssetsLocation(String modid)
    {
        return modid + ":";
    }

    public static String getAssetsLocationGui(String modid)
    {
        return modid.toLowerCase();
    }

    public static String getLogoFile(String modid)
    {
        return "/assets/" + modid.toLowerCase() + "/logo.png";
    }

    public static String getModString(int mod)
    {
        if (mod == 0)
        {
            return "FergoTools:";
        }
        else if (mod == 0)
        {
            return "MSB:";
        }
        else
        {
            return "null:";
        }
    }

    public static String getDurabilityString(ItemStack stack)
    {
        return "Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage();
    }
}