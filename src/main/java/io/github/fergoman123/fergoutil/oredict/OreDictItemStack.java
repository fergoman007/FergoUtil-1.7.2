package io.github.fergoman123.fergoutil.oredict;

import net.minecraft.item.ItemStack;

public class OreDictItemStack
{
    private String name;
    private ItemStack stack;

    public OreDictItemStack(String name, ItemStack stack)
    {
        this.name = name;
        this.stack = stack;
    }

    public String getName() {
        return name;
    }

    public ItemStack getStack() {
        return stack;
    }
}
