package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;

public class BlockContainerInfo
{
    private Material material;
    private float hardness;
    private float resistance;
    private TileEntity tileEntity;
    private String tileName;
    private BlockModel blockModel;
    private BlockVariant blockVariant;

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

    public TileEntity getTileEntity() {
        return tileEntity;
    }

    public void setTileEntity(TileEntity tileEntity) {
        this.tileEntity = tileEntity;
    }

    public String getTileName() {
        return tileName;
    }

    public void setTileName(String tileName) {
        this.tileName = tileName;
    }

    public BlockModel getBlockModel() {
        return blockModel;
    }

    public void setBlockModel(BlockModel blockModel) {
        this.blockModel = blockModel;
    }

    public BlockVariant getBlockVariant() {
        return blockVariant;
    }

    public void setBlockVariant(BlockVariant blockVariant) {
        this.blockVariant = blockVariant;
    }
}
