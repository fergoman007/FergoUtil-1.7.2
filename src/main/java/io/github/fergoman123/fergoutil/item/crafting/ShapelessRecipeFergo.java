package io.github.fergoman123.fergoutil.item.crafting;

import net.minecraft.item.ItemStack;

public class ShapelessRecipeFergo
{
    private ItemStack output;
    private ItemStack[] recipe;

    public ShapelessRecipeFergo(ItemStack output, ItemStack... recipe)
    {
        this.output = output;
        this.recipe = recipe;
    }

    public ItemStack getOutput() {
        return output;
    }

    public ItemStack[] getRecipe() {
        return recipe;
    }
}
