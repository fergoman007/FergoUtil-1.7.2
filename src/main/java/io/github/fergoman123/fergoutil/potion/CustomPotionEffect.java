package io.github.fergoman123.fergoutil.potion;

import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class CustomPotionEffect extends PotionEffect
{
    public CustomPotionEffect(Potion potion, int effectDuration, int effectAmplifier) {
        super(potion.getId(), effectDuration, effectAmplifier);
    }
}
