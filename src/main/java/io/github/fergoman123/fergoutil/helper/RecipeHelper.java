package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.item.recipe.ItemRecipe;
import io.github.fergoman123.fergoutil.item.recipe.RecipeFergo;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class RecipeHelper
{
    public static void addRecipe(RecipeFergo recipe)
    {
        GameRegistry.addRecipe(recipe.getOutput(), new Object[]{recipe.getTopRow(), recipe.getMiddleRow(), recipe.getBottomRow(), recipe.getId(), recipe.getInput()});
    }

    public static void addItemRecipe(ItemRecipe recipe)
    {
        GameRegistry.addRecipe(new ItemStack(recipe.getItem(), recipe.getQuantity(), recipe.getMeta()), recipe.getRecipe());
    }
}
