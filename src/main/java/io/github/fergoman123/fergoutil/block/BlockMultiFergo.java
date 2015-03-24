package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class BlockMultiFergo extends Block
{
    private int mod;
    private String[] models;
    private String name;

    public BlockMultiFergo(Material materialIn, int mod, CreativeTabs tab, String name, String[] models, float hardness, float resistance) {
        super(materialIn);
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.setModels(models);
        this.setHardness(hardness);
        this.setResistance(resistance);
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

    public String[] getModels() {
        return models;
    }

    public Block setModels(String[] models) {
        this.models = models;
        return this;
    }

    public BlockModel[] getBlockModels()
    {
        BlockModel[] blockModels = new BlockModel[getModels().length];
        for (int i = 0; i < blockModels.length; i++) {
            blockModels[i] = new BlockModel(this, i, getModString(this.getMod()) + ":" + getModels()[i]);
        }
        return blockModels;
    }

    public BlockVariant[] getBlockVariants()
    {
        BlockVariant[] blockVariants = new BlockVariant[getModels().length];
        for (int i = 0; i < blockVariants.length; i++) {
            blockVariants[i] = new BlockVariant(this, getModString(this.getMod()) + ":" + getModels()[i]);
        }
        return blockVariants;
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < getModels().length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }

    public String getName()
    {
        return this.name;
    }
    
    
}
