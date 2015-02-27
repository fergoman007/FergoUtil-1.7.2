package io.github.fergoman123.fergoutil.model;

import net.minecraft.item.Item;

public class ItemModel
{
    public Item item;
    public int meta;
    public String name;

    public ItemModel(Item item, int meta, String name)
    {
        this.item = item;
        this.meta = meta;
        this.name = name;
    }

    public ItemModel(Item item, String name)
    {
        this(item, 0, name);
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
