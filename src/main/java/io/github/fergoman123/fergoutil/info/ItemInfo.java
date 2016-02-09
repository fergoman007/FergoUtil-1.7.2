package io.github.fergoman123.fergoutil.info;

import net.minecraft.item.Item;

public abstract class ItemInfo implements IItemInfo {
    private Item item;

    public ItemInfo(Item item){
        this.item = item;
    }

    public Item getItem(){
        return this.item;
    }
}
