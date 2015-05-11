package io.github.fergoman123.fergoutil.model;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.item.ItemFergo;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ModelHelper
{
    public static void registerBlockModel(Block block, String modid, String name)
    {
        if (block instanceof BlockFergo)
        {
            BlockFergo blockFergo = (BlockFergo)block;
            getItemModelMesher().register(Item.getItemFromBlock(blockFergo), 0, new ModelResLocFergo(modid, name));
            ModelBakery.addVariantName(Item.getItemFromBlock(blockFergo), modid + ":" + name);
        }
        else if (block instanceof BlockMultiFergo)
        {
            BlockMultiFergo multi = (BlockMultiFergo)block;
            for (int i = 0; i < multi.getSubNames().length; i++) {
                getItemModelMesher().register(Item.getItemFromBlock(multi), i, new ModelResLocFergo(modid, multi.getSubNames()[i]));
                ModelBakery.addVariantName(Item.getItemFromBlock(multi), modid + ":" + multi.getSubNames()[i]);
            }
        }
        else
        {
            getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(name, "inventory"));
        }
    }

    public static void registerItemModel(Item item, String modid, String name)
    {
        if (item instanceof ItemFergo)
        {
            ItemFergo itemFergo = (ItemFergo)item;
            getItemModelMesher().register(itemFergo, 0, new ModelResLocFergo(modid, name));
            ModelBakery.addVariantName(itemFergo, modid + ":" + name);
        }
        else if (item instanceof ItemMultiFergo)
        {
            ItemMultiFergo multi = (ItemMultiFergo)item;
            for (int i = 0; i < multi.getSubNames().length; i++) {
                getItemModelMesher().register(multi, i, new ModelResLocFergo(modid, multi.getSubNames()[i]));
                ModelBakery.addVariantName(multi, multi.getSubNames()[i]);
            }
        }
        else
        {
            getItemModelMesher().register(item, 0, new ModelResourceLocation(name, "inventory"));
            ModelBakery.addVariantName(item, name);
        }
    }

    public static ItemModelMesher getItemModelMesher()
    {
        return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    }

    public static class ModelResLocFergo extends ModelResourceLocation
    {
        public ModelResLocFergo(String modid, String name)
        {
            super(modid.toLowerCase() + ":" + name, "inventory");
        }
    }
}
