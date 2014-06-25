package fergoman123.mods.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemStackHelper {

    public static ItemStack getItemStackForBlock(Block block)
    {
        return new ItemStack(block);
    }

    public static ItemStack getItemStackForBlock(Block block, int quantity)
    {
        return new ItemStack(block, quantity);
    }

    public static ItemStack getItemStackForBlock(Block block, int quantity, int metadata)
    {
        return new ItemStack(block, quantity, metadata);
    }

    public static ItemStack getItemStackForItem(Item item)
    {
        return new ItemStack(item);
    }

    public static ItemStack getItemStackForItem(Item item, int quantity)
    {
        return new ItemStack(item, quantity);
    }

    public static ItemStack getItemStackForItem(Item item, int quantity, int metadata)
    {
        return new ItemStack(item, quantity, metadata);
    }
}
