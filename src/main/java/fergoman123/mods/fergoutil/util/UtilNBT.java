package fergoman123.mods.fergoutil.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by Fergoman123 on 21/05/2014.
 */
public class UtilNBT {

    private static void initNBTTagCompound(ItemStack stack)
    {
        if (stack.stackTagCompound == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }
    }

    public static boolean hasTag(ItemStack stack, String tagName)
    {
        if (stack.stackTagCompound != null)
        {
            return stack.stackTagCompound.hasKey(tagName);
        }
        return false;
    }

    public static void removeTag(ItemStack stack, String tagName)
    {
        if (stack.stackTagCompound != null)
        {
            stack.stackTagCompound.removeTag(tagName);
        }
    }

    public static String getString(ItemStack stack, String tagName)
    {
        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tagName))
        {
            setString(stack, tagName, "");
        }
        return stack.stackTagCompound.getString(tagName);
    }

    public static void setString(ItemStack stack, String tagName, String tagValue)
    {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setString(tagName, tagValue);
    }

    public static Boolean getBoolean(ItemStack stack, String tagName)
    {
        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tagName))
        {
            setBoolean(stack, tagName, false);
        }

        return stack.stackTagCompound.getBoolean(tagName);
    }

    public static void setBoolean(ItemStack stack, String tagName, boolean tagValue)
    {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setBoolean(tagName, tagValue);
    }

    public static Byte getByte(ItemStack stack, String tagName)
    {
        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(tagName))
        {
            setByte(stack, tagName, (byte)0);
        }

        return stack.stackTagCompound.getByte(tagName);
    }

    public static void setByte(ItemStack stack, String tagName, byte tagValue)
    {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setByte(tagName, tagValue);
    }

    public static Short getShort(ItemStack stack, String tagName) {
        initNBTTagCompound(stack);

        if(!stack.stackTagCompound.hasKey(tagName)) {
            setShort(stack, tagName, (short) 0);
        }

        return stack.stackTagCompound.getShort(tagName);
    }

    public static void setShort(ItemStack stack, String tagName, short tagValue) {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setShort(tagName, tagValue);
    }

    public static Integer getInteger(ItemStack stack, String tagName) {
        initNBTTagCompound(stack);

        if(!stack.stackTagCompound.hasKey(tagName)) {
            setInteger(stack, tagName, 0);
        }

        return stack.stackTagCompound.getInteger(tagName);
    }

    public static void setInteger(ItemStack stack, String tagName, int tagValue) {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setInteger(tagName, tagValue);
    }

    public static Long getLong(ItemStack stack, String tagName) {
        initNBTTagCompound(stack);

        if(!stack.stackTagCompound.hasKey(tagName)) {
            setLong(stack, tagName, 0);
        }

        return stack.stackTagCompound.getLong(tagName);
    }

    public static void setLong(ItemStack stack, String tagName, long tagValue) {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setLong(tagName, tagValue);
    }

    public static Float getFloat(ItemStack stack, String tagName) {
        initNBTTagCompound(stack);

        if(!stack.stackTagCompound.hasKey(tagName)) {
            setFloat(stack, tagName, 0);
        }

        return stack.stackTagCompound.getFloat(tagName);
    }

    public static void setFloat(ItemStack stack, String tagName, float tagValue) {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setFloat(tagName, tagValue);
    }

    public static Double getDouble(ItemStack stack, String tagName) {
        initNBTTagCompound(stack);

        if(!stack.stackTagCompound.hasKey(tagName)) {
            setDouble(stack, tagName, 0);
        }

        return stack.stackTagCompound.getDouble(tagName);
    }

    public static void setDouble(ItemStack stack, String tagName, double tagValue) {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setDouble(tagName, tagValue);
    }

    public static NBTTagCompound getCompoundTag(ItemStack stack, String tagName) {
        initNBTTagCompound(stack);

        if(!stack.stackTagCompound.hasKey(tagName)) {
            stack.stackTagCompound.setTag(tagName, new NBTTagCompound());
        }

        return stack.stackTagCompound.getCompoundTag(tagName);
    }

    public static void setCompoundTag(ItemStack stack, String tagName, NBTTagCompound tagValue) {
        initNBTTagCompound(stack);
        stack.stackTagCompound.setTag(tagName, tagValue);
    }


}
