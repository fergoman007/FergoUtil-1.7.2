package io.github.fergoman123.fergoutil.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelEntry {
	public Item item;
	public int meta;
	public String name;
	
	public ModelEntry(Item item, int meta, String name){
		this.item = item;
		this.meta = meta;
		this.name = name;
	}
	
	public ModelEntry(Item item, String name){
		this(item, 0, name);
	}
	
	public void register(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this.item, this.meta, new ModelResourceLocation(this.name, "inventory"));
	}
}
