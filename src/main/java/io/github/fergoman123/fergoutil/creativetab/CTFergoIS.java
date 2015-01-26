package io.github.fergoman123.fergoutil.creativetab;

import net.minecraft.item.Item;

public class CTFergoIS extends CTFergoItem
{
    private int damage;

    public CTFergoIS(String label, Item tabIcon, int damage) {
        super(label, tabIcon);
        this.damage = damage;
    }

    @Override
    public int getIconItemDamage() {
        return this.damage;
    }
}
