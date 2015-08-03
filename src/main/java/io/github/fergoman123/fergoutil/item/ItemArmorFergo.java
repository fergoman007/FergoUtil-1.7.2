package io.github.fergoman123.fergoutil.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public abstract class ItemArmorFergo extends ItemArmor {
	private String mod, name;
	private ArmorType type;

	public ItemArmorFergo(ArmorMaterial material, String mod, CreativeTabs tab, ArmorType type, String name) {
		super(material, 0, type.ordinal());
		this.setCreativeTab(tab);
		this.setUnlocalizedName(name);
		this.mod = mod;
		this.name = name;
		this.type = type;
	}
	
	@Override
	public abstract String getArmorTexture(ItemStack stack, Entity entity, int slot, String type);
	
	public String getMod() {
		return mod;
	}
	
	public String getName() {
		return name;
	}
	
	public ArmorType getType() {
		return type;
	}
	
	@Override
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		tooltip.add("Material: " + this.getArmorMaterial().getName());
		if(this.type == ArmorType.helmet){
			tooltip.add("Max Durability: " + this.getArmorMaterial().getDurability(0));
			tooltip.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(0));
		}
		
		if(this.type == ArmorType.chestplate){
			tooltip.add("Max Durability: " + this.getArmorMaterial().getDurability(1));
			tooltip.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(1));
		}
		
		if(this.type == ArmorType.leggings){
			tooltip.add("Max Durability: " + this.getArmorMaterial().getDurability(2));
			tooltip.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(2));
		}
		
		if(this.type == ArmorType.boots){
			tooltip.add("Max Durability: " + this.getArmorMaterial().getDurability(3));
			tooltip.add("Reduction Amount: " + this.getArmorMaterial().getDamageReductionAmount(3));
		}
		
		tooltip.add("Enchantability: " + this.getArmorMaterial().getEnchantability());
		tooltip.add("");
		tooltip.add("Durability: " + (stack.getMaxDamage() - stack.getItemDamage()) + " / " + stack.getMaxDamage());
	}
}
