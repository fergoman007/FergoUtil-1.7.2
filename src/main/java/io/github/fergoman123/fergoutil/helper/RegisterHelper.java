package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.block.BlockFergo;
import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockVariants;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
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

    public static void registerBlock(Block block){
        if (block instanceof BlockFergo) {
            BlockFergo blockFergo = (BlockFergo)block;
            GameRegistry.registerBlock(blockFergo, blockFergo.getInfo().getName());
            getModelMesher().register(Item.getItemFromBlock(blockFergo), 0, blockFergo.getModel());
            ModelBakery.addVariantName(Item.getItemFromBlock(blockFergo), blockFergo.getInfo().getModel());
        }
        else if (block instanceof BlockMultiFergo)
        {
            BlockMultiFergo multiFergo = (BlockMultiFergo)block;
            GameRegistry.registerBlock(multiFergo, ItemBlockVariants.class, multiFergo.getInfo().getName());
            for (int i = 0; i < multiFergo.getInfo().getNames().length; i++)
            {
                getModelMesher().register(Item.getItemFromBlock(multiFergo), i, multiFergo.getModels()[i]);
                ModelBakery.addVariantName(Item.getItemFromBlock(multiFergo), multiFergo.getInfo().getNames());
            }
        }
    }

    public static ItemModelMesher getModelMesher()
    {
        return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    }
}
