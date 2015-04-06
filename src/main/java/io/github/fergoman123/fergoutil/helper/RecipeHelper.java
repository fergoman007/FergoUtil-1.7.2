package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.item.crafting.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class RecipeHelper
{
    public static void addRecipe(RecipeFergo recipe)
    {
        GameRegistry.addRecipe(recipe.getOutput(), recipe.getRecipe());
    }

    public static void addBlockRecipe(BlockRecipe recipe)
    {
        addRecipe(recipe);
    }

    public static void addItemRecipe(ItemRecipe recipe)
    {
        addRecipe(recipe);
    }

    public static void addShapelessRecipe(ShapelessRecipeFergo recipe)
    {
        GameRegistry.addShapelessRecipe(recipe.getOutput(), recipe.getRecipe());
    }

    public static void addShapelessBlockRecipe(ShapelessBlockRecipe recipe)
    {
        addShapelessRecipe(recipe);
    }

    public static void addShapelessItemRecipe(ShapelessItemRecipe recipe)
    {
        addShapelessRecipe(recipe);
    }
}
