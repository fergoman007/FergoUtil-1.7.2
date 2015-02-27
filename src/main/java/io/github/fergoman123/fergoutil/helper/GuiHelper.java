package io.github.fergoman123.fergoutil.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class GuiHelper
{
    public static void bindTexture(ResourceLocation texture)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
    }

    public static GuiScreen getGuiScreen(GuiScreen screen)
    {
        return screen;
    }

    public static void registerGuiHandler(Object mod, IGuiHandler guiHandler)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(mod, guiHandler);
    }
}
