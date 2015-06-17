package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.common.IShearable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class BlockLeavesFergo extends BlockLeavesBase implements IShearable{
    public static final PropertyBool decayable = PropertyBool.create("decayable");
    public static final PropertyBool checkDecay = PropertyBool.create("check_decay");
    int[] surroundings;

    @SideOnly(Side.CLIENT)
    public int iconIndex;

    @SideOnly(Side.CLIENT)
    public boolean isTransparent;

    private int mod;

    public BlockLeavesFergo(int mod, CreativeTabs tab, String name) {
        super(Material.leaves, false);
        this.setTickRandomly(true);
        this.setCreativeTab(tab);
        this.setHardness(0.2f);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeGrass);
        this.mod = mod;
    }


    public int getBlockColor() {
        return ColorizerFoliage.getFoliageColor(0.5D, 1.0D);
    }

    public int getRenderColor(IBlockState state) {
        return ColorizerFoliage.getFoliageColorBasic();
    }

    public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
        return BiomeColorHelper.getFoliageColorAtPos(worldIn, pos);
    }

    public void breakBlock(World world, BlockPos pos, IBlockState state){
        byte b0 = 1;
        int i = b0 + 1;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        if (world.isAreaLoaded(new BlockPos(x - i, y - i, z - i), new BlockPos(x + i, y + i, z + i))){
            {
                for (int i1 = -b0; i1 <= b0; ++i1)
                {
                    for (int j1 = -b0; j1 <= b0; ++j1)
                    {
                        for (int k1 = -b0; k1 <= b0; ++k1)
                        {
                            BlockPos blockpos1 = pos.add(i1, j1, k1);
                            IBlockState iblockstate1 = world.getBlockState(blockpos1);

                            if (iblockstate1.getBlock().isLeaves(world, blockpos1))
                            {
                                iblockstate1.getBlock().beginLeavesDecay(world, blockpos1);
                            }
                        }
                    }
                }
            }
        }
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            if ((Boolean) state.getValue(checkDecay) && (Boolean) state.getValue(decayable))
            {
                byte b0 = 4;
                int i = b0 + 1;
                int j = pos.getX();
                int k = pos.getY();
                int l = pos.getZ();
                byte b1 = 32;
                int i1 = b1 * b1;
                int j1 = b1 / 2;

                if (this.surroundings == null)
                {
                    this.surroundings = new int[b1 * b1 * b1];
                }

                int k1;

                if (worldIn.isAreaLoaded(new BlockPos(j - i, k - i, l - i), new BlockPos(j + i, k + i, l + i)))
                {
                    int l1;
                    int i2;

                    for (k1 = -b0; k1 <= b0; ++k1)
                    {
                        for (l1 = -b0; l1 <= b0; ++l1)
                        {
                            for (i2 = -b0; i2 <= b0; ++i2)
                            {
                                BlockPos tmp = new BlockPos(j + k1, k + l1, l + i2);
                                Block block = worldIn.getBlockState(tmp).getBlock();

                                if (!block.canSustainLeaves(worldIn, tmp))
                                {
                                    if (block.isLeaves(worldIn, tmp))
                                    {
                                        this.surroundings[(k1 + j1) * i1 + (l1 + j1) * b1 + i2 + j1] = -2;
                                    }
                                    else
                                    {
                                        this.surroundings[(k1 + j1) * i1 + (l1 + j1) * b1 + i2 + j1] = -1;
                                    }
                                }
                                else
                                {
                                    this.surroundings[(k1 + j1) * i1 + (l1 + j1) * b1 + i2 + j1] = 0;
                                }
                            }
                        }
                    }

                    for (k1 = 1; k1 <= 4; ++k1)
                    {
                        for (l1 = -b0; l1 <= b0; ++l1)
                        {
                            for (i2 = -b0; i2 <= b0; ++i2)
                            {
                                for (int j2 = -b0; j2 <= b0; ++j2)
                                {
                                    if (this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + j2 + j1] == k1 - 1)
                                    {
                                        if (this.surroundings[(l1 + j1 - 1) * i1 + (i2 + j1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1 - 1) * i1 + (i2 + j1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1 + 1) * i1 + (i2 + j1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1 + 1) * i1 + (i2 + j1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1 - 1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1 - 1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1 + 1) * b1 + j2 + j1] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1 + 1) * b1 + j2 + j1] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + (j2 + j1 - 1)] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + (j2 + j1 - 1)] = k1;
                                        }

                                        if (this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + j2 + j1 + 1] == -2)
                                        {
                                            this.surroundings[(l1 + j1) * i1 + (i2 + j1) * b1 + j2 + j1 + 1] = k1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                k1 = this.surroundings[j1 * i1 + j1 * b1 + j1];

                if (k1 >= 0)
                {
                    worldIn.setBlockState(pos, state.withProperty(checkDecay, false), 4);
                }
                else
                {
                    this.destroy(worldIn, pos);
                }
            }
        }
    }

    public void randomDisplayTick(World world, BlockPos pos, IBlockState state, Random rand){
        if (world.canLightningStrike(pos.up()) && !World.doesBlockHaveSolidTopSurface(world, pos.down()) && rand.nextInt(15) == 1){
            double dx = (double)((float)pos.getX() + rand.nextFloat());
            double dy = (double)pos.getY() - 0.05D;
            double dz = (double)((float)pos.getZ() + rand.nextFloat());
            world.spawnParticle(EnumParticleTypes.DRIP_WATER, dx, dy, dz, 0.0D, 0.0D, 0.0D);
        }
    }

    private void destroy(World world, BlockPos pos){
        this.dropBlockAsItem(world, pos, world.getBlockState(pos), 0);
        world.setBlockToAir(pos);
    }

    public int quantityDropped(Random rand){
        return  rand.nextInt(20) == 1 ? 1 : 0;
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return getItemFromBlock(getBlock());
    }

    public abstract Block getBlock();

    public abstract int damageDropped(IBlockState state);

    public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune){
        super.dropBlockAsItemWithChance(world, pos, state, chance, fortune);
    }

    public void dropApple(World world, BlockPos pos, IBlockState state, int chance){
        spawnAsEntity(world, pos, new ItemStack(Items.apple, 1, 0));
    }

    public int getSaplingDropChance(IBlockState state){return 20;}

    public boolean isOpaqueCube(){return !this.fancyGraphics;}

    @SideOnly(Side.CLIENT)
    public void setGraphicsLevel(boolean fancy){
        this.isTransparent = fancy;
        this.fancyGraphics = fancy;
        this.iconIndex = fancy ? 0 : 1;
    }

    public EnumWorldBlockLayer getBlockLayer(){
        return this.isTransparent ? EnumWorldBlockLayer.CUTOUT_MIPPED : EnumWorldBlockLayer.SOLID;
    }

    public boolean isVisuallyOpaque(){return false;}

    public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){
        return true;
    }

    public boolean isLeaves(IBlockAccess world, BlockPos pos){return true;}

    public void beginLeavesDecay(World world, BlockPos pos){
        IBlockState state = world.getBlockState(pos);
        if ((Boolean)state.getValue(checkDecay)){
            world.setBlockState(pos, state.withProperty(checkDecay, true), 4);
        }
    }

    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune){
        List<ItemStack> ret = new ArrayList<ItemStack>();
        Random rand = world instanceof World ? ((World)world).rand : new Random();
        int chance = this.getSaplingDropChance(state);

        if (fortune > 0){
            chance -= 2 << fortune;
            if (chance < 10) chance = 10;
        }

        if (rand.nextInt(chance) == 0)
            ret.add(new ItemStack(getItemDropped(state, rand, fortune), damageDropped(state)));

        chance = 200;
        if (fortune > 0){
            chance -= 10 << fortune;
            if (chance < 40) chance = 40;
        }

        this.captureDrops(true);
        if (world instanceof World)
            this.dropApple((World)world, pos, state, chance);
        ret.addAll(this.captureDrops(false));
        return ret;
    }

    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune){
        return new ArrayList<ItemStack>(Collections.singletonList(new ItemStack(Item.getItemFromBlock(this), 1, 0)));
    }

    public String getUnlocalizedName(){
        return NameHelper.formatBlockName(mod, NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public Item getItemFromBlock(Block block){
        return Item.getItemFromBlock(block);
    }
}