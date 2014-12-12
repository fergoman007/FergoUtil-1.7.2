package io.github.fergoman123.fergoutil.item.tool;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemFergoAxe extends ItemAxe
{
    public int mod;
    public Item repairItem;

    public ItemFergoAxe(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem)
    {
        super(material);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(tab);
        this.mod = mod;
        this.repairItem = repairItem;
    }

    @Override
    public boolean getIsRepairable(ItemStack itemToRepair, ItemStack repairItem) {
        return repairItem.isItemEqual(new ItemStack(this.repairItem)) || super.getIsRepairable(itemToRepair, repairItem);
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b)
    {
        list.add("Durability: " + NameHelper.getDurabilityString(stack));
    }

    public String getModString(int mod)
    {
        if (mod == 0)
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
