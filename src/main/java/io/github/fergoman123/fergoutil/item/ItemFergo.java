package io.github.fergoman123.fergoutil.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFergo extends Item{
	private String mod;
	private String name;
	
	public ItemFergo(String mod, CreativeTabs tab, String name){
		super();
		this.setUnlocalizedName(name);
		this.mod = mod;
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
	
	public String getMod() {
		return mod;
	}
	
	public String getName() {
		return name;
	}
}
