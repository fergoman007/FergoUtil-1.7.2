package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemBowFergo extends ItemBow
{
    public static final String[] bowPull = new String[]{"standby", "_0", "_1", "_2"};

    private int mod;
    private Item repairItem;

    public ItemBowFergo(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name)
    {
        super();
        this.setMaxDamage(material.getMaxUses());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.setRepairItem(repairItem);
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    public String getUnlocalizedName() {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatItemName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining)
    {
        String standby = NameHelper.getBowModel(getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()), bowPull[0]);
        String pull0 = NameHelper.getBowModel(getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()), bowPull[1]);
        String pull1 = NameHelper.getBowModel(getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()), bowPull[2]);
        String pull2 = NameHelper.getBowModel(getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()), bowPull[3]);

        ModelResourceLocation modelresourcelocation = new ModelResourceLocation(standby, "inventory");

        if(stack.getItem() == this && player.getItemInUse() != null)
        {
            if(useRemaining >= 18)
            {
                modelresourcelocation = new ModelResourceLocation(pull0, "inventory");
            }
            else if(useRemaining > 13)
            {
                modelresourcelocation = new ModelResourceLocation(pull1, "inventory");
            }
            else if(useRemaining > 0)
            {
                modelresourcelocation = new ModelResourceLocation(pull2, "inventory");
            }
        }
        return modelresourcelocation;
    }

    public String getModString(int mod)
    {
        return NameHelper.getModString(mod).toLowerCase();
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public void setRepairItem(Item repairItem) {
        this.repairItem = repairItem;
    }

    public Item getRepairItem() {
        return repairItem;
    }
}
