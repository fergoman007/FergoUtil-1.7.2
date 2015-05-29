package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import io.github.fergoman123.fergoutil.info.StairsInfo;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStairsFergo extends BlockStairs
{
    private int mod;
    private StairsInfo info;

    public BlockStairsFergo(int mod, CreativeTabs tab, StairsInfo info)
    {
        super(info.getModelState());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(info.getName());
        this.info = info;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatBlockName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public ModelResourceLocation getModel()
    {
        return new ModelResourceLocation(getInfo().getModel(), "inventory");
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public StairsInfo getInfo()
    {
        return info;
    }
}
