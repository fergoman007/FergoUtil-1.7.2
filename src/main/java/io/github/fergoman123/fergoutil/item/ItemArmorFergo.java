package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorFergo extends ItemArmor
{
    private int mod;
    private ArmorMaterial material;

    public ItemArmorFergo(ArmorMaterial material, int mod, CreativeTabs tab, ArmorType type, String name)
    {
        super(material, 0, type.ordinal());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.material = material;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(material.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String layer1 = String.format("%s:textures/models/armor/%s_1.png", NameHelper.getModString(this.getMod()), getArmorName());
        String layer2 = String.format("%s:textures/models/armor/%s_2.png", NameHelper.getModString(this.getMod()), this.getArmorMaterial().getName());

        if (slot == ArmorType.helmet.ordinal() || slot == ArmorType.chestplate.ordinal() || slot == ArmorType.boots.ordinal())
        {
            return layer1;
        }

        if (slot == ArmorType.leggings.ordinal())
        {
            return layer2;
        }
        else
        {
            return null;
        }
    }

    public Item setMod(int mod)
    {
        this.mod = mod;
        return this;
    }

    public int getMod()
    {
        return this.mod;
    }

    public int getDurability(int armorType)
    {
        return material.getDurability(armorType);
    }

    public int getReductAmount(int armorType)
    {
        return material.getDamageReductionAmount(armorType);
    }

    public int getEnchantability()
    {
        return material.getEnchantability();
    }

    public String getArmorName()
    {
        return material.getName();
    }
}
