package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ItemBlockFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockMultiFergo extends Block
{
    public int mod;

    public BlockMultiFergo(Material materialIn, int mod, CreativeTabs tab, String name)
    {
        super(materialIn);
        this.setMod(mod);
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
