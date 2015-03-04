package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.model.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public final class RegisterHelper
{
    public static void registerItem(Item item, String modid, String name)
    {
        GameRegistry.registerItem(item, name);
        ModelHelper.registerItemModel(new ItemModel(item, modid + ":" + name));
        ModelHelper.addItemVariant(new ItemVariant(item, modid + ":" +  name));
    }

    public static void registerItem(Item item, String modid, String name, String[] modelNames)
    {
        GameRegistry.registerItem(item, name);
        ItemModel[] models = new ItemModel[modelNames.length];
        ItemVariant[] variants = new ItemVariant[modelNames.length];
        for (int i = 0; i < modelNames.length; i++)
        {
            models[i] = new ItemModel(item, i, modid + ":" + modelNames[i]);
            variants[i] = new ItemVariant(item, modid + ":" + modelNames[i]);
        }

        for(ItemModel model : models)
        {
            for(ItemVariant variant : variants) {
                ModelHelper.registerItemModel(model);
                ModelHelper.addItemVariant(variant);
            }
        }
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemblock, String modid, String name)
    {
        GameRegistry.registerBlock(block, itemblock, name);
        ModelHelper.registerBlockModel(new BlockModel(block, modid + ":" + name));
        ModelHelper.addBlockVariant(new BlockVariant(block, modid + ":" + name));
        if (name.contains("ore") || name.contains("block"))
        {
            OreDictionary.registerOre(name, block);
        }
    }

    public static void registerBlock(Block block, String modid, String name)
    {
        GameRegistry.registerBlock(block, name);
        ModelHelper.registerBlockModel(new BlockModel(block, modid + ":" + name));
        ModelHelper.addBlockVariant(new BlockVariant(block, modid + ":" + name));
        if (name.contains("ore") || name.contains("block"))
        {
            OreDictionary.registerOre(name, block);
        }
    }

    public static void registerBlock(Block block, Class<? extends ItemBlock> itemBlock, String modid, String name, String[] modelNames)
    {
        GameRegistry.registerBlock(block, itemBlock, name);
        BlockModel[] models = new BlockModel[modelNames.length];
        BlockVariant[] variants = new BlockVariant[modelNames.length];

        for (int i = 0; i < modelNames.length; i++)
        {
            models[i] = new BlockModel(block, i, modid + ":" + modelNames[i]);
            variants[i] = new BlockVariant(block, modid + ":" + modelNames[i]);
        }

        for(BlockModel model : models)
        {
            for(BlockVariant variant : variants) {
                ModelHelper.registerBlockModel(model);
                ModelHelper.addBlockVariant(variant);
            }
        }
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileClass, String tileID)
    {
        GameRegistry.registerTileEntity(tileClass, tileID);
    }

    public static void registerEvent(Object event)
    {
        MinecraftForge.EVENT_BUS.register(event);
    }

    public static void registerFuelHandler(IFuelHandler handler)
    {
        GameRegistry.registerFuelHandler(handler);
    }
}
