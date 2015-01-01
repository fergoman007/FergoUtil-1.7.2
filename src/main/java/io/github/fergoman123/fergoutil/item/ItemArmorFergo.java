package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemArmorFergo extends ItemArmor
{
    public ArmorMaterial material;
    public int mod;
    public int type;

    public ItemArmorFergo(ArmorMaterial material, int type, int mod, CreativeTabs tab) {
        super(material, 0, type);
        this.mod = mod;
        this.material = material;
        this.type = type;
    }

    public String getUnlocalizedName() {
        return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getName(super.getUnlocalizedName(stack)));
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        if (this.type == 0)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(0));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
            list.add(EnumChatFormatting.DARK_GRAY + NameHelper.translate(this.getUnlocalizedName(stack)));
        }
        else if (this.type == 1)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(1));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
            list.add(EnumChatFormatting.DARK_GRAY + NameHelper.translate(this.getUnlocalizedName(stack)));
        }
        else if (this.type == 2)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(2));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
            list.add(EnumChatFormatting.DARK_GRAY + NameHelper.translate(this.getUnlocalizedName(stack)));
        }
        else if (this.type == 3)
        {
            list.add("Reduction Amount: " + this.material.getDamageReductionAmount(3));
            list.add("Durability: " + NameHelper.getDurabilityString(stack));
            list.add(EnumChatFormatting.DARK_GRAY + NameHelper.translate(this.getUnlocalizedName(stack)));
        }
    }
}
