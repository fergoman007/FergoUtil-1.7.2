package io.github.fergoman123.fergoutil.helper;

import io.github.fergoman123.fergoutil.creativetab.CreativeTabFergoBlock;
import io.github.fergoman123.fergoutil.creativetab.CreativeTabFergoItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CreativeTabHelper
{
    public static CreativeTabFergoItem newCreativeTab(String name, Item item)
    {
        return new CreativeTabFergoItem(name, item);
    }

    public static CreativeTabFergoBlock newCreativeTab(String name, Block block)
    {
        return new CreativeTabFergoBlock(name, block);
    }
}
