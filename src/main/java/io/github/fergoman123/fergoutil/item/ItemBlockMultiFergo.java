package io.github.fergoman123.fergoutil.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBlockMultiFergo extends ItemMultiTexture
{

    public ItemBlockMultiFergo(Block block, Block block2, String[] namesByMeta) {
        super(block, block2, namesByMeta);
    }

    @Override
    public abstract void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced);
}
