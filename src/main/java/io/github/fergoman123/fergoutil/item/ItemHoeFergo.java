package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemHoeFergo extends ItemHoe
{
    public int mod;
    public Item repairItem;
    public Item.ToolMaterial material;

    public ItemHoeFergo(Item.ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.setMod(mod);
        this.setRepairItem(repairItem);
        this.setCreativeTab(tab);
        this.material = material;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    public Item getRepairItem() {
        return repairItem;
    }

    public Item setRepairItem(Item repairItem) {
        this.repairItem = repairItem;
        return this;
    }

    public int getMod() {
        return mod;
    }

    public Item setMod(int mod) {
        this.mod = mod;
        return this;
    }
}
