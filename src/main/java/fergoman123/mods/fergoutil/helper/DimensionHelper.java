 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */
  
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
