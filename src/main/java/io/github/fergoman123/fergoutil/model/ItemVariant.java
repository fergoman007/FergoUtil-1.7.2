package io.github.fergoman123.fergoutil.model;

import net.minecraft.item.Item;

public class ItemVariant
{
    private Item item;
    private String name;

    public ItemVariant(Item item, String name) {
        this.item = item;
        this.name = name;
    }

    public Item getItem() {
        return item;
    }

    public String getName() {
        return name;
    }
}
