package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModelEntry {
	public Item item;
	public int meta;
	public String modid;
	public String name;
	
	public ModelEntry(Item item, int meta, String modid, String name){
		this.item = item;
		this.meta = meta;
		this.modid = modid;
		this.name = name;
	}
	
	public ModelEntry(Item item, String modid, String name){
		this(item, 0, modid, name);
	}
	
	public ModelEntry(Block block, int meta, String modid, String name){
		this(Item.getItemFromBlock(block), meta, modid, name);
	}
	
	public ModelEntry(Block block, String modid, String name){
		this(block, 0, modid, name);
	}
}
