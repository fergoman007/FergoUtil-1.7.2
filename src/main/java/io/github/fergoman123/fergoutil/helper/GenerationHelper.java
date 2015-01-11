package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import io.github.fergoman123.fergoutil.worldgen.WorldGenEndMinable;
import io.github.fergoman123.fergoutil.worldgen.WorldGenNetherMinable;

import java.util.Random;

@SuppressWarnings("unused")
public class GenerationHelper
{
    public static void addOverWorldOreSpawn(Block block, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "“addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int i = 0; i < chancesToSpawn; i++)
        {
            int posX = blockXPos + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + rand.nextInt(maxZ);
            (new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world, rand, BlockHelper.getBlockPos(posX, posY, posZ));
        }
    }

    public static void addNetherOreSpawn(Block block, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "“addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int i = 0; i < chancesToSpawn; i++)
        {
            int posX = blockXPos + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + rand.nextInt(maxZ);
            (new WorldGenNetherMinable(block.getDefaultState(), maxVeinSize)).generate(world, rand, BlockHelper.getBlockPos(posX, posY, posZ));
        }
    }

    public static void addEndOreSpawn(Block block, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY: "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16: "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0: "“addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0: "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16: "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int i = 0; i < chancesToSpawn; i++)
        {
            int posX = blockXPos + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + rand.nextInt(maxZ);
            (new WorldGenEndMinable(block.getDefaultState(), maxVeinSize)).generate(world, rand, BlockHelper.getBlockPos(posX, posY, posZ));
        }
    }
}
