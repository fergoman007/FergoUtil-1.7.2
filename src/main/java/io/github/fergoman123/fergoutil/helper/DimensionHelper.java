package io.github.fergoman123.fergoutil.helper;

import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionHelper
{
    public static void registerProviderType(int dimID, Class<? extends WorldProvider> provider, boolean keepLoaded)
    {
        DimensionManager.registerProviderType(dimID, provider, keepLoaded);
    }

    public static void registerDimension(int dimID, int providerType)
    {
        DimensionManager.registerDimension(dimID, providerType);
    }
}
