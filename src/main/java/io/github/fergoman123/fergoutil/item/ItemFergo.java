package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFergo extends Item
{
    private int mod;
    private String name;

    public ItemFergo(int mod, CreativeTabs tab, String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        this.setMod(mod);
        this.name = name;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()).toLowerCase(), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()).toLowerCase(), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
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

    public String getName()
    {
        return this.name;
    }

    public ItemModel getItemModel()
    {
        return new ItemModel(this, NameHelper.getModString(this.getMod()).toLowerCase() + ":" + this.getName());
    }

    public ItemVariant getItemVariant()
    {
        return new ItemVariant(this, NameHelper.getModString(this.getMod()).toLowerCase() + ":" + this.getName());
    }
}
