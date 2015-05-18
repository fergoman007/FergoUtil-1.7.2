package io.github.fergoman123.fergoutil.helper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public final class RecipeHelper
{
    public static void addPickaxeRecipe(ItemStack output, ItemStack toolItem)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, "xxx", " y ", " y ", 'x', toolItem, 'y', "stickWood"));
    }

    public static void addShovelRecipe(ItemStack output, ItemStack toolItem)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, "x", "y", "y", 'x', toolItem, 'y', "stickWood"));
    }

    public static void addAxeRecipe(ItemStack output, ItemStack toolItem)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, "xx", "xy", "y", 'x', toolItem, 'y', "stickWood"));
    }

    public static void addHoeRecipe(ItemStack output, ItemStack toolItem)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, "xx", " y", " y", 'x', toolItem, 'y', "stickWood"));
    }

    public static void addSwordRecipe(ItemStack output, ItemStack toolItem)
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(output, "x", "x", "y", 'x', toolItem, 'y', "stickWood"));
    }

    public static void addStorageBlockRecipe(ItemStack output, ItemStack input)
    {
        GameRegistry.addRecipe(output, "xxx", "xxx", "xxx", 'x', input);
    }

    public static void addRecipe(ItemStack output, Object... recipe)
    {
        GameRegistry.addRecipe(output, recipe);
    }

    public static void addShapelessRecipe(ItemStack output, Object... recipe)
    {
        GameRegistry.addShapelessRecipe(output, recipe);
    }


}
