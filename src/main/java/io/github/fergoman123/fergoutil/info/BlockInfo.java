package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import net.minecraft.block.material.Material;

public class BlockInfo
{
    private Material material;
    private float hardness;
    private float resistance;
    private BlockModel model;
    private BlockVariant variant;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public float getHardness() {
        return hardness;
    }

    public void setHardness(float hardness) {
        this.hardness = hardness;
    }

    public float getResistance() {
        return resistance;
    }

    public void setResistance(float resistance) {
        this.resistance = resistance;
    }

    public BlockModel getModel() {
        return model;
    }

    public void setModel(BlockModel model) {
        this.model = model;
    }

    public BlockVariant getVariant() {
        return variant;
    }

    public void setVariant(BlockVariant variant) {
        this.variant = variant;
    }
}
