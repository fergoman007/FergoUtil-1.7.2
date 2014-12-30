package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public final class RegisterHelper
{
    public static void registerWorldGenerator(IWorldGenerator generator, int weight)
    {
        GameRegistry.registerWorldGenerator(generator, weight);
    }

    public static void registerItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }

    public static Block registerBlock(Block block, String name)
    {
        return GameRegistry.registerBlock(block, name);
    }

    public static Block registerBlock(Block block, Class<? extends ItemBlock> itemBlockClass, String name)
    {
        return GameRegistry.registerBlock(block, itemBlockClass, name);
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String id)
    {
        GameRegistry.registerTileEntity(tileEntityClass, id);
    }

    public static void registerFuelHandler(IFuelHandler handler)
    {
        GameRegistry.registerFuelHandler(handler);
    }

    public static void registerOre(String name, Item ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerOre(String name, Block ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerOre(String name, ItemStack ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerGuiHandler(Object modInstance, IGuiHandler handler)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(modInstance, handler);
    }

    public static int getFuelValue(ItemStack stack)
    {
        return GameRegistry.getFuelValue(stack);
    }

    public static void registerEvent(Object event)
    {
        MinecraftForge.EVENT_BUS.register(event);
    }
}
