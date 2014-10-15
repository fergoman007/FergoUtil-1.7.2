 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class ItemStackHelper {

    public static ItemStack getItemStack(Block block)
    {
        return new ItemStack(block);
    }

    public static ItemStack getItemStack(Block block, int quantity)
    {
        return new ItemStack(block, quantity);
    }

    public static ItemStack getItemStack(Block block, int quantity, int metadata)
    {
        return new ItemStack(block, quantity, metadata);
    }

    public static ItemStack getItemStack(Item item)
    {
        return new ItemStack(item);
    }

    public static ItemStack getItemStack(Item item, int quantity)
    {
        return new ItemStack(item, quantity);
    }

    public static ItemStack getItemStack(Item item, int quantity, int metadata)
    {
        return new ItemStack(item, quantity, metadata);
    }
}
