package io.github.fergoman123.fergoutil.item.tools;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemShovelFergo extends ItemSpade
{
    private int mod;
    private ToolMaterial material;

    public ItemShovelFergo(ToolMaterial material, int mod, CreativeTabs tab, String name)
    {
        super(material);
        this.setMaxDamage(material.getMaxUses());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.material = material;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }

    public String getUnlocalizedName() {
        return NameHelper.formatItemName(this.getMod(), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatItemName(this.getMod(), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void setMod(int mod)
    {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }
}
