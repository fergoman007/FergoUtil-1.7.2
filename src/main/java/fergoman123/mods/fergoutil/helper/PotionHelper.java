 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergoutil.helper;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

public class PotionHelper {

    public static EntityPlayer player;
    public static EntityLivingBase elb;

    public static PotionEffect getPotionEffect(int potionEffectID, int duration, int amplifier)
    {
        return new PotionEffect(potionEffectID, duration, amplifier);
    }

    public static PotionEffect getPotionEffect(int potionEffectID, int duration, int amplifier, boolean force)
    {
        return new PotionEffect(potionEffectID, duration, amplifier, force);
    }

    public static PotionEffect getPotionEffect(PotionEffect effect)
    {
        return new PotionEffect(effect);
    }

}
