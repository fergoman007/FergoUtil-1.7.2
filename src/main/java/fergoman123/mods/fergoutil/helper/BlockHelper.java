package fergoman123.mods.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;


public class BlockHelper {

    public static Item getItemFromBlock(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        return item;
    }

    public static Block getBlockFromItem(Item item)
    {
        Block block = Block.getBlockFromItem(item);
        return block;
    }
}
