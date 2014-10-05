/*
 * Fergoman123's Util
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.html
 */

package fergoman123.mods.fergoutil.block;

import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class FergoBlock extends Block
{

    public int mod;

    public FergoBlock(Material material, CreativeTabs tab, int mod)
    {
        super(material);
        this.setCreativeTab(tab);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", NameHelper.getAssetStringBasedOnMod(this.mod), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    public abstract Item getItemDropped(int metadata, Random rand, int fortune);
}
