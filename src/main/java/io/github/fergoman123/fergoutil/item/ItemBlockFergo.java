package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockFergo extends ItemBlock{
    public ItemBlockFergo(Block block){
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    public String getUnlocalizedName(ItemStack stack){
        BlockMultiFergo multi = (BlockMultiFergo)this.block;
        return super.getUnlocalizedName() + "." + multi.getSubNames()[stack.getItemDamage()];
    }
}
