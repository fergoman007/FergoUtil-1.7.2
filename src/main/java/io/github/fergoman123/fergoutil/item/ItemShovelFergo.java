package io.github.fergoman123.fergoutil.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemShovelFergo extends ItemSpade {
    private String mod;
    private ToolMaterial material;
    private String name;

    public ItemShovelFergo(ToolMaterial material, String mod, CreativeTabs tab, String name) {
        super(material);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(tab);
        this.material = material;
        this.mod = mod;
        this.name = name;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add("Tool Material: " + this.material.toString());
        tooltip.add("Harvest Level: " + this.material.getHarvestLevel());
        tooltip.add("Max Uses: " + this.material.getMaxUses());
        tooltip.add("Efficiency: " + this.material.getEfficiencyOnProperMaterial());
        tooltip.add("Damage VS Entity: " + this.material.getDamageVsEntity());
        tooltip.add("Enchantability: " + this.material.getEnchantability());
        tooltip.add(EnumChatFormatting.RED + "Durabiltity: " +
                EnumChatFormatting.YELLOW +
                (stack.getMaxDamage() - stack.getItemDamage()) + (EnumChatFormatting.GREEN + "/" +
                EnumChatFormatting.YELLOW + stack.getMaxDamage()));
    }

    public String getMod() {
        return mod;
    }

    public ToolMaterial getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }
}
