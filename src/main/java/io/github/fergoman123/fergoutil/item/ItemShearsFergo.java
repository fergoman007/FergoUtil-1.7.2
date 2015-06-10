package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class ItemShearsFergo extends ItemShears
{
    private int mod;
    private ToolMaterial material;

    public ItemShearsFergo(ToolMaterial material, int mod, CreativeTabs tab, String name)
    {
        super();
        this.setMaxDamage(material.getMaxUses());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.material = material;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public void registerModel(){
        RegisterHelper.registerModel(this, getUnlocalizedName().substring(5));
    }
}
