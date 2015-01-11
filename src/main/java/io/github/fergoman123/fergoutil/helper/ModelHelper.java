package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
public class ModelHelper
{
    public static void registerItemModel(Item item, ModelResourceLocation model)
    {
        registerItemModel(item, 0, model);
    }

    public static void registerItemModel(Item item, int meta, ModelResourceLocation model)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, model);
    }

    public static void registerBlockModel(Block block, ModelResourceLocation model)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, model);
    }

    public static void registerBlockModel(Block block, int meta, ModelResourceLocation model)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, model);
    }

    public static void addVariantName(Item item, String variants)
    {
        ModelBakery.addVariantName(item, variants);
    }

    public static void addVariantName(Block block, String variants)
    {
        addVariantName(Item.getItemFromBlock(block), variants);
    }
}
