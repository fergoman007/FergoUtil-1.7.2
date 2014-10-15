 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergoutil.helper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public final class GuiHelper {

    public static Object[] object = new Object[0];

    public static String format(String text, Object ... obj)
    {
        return I18n.format(text, object);
    }

    public static void bindTexture(ResourceLocation location)
    {
        Minecraft.getMinecraft().getTextureManager().bindTexture(location);
    }

    public static GuiScreen getGuiScreen(GuiScreen screen)
    {
        return screen;
    }
}