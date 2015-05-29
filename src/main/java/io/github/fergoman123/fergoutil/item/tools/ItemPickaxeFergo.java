package io.github.fergoman123.fergoutil.item.tools;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.ToolInfo;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeFergo extends ItemPickaxe
{
    private int mod;
    private ToolInfo info;

    public ItemPickaxeFergo(int mod, CreativeTabs tab, ToolInfo info)
    {
        super(info.getMaterial());
        this.setMaxDamage(info.getMaterial().getMaxUses());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(info.getName());
        this.info = info;
    }

    @Override
    public String getUnlocalizedName() {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void setMod(int mod)
    {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public ToolInfo getInfo()
    {
        return info;
    }

    public ModelResourceLocation getModel()
    {
        return new ModelResourceLocation(getInfo().getModel(), "inventory");
    }
}
