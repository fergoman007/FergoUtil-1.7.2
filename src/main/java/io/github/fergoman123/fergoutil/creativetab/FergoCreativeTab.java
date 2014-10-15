package io.github.fergoman123.fergoutil.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public abstract class FergoCreativeTab extends CreativeTabs
{
    public String label;
    public int id;

    public FergoCreativeTab(String label) {
        super(label);
        this.label = label;
    }

    public abstract Item getTabIconItem();

    public abstract String getTranslatedTabLabel();
}
