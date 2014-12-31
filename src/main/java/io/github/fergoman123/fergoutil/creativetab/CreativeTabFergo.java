package io.github.fergoman123.fergoutil.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public abstract class CreativeTabFergo extends CreativeTabs
{
    public CreativeTabFergo(String label)
    {
        super(label);
    }

    @Override
    public abstract Item getTabIconItem();

    @Override
    public abstract String getTranslatedTabLabel();
}
