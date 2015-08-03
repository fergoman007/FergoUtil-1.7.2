package io.github.fergoman123.fergoutil.block;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public abstract class BlockMultiFergo extends BlockFergo{
	
	private String[] subNames;

	protected BlockMultiFergo(Material material, String mod, CreativeTabs tab, String[] subNames, String name) {
		super(material, mod, tab, name);
		this.subNames = subNames;
	}
	
	@SuppressWarnings({"unchecked", "rawtypes"})
	@Override
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
		for(int i = 0; i < this.subNames.length; i++){
			list.add(new ItemStack(itemIn, 1, i));
		}
	}
	
	public String[] getSubNames(){
		return subNames;
	}
	
	public abstract int damageDropped(IBlockState state);
	public abstract IBlockState getStateFromMeta(int meta);
	public abstract int getMetaFromState(IBlockState state);
	public abstract BlockState createBlockState();
}
