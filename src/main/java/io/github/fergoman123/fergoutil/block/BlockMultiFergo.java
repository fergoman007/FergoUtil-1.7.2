package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.ItemStackHelper;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class BlockMultiFergo extends Block
{
    private int mod;
    public String[] subNames;

    public BlockMultiFergo(Material material, int mod, CreativeTabs tab, float hardness, float resistance, String[] subNames, String name) {
        super(material);
        this.setMod(mod);
        this.setCreativeTab(tab);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(name);
        this.subNames = subNames;
    }

    @Override
    public String getUnlocalizedName() {
        return NameHelper.formatBlockName(this.getMod(), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }

    public abstract int damageDropped(IBlockState state);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();

    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for (int i = 0; i < subNames.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }

    public void registerModels(){
        for (int i = 0; i < subNames.length; i++) {
            RegisterHelper.registerModel(Item.getItemFromBlock(this), i, NameHelper.getModString(getMod()) + subNames[i]);
        }
    }
}
