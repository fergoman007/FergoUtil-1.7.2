package fergoman123.mods.fergoutil.helper;

import net.minecraft.potion.PotionEffect;

public class PotionHelper {

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
