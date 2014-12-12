package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemArmorFergo extends ItemArmor
{
    public String armorTexture;
    public ArmorMaterial material;
    public ArmorType type;
    public int mod;
    public Item repairItem;

    public ItemArmorFergo(ArmorMaterial material, int mod, ArmorType type, String armorTexture, Item repairItem)
    {
        super(material, 1, type.ordinal());
        this.mod = mod;
        this.armorTexture = armorTexture;
        this.material = material;
        this.type = type;
        this.repairItem = repairItem;
    }

    @Override
    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem) {
        return repairItem.isItemEqual(new ItemStack(this.repairItem)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == ArmorType.HELMET.ordinal() || slot == ArmorType.CHEST.ordinal() || slot == ArmorType.BOOTS.ordinal())
        {
            return getModString(this.mod) + "textures/armor/" + this.armorTexture + "_1";
        }

        if (slot == ArmorType.LEGS.ordinal())
        {
            return getModString(this.mod) + "textures/armor/" + this.armorType + "_2";
        }
        else
        {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (this.type == ArmorType.HELMET)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(0));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
        else if (this.type == ArmorType.CHEST)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(1));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
        else if (this.type == ArmorType.LEGS)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(2));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
        else if (this.type == ArmorType.BOOTS)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(3));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
        }
    }

    public String getModString(int mod)
    {
        if(mod == 0)
        {
            return "FergoTools:";
        }
        else if (mod == 1)
        {
            return "MSB:";
        }
        else
        {
            return "null:";
        }
    }
}
