package fergoman123.mods.fergoutil.util;

import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentText;

public class UtilServer
{

    public static ChatComponentStyle getChatForString(String str)
    {
        return new ChatComponentText(str);
    }
}
