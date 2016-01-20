package io.github.fergoman123.fergoutil.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelHelper {
	public static ItemModelMesher getModelMesher(){
		return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
	}
	
	public static void register(ModelEntry model){
		getModelMesher().register(model.item, model.meta, new ModelResourceLocation(model.modid + ":" + model.name, "inventory"));
	}
	
	public static void addVariant(ModelVariant variant){
		ModelBakery.addVariantName(variant.item, variant.modid + ":" + variant.name);
	}
}
