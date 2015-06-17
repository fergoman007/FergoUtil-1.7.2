package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;

public class ItemBowFergo extends ItemBow
{

    private int mod;
    private ToolMaterial material;

    public ItemBowFergo(ToolMaterial material, int mod, CreativeTabs tab, String name)
    {
        super();
        this.setMaxDamage(material.getMaxUses());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.material = material;
    }

    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(material.getRepairItemStack()) || super.getIsRepairable(toRepair, repair);
    }

    public String getUnlocalizedName() {
        return NameHelper.formatItemName(this.getMod(), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack) {
        return NameHelper.formatItemName(this.getMod(), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining)
    {
        String[] pulls = new String[]{"_0", "_1", "_2",};
        String standby = String.format("%s:%s", NameHelper.getModString(this.getMod()), getUnlocalizedName(stack).substring(5));
        String pull0 = String.format("%s:%s%s", NameHelper.getModString(this.getMod()), getUnlocalizedName(stack).substring(5), pulls[0]);
        String pull1 = String.format("%s:%s%s", NameHelper.getModString(this.getMod()), getUnlocalizedName(stack).substring(5), pulls[1]);
        String pull2 = String.format("%s:%s%s", NameHelper.getModString(this.getMod()), getUnlocalizedName(stack).substring(5), pulls[2]);

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

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

}
