package fergoman123.mods.fergoutil.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public abstract class FergoEnchantment extends Enchantment
{
    public FergoEnchantment(int id, int weight, EnumEnchantmentType enchantmentType)
    {
        super(id, weight, enchantmentType);
    }

    public abstract int getWeight();

    public abstract int getMinLevel();

    public abstract int getMaxLevel();

    public abstract String getName();

    public abstract boolean isAllowedOnBooks();
}
