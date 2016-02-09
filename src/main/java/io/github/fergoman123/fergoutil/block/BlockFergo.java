package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;

public abstract class BlockFergo extends Block {

    private String mod;

    public BlockFergo(Material material, String mod, String name) {
        super(material);
        this.mod = mod;
        this.setUnlocalizedName(name);
        this.setRegistryName(mod, name);
    }

    public String getUnlocalizedName(){
        return String.format("tile.%s.%s", this.mod, NameHelper.getName(super.getUnlocalizedName()));
    }
}
