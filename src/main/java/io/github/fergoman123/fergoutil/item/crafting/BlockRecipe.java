package io.github.fergoman123.fergoutil.item.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class BlockRecipe extends RecipeFergo
{
    private Block block;
    private int quantity;
    private int meta;

    public BlockRecipe(Block block, int quantity, int meta, Object... recipe)
    {
        super(new ItemStack(block, quantity, meta), recipe);
        this.block = block;
        this.quantity = quantity;
        this.meta = meta;
    }

    public BlockRecipe(Block block, int quantity, Object... recipe)
    {
        this(block, quantity, 0, recipe);
    }

    public BlockRecipe(Block block, Object... recipe)
    {
        this(block, 1, 0, recipe);
    }

    public Block getBlock()
    {
        return this.block;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getMeta() {
        return meta;
    }
}
