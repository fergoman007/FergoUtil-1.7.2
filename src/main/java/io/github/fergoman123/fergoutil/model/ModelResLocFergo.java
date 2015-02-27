package io.github.fergoman123.fergoutil.model;

import net.minecraft.client.resources.model.ModelResourceLocation;

public class ModelResLocFergo extends ModelResourceLocation
{
    public ModelResLocFergo(String modid, String model) {
        super(modid.toLowerCase() + ":" + model, "inventory");
    }
}
