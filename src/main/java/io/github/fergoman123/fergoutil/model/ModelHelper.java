package io.github.fergoman123.fergoutil.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelHelper
{
    public static void registerItemModel(ItemModel model)
    {
        getItemModelMesher().register(model.getItem(), model.getMeta(), getModelResourceLocation(model.getName()));
    }

    public static void registerBlockModel(BlockModel model)
    {
        getItemModelMesher().register(Item.getItemFromBlock(model.getBlock()), model.getMeta(), getModelResourceLocation(model.getName()));
    }

    public static ModelResourceLocation getModelResourceLocation(String model)
    {
        return new ModelResourceLocation(model, "inventory");
    }

    public static void addBlockVariant(BlockVariant variant)
    {
        ModelBakery.addVariantName(Item.getItemFromBlock(variant.getBlock()), variant.getName());
    }

    public static void addItemVariant(ItemVariant variant)
    {
        ModelBakery.addVariantName(variant.getItem(), variant.getName());
    }

    public static ItemModelMesher getItemModelMesher()
    {
        return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    }
}
