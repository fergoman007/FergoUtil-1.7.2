package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.item.ArmorType;
import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorInfo
{
    private ArmorMaterial material;
    private ArmorType type;
    private Item repairItem;
    private ItemModel model;
    private ItemVariant variant;

    public void setMaterial(ArmorMaterial material)
    {
        this.material = material;
    }

    public void setType(ArmorType type)
    {
        this.type = type;
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

    public ArmorMaterial getMaterial() {
        return material;
    }

    public ArmorType getType() {
        return type;
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
