package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemHoeFergo extends ItemHoe
{
    private int mod;
    private Item repairItem;

    public ItemHoeFergo(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name)
    {
        super(material);
        this.setMod(mod);
        this.setMaxDamage(material.getMaxUses());
        this.setRepairItem(repairItem);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("Tool Material: " + this.theToolMaterial.toString());
            tooltip.add("Max Uses: " + this.theToolMaterial.getMaxUses());
            tooltip.add("Attack Damage: " + this.theToolMaterial.getDamageVsEntity());
            tooltip.add("Efficiency: " + this.theToolMaterial.getEfficiencyOnProperMaterial());
            tooltip.add("Harvest Level: " + this.theToolMaterial.getHarvestLevel());
        }
        else
        {
            tooltip.add("<Hold Shift for" + (EnumChatFormatting.YELLOW + "Info") + ">");
        }
    }

    public ItemHoeFergo register(String name)
    {
        GameRegistry.registerItem(this, name);
        return this;
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

    public Item setRepairItem(Item repairItem)
    {
        this.repairItem = repairItem;
        return this;
    }

    public Item getRepairItem()
    {
        return this.repairItem;
    }
}
