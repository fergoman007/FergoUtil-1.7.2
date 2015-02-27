package io.github.fergoman123.fergoutil.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

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
}
