package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.List;

public abstract class BlockMultiFergo extends Block
{
    private int mod;
    private String[] subNames;

    public BlockMultiFergo(Material material, int mod, CreativeTabs tab, float hardness, float resistance, String[] subNames, String name) {
        super(material);
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setSubNames(subNames);
        this.setUnlocalizedName(name);
    }

    @Override
    public String getUnlocalizedName() {
        return NameHelper.formatBlockName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public void setSubNames(String[] subNames) {
        this.subNames = subNames;
    }

    public String[] getSubNames() {
        return subNames;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public abstract int damageDropped(IBlockState state);
    
    @SuppressWarnings("rawtypes")
	public abstract void getSubBlocks(Item item, CreativeTabs tab, List list);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();
}
