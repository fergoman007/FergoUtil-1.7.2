package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBowFergo extends ItemBow
{
    public static final String[] pullArray = new String[]{"_0", "_1", "_2"};
    private ToolMaterial material;
    public int mod;
    public Item repairItem;

    public ItemBowFergo(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name) {
        super();
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setRepairItem(repairItem);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public abstract void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced);

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    public Item setMod(int mod) {
        this.mod = mod;
        return this;
    }

    public Item setRepairItem(Item repairItem)
    {
        this.repairItem = repairItem;
        return this;
    }

    public int getMod()
    {
        return this.mod;
    }

    public Item getRepairItem()
    {
        return this.repairItem;
    }

    @Override
    public int getItemEnchantability() {
        return this.material.getEnchantability();
    }
}
