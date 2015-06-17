package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStairsFergo extends BlockStairs
{
    private int mod;

    public BlockStairsFergo(IBlockState modelState, int mod, CreativeTabs tab, String name)
    {
        super(modelState);
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatBlockName(this.getMod(), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }


    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }
}
