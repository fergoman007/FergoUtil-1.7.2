package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class RecipeHelper
{
    public static void addShapelessRecipe(ItemStack output, ItemStack input){GameRegistry.addShapelessRecipe(output, input);}
    public static void addRecipe(ItemStack output, Object... params){GameRegistry.addRecipe(output, params);}
    public static void addBlockSmelting(Block block, ItemStack output, float xp){GameRegistry.addSmelting(block, output, xp);}
    public static void addItemSmelting(Item item, ItemStack output, float xp){GameRegistry.addSmelting(item, output, xp);}
    public static void addItemStackSmelting(ItemStack input, ItemStack output, float xp)
    {
        FurnaceRecipes.instance().addSmeltingRecipe(input, output, xp);
    }

    public static String[] getPickaxeRecipe()
    {
        return new String[]{"xxx", " y ", " y "};
    }

    public static String[] getShovelRecipe()
    {
        return new String[]{"x", "y", "y"};
    }

    public static String[] getAxeRecipe()
    {
        return new String[]{"xx", "xy", " y"};
    }

    public static String[] getHoeRecipe()
    {
        return new String[]{"xx", " y", " y"};
    }

    public static String[] getSwordRecipe()
    {
        return new String[]{"x", "x", "y"};
    }

    public static String[] getBowRecipe()
    {
        return new String[]{" yx", "y x", " yx"};
    }

    public static String[] getBlockRecipe()
    {
        return new String[]{"xxx", "xxx", "xxx"};
    }

    public static String[] getHelmetRecipe()
    {
        return new String[]{"xxx", "x x"};
    }

    public static String[] getChestplateRecipe()
    {
        return new String[]{"x x", "xxx", "xxx"};
    }

    public static String[] getLeggingsRecipe()
    {
        return new String[]{"xxx", "x x", "x x"};
    }

    public static String[] getBootsRecipe()
    {
        return new String[]{"x x", "x x"};
    }

    public static String[] getFurnaceRecipe()
    {
        return new String[]{"xxx", "x x", "xxx"};
    }
}
