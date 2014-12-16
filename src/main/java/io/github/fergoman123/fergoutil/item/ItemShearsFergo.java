package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemShearsFergo extends ItemShears
{
    public int mod;
    public String folder;
    public String texture;

    public ItemShearsFergo(ToolMaterial material, int mod, String folder, String texture, CreativeTabs tab) {
        super();
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(tab);
        this.setMaxStackSize(1);
        this.mod = mod;
        this.folder = folder;
        this.texture = texture;
    }


    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s%s/%sShears", NameHelper.getModString(this.mod), this.folder, this.texture));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.getDurabilityString(stack));
    }
}
