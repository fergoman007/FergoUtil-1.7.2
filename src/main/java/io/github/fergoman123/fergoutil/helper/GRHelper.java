package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class GRHelper
{
    public static void registerItem(Item item, String modid, String name)
    {
        GameRegistry.registerItem(item, name);
        ModelHelper.registerItemModel(item, modid, name);
    }

    public static void registerBlock(Block block, String modid, String name)
    {
        if (block instanceof BlockMultiFergo)
        {
            BlockMultiFergo multi = (BlockMultiFergo)block;
            GameRegistry.registerBlock(multi, ItemBlockVariants.class, name);
            ModelHelper.registerBlockModel(multi, modid, name);
        }
        else
        {
            GameRegistry.registerBlock(block, name);
            ModelHelper.registerBlockModel(block, modid, name);
        }
    }
}