package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;

public class ClientHelper
{
    public static void registerKeyBinding(KeyBinding key)
    {
        ClientRegistry.registerKeyBinding(key);
    }
}
