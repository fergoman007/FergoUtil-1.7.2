package io.github.fergoman123.fergoutil.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

public class ItemAxeFergo extends ItemAxe{

    private String mod;
    private ToolMaterial material;
    private String name;

    public ItemAxeFergo(ToolMaterial material, String mod, CreativeTabs tab, String name){
        super(material);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab(tab);
        this.mod = mod;
        this.material = material;
        this.name = name;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s.%s", this.getMod(), this.getName());
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s.%s", this.getMod(), this.getName());
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

    public String getMod(){
        return mod;
    }

    public String getName(){
        return name;
    }
}
