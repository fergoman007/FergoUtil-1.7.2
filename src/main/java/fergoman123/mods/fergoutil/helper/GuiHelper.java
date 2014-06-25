package fergoman123.mods.fergoutil.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class GuiHelper {

    public static Object[] obj = new Object[0];

    public static String format(String text, Object ... obj)
    {
        return I18n.format(text, obj);
    }

    public static void bindTexture(ResourceLocation location)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
    }
}
