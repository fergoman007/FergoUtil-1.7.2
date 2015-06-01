package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.MultiBlockInfo;
import net.minecraft.block.Block;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.List;

public abstract class BlockMultiFergo extends Block
{
    private int mod;
    private MultiBlockInfo info;

    public BlockMultiFergo(int mod, CreativeTabs tab, float hardness, float resistance, MultiBlockInfo info) {
        super(info.getMaterial());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(info.getName());
    }

    @Override
    public String getUnlocalizedName() {
        return NameHelper.formatBlockName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public MultiBlockInfo getInfo()
    {
        return info;
    }

    public abstract int damageDropped(IBlockState state);
    
    @SuppressWarnings("rawtypes")
	public abstract void getSubBlocks(Item item, CreativeTabs tab, List list);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();

    public ModelResourceLocation[] getModels()
    {
        ModelResourceLocation[] models = new ModelResourceLocation[getInfo().getModels().length];
        for(ModelResourceLocation model: models)
        {
            for (String modelName : getInfo().getModels())
            {
                model = new ModelResourceLocation(modelName, "inventory");
            }
        }

        return models;
    }
}
