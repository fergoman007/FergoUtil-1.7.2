package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.BlockContainerInfo;
import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class BlockContainerFergo extends Block implements ITileEntityProvider
{
    public String name;
    public int mod;

    public BlockContainerInfo info;


    public BlockContainerFergo(BlockContainerInfo info, int mod, CreativeTabs tab, float hardness, float resistance, String name, String tileName, TileEntity tileEntity) {
        super(info.getMaterial());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(info.getHardness());
        this.setResistance(info.getResistance());
        this.setUnlocalizedName(name);
        this.name = name;
        this.info = info;
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s.%s", getModString(this.getMod()), this.getName());
    }

    public String getModString(int mod)
    {
        return NameHelper.getModString(mod).toLowerCase();
    }

    public String getName()
    {
        return this.name;
    }

    public Block setMod(int mod)
    {
        this.mod = mod;
        return this;
    }

    public int getMod()
    {
        return this.mod;
    }

    public TileEntity getTileEntity()
    {
        return info.getTileEntity();
    }

    public void registerModels()
    {
        ModelHelper.registerBlockModel(info.getBlockModel());
        ModelHelper.addBlockVariant(info.getBlockVariant());
    }
}
