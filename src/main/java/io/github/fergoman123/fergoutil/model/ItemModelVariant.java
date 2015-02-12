package io.github.fergoman123.fergoutil.model;

import net.minecraft.item.Item;

public class ItemModelVariant
{
    public Item item;
    public String variant;

    public ItemModelVariant(Item item, String variant)
    {
        this.item = item;
        this.variant = variant;
    }

    public Item getItem()
    {
        return this.item;
    }

    public String getVariant()
    {
        return this.variant;
    }
}
