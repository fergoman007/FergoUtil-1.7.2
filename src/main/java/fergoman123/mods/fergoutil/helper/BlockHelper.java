 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

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
