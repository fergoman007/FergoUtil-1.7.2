package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemShearsFergo extends ItemShears
{
    private int mod;
    private ToolMaterial material;
    private Item repairItem;

    public ItemShearsFergo(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name)
    {
        super();
        this.material = material;
        this.setMod(mod);
        this.setRepairItem(repairItem);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            list.add("Tool Material: " + this.material.toString());
            list.add("Max Uses: " + this.material.getMaxUses());
        }
        else
        {
            list.add(ModConstants.holdShift);
        }
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
