package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.block.BlockMultiFergo;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public abstract class ItemBlockFergo extends ItemBlock
{
    public ItemBlockFergo(Block block, boolean hasSubtypes){
        super(block);
        this.hasSubtypes = hasSubtypes;
    }

    public abstract int getMetadata(int damage);
    public abstract String getUnlocalizedName(ItemStack stack);

    public static class ItemBlockNormalFergo extends ItemBlockFergo
    {
        public ItemBlockNormalFergo(Block block) {
            super(block, false);
        }

        public int getMetadata(int damage){return 0;}

        @Override
        public String getUnlocalizedName(ItemStack stack) {
            return super.getUnlocalizedName();
        }
    }

    public static class ItemBlockMetaFergo extends ItemBlockFergo
    {
        public ItemBlockMetaFergo(Block block, boolean hasSubtypes) {
            super(block, true);
        }

        public int getMetadata(int damage) {return damage;}

        public String getUnlocalizedName(ItemStack stack) {
            BlockMultiFergo blockMulti = (BlockMultiFergo)this.block;
            return super.getUnlocalizedName() + "." + blockMulti.subNames[stack.getItemDamage()];
        }
    }
}
