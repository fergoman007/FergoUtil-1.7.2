package io.github.fergoman123.fergoutil.helper;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientHelper
{
    public static void registerKeyBinding(KeyBinding key)
    {
        ClientRegistry.registerKeyBinding(key);
    }
}
