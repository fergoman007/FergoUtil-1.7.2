package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModelHelper {
    private static ItemModelMesher getModelMesher() {
        return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    }

    public static void register(Item item, int meta, ModelResourceLocation model) {
        getModelMesher().register(item, meta, model);
    }

    public static void register(Item item, ModelResourceLocation model) {
        register(item, 0, model);
    }

    public static void register(Block block, int meta, ModelResourceLocation model) {
        register(Item.getItemFromBlock(block), meta, model);
    }

    public static void register(Block block, ModelResourceLocation model) {
        register(block, 0, model);
    }

    public static void variant(Item item, ResourceLocation variants) {
        ModelBakery.registerItemVariants(item, variants);
    }

    public static void variant(Block block, ResourceLocation variant) {
        variant(Item.getItemFromBlock(block), variant);
    }
}
