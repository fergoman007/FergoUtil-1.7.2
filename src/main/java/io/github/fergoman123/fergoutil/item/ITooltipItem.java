package io.github.fergoman123.fergoutil.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public interface ITooltipItem {

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo);
}
