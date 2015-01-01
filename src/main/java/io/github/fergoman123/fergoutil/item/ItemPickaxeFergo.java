package io.github.fergoman123.fergoutil.item;

<<<<<<< HEAD
import java.util.List;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemPickaxeFergo extends ItemPickaxe
{
	

=======
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeFergo extends ItemPickaxe
{
>>>>>>> 632498bdec700d998437fc223a3755c7a3f55597
	public int mod;
	
	public ItemPickaxeFergo(ToolMaterial material, int mod, CreativeTabs tab)
	{
		super(material);
		this.setCreativeTab(tab);
		this.mod = mod;
	}

	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getName(super.getUnlocalizedName()));
	}
<<<<<<< HEAD
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return String.format("item.%s%s", NameHelper.getModString(this.mod), NameHelper.getName(super.getUnlocalizedName(stack)));
	}

	@Override
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
	{
		tooltip.add(NameHelper.getDurabilityString(stack));
		tooltip.add(EnumChatFormatting.DARK_GRAY + this.getUnlocalizedName());
	}
=======

>>>>>>> 632498bdec700d998437fc223a3755c7a3f55597
}
