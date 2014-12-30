package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public abstract class BlockFurnaceFergo extends BlockContainerFergo
{
    public static final PropertyDirection facing = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public final boolean isBurning;
    public static boolean keepInventory;

    public BlockFurnaceFergo(Material materialIn, int mod, CreativeTabs tab, boolean isBurning) {
        super(materialIn, mod, tab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(facing, EnumFacing.NORTH));
        this.isBurning = isBurning;
    }

    public void onBlockAdded(World world, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(world, pos, state);
    }

    private void setDefaultFacing(World world, BlockPos pos, IBlockState state)
    {
        if (!world.isRemote)
        {
            Block north = world.getBlockState(pos.north()).getBlock();
            Block south = world.getBlockState(pos.south()).getBlock();
            Block west = world.getBlockState(pos.west()).getBlock();
            Block east = world.getBlockState(pos.east()).getBlock();
            EnumFacing enumfacing = (EnumFacing)state.getValue(facing);

            if (enumfacing == EnumFacing.NORTH && north.isFullBlock() && !south.isFullBlock())
            {
                enumfacing = EnumFacing.SOUTH;
            }
            else if (enumfacing == EnumFacing.SOUTH && south.isFullBlock() && !north.isFullBlock())
            {
                enumfacing = EnumFacing.NORTH;
            }
            else if (enumfacing == EnumFacing.WEST && west.isFullBlock() && !east.isFullBlock())
            {
                enumfacing = EnumFacing.EAST;
            }
            else if (enumfacing == EnumFacing.EAST && east.isFullBlock() && !west.isFullBlock())
            {
                enumfacing = EnumFacing.WEST;
            }

            world.setBlockState(pos, state.withProperty(facing, enumfacing), 2);
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (this.isBurning)
        {
            EnumFacing enumfacing = (EnumFacing)state.getValue(facing);
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            switch (SwitchEnumFacing.facingLookup[enumfacing.ordinal()])
            {
                case 1:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case 2:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case 3:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D, new int[0]);
                    break;
                case 4:
                    worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
                    worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D, new int[0]);
            }
        }
    }

    @Override
    public abstract boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ);

    // TODO: add setState in main furnace class

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing enumFacing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(facing, placer.getHorizontalFacing().getOpposite());
    }

    public abstract void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack);

    public abstract Item getItem(World world, BlockPos pos);

    @Override
    public int getRenderType() {
        return 3;
    }

    public IBlockState getStateForEntityRender(IBlockState state)
    {
        return this.getDefaultState().withProperty(facing, EnumFacing.SOUTH);
    }

    public IBlockState getStateFromMeta(int meta)
    {
        EnumFacing enumFacing = EnumFacing.getFront(meta);

        if (enumFacing.getAxis() == EnumFacing.Axis.Y)
        {
            enumFacing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(facing, enumFacing);
    }

    public int getMetaFromState(IBlockState state)
    {
        return ((EnumFacing)state.getValue(facing)).getIndex();
    }

    public BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[]{facing});
    }

    @SideOnly(Side.CLIENT)
    public static final class SwitchEnumFacing
    {
        public static final int[] facingLookup = new int[EnumFacing.values().length];

        static
        {
            try
            {
                facingLookup[EnumFacing.WEST.ordinal()] = 1;
            }
            catch (NoSuchFieldError var4)
            {
                ;
            }

            try
            {
                facingLookup[EnumFacing.EAST.ordinal()] = 2;
            }
            catch (NoSuchFieldError var3)
            {
                ;
            }

            try
            {
                facingLookup[EnumFacing.NORTH.ordinal()] = 3;
            }
            catch (NoSuchFieldError var2)
            {
                ;
            }

            try
            {
                facingLookup[EnumFacing.SOUTH.ordinal()] = 4;
            }
            catch (NoSuchFieldError var1)
            {
                ;
            }
        }
    }
}
