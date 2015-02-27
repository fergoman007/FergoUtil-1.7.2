package io.github.fergoman123.fergoutil.item;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Set;

public class ItemShovelFergo extends ItemToolFergo
{
    private static final Set effectiveBlocks = Sets.newHashSet(new Block[]{Blocks.clay, Blocks.dirt, Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer, Blocks.soul_sand});

    public ItemShovelFergo(ToolMaterial material, int mod, CreativeTabs tab, String name)
    {
        super(1.0F, material, effectiveBlocks, mod, tab, name);
    }

    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.snow_layer ? true : blockIn == Blocks.snow;
    }
}
