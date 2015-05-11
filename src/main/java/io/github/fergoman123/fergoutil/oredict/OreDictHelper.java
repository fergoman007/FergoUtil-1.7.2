package io.github.fergoman123.fergoutil.oredict;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHelper
{
    public static void registerOre(OreDictItemStack stack)
    {
        OreDictionary.registerOre(stack.getName(), stack.getStack());
    }

    public static void registerOre(OreDictItem item)
    {
        OreDictionary.registerOre(item.getName(), new ItemStack(item.getItem()));
    }

    public static void registerOre(OreDictBlock block)
    {
        OreDictionary.registerOre(block.getName(), new ItemStack(block.getBlock()));
    }
}
