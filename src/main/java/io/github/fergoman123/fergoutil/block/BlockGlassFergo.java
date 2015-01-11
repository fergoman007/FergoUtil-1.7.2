package io.github.fergoman123.fergoutil.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockGlassFergo extends BlockBreakableFergo
{
    public BlockGlassFergo(Material materialIn, int mod, CreativeTabs tab, String name, boolean ignoreSimilarity) {
        super(materialIn, mod, tab, -1.0f, 6000000.0F, name, ignoreSimilarity);
        this.setBlockUnbreakable();
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return false;
    }



    public boolean canPlaceTorchOnTop(IBlockAccess world, BlockPos pos) {
        return true;
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, BlockPos pos, Entity entity)
    {
        return false;
    }
}
