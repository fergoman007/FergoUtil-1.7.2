package io.github.fergoman123.fergoutil.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemBlockMultiFergo extends ItemMultiTexture
{

    public String[] namesByMeta;
    public ItemBlockMultiFergo(Block block, String[] namesByMeta) {
        super(block, block, namesByMeta);
        this.namesByMeta = namesByMeta;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        tooltip.add("Ore Dictionary Name: " + this.namesByMeta[stack.getItemDamage()]);
    }
}
