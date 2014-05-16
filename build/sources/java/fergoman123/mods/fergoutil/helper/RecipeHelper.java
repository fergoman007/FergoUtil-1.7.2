package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 28/04/2014.
 */
public class RecipeHelper {

    public static void addShapelessRecipe(ItemStack output, ItemStack input){GameRegistry.addShapelessRecipe(output, input);}
    public static void addRecipe(ItemStack output, Object[] params){GameRegistry.addRecipe(output, params);}
    public static void addBlockSmelting(Block block, ItemStack output, float xp){GameRegistry.addSmelting(block, output, xp);}
    public static void addSmelting(Item item, ItemStack stack, float xp){GameRegistry.addSmelting(item, stack, xp);}


}
