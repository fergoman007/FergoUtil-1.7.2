package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.block.BlockContainerFergo;
import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.item.ItemArmorFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import io.github.fergoman123.fergoutil.item.ItemFergo;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;
import io.github.fergoman123.fergoutil.model.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class RegisterHelper
{
    public static Item registerItem(Item item)
    {
        if (item instanceof ItemMultiFergo)
        {
            ItemMultiFergo multiItem = (ItemMultiFergo)item;
            GameRegistry.registerItem(multiItem, multiItem.getName());
            for(ItemModel model : multiItem.getItemModels())
            {
                for(ItemVariant variant : multiItem.getItemVariants())
                {
                    ModelHelper.registerItemModel(model);
                    ModelHelper.addItemVariant(variant);
                }
            }
            return multiItem;
        }
        else if (item instanceof ItemArmorFergo)
        {
            ItemArmorFergo armor = (ItemArmorFergo)item;
            GameRegistry.registerItem(armor, armor.getName());
            ModelHelper.registerItemModel(armor.getItemModel());
            ModelHelper.addItemVariant(armor.getItemVariant());
            return armor;
        }
        else
        {
            ItemFergo itemFergo = (ItemFergo)item;
            GameRegistry.registerItem(itemFergo, itemFergo.getName());
            ModelHelper.registerItemModel(itemFergo.getItemModel());
            ModelHelper.addItemVariant(itemFergo.getItemVariant());
            return itemFergo;
        }
    }

    public static Block registerBlock(Block block)
    {
        if (block instanceof BlockMultiFergo)
        {
            BlockMultiFergo multiBlock = (BlockMultiFergo)block;
            GameRegistry.registerBlock(block, ItemBlockVariants.class, multiBlock.getName());
            for (BlockModel model : multiBlock.getBlockModels())
            {
                for(BlockVariant variant : multiBlock.getBlockVariants())
                {
                    ModelHelper.registerBlockModel(model);
                    ModelHelper.addBlockVariant(variant);
                }
            }
            return multiBlock;
        }
        else if(block instanceof BlockContainerFergo)
        {
            BlockContainerFergo blockContainer = (BlockContainerFergo)block;
            GameRegistry.registerBlock(blockContainer, blockContainer.getName());
            ModelHelper.registerBlockModel(blockContainer.getBlockModel());
            ModelHelper.addBlockVariant(blockContainer.getBlockVariant());
            registerTileEntity(blockContainer.getTileEntity().getClass(), blockContainer.getTileName());
            return blockContainer;
        }
        else
        {
            BlockFergo blockFergo = (BlockFergo)block;
            GameRegistry.registerBlock(block, blockFergo.getName());
            ModelHelper.registerBlockModel(blockFergo.getBlockModel());
            ModelHelper.addBlockVariant(blockFergo.getBlockVariant());
            return blockFergo;
        }
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileClass, String tileID)
    {
        GameRegistry.registerTileEntity(tileClass, tileID);
    }

    public static void registerEvent(Object event)
    {
        MinecraftForge.EVENT_BUS.register(event);
        FMLCommonHandler.instance().bus().register(event);
    }

    public static void registerFuelHandler(IFuelHandler handler)
    {
        GameRegistry.registerFuelHandler(handler);
    }
}
