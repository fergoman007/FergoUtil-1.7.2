package io.github.fergoman123.fergoutil.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;

public final class NameHelper
{
    public static String getUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static String getUnlocalizedName(String unlocalizedName, int plus)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + plus);
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

    public static String getDurabilityString(ItemStack stack)
    {
        return "Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + "/" + stack.getMaxDamage();
    }

    public static String toLower(String text)
    {
        return text.toLowerCase();
    }
}