package io.github.fergoman123.fergoutil.model;

import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.item.Item;

public class ModelVariant {
	public Item item;
	public String name;
	
	public ModelVariant(Item item, String name){
		this.item = item;
		this.name = name;
	}
	
	public void add(){
		ModelBakery.addVariantName(this.item, this.name);
	}
}
