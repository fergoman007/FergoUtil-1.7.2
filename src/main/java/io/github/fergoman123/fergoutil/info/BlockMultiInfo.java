package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import net.minecraft.block.material.Material;

public class BlockMultiInfo
{
    private Material material;
    private float hardness;
    private float resistance;
    private BlockModel[] models;
    private BlockVariant[] variants;

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

    public BlockModel[] getModels() {
        return models;
    }

    public void setModels(BlockModel[] models) {
        this.models = models;
    }

    public BlockVariant[] getVariants() {
        return variants;
    }

    public void setVariants(BlockVariant[] variants) {
        this.variants = variants;
    }
}
