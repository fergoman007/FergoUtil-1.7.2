package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeFergo extends ItemPickaxe
{
	public int mod;
	
	public ItemPickaxeFergo(ToolMaterial material, int mod, CreativeTabs tab)
	{
		super(material);
		this.setCreativeTab(tab);
		this.mod = mod;
	}

	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getName(super.getUnlocalizedName()));
	}

}
