package io.github.fergoman123.fergoutil.item.crafting;

import net.minecraft.item.ItemStack;

public class RecipeFergo
{
    private ItemStack output;
    private Object[] recipe;

    public RecipeFergo(ItemStack output, Object... recipe)
    {
        this.output = output;
        this.recipe = recipe;
    }

    public ItemStack getOutput()
    {
        return this.output;
    }

    public Object[] getRecipe() {
        return recipe;
    }
}
