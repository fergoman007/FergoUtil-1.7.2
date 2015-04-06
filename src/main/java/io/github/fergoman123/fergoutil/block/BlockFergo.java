package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import io.github.fergoman123.fergoutil.model.ModelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.awt.image.renderable.RenderableImage;

public abstract class BlockFergo extends Block
{
    private int mod;
    private String name;
    private BlockInfo info;

    public BlockFergo(BlockInfo info, int mod, CreativeTabs tab, String name)
    {
        super(info.getMaterial());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(info.getHardness());
        this.setResistance(info.getResistance());
        this.setUnlocalizedName(name);
        this.name = name;
        this.info = info;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s.%s", NameHelper.getModString(this.getMod()).toLowerCase(), this.getName());
    }

    public Block setMod(int mod)
    {
        this.mod = mod;
        return this;
    }

    public int getMod()
    {
        return mod;
    }

    public String getName()
    {
        return this.name;
    }

    public void registerModels()
    {
        ModelHelper.registerBlockModel(info.getModel());
        ModelHelper.addBlockVariant(info.getVariant());
    }
}