package fergoman123.mods.fergoutil.helper;

import fergoman123.mods.fergoutil.lib.NBT;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.UUID;

public class NBTHelper {

    private static void initNBTTagCompound(ItemStack stack)
    {
        if (stack.stackTagCompound == null)
        {
            stack.setTagCompound(new NBTTagCompound());
        }
    }

    public static boolean hasTag(ItemStack stack, String keyName)
    {
        return stack != null && stack.stackTagCompound != null && stack.stackTagCompound.hasKey(keyName);
    }

    public static void removeTag(ItemStack stack, String keyName)
    {
        if (stack.stackTagCompound != null)
        {
            stack.stackTagCompound.removeTag(keyName);
        }
    }

    public static boolean hasUUID(ItemStack stack)
    {
        return hasTag(stack, NBT.UUID_MOST_SIG) && hasTag(stack, NBT.UUID_LEAST_SIG);
    }

    public static void setUUID(ItemStack stack)
    {
        initNBTTagCompound(stack);

        if (!hasTag(stack, NBT.UUID_MOST_SIG) && !hasTag(stack, NBT.UUID_LEAST_SIG))
        {
            UUID itemUUID = UUID.randomUUID();
            setLong(stack, NBT.UUID_MOST_SIG, itemUUID.getMostSignificantBits());
            setLong(stack, NBT.UUID_LEAST_SIG, itemUUID.getLeastSignificantBits());
        }
    }

    public static String getString(ItemStack stack, String keyName)
    {
        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(keyName))
        {
            setString(stack, keyName, "");
        }

        return stack.stackTagCompound.getString(keyName);
    }

    public static void setString(ItemStack stack, String keyName, String keyValue)
    {
        initNBTTagCompound(stack);

        stack.stackTagCompound.setString(keyName, keyValue);
    }

    public static boolean getBoolean(ItemStack stack, String keyName)
    {
        initNBTTagCompound(stack);

        if (!stack.stackTagCompound.hasKey(keyName))
        {
            setBoolean(stack, keyName, false);
        }

        return stack.stackTagCompound.getBoolean(keyName);
    }

    public static void setBoolean(ItemStack stack, String keyName, boolean keyValue)
    {
        initNBTTagCompound(stack);

        stack.stackTagCompound.setBoolean(keyName, keyValue);
    }

    public static byte getByte(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setByte(itemStack, keyName, (byte) 0);
        }

        return itemStack.stackTagCompound.getByte(keyName);
    }

    public static void setByte(ItemStack itemStack, String keyName, byte keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setByte(keyName, keyValue);
    }

    public static short getShort(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setShort(itemStack, keyName, (short) 0);
        }

        return itemStack.stackTagCompound.getShort(keyName);
    }

    public static void setShort(ItemStack itemStack, String keyName, short keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setShort(keyName, keyValue);
    }

    public static int getInt(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setInteger(itemStack, keyName, 0);
        }

        return itemStack.stackTagCompound.getInteger(keyName);
    }

    public static void setInteger(ItemStack itemStack, String keyName, int keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setInteger(keyName, keyValue);
    }

    public static long getLong(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setLong(itemStack, keyName, 0);
        }

        return itemStack.stackTagCompound.getLong(keyName);
    }

    public static void setLong(ItemStack itemStack, String keyName, long keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setLong(keyName, keyValue);
    }

    public static float getFloat(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setFloat(itemStack, keyName, 0);
        }

        return itemStack.stackTagCompound.getFloat(keyName);
    }

    public static void setFloat(ItemStack itemStack, String keyName, float keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setFloat(keyName, keyValue);
    }

    public static double getDouble(ItemStack itemStack, String keyName)
    {
        initNBTTagCompound(itemStack);

        if (!itemStack.stackTagCompound.hasKey(keyName))
        {
            setDouble(itemStack, keyName, 0);
        }

        return itemStack.stackTagCompound.getDouble(keyName);
    }

    public static void setDouble(ItemStack itemStack, String keyName, double keyValue)
    {
        initNBTTagCompound(itemStack);

        itemStack.stackTagCompound.setDouble(keyName, keyValue);
    }

}
