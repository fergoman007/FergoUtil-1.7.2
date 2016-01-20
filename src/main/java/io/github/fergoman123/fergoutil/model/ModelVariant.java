package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModelVariant {
	public Item item;
	public String modid, name;
	
	public ModelVariant(Item item, String modid, String name){
		this.item = item;
		this.modid = modid;
		this.name = name;
	}
	
	public ModelVariant(Block block, String modid, String name){
		this(Item.getItemFromBlock(block), modid, name);
	}
}
