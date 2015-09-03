package io.github.fergoman123.fergoutil.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelHelper {
	public static void registerModel(ModelEntry model, ModelVariant variant){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(model.item, model.meta, new ModelResourceLocation(model.name, "inventory"));
		ModelBakery.addVariantName(variant.item, variant.name);
	}
}
