package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFergo extends Block {

	private String mod;
	private String name;
	
	protected BlockFergo(Material material, String mod, CreativeTabs tab, String name) {
		super(material);
		this.setUnlocalizedName(name);
		this.name = name;
		this.mod = mod;
		this.setCreativeTab(tab);
	}
	
	public String getUnlocalizedName(){
		return String.format("tile.%s.%s", this.getMod(), this.getName());
	}
	
	public String getName() {
		return name;
	}
	
	public String getMod() {
		return mod;
	}
}
