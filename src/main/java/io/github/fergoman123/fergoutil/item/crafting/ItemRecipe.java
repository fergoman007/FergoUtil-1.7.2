package io.github.fergoman123.fergoutil.item.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRecipe extends RecipeFergo
{
    private Item item;
    private int quantity;
    private int meta;

    public ItemRecipe(Item item, int quantity, int meta, Object... recipe)
    {
        super(new ItemStack(item, quantity, meta), recipe);
        this.item = item;
        this.quantity = quantity;
        this.meta = meta;
    }

    public ItemRecipe(Item item, int quantity, Object... recipe)
    {
        this(item, quantity, 0, recipe);
    }

    public ItemRecipe(Item item, Object... recipe)
    {
        this(item, 1, 0, recipe);
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
}
