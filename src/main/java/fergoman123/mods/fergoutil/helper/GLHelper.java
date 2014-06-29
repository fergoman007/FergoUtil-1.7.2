package fergoman123.mods.fergoutil.helper;

import org.lwjgl.opengl.GL11;

public class GLHelper {

    public static void getGlColor4f(float red, float green, float blue, float alpha)
    {
        GL11.glColor4f(red, green, blue, alpha);
    }
}
