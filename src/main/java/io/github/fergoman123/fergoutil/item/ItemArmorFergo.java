package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorFergo extends ItemArmor
{
    private int mod;
    private ArmorMaterial material;
    private ArmorType type;
    private Item repairItem;
    private String name;

    public ItemArmorFergo(ArmorMaterial material, int mod, CreativeTabs tab, ArmorType type, Item repairItem, String name)
    {
        super(material, 0, type.ordinal());
        this.material = material;
        this.setMod(mod);
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
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List list, boolean advanced)
    {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            if (this.type == ArmorType.getHelmet())
            {
                list.add("Armor Material: " + this.material.getName());
                list.add("Durability: " + this.material.getDurability(0));
                list.add("Reduction Amount: " + this.material.getDamageReductionAmount(0));
                list.add("Enchantability: " + this.material.getEnchantability());
            }

            if (this.type == ArmorType.getChestplate())
            {
                list.add("Armor Material: " + this.material.getName());
                list.add("Durability: " + this.material.getDurability(1));
                list.add("Reduction Amount: " + this.material.getDamageReductionAmount(1));
                list.add("Enchantability: " + this.material.getEnchantability());
            }

            if (this.type == ArmorType.getLeggings())
            {
                list.add("Armor Material: " + this.material.getName());
                list.add("Durability: " + this.material.getDurability(2));
                list.add("Reduction Amount: " + this.material.getDamageReductionAmount(2));
                list.add("Enchantability: " + this.material.getEnchantability());
            }

            if (this.type == ArmorType.getBoots())
            {
                list.add("Armor Material: " + this.material.getName());
                list.add("Durability: " + this.material.getDurability(3));
                list.add("Reduction Amount: " + this.material.getDamageReductionAmount(3));
                list.add("Enchantability: " + this.material.getEnchantability());
            }
        }
        else
        {
            list.add(ModConstants.holdShift);
        }
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (this.type == ArmorType.getHelmet() || this.type == ArmorType.getChestplate() || this.type == ArmorType.getBoots())
        {
            return String.format("%s:textures/models/armor/%s_1", NameHelper.getModString(this.getMod()), this.material.toString());
        }

        if (this.type == ArmorType.getLeggings())
        {
            return String.format("%s:textures/models/armor/%s_2", NameHelper.getModString(this.getMod()), this.material.toString());
        }
        else
        {
            return null;
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
