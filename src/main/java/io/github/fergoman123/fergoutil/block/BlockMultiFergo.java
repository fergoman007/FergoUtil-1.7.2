package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.BlockMultiInfo;
import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

@SuppressWarnings("unchecked")
public class BlockMultiFergo extends Block
{
    private int mod;
    private String name;
    private BlockMultiInfo info;

    public BlockMultiFergo(BlockMultiInfo info, int mod, CreativeTabs tab, String name) {
        super(info.getMaterial());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.setHardness(info.getHardness());
        this.setResistance(info.getResistance());
        this.name = name;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s.%s", getModString(this.getMod()), this.getName());
    }

    public String getModString(int mod) {
        return NameHelper.getModString(mod).toLowerCase();
    }

    public int getMod() {
        return mod;
    }

    public Block setMod(int mod) {
        this.mod = mod;
        return this;
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < info.getModels().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    public String getName()
    {
        return this.name;
    }
    
    public void registerModels()
    {
        for(BlockModel model : info.getModels())
        {
            for(BlockVariant variant : info.getVariants())
            {
                ModelHelper.registerBlockModel(model);
                ModelHelper.addBlockVariant(variant);
            }
        }
    }
}
