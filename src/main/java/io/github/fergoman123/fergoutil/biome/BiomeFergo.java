package io.github.fergoman123.fergoutil.biome;

import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.List;

public class BiomeFergo extends BiomeGenBase
{
    private int[] color;

    @SuppressWarnings("rawtypes")
    public BiomeFergo(int biomeId, String biomeName, float rainfall, float temperature, List spawnableCreatureList, int[] color) {
        super(biomeId);
        this.setBiomeName(biomeName);
        this.setTemperatureRainfall(temperature, rainfall);
        this.spawnableCreatureList = spawnableCreatureList;
        this.color = color;
    }


    @Override
    public int getModdedBiomeFoliageColor(int original) {
        return ColorizerFoliage.getFoliageColor(color[0], color[1]);
    }

    @Override
    public int getModdedBiomeGrassColor(int original) {
        return ColorizerGrass.getGrassColor(color[0], color[1]);
    }
}
