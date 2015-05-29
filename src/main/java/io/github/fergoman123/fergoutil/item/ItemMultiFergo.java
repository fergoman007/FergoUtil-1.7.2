package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.MultiItemInfo;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemMultiFergo extends Item
{
    private int mod;
    private MultiItemInfo info;

    public ItemMultiFergo(int mod, CreativeTabs tab, MultiItemInfo info) {
        super();
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(info.getName());
        this.info = info;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return NameHelper.formatMetadataItem(stack, NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)), getInfo().getNames());
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public MultiItemInfo getInfo()
    {
        return info;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void getSubItems(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < getInfo().getNames().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    public ModelResourceLocation[] getModels()
    {
        ModelResourceLocation[] models = new ModelResourceLocation[getInfo().getModels().length];
        for(ModelResourceLocation model : models)
        {
            for(String modelName : getInfo().getModels())
            {
                model = new ModelResourceLocation(modelName, "inventory");
            }
        }

        return models;
    }
}
