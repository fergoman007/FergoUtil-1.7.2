package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.creativetab.CTFergoBlock;
import io.github.fergoman123.fergoutil.creativetab.CTFergoItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CreativeTabHelper
{
    public static CTFergoItem newCreativeTab(String name, Item item)
    {
        return new CTFergoItem(name, item);
    }

    public static CTFergoBlock newCreativeTab(String name, Block block)
    {
        return new CTFergoBlock(name, block);
    }
}
