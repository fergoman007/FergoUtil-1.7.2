package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFergo extends Block
{
    public int mod;

    public BlockFergo(Material materialIn, int mod, CreativeTabs tab, float hardness, float resistance, String name)
    {
        super(materialIn);
        this.setMod(mod);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
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
}
