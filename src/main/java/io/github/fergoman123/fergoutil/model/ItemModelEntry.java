package io.github.fergoman123.fergoutil.model;

import net.minecraft.item.Item;

public class ItemModelEntry
{
    public Item item;
    public int metadata;
    public String name;

    public ItemModelEntry(Item item, int metadata, String name)
    {
        this.item = item;
        this.metadata = metadata;
        this.name = name;
    }

    public Item getItem()
    {
        return this.item;
    }

    public int getMetadata()
    {
        return this.metadata;
    }

    public String getName()
    {
        return this.name;
    }
}
