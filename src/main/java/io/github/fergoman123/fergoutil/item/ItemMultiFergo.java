package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemMultiFergo extends Item
{
    public String[] subTypes;
    public int mod;

    public ItemMultiFergo(int mod, CreativeTabs tab, String[] subTypes, String name)
    {
        super();
        this.setCreativeTab(tab);
        this.setMod(mod);
        this.setSubTypes(subTypes);
        this.setUnlocalizedName(name);
        this.setHasSubtypes(true);
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s:%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()), this.getSubTypes(stack.getItemDamage()));
    }

    public void getSubItems(Item item, CreativeTabs tabs, List list)
    {
        for (int i = 0; i < this.getSubTypes().length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
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

    public Item setSubTypes(String[] subTypes)
    {
        this.subTypes = subTypes;
        return this;
    }

    public String getSubTypes(int meta)
    {
        return this.subTypes[meta];
    }

    public String[] getSubTypes()
    {
        return this.subTypes;
    }
}
