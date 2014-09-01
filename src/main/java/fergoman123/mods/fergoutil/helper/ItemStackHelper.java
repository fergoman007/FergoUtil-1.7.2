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
