package io.github.fergoman123.fergoutil.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CTFergoBlock extends CreativeTabs
{
    public String label;
    public Block tabIcon;

    public CTFergoBlock(String label, Block tabIcon, String texture)
    {
        super(label);
        this.label = label;
        this.tabIcon = tabIcon;
        this.setBackgroundImageName(texture);
    }

    @Override
    public Item getTabIconItem() {
        return Item.getItemFromBlock(this.tabIcon);
    }

    @Override
    public String getTranslatedTabLabel() {
        return this.label;
    }
}
