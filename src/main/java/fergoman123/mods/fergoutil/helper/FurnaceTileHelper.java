package fergoman123.mods.fergoutil.helper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by Fergoman123 on 15/05/2014.
 */
public class FurnaceTileHelper {

    public static ItemStack is;

    public static int getMaxStackSize()
    {
        return is.getMaxStackSize();
    }

    public static Block getBlockFromItem(Item item){return Block.getBlockFromItem(item);}
    public static Item getItemFromBlock(Block block){return Item.getItemFromBlock(block);}

    public static int getItemBurnTime(ItemStack par0ItemStack) {
        if (par0ItemStack == null) {
            return 0;
        } else {

            Item item = par0ItemStack.getItem();

            if (par0ItemStack.getItem() instanceof ItemBlock && FurnaceTileHelper.getBlockFromItem(item) != null) {
                Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab) {
                    return 300;
                }

                if (block.getMaterial() == Material.wood) {
                    return 600;
                }

                if (block == Blocks.coal_block) {
                    return 32000;
                }
            }

            if (item instanceof ItemTool && ((ItemTool) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe) item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 200;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 200;
            if (item == Items.blaze_rod) return 2400;
            return GameRegistry.getFuelValue(par0ItemStack);
        }
    }

    public static ItemStack loadItemStackFromNBT(NBTTagCompound compound)
    {
        return ItemStack.loadItemStackFromNBT(compound);
    }

    public static boolean isItemFuel(ItemStack stack)
    {
        return getItemBurnTime(stack) > 0;
    }
}
