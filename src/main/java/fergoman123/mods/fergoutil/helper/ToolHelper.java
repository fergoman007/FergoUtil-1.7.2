package fergoman123.mods.fergoutil.helper;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolHelper
{

    public static ToolMaterial addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
    {
        return EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
    }

    public static ArmorMaterial addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    {
        return EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
    }
}
