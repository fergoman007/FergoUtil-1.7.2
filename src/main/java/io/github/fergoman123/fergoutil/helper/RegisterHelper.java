package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public final class RegisterHelper {

    public static void registerBlock(Block block, String name) {
        GameRegistry.registerBlock(block, name);
    }

    public static void registerBlock(Block block, ItemBlock itemblock, String name) {
        GameRegistry.registerBlock(block, itemblock.getClass(), name);
    }

    public static void registerItem(Item item, String name) {
        GameRegistry.registerItem(item, name);
    }

    public static void registerItemModel(Item item, int meta, String name, String modid)
    {
        getItemModelMesher().register(item, meta, new ModelResourceLocation(modid.toLowerCase() + ":" + name, "inventory"));
    }

    public static void registerItemModel(Item item, String name, String modid) {
        registerItemModel(item, 0, name, modid);
    }

    public static void registerBlockModel(Block block, int meta, String name, String modid)
    {
        getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid.toLowerCase() + ":" + name, "inventory"));
    }

    public static void registerBlockModel(Block block, String name, String modid)
    {
        registerBlockModel(block, 0, name, modid);
    }

    public static void addVariantName(Item item, String variant, String modid)
    {
        ModelBakery.addVariantName(item, modid.toLowerCase() + ":" + variant);
    }

    public static void addVariantName(Block block, String variant, String modid)
    {
        addVariantName(Item.getItemFromBlock(block), variant, modid);
    }

    public static ItemModelMesher getItemModelMesher()
    {
        return Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
    }

    public static void registerEvent(Object evt)
    {
        MinecraftForge.EVENT_BUS.register(evt);
    }

    public static void registerOre(String oreDictName, ItemStack ore)
    {
        OreDictionary.registerOre(oreDictName, ore);
    }

    public static void registerOre(String oreDictName, Item ore)
    {
        OreDictionary.registerOre(oreDictName, ore);
    }

    public static void registerOre(String oreDictName, Block ore)
    {
        OreDictionary.registerOre(oreDictName, ore);
    }

    public static void registerFuelHandler(IFuelHandler handler)
    {
        GameRegistry.registerFuelHandler(handler);
    }

    public static void getFuelValue(ItemStack stack)
    {
        GameRegistry.getFuelValue(stack);
    }
}
