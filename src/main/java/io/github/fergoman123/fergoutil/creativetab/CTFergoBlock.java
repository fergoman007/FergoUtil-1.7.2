package io.github.fergoman123.fergoutil.creativetab;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class CTFergoBlock extends CTFergoItem
{
    public CTFergoBlock(String label, Block tabIcon)
    {
        super(label, Item.getItemFromBlock(tabIcon));
    }
}
