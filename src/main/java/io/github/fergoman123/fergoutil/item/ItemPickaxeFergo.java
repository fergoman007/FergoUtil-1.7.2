package io.github.fergoman123.fergoutil.item;

import com.google.common.collect.Sets;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Set;

public class ItemPickaxeFergo extends ItemToolFergo
{
    private static final Set effectiveBlocks = Sets.newHashSet(new Block[] {Blocks.activator_rail, Blocks.coal_ore, Blocks.cobblestone, Blocks.detector_rail, Blocks.diamond_block, Blocks.diamond_ore, Blocks.double_stone_slab, Blocks.golden_rail, Blocks.gold_block, Blocks.gold_ore, Blocks.ice, Blocks.iron_block, Blocks.iron_ore, Blocks.lapis_block, Blocks.lapis_ore, Blocks.lit_redstone_ore, Blocks.mossy_cobblestone, Blocks.netherrack, Blocks.packed_ice, Blocks.rail, Blocks.redstone_ore, Blocks.sandstone, Blocks.red_sandstone, Blocks.stone, Blocks.stone_slab});

    public ItemPickaxeFergo(ToolMaterial material, int mod, CreativeTabs tab, String name) {
        super(2.0F, material, effectiveBlocks, mod, tab, name);
    }

    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.obsidian ? this.material.getHarvestLevel() == 3 : (blockIn != Blocks.diamond_block && blockIn != Blocks.diamond_ore ? (blockIn != Blocks.emerald_ore && blockIn != Blocks.emerald_block ? (blockIn != Blocks.gold_block && blockIn != Blocks.gold_ore ? (blockIn != Blocks.iron_block && blockIn != Blocks.iron_ore ? (blockIn != Blocks.lapis_block && blockIn != Blocks.lapis_ore ? (blockIn != Blocks.redstone_ore && blockIn != Blocks.lit_redstone_ore ? (blockIn.getMaterial() == Material.rock ? true : (blockIn.getMaterial() == Material.iron ? true : blockIn.getMaterial() == Material.anvil)) : this.material.getHarvestLevel() >= 2) : this.material.getHarvestLevel() >= 1) : this.material.getHarvestLevel() >= 1) : this.material.getHarvestLevel() >= 2) : this.material.getHarvestLevel() >= 2) : this.material.getHarvestLevel() >= 2);
    }

    @Override
    public float getStrVsBlock(ItemStack stack, Block block) {
        return block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
    }
}
