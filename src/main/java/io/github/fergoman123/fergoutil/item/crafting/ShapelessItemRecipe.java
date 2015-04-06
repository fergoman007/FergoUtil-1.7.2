package io.github.fergoman123.fergoutil.item.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ShapelessItemRecipe extends  ShapelessRecipeFergo
{
    private Item item;
    private int quantity;
    private int meta;

    public ShapelessItemRecipe(Item item, int quantity, int meta, ItemStack... input) {
        super(new ItemStack(item, quantity, meta), input);
        this.item = item;
        this.quantity = quantity;
        this.meta = meta;
    }

    public ShapelessItemRecipe(Item item, int quantity, ItemStack... recipe)
    {
        this(item, quantity, 0, recipe);
    }

    public ShapelessItemRecipe(Item item, ItemStack... recipe)
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
