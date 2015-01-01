package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
public class ModelHelper
{
    public static void registerItemModel(Item item, String name)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(name, "inventory"));
    }

    public static void registerItemModel(Item item, int meta, String name)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(name, "inventory"));
    }

    public static void registerBlockModel(Block block, String name)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(name, "inventory"));
    }

    public static void registerBlockModel(Block block, int meta, String name)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(name, "inventory"));
    }

    public static void addVariantName(Item item, String[] variants)
    {
        ModelBakery.addVariantName(item, variants);
    }
}
