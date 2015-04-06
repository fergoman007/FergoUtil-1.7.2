package io.github.fergoman123.fergoutil.info;

import net.minecraft.world.biome.BiomeGenBase;

import java.util.List;

public class BiomeInfo
{
    public int biomeID;
    private String biomeName;
    private float temperature;
    private float rainfall;
    private float[] color;
    private BiomeGenBase.Height height;
    private List spawnableCreatures;

    public void setBiomeID(int biomeID)
    {
        this.biomeID = biomeID;
    }

    public int getBiomeID() {
        return biomeID;
    }

    public void setBiomeName(String biomeName)
    {
        this.biomeName = biomeName;
    }

    public String getBiomeName()
    {
        return biomeName;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setRainfall(float rainfall) {
        this.rainfall = rainfall;
    }

    public float getRainfall() {
        return rainfall;
    }

    public BiomeGenBase.Height getHeight() {
        return height;
    }

    public void setHeight(BiomeGenBase.Height height) {
        this.height = height;
    }

    public float[] getColor() {
        return color;
    }

    public void setColor(float color1, float color2) {
        this.color = new float[]{color1, color2};
    }

    public void setSpawnableCreatures(List spawnableCreatures) {
        this.spawnableCreatures = spawnableCreatures;
    }

    public List getSpawnableCreatures() {
        return spawnableCreatures;
    }
}
