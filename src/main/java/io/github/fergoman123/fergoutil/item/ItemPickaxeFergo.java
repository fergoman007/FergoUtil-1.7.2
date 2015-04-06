package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.ToolInfo;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeFergo extends ItemPickaxe
{
    private ToolInfo info;
    private int mod;
    private String name;

    protected ItemPickaxeFergo(ToolInfo info, int mod, CreativeTabs tab, String name) {
        super(info.getMaterial());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.info = info;
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(info.getRepairItem()));
    }

    public Item setMod(int mod)
    {
        this.mod = mod;
        return this;
    }

    public int getMod()
    {
        return mod;
    }

    public void registerModels()
    {
        ModelHelper.registerItemModel(info.getModel());
        ModelHelper.addItemVariant(info.getVariant());
    }
}
