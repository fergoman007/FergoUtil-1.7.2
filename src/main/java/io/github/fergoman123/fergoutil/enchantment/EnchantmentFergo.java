package io.github.fergoman123.fergoutil.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.util.ResourceLocation;

public abstract class EnchantmentFergo extends Enchantment
{
    public EnchantmentFergo(int enchID, ResourceLocation enchName, int enchWeight, EnumEnchantmentType enchType) {
        super(enchID, enchName, enchWeight, enchType);
    }

    @Override
    public abstract int getWeight();

    @Override
    public abstract int getMinLevel();

    @Override
    public abstract int getMaxLevel();

    @Override
    public abstract String getName();

    @Override
    public abstract boolean isAllowedOnBooks();
}
