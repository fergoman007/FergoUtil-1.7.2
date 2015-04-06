package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.ItemModel;
import io.github.fergoman123.fergoutil.model.ItemVariant;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class BowInfo
{
    private ToolMaterial material;
    private Item repairItem;
    private ModelResourceLocation[] models;
    private String[] variantNames;
    private ItemModel[] itemModels;
    private ItemVariant[] variants;

    public ToolMaterial getMaterial() {
        return material;
    }

    public void setMaterial(ToolMaterial material) {
        this.material = material;
    }

    public Item getRepairItem() {
        return repairItem;
    }

    public void setRepairItem(Item repairItem) {
        this.repairItem = repairItem;
    }

    public ModelResourceLocation[] getModels() {
        return models;
    }

    public void setModels(String model1, String model2, String model3, String model4) {
        this.models = new ModelResourceLocation[]
                {
                        new ModelResourceLocation(model1, "inventory"),
                        new ModelResourceLocation(model2, "inventory"),
                        new ModelResourceLocation(model3, "inventory"),
                        new ModelResourceLocation(model4, "inventory")
                };
    }

    public ItemModel[] getItemModels() {
        return itemModels;
    }

    public void setVariantNames(String variant1, String variant2, String variant3, String variant4)
    {
        this.variantNames = new String[]{variant1, variant2, variant3, variant4};
    }

    public String[] getVariantNames() {
        return variantNames;
    }

    public void setItemModels(ItemModel[] itemModels) {
        this.itemModels = itemModels;
    }

    public ItemVariant[] getVariant() {
        return variants;
    }

    public void setVariant(ItemVariant[] variants){
        this.variants = variants;
    }
}