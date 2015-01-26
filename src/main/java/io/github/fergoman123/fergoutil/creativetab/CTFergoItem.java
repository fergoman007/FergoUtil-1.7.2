package io.github.fergoman123.fergoutil.creativetab;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTFergoItem extends CreativeTabs
{
    public String label;
    public Item tabIcon;
    public CTFergoItem(String label, Item tabIcon)
    {
        super(label);
        this.label = label;
        this.tabIcon = tabIcon;
    }

    @Override
    public Item getTabIconItem() {
        return this.tabIcon;
    }

    @Override
    public String getTranslatedTabLabel() {
        return NameHelper.translate(this.label);
    }
}
