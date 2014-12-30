package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockFergo extends Block
{
    public int mod;

    public BlockFergo(Material materialIn, int mod, CreativeTabs tab)
    {
        super(materialIn);
        this.setCreativeTab(tab);
        this.mod = mod;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", NameHelper.getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);
}
