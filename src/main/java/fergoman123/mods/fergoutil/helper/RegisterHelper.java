package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Fergoman123 on 28/04/2014.
 */
public class RegisterHelper {

    public static void registerBlock(Block block, String value){GameRegistry.registerBlock(block, value);}
    public static void registerItem(Item item, String value){GameRegistry.registerItem(item, value);}
    public static void registerTileEntity(Class<? extends TileEntity> tile, String tileString){GameRegistry.registerTileEntity(tile, tileString);}
    public static void registerWorldGen(IWorldGenerator generator, int weight){GameRegistry.registerWorldGenerator(generator, weight);}
    public static void registerGuiHandler(Object mod, IGuiHandler handler){NetworkRegistry.INSTANCE.registerGuiHandler(mod, handler);}
}
