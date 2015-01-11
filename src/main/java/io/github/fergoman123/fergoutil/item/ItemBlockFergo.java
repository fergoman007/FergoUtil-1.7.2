package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockFergo extends ItemBlock
{
    public Block block;
    public ItemBlockFergo(Block block) {
        super(block);
        this.block = block;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add("Ore Dictionary Name: " +  NameHelper.translate(NameHelper.getUnlocalizedNameForRegistry(this.block.getUnlocalizedName())));
    }
}
