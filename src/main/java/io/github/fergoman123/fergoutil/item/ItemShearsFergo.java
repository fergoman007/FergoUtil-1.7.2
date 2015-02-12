package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class ItemShearsFergo extends ItemShears
{
    public int mod;
    public ToolMaterial material;
    public Item repairItem;

    public ItemShearsFergo(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(tab);
        this.setMod(mod);
        this.setRepairItem(repairItem);
        this.material = material;
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    public Item setMod(int mod)
    {
        this.mod = mod;
        return this;
    }

    public Item setRepairItem(Item repairItem)
    {
        this.repairItem = repairItem;
        return this;
    }

    public int getMod()
    {
        return this.mod;
    }

    public Item getRepairItem()
    {
        return this.repairItem;
    }
}
