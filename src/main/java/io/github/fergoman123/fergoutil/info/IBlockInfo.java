package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.model.ModelEntry;
import io.github.fergoman123.fergoutil.model.ModelVariant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface IBlockInfo {
    void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced);
    ModelEntry getModel();
    ModelVariant getVariant();
}
