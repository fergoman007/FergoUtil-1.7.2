package io.github.fergoman123.fergoutil.model;

import io.github.fergoman123.fergoutil.item.ItemFergo;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModelHelper {
	public static ItemModelMesher getModelMesher(){
		return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	}
	
	public static void register(ModelEntry model){
		getModelMesher().register(model.item, model.meta, new ModelResourceLocation(model.modid + ":" + model.name, "inventory"));
	}
	
	public static void addVariant(ModelVariant variant){
		ModelBakery.registerItemVariants(variant.item, new ResourceLocation(variant.modid + ":" + variant.name));
	}

	public static void registerModel(Item item){
		if (item instanceof ItemFergo){
			ItemFergo itemFergo = (ItemFergo)item;
			getModelMesher().register(itemFergo, 0, new ModelResourceLocation(itemFergo.getRegistryName(), "inventory"));
			ModelBakery.registerItemVariants(item, new ResourceLocation(item.getRegistryName()));
		} else if (item instanceof ItemMultiFergo){
			ItemMultiFergo multiFergo = (ItemMultiFergo)item;
			for (int i = 0; i < multiFergo.getSubNames().length; i++) {
				getModelMesher().register(multiFergo, i, new ModelResourceLocation(multiFergo.getMod() + ":" + multiFergo.getSubNames()[i], "inventory"));
				ModelBakery.registerItemVariants(multiFergo, new ResourceLocation(multiFergo.getMod() + ":" + multiFergo.getSubNames()[i]));
			}
		} else {
			getModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			ModelBakery.registerItemVariants(item, new ResourceLocation(item.getRegistryName()));
		}
	}
}
