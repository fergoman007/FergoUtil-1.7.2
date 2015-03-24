package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.model.BlockModel;
import io.github.fergoman123.fergoutil.model.BlockVariant;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.awt.image.renderable.RenderableImage;

public abstract class BlockFergo extends Block
{
    private int mod;
    private String name;

    public BlockFergo(Material material, int mod, CreativeTabs tab, float hardness, float resistance, String name)
    {
        super(material);
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(name);
        this.name = name;
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

    public BlockModel getBlockModel()
    {
        return new BlockModel(this, getModString(this.getMod()) + ":" + this.getName());
    }

    public BlockVariant getBlockVariant()
    {
        return new BlockVariant(this, getModString(this.getMod()) + ":" + this.getName());
    }

    public String getModString(int mod)
    {
        return NameHelper.getModString(mod).toLowerCase();
    }
}