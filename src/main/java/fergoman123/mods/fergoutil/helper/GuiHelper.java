package fergoman123.mods.fergoutil.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class GuiHelper {

    public static String format(String containerString, Object ... obj)
    {
        return I18n.format(containerString, new Object[0]);
    }

    public static Minecraft getMinecraft()
    {
        Minecraft minecraft = Minecraft.getMinecraft();
        return minecraft;
    }

    public static TextureManager getTextureManager()
    {
        return getMinecraft().getTextureManager();
    }

    public static void bindTexture(ResourceLocation location)
    {
        getTextureManager().bindTexture(location);
    }
}
