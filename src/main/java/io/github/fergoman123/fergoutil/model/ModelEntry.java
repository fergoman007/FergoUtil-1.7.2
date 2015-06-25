/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.model;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class ModelEntry
{
    private Item item;
    private int meta;
    private String name;

    public ModelEntry(Item item, int meta, String name)
    {
        this.item = item;
        this.meta = meta;
        this.name = name;
    }

    public ModelEntry(Item item, String name)
    {
        this(item, 0, name);
    }

    public ModelEntry(Block block, int meta, String name)
    {
        this(Item.getItemFromBlock(block), meta, name);
    }

    public ModelEntry(Block block, String name)
    {
        this(block, 0, name);
    }

    public Item getItem() {
        return item;
    }

    public int getMeta() {
        return meta;
    }

    public String getName() {
        return name;
    }
}
