package fergoman123.mods.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class BiomeHelper {

    public static Block getTopBlock(Block block)
    {
        return block;
    }

    public static Block getFillerBlock(Block block)
    {
        return block;
    }

    public static int getTreesPerChunk(int treesPerChunk)
    {
        return treesPerChunk;
    }

    public static int getFlowerPerChunk(int flowersPerChunk)
    {
        return flowersPerChunk;
    }

    public static int getBigMushroomsPerChunk(int bigMushroomsPerChunk)
    {
        return bigMushroomsPerChunk;
    }

    public static int getClayPerChunk(int clayPerChunk)
    {
        return clayPerChunk;
    }

    public static int getDeadBushPerChunk(int deadBushPerChunk)
    {
        return deadBushPerChunk;
    }

    public static int getMushroomsPerChunk(int mushroomsPerChunk)
    {
        return mushroomsPerChunk;
    }

    public static int getReedsPerChunk(int reedsPerChunk)
    {
        return reedsPerChunk;
    }

    public static int getSandPerChunk(int sandPerChunk)
    {
        return sandPerChunk;
    }

    public static int getSandPerChunk2(int sandPerChunk2)
    {
        return sandPerChunk2;
    }

    public static int getWaterLilyPerChunk(int waterlilyPerChunk)
    {
        return waterlilyPerChunk;
    }

    public static boolean getGenerateLakes(boolean generateLakes)
    {
        return generateLakes;
    }

    public static void addStrongholdBiome(BiomeGenBase base)
    {
        BiomeManager.addStrongholdBiome(base);
    }

    public static void registerBiomeType(BiomeGenBase base, BiomeDictionary.Type ... types)
    {
        BiomeDictionary.registerBiomeType(base, types);
    }
}
