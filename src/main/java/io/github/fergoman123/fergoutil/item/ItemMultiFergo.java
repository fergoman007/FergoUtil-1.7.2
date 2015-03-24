package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.BlockHelper;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ItemMultiFergo extends Item
{
    private int mod;
    private String[] models;
    private String name;

    public ItemMultiFergo(int mod, CreativeTabs tab, String name, String[] models)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        this.setMod(mod);
        this.setModels(models);
        this.name = name;
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s.%s", getModString(this.getMod()), getName());
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s.%s.%s", getModString(this.getMod()), getName(), getClampedInt(stack, getModels()));
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

    public Item setModels(String[] models)
    {
        this.models = models;
        return this;
    }

    public String getName() {
        return name;
    }

    public String[] getModels()
    {
        return models;
    }

    public ItemModel[] getItemModels()
    {
        ItemModel[] itemModels = new ItemModel[getModels().length];
        for (int i = 0; i < itemModels.length; i++) {
            itemModels[i] = new ItemModel(this, i, NameHelper.getModString(this.getMod()).toLowerCase() + ":" + getModels()[i]);
        }
        return itemModels;
    }

    public ItemVariant[] getItemVariants()
    {
        ItemVariant[] itemVariants = new ItemVariant[getModels().length];
        for (int i = 0; i < itemVariants.length; i++) {
            itemVariants[i] = new ItemVariant(this, getModels()[i]);
        }
        return itemVariants;
    }

    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
        for (int i = 0; i < getModels().length; i++) {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

    public String getClampedInt(ItemStack stack, String[] array)
    {
        return BlockHelper.getClampedInt(stack, array);
    }

    public String getModString(int mod)
    {
        return NameHelper.getModString(mod).toLowerCase();
    }
}
