package io.github.fergoman123.fergoutil.oredict;

import net.minecraft.item.Item;
//todo ore dictionary item
public class OreDictItem
{
    private String name;
    private Item item;

    public OreDictItem(String name, Item item)
    {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Item getItem() {
        return item;
    }
}
