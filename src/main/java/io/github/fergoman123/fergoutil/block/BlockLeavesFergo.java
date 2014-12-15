package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockLeavesFergo extends BlockLeaves
{
    public int mod;
    public String folder;
    public String texture;

    public IIcon opaqueIcon;
    public IIcon fancyIcon;

    public static final boolean isOpaque = !Minecraft.getMinecraft().gameSettings.fancyGraphics;

    public static final String opaque = "Opaque";

    public BlockLeavesFergo(int mod, String folder, String texture, CreativeTabs tab)
    {
        super();
        this.setCreativeTab(tab);
        this.mod = mod;
        this.folder = folder;
        this.texture = texture;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", getModString(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.opaqueIcon = register.registerIcon(getModString(this.mod) + "leaves/" + this.folder + "/leaves" + this.texture + opaque);
        this.fancyIcon = register.registerIcon(getModString(this.mod) + "leaves/" + this.folder + "/leaves" + this.texture);
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (isOpaque)
        {
            return this.opaqueIcon;
        }
        else
        {
            return this.fancyIcon;
        }
    }

    @Override
    public String[] func_150125_e() {
        return new String[0];
    }

    public String getModString(int mod)
    {
        if (mod == 0)
        {
            return "FergoTools:";
        }
        else if (mod == 1)
        {
            return "MSB:";
        }
        else
        {
            return "null:";
        }
    }
}
