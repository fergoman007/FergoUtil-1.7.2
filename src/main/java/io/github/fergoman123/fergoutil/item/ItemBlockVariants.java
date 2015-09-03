package io.github.fergoman123.fergoutil.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public abstract class ItemBlockVariants extends ItemBlock{
	
	public ItemBlockVariants(Block block){
		super(block);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	public int getMetadata(int damage){
		return damage;
	}

	@Override
	public abstract String getUnlocalizedName(ItemStack stack);
}
