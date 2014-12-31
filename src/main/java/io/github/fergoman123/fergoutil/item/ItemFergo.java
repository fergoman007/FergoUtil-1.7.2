package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFergo extends Item
{
    public int mod;

    public ItemFergo(int mod, CreativeTabs tab)
    {
        super();
        this.setCreativeTab(tab);
        this.mod = mod;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }
}
