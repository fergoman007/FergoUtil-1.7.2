package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class RegisterHelper
{
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

    public static void registerWorldGenerator(IWorldGenerator worldGen, int weight) {
        GameRegistry.registerWorldGenerator(worldGen, weight);
    }

    public static ItemModelMesher getModelMesher()
    {
        return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    }

    public static void registerModel(Item item, int meta, String name){
        getModelMesher().register(item, meta, new ModelResourceLocation(name, "inventory"));
    }

    public static void registerModel(Item item, String name) {
        registerModel(item, 0, name);
    }

    public static void registerModel(Block block, int meta, String name){
        registerModel(Item.getItemFromBlock(block), meta, name);
    }

    public static void registerModel(Block block, String name){
        registerModel(block, 0, name);
    }

    public static void addVariantName(Item item, String... variant){
        ModelBakery.addVariantName(item, variant);
    }

    public static void addVariantName(Block block, String... variant){
        addVariantName(Item.getItemFromBlock(block), variant);
    }
}
