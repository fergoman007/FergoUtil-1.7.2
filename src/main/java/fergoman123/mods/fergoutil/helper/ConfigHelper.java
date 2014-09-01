 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergoutil.helper;

import net.minecraftforge.common.config.Configuration;

import java.util.regex.Pattern;

public class ConfigHelper
{
    private static Configuration config;

    public static String getString(String name, String category, String defaultValue, String comment)
    {
        return config.getString(name, category, defaultValue, comment);
    }

    public static String getString(String name, String category, String defaultValue, String comment, String langKey)
    {
        return config.getString(name, category, defaultValue, comment, langKey);
    }

    public static String getString(String name, String category, String defaultValue, String comment, Pattern pattern)
    {
        return config.getString(name, category, defaultValue, comment, pattern);
    }

    public static String getString(String name, String category, String defaultValue, String comment, String langKey, Pattern pattern)
    {
        return config.getString(name, category, defaultValue, comment, langKey, pattern);
    }

    public static String getString(String name, String category, String defaultValue, String comment, String[] validValues)
    {
     return config.getString(name, category, defaultValue, comment, validValues);
    }

    public String getString(String name, String category, String defaultValue, String comment, String[] validValues, String langKey)
    {
        return config.getString(name, category, defaultValue, comment, validValues, langKey);
    }

    public static boolean getBoolean(String name, String category, boolean defaultValue, String comment)
    {
        return config.getBoolean(name, category, defaultValue, comment);
    }

    public static boolean getBoolean(String name, String category, boolean defaultValue, String comment, String langKey)
    {
        return config.getBoolean(name, category, defaultValue, comment, langKey);
    }

    public static int getInt(String name, String category, int defaultValue, int minValue, int maxValue, String comment)
    {
        return config.getInt(name, category, defaultValue, minValue, maxValue, comment);
    }

    public static int getInt(String name, String category, int defaultValue, int minValue, int maxValue, String comment, String langKey)
    {
        return config.getInt(name, category, defaultValue, minValue, maxValue, comment, langKey);
    }

    public float getFloat(String name, String category, float defaultValue, float minValue, float maxValue, String comment)
    {
        return config.getFloat(name, category, defaultValue, minValue, maxValue, comment);
    }

    public float getFloat(String name, String category, float defaultValue, float minValue, float maxValue, String comment, String langKey)
    {
        return config.getFloat(name, category, defaultValue, minValue, maxValue, comment, langKey);
    }
    public static String getCategoryGeneral()
    {
        return Configuration.CATEGORY_GENERAL;
    }

    public static void loadConfig()
    {
        config.load();
    }

    public static void saveConfig()
    {
        config.save();
    }

    public static void addCustomCategoryComment(String category, String comment)
    {
        config.addCustomCategoryComment(category, comment);
    }
}
