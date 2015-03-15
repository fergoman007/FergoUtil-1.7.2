package io.github.fergoman123.fergoutil.item.recipe;

import net.minecraft.item.Item;

public class ItemRecipe
{
    private Item item;
    private int quantity;
    private int meta;
    private Object[] recipe;

    public ItemRecipe(Item item, int quantity, int meta, Object[] recipe)
    {
        this.item = item;
        this.quantity = quantity;
        this.meta = meta;
        this.recipe = recipe;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMeta() {
        return meta;
    }

    public Object[] getRecipe() {
        return recipe;
    }
}
