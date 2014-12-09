 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergoutil.helper;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public final class NameHelper {

    public static String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

    public static String getUnwrappedUnlocalizedNameForRegistry(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(":") + 1);
    }

    public static String format(String text, Object... args)
    {
        return String.format(text, args);
    }

    public static String getFurnaceType(boolean isActive)
    {
        if (isActive)
        {
            return "Active";
        }
        else
        {
            return "Idle";
        }
    }

    public static String translateToLocal(String locale)
    {
        return StatCollector.translateToLocal(locale);
    }

    public static String getAssetsLocation(String modid)
    {
        return modid + ":";
    }
    public static String getAssetsLocationGui(String modid){return modid.toLowerCase();}

    public static String getLogoFile(String modid)
    {
        return "/assets/" + modid + "/logo.png";
    }

    public static String getTooltip(){return "tooltip.";}

    public static String getContainer(){return "container.";}

    public static String getInventory()
    {
        return "inventory";
    }

    /**
     *
     * @param mod the mod number (1 is FergoTools, 2 is MoreStorageBlocks)
     * @return the mod prefix
     */
    public static String getModString(int mod)
    {
        if (mod == 1)
        {
            return "FergoTools:";
        }
        else if (mod == 2)
        {
            return "MSB:";
        }
        else
        {
            return "nn";
        }
    }

    public static String getDurabilityString(ItemStack stack)
    {
        return (stack.getMaxDamage() - stack.getItemDamageForDisplay()) + "/" + stack.getMaxDamage();
    }
}
