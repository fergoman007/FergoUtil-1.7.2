package fergoman123.mods.fergoutil.util;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class UtilWorldGen {

    public static class WorldGenNetherMinable extends WorldGenerator {

        private Block minableBlock;
        private int numberOfBlocks;
        private Block blockToReplace;
        private int metadata;

        public WorldGenNetherMinable(Block par1, int par2)
        {
            this(par1, par2, Blocks.netherrack);
        }

        public WorldGenNetherMinable(Block par1, int par2, Block par3)
        {
            minableBlock = par1;
            numberOfBlocks = par2;
            blockToReplace = par3;
        }

        public WorldGenNetherMinable(Block block, int meta, int number, Block replace)
        {
            this(block, number, replace);
            this.metadata = meta;
        }

        public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
        {
            float f = par2Random.nextFloat() * (float)Math.PI;
            double d = (float)(par3 + 8) + (MathHelper.sin(f) * (float)numberOfBlocks) / 8F;
            double d1 = (float)(par3 + 8) - (MathHelper.sin(f) * (float)numberOfBlocks) / 8F;
            double d2 = (float)(par5 + 8) + (MathHelper.cos(f) * (float)numberOfBlocks) / 8F;
            double d3 = (float)(par5 + 8) - (MathHelper.cos(f) * (float)numberOfBlocks) / 8F;
            double d4 = (par4 + par2Random.nextInt(3)) - 2;
            double d5 = (par4 + par2Random.nextInt(3)) - 2;

            for (int i = 0; i <= numberOfBlocks; i++)
            {
                double d6 = d + ((d1 - d) * (double)i) / (double)numberOfBlocks;
                double d7 = d4 + ((d5 - d4) * (double)i) / (double)numberOfBlocks;
                double d8 = d2 + ((d3 - d2) * (double)i) / (double)numberOfBlocks;
                double d9 = (par2Random.nextDouble() * (double)numberOfBlocks) / 16D;
                double d10 = (double)(MathHelper.sin(((float)i * (float)Math.PI) / (float)numberOfBlocks) + 1.0F) * d9 + 1.0D;
                double d11 = (double)(MathHelper.sin(((float)i * (float)Math.PI) / (float)numberOfBlocks) + 1.0F) * d9 + 1.0D;
                int j = MathHelper.floor_double(d6 - d10 / 2D);
                int k = MathHelper.floor_double(d7 - d11 / 2D);
                int l = MathHelper.floor_double(d8 - d10 / 2D);
                int i1 = MathHelper.floor_double(d6 + d10 / 2D);
                int j1 = MathHelper.floor_double(d7 + d11 / 2D);
                int k1 = MathHelper.floor_double(d8 + d10 / 2D);

                for (int l1 = j; l1 <= i1; l1++)
                {
                    double d12 = (((double)l1 + 0.5D) - d6) / (d10 / 2D);

                    if (d12 * d12 >= 1.0D)
                    {
                        continue;
                    }

                    for (int i2 = k; i2 <= j1; i2++)
                    {
                        double d13 = (((double)i2 + 0.5D) - d7) / (d11 / 2D);

                        if (d12 * d12 + d13 * d13 >= 1.0D)
                        {
                            continue;
                        }

                        for (int j2 = l; j2 <= k1; j2++)
                        {
                            double d14 = (((double)j2 + 0.5D) - d8) / (d10 / 2D);

                            if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && par1World.getBlock(l1, i2, j2) == this.blockToReplace)
                            {
                                par1World.setBlock(l1, i2, j2, minableBlock, metadata, 2);
                            }
                        }
                    }
                }
            }
            return true;
        }

    }

    public static class WorldGenEndMinable extends WorldGenerator{

        private Block minableBlock;

        private int metadata;

        private int numberOfBlocks;

        private Block blockToReplace;

        public WorldGenEndMinable(Block par1, int par2)
        {
            this(par1, par2, Blocks.end_stone);
        }

        public WorldGenEndMinable(Block par1, int par2, Block par3)
        {
            this.minableBlock = par1;
            this.numberOfBlocks = par2;
            this.blockToReplace = par3;
        }

        public WorldGenEndMinable(Block block, int meta, int number, Block target)
        {
            this(block, number, target);
            this.metadata = meta;
        }

        public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
        {
            float f = par2Random.nextFloat() * (float)Math.PI;
            double d = (float)(par3 + 8) + (MathHelper.sin(f) * (float)numberOfBlocks) / 8F;
            double d1 = (float)(par3 + 8) - (MathHelper.sin(f) * (float)numberOfBlocks) / 8F;
            double d2 = (float)(par5 + 8) + (MathHelper.cos(f) * (float)numberOfBlocks) / 8F;
            double d3 = (float)(par5 + 8) - (MathHelper.cos(f) * (float)numberOfBlocks) / 8F;
            double d4 = (par4 + par2Random.nextInt(3)) - 2;
            double d5 = (par4 + par2Random.nextInt(3)) - 2;

            for (int i = 0; i <= numberOfBlocks; i++)
            {
                double d6 = d + ((d1 - d) * (double)i) / (double)numberOfBlocks;
                double d7 = d4 + ((d5 - d4) * (double)i) / (double)numberOfBlocks;
                double d8 = d2 + ((d3 - d2) * (double)i) / (double)numberOfBlocks;
                double d9 = (par2Random.nextDouble() * (double)numberOfBlocks) / 16D;
                double d10 = (double)(MathHelper.sin(((float)i * (float)Math.PI) / (float)numberOfBlocks) + 1.0F) * d9 + 1.0D;
                double d11 = (double)(MathHelper.sin(((float)i * (float)Math.PI) / (float)numberOfBlocks) + 1.0F) * d9 + 1.0D;
                int j = MathHelper.floor_double(d6 - d10 / 2D);
                int k = MathHelper.floor_double(d7 - d11 / 2D);
                int l = MathHelper.floor_double(d8 - d10 / 2D);
                int i1 = MathHelper.floor_double(d6 + d10 / 2D);
                int j1 = MathHelper.floor_double(d7 + d11 / 2D);
                int k1 = MathHelper.floor_double(d8 + d10 / 2D);

                for (int l1 = j; l1 <= i1; l1++)
                {
                    double d12 = (((double)l1 + 0.5D) - d6) / (d10 / 2D);

                    if (d12 * d12 >= 1.0D)
                    {
                        continue;
                    }

                    for (int i2 = k; i2 <= j1; i2++)
                    {
                        double d13 = (((double)i2 + 0.5D) - d7) / (d11 / 2D);

                        if (d12 * d12 + d13 * d13 >= 1.0D)
                        {
                            continue;
                        }

                        for (int j2 = l; j2 <= k1; j2++)
                        {
                            double d14 = (((double)j2 + 0.5D) - d8) / (d10 / 2D);

                            if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D && par1World.getBlock(l1, i2, j2) == this.blockToReplace)
                            {
                                par1World.setBlock(l1, i2, j2, minableBlock, metadata, 2);
                            }
                        }
                    }
                }
            }
            return true;
        }

    }
}
