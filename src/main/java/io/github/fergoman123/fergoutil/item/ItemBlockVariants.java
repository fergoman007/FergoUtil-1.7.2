package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.block.IBlockInfo;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

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

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
		((IBlockInfo)this.block).addInformation(stack, playerIn, tooltip, advanced);
	}
}
