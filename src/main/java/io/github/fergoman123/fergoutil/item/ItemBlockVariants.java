package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockVariants extends ItemBlock
{

    public ItemBlockVariants(Block block)
    {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int damage) {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        BlockMultiFergo block = (BlockMultiFergo)this.block;
        return super.getUnlocalizedName(stack) + "." + block.getInfo().getNames()[stack.getItemDamage()];
    }
}
