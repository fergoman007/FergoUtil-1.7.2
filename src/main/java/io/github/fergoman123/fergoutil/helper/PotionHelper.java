package io.github.fergoman123.fergoutil.helper;

import net.minecraft.potion.PotionEffect;

public final class PotionHelper
{
    public static PotionEffect getPotionEffect(int id, int duration)
    {
        return getPotionEffect(id, duration, 0);
    }

    public static PotionEffect getPotionEffect(int id, int duration, int amplifier)
    {
        return getPotionEffect(id, duration, amplifier, false, true);
    }

    public static PotionEffect getPotionEffect(int id, int duration, int amplifier, boolean isAmbient, boolean showParticles)
    {
        return new PotionEffect(id, duration, amplifier, isAmbient, showParticles);
    }

    public static PotionEffect getPotionEffect(PotionEffect other)
    {
        return new PotionEffect(other);
    }
}
