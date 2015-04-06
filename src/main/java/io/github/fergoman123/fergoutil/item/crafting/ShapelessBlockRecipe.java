package io.github.fergoman123.fergoutil.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ShapelessBlockRecipe extends ShapelessRecipeFergo
{
    private Block block;
    private int quantity;
    private int meta;

    public ShapelessBlockRecipe(Block block, int quantity, int meta, ItemStack... recipe)
    {
        super(new ItemStack(block, quantity, meta), recipe);
        this.block = block;
        this.quantity = quantity;
        this.meta = meta;
    }

    public ShapelessBlockRecipe(Block block, int quantity, ItemStack... recipe)
    {
        this(block, quantity, 0, recipe);
    }

    public ShapelessBlockRecipe(Block block, ItemStack... recipe)
    {
        this(block, 1, 0, recipe);
    }

    public Block getBlock() {
        return block;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMeta() {
        return meta;
    }
}
