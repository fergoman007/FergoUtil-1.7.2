package io.github.fergoman123.fergoutil.item;

import java.util.List;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemMultiFergo extends Item{
	private String[] subNames;
	private String mod;
	private String name;
	
	public ItemMultiFergo(String mod, CreativeTabs tab, String[] subNames, String name){
		super();
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		this.subNames = subNames;
		this.mod = mod;
		this.name = name;
	}
	
	public String getUnlocalizedName(){
		return String.format("item.%s.%s", this.getMod(), this.getName());
	}
	
	public String getUnlocalizedName(ItemStack stack){
		return String.format("item.%s.%s.%s", this.getMod(), this.getName(), this.getSubNames()[stack.getItemDamage()]);
	}
	
	@Override
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void getSubItems(Item itemIn, CreativeTabs tab, List subItems) {
		for (int i = 0; i < this.getSubNames().length; i++) {
			subItems.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String[] getSubNames() {
		return subNames;
	}
	
	public String getMod() {
		return mod;
	}
}
