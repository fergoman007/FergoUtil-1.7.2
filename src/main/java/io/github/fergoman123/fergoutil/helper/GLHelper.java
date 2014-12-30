package io.github.fergoman123.fergoutil.helper;

import org.lwjgl.opengl.GL11;

public class GLHelper
{
    public static void getColor4f(float red, float green, float blue, float alpha)
    {
        GL11.glColor4f(red, green, blue, alpha);
    }

    public static void getGLEnable(int cap)
    {
        GL11.glEnable(cap);
    }

    public static void getGLDisable(int cap)
    {
        GL11.glDisable(cap);
    }
}
