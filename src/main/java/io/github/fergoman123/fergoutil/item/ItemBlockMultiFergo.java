package io.github.fergoman123.fergoutil.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBlockMultiFergo extends ItemMultiTexture
{
    public ItemBlockMultiFergo(Block block, String[] namesByMeta) {
        super(block, block, namesByMeta);
    }
}
