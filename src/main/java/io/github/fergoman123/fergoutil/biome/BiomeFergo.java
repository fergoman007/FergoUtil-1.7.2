package io.github.fergoman123.fergoutil.biome;

import io.github.fergoman123.fergoutil.info.BiomeInfo;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeFergo extends BiomeGenBase
{
    private BiomeInfo info;

    public BiomeFergo(BiomeInfo info) {
        super(info.getBiomeID());
        this.setBiomeName(info.getBiomeName());
        this.setTemperatureRainfall(info.getTemperature(), info.getRainfall());
        this.spawnableCreatureList = info.getSpawnableCreatures();
        this.info = info;
    }


    @Override
    public int getModdedBiomeFoliageColor(int original) {
        return ColorizerFoliage.getFoliageColor(info.getColor()[0], info.getColor()[1]);
    }

    @Override
    public int getModdedBiomeGrassColor(int original) {
        return ColorizerGrass.getGrassColor(info.getColor()[0], info.getColor()[1]);
    }
}
