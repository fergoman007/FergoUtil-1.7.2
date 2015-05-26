package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockFergo extends Block
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
        return NameHelper.formatBlockName(NameHelper.getModString(this.getMod()), this.getName());
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public String getName() {
        return name;
    }

    public int getMod() {
        return mod;
    }

    public Item getItemFromBlock(Block block)
    {
        return Item.getItemFromBlock(block);
    }
}
