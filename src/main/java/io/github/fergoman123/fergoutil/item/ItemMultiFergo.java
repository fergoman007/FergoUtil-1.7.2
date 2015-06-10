package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemMultiFergo extends Item
{
    private int mod;
    private String[] subNames;

    public ItemMultiFergo(int mod, CreativeTabs tab, String[] subNames, String name) {
        super();
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setSubNames(subNames);
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatMetadataItem(stack, NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)), this.getSubNames());
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public void getSubItems(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < getSubNames().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    public void registerModels(){
        for (int i = 0; i < getSubNames().length; i++) {
            RegisterHelper.registerModel(this, i, NameHelper.getModString(getMod()) + getSubNames()[i]);
        }
    }

    public void setSubNames(String[] subNames) {
        this.subNames = subNames;
    }

    public String[] getSubNames() {
        return subNames;
    }
}
