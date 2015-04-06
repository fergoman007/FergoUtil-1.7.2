package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.ToolInfo;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

public class ItemShearsFergo extends ItemShears
{
    private int mod;
    private ToolInfo info;

    public ItemShearsFergo(ToolInfo info, int mod, CreativeTabs tab, String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setMaxDamage(info.getMaterial().getMaxUses());
        this.setCreativeTab(tab);
        this.setMod(mod);
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
        return repair.isItemEqual(new ItemStack(info.getRepairItem())) || super.getIsRepairable(toRepair, repair);
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

    public void registerModel()
    {
        ModelHelper.registerItemModel(info.getModel());
        ModelHelper.addItemVariant(info.getVariant());
    }
}
