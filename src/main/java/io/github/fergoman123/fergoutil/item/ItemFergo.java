package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemFergo extends Item {
    private String mod;

    public ItemFergo(CreativeTabs tab, String mod, String name) {
        super();
        this.setUnlocalizedName(name);
        this.mod = mod;
        this.setCreativeTab(tab);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s.%s", this.mod, NameHelper.getName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s.%s", this.mod, NameHelper.getName(super.getUnlocalizedName(stack)));
    }

    public String getMod(){
        return this.mod;
    }
}
