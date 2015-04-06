package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.ArmorInfo;
import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class ItemArmorFergo extends ItemArmor
{
    public int mod;
    public String name;
    private ArmorInfo info;

    public ItemArmorFergo(ArmorInfo info, int mod, CreativeTabs tab, String name)
    {
        super(info.getMaterial(), 0, info.getType().ordinal());
        this.name = name;
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.info = info;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s.%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(info.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        String layer1 = String.format("%s:textures/models/armor/%s_1.png", getModString(this.getMod()), info.getMaterial().getName().toLowerCase());
        String layer2 = String.format("%s:textures/models/armor/%s_2.png", getModString(this.getMod()), info.getMaterial().getName().toLowerCase());

        if (slot == ArmorType.helmet.ordinal() || slot == ArmorType.chestplate.ordinal() || slot == ArmorType.boots.ordinal())
        {
            return layer1;
        }

        if (slot == ArmorType.leggings.ordinal())
        {
            return layer2;
        }
        else
        {
            return null;
        }
    }

    public String getName() {
        return name;
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

    public int getDurability(int armorType)
    {
        return info.getMaterial().getDurability(armorType);
    }

    public int getReductAmount(int armorType)
    {
        return info.getMaterial().getDamageReductionAmount(armorType);
    }

    public int getEnchantability()
    {
        return info.getMaterial().getEnchantability();
    }

    public String getArmorName()
    {
        return info.getMaterial().name();
    }

    public String getModString(int mod)
    {
        return NameHelper.getModString(mod).toLowerCase();
    }

    public ItemModel getItemModel()
    {
        return info.getModel();
    }

    public ItemVariant getItemVariant()
    {
        return info.getVariant();
    }
}
