package fergoman123.mods.fergoutil.helper;

import net.minecraft.world.WorldProvider;
import net.minecraftforge.common.DimensionManager;

public class DimensionHelper {

    public static void registerProviderType(int dimensionID, Class<? extends WorldProvider> provider, boolean keepLoaded)
    {
        DimensionManager.registerProviderType(dimensionID, provider, keepLoaded);
    }

    public static void registerDimension(int dimensionID, int providerType)
    {
        DimensionManager.registerDimension(dimensionID, providerType);
    }
}
