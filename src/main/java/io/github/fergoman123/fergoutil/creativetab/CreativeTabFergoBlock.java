package io.github.fergoman123.fergoutil.creativetab;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFergoBlock extends CreativeTabs
{
    public String label;
    public net.minecraft.block.Block tabIcon;
    public CreativeTabFergoBlock(String label, Block tabIcon)
    {
        super(label);
        this.label = label;
        this.tabIcon = tabIcon;
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(this.tabIcon);
    }

    @Override
    public String getTranslatedTabLabel() {
        return NameHelper.translate(this.label);
    }
}
