package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorFergo extends ItemArmor
{
    public int mod;
    public ArmorMaterial material;
    public ArmorType type;
    public Item repairItem;
    public String name;

    public ItemArmorFergo(ArmorMaterial material, int mod, CreativeTabs tab, ArmorType type, Item repairItem, String name)
    {
        super(material, 0, type.ordinal());
        this.type = type;
        this.material = material;
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String layer1 = String.format("%s:textures/models/armor/%s_1.png", NameHelper.getModString(this.getMod()), this.material.getName().toLowerCase());
        String layer2 = String.format("%s:textures/models/armor/%s_2.png", NameHelper.getModString(this.getMod()), this.material.getName().toLowerCase());

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

    public ArmorType getArmorType()
    {
        return type;
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

    public Item setRepairItem(Item repairItem)
    {
        this.repairItem = repairItem;
        return this;
    }

    public Item getRepairItem()
    {
        return this.repairItem;
    }

    public int getDurability(int armorType)
    {
        return getArmorMaterial().getDurability(armorType);
    }

    public int getReductAmount(int armorType)
    {
        return getArmorMaterial().getDamageReductionAmount(armorType);
    }

    public int getEnchantability()
    {
        return getArmorMaterial().getEnchantability();
    }

    public String getArmorName()
    {
        return getArmorMaterial().name();
    }
}
