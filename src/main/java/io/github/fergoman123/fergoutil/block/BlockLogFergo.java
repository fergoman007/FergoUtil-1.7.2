package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.BlockLog;
import net.minecraft.creativetab.CreativeTabs;

public class BlockLogFergo extends BlockLog
{
    private int mod;

    public BlockLogFergo(int mod, CreativeTabs tabs, String name)
    {
        super();
        this.setMod(mod);
        this.setCreativeTab(tabs);
        this.setUnlocalizedName(name);
    }

    @Override
    public String getUnlocalizedName() {
        return NameHelper.formatBlockName(NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getMod() {
        return mod;
    }
}
