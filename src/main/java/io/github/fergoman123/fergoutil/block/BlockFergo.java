package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.info.BlockInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockFergo extends Block
{
    private int mod;
    private BlockInfo info;

    public BlockFergo(int mod, CreativeTabs tab, float hardness, float resistance, BlockInfo info)
    {
        super(info.getMaterial());
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(info.getName());
        this.info = info;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.formatBlockName(NameHelper.getModString(this.getMod()), getInfo().getName());
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

    public Item getItemFromBlock(Block block)
    {
        return Item.getItemFromBlock(block);
    }

    public BlockInfo getInfo()
    {
        return info;
    }
}
