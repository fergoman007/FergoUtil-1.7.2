package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStairsFergo extends BlockStairs {
	
	private String mod;
	private String name;

	public BlockStairsFergo(IBlockState modelState, String mod, CreativeTabs tab, String name) {
		super(modelState);
		this.setUnlocalizedName(name);
		this.setCreativeTab(tab);
		this.mod = mod;
		this.name = name;
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s.%s", this.getMod(), this.getName());
	}
	
	public String getMod() {
		return mod;
	}
	
	public String getName() {
		return name;
	}
}
