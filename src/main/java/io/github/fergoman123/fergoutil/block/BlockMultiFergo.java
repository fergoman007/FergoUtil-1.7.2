package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.List;
import java.util.Random;

public abstract class BlockMultiFergo extends Block{

    private String mod;
    private String[] subNames;

    public BlockMultiFergo(Material materialIn, String mod, String[] subNames, String name) {
        super(materialIn);
        this.mod = mod;
        this.subNames = subNames;
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName(){
        return String.format("tile.%s.%s", this.mod, NameHelper.getName(super.getUnlocalizedName()));
    }

    public String[] getSubNames(){
        return this.subNames;
    }

    public String getMod(){
        return this.mod;
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);
    public abstract int damageDropped(IBlockState state);
    public abstract IBlockState getStateFromMeta(int meta);

    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        for (int i = 0; i < subNames.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();
}
