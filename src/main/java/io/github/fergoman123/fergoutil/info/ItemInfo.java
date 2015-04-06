package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;

public class ItemInfo
{
    private ItemModel model;
    private ItemVariant variant;

    public void setModel(ItemModel model)
    {
        this.model = model;
    }

    public void setVariant(ItemVariant variant)
    {
        this.variant = variant;
    }

    public ItemModel getModel() {
        return model;
    }

    public ItemVariant getVariant() {
        return variant;
    }
}
