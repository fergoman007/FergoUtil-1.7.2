package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.enums.Properties;
import io.github.fergoman123.fergoutil.enums.SwitchEnumFacing;
import io.github.fergoman123.fergoutil.helper.BlockStateHelper;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.BlockFurnaceInfo;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public abstract class BlockFurnaceFergo extends BlockContainer
{
    private final boolean isActive;
    private static boolean keepInventory;
    private int mod;
    private BlockFurnaceInfo info;

    public BlockFurnaceFergo(BlockFurnaceInfo info, int mod, CreativeTabs tab, String name) {
        super(info.getMaterial());
        this.setUnlocalizedName(name);
        this.isActive = info.getState();
        this.setHardness(info.getHardness());
        this.setResistance(info.getResistance());
        this.info = info;
        this.mod = mod;
        this.setBasedOnState(tab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(Properties.FACING, EnumFacing.NORTH));
    }

    @Override
    public String getUnlocalizedName()
    {
        return NameHelper.formatBlockName(NameHelper.getModString(this.mod).toLowerCase(), super.getUnlocalizedName());
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);

    public void onBlockAdded(World world, BlockPos pos, IBlockState state)
    {
        this.setDefaultFacing(world, pos, state);
    }

    private void setDefaultFacing(World world, BlockPos pos, IBlockState state) {
        if (!world.isRemote)
        {
            Block block = world.getBlockState(pos.north()).getBlock();
            Block block1 = world.getBlockState(pos.south()).getBlock();
            Block block2 = world.getBlockState(pos.west()).getBlock();
            Block block3 = world.getBlockState(pos.east()).getBlock();
            EnumFacing facing = (EnumFacing)state.getValue(Properties.FACING);

            if (facing == EnumFacing.NORTH && block.isFullBlock() && !block1.isFullBlock())
            {
                facing = EnumFacing.SOUTH;
            }
            else if (facing == EnumFacing.SOUTH && block1.isFullBlock() && !block.isFullBlock())
            {
                facing = EnumFacing.NORTH;
            }
            else if (facing == EnumFacing.WEST && block2.isFullBlock() && !block3.isFullBlock())
            {
                facing = EnumFacing.EAST;
            }
            else if (facing == EnumFacing.EAST && block3.isFullBlock() && !block2.isFullBlock())
            {
                facing = EnumFacing.WEST;
            }

            world.setBlockState(pos, state.withProperty(Properties.FACING, facing), 2);
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, BlockPos pos, IBlockState state, Random rand)
    {
        if (this.isActive)
        {
            EnumFacing enumfacing = (EnumFacing)state.getValue(Properties.FACING);
            double d0 = (double)pos.getX() + 0.5D;
            double d1 = (double)pos.getY() + rand.nextDouble() * 6.0D / 16.0D;
            double d2 = (double)pos.getZ() + 0.5D;
            double d3 = 0.52D;
            double d4 = rand.nextDouble() * 0.6D - 0.3D;

            switch (SwitchEnumFacing.FACING_LOOKUP[enumfacing.ordinal()])
            {
                case 1:
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, d0 - d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case 2:
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, d0 + d3, d1, d2 + d4, 0.0D, 0.0D, 0.0D);
                    break;
                case 3:
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 - d3, 0.0D, 0.0D, 0.0D);
                    break;
                case 4:
                    world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D);
                    world.spawnParticle(EnumParticleTypes.FLAME, d0 + d4, d1, d2 + d3, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return info.getTileEntity();
    }

    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(Properties.FACING, placer.getHorizontalFacing().getOpposite());
    }

    @Override
    public boolean hasComparatorInputOverride() {
        return true;
    }

    @Override
    public int getComparatorInputOverride(World worldIn, BlockPos pos) {
        return Container.calcRedstone(worldIn.getTileEntity(pos));
    }

    public abstract Item getItem(World world, BlockPos pos);

    @Override
    public int getRenderType() {
        return 3;
    }

    @Override
    public IBlockState getStateForEntityRender(IBlockState state) {
        return this.getDefaultState().withProperty(Properties.FACING, EnumFacing.SOUTH);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.getFront(meta);

        if (facing.getAxis() == EnumFacing.Axis.Y)
        {
            facing = EnumFacing.NORTH;
        }

        return this.getDefaultState().withProperty(Properties.FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing)state.getValue(Properties.FACING)).getIndex();
    }

    public BlockState createBlockState(IBlockState state)
    {
        return new BlockState(this, Properties.FACING);
    }

    public Block setBasedOnState(CreativeTabs tab)
    {
        if (info.getState())
        {
            this.setLightLevel(0.875f);
        }
        else
        {
            this.setCreativeTab(tab);
        }
        return this;
    }
}
