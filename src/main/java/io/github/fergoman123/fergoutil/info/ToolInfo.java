package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ToolInfo
{
    private ToolMaterial material;
    private Item repairItem;
    private ItemModel model;
    private ItemVariant variant;

    public void setMaterial(ToolMaterial material)
    {
        this.material = material;
    }

    public void setRepairItem(Item repairItem)
    {
        this.repairItem = repairItem;
    }

    public void setModel(ItemModel model)
    {
        this.model = model;
    }

    public void setVariant(ItemVariant variant)
    {
        this.variant = variant;
    }

    public ToolMaterial getMaterial() {
        return material;
    }

    public Item getRepairItem() {
        return repairItem;
    }

    public ItemModel getModel() {
        return model;
    }

    public ItemVariant getVariant() {
        return variant;
    }
}
