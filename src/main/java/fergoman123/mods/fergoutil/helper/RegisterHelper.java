package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterHelper {

    public static void registerItem(Item item, String value)
    {
        GameRegistry.registerItem(item, value);
    }

    public static void registerBlock(Block block, String value)
    {
        GameRegistry.registerBlock(block, value);
    }

    public static void registerTileEntity(Class<? extends TileEntity> tileClass, String tileValue)
    {
        GameRegistry.registerTileEntity(tileClass, tileValue);
    }

    public static void registerWorldGen(IWorldGenerator generator, int weight)
    {
        GameRegistry.registerWorldGenerator(generator, weight);
    }

    public static void registerGuiHandler(Object mod, IGuiHandler handler)
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(mod, handler);
    }

    public static void registerMetadataBlock(Block block, Class<? extends ItemBlock> itemBlockClass, String value)
    {
        GameRegistry.registerBlock(block, itemBlockClass, value);
    }

    public static void registerFuelHandler(IFuelHandler handler)
    {
        GameRegistry.registerFuelHandler(handler);
    }

    public static int getFuelValue(ItemStack stack)
    {
        return GameRegistry.getFuelValue(stack);
    }

    public static void registerOre(String name, Block ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerOre(String name, Item ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void registerOre(String name, ItemStack ore)
    {
        OreDictionary.registerOre(name, ore);
    }

    public static void register(Object eventClass)
    {
        FMLCommonHandler.instance().bus().register(eventClass);
    }

}
