package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ItemBlockFergo;
import io.github.fergoman123.fergoutil.item.ItemBlockMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;
import java.util.Random;

public class BlockMultiFergo extends BlockFergo
{
    public int mod;
    public String[] subNames;

    public BlockMultiFergo(Material materialIn, int mod, CreativeTabs tab, ItemBlock itemBlock, String[] subNames, float hardness, float resistance, String name)
    {
        super(materialIn, mod, tab, hardness, resistance, name);
        this.setMod(mod);
        this.setSubNames(subNames);
        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
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

    public Block setSubNames(String[] subNames)
    {
        this.subNames = subNames;
        return this;
    }

    public String[] getSubNames()
    {
        return subNames;
    }

    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list) {
        for (int i = 0; i < subNames.length; i++) {
            list.add(new ItemStack(itemIn, 1, i));
        }
    }
}
