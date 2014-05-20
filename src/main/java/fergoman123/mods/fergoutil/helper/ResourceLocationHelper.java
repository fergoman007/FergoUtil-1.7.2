package fergoman123.mods.fergoutil.helper;

import net.minecraft.util.ResourceLocation;

/**
 * Created by Fergoman123 on 20/05/2014.
 */
public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modid, String path)
    {
        return new ResourceLocation(modid, path);
    }
}
