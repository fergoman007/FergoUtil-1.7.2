package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.enums.SwitchDirtType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHoeFergo extends ItemFergo
{
    public ToolMaterial material;

    public ItemHoeFergo(ToolMaterial material, int mod, CreativeTabs tab, String name)
    {
        super(mod, tab, name);
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.material = material;
    }

    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (!playerIn.canPlayerEdit(pos.offset(side), side, stack))
        {
            return false;
        }
        else
        {
            int hook = net.minecraftforge.event.ForgeEventFactory.onHoeUse(stack, playerIn, worldIn, pos);
            if (hook != 0) return hook > 0;

            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (side != EnumFacing.DOWN && worldIn.isAirBlock(pos.up()))
            {
                if (block == Blocks.grass)
                {
                    return this.useHoe(stack, playerIn, worldIn, pos, Blocks.farmland.getDefaultState());
                }

                if (block == Blocks.dirt)
                {
                    switch (SwitchDirtType.TYPE_LOOKUP[((BlockDirt.DirtType)iblockstate.getValue(BlockDirt.VARIANT)).ordinal()])
                    {
                        case 1:
                            return this.useHoe(stack, playerIn, worldIn, pos, Blocks.farmland.getDefaultState());
                        case 2:
                            return this.useHoe(stack, playerIn, worldIn, pos, Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.DIRT));
                    }
                }
            }

            return false;
        }
    }

    protected boolean useHoe(ItemStack stack, EntityPlayer player, World worldIn, BlockPos target, IBlockState newState)
    {
        worldIn.playSoundEffect((double)((float)target.getX() + 0.5F), (double)((float)target.getY() + 0.5F), (double)((float)target.getZ() + 0.5F), newState.getBlock().stepSound.getStepSound(), (newState.getBlock().stepSound.getVolume() + 1.0F) / 2.0F, newState.getBlock().stepSound.getFrequency() * 0.8F);

        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            worldIn.setBlockState(target, newState);
            stack.damageItem(1, player);
            return true;
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    public ToolMaterial getToolMaterial()
    {
        return this.material;
    }

    public String getMaterialName()
    {
        return this.material.toString();
    }

    public int getHarvestLevel()
    {
        return getToolMaterial().getHarvestLevel();
    }

    public int getMaxUses()
    {
        return getToolMaterial().getMaxUses();
    }

    public float getEfficiency()
    {
        return getToolMaterial().getEfficiencyOnProperMaterial();
    }

    public float getDamageVsEntity()
    {
        return getToolMaterial().getDamageVsEntity();
    }

    public int getEnchantability()
    {
        return getToolMaterial().getEnchantability();
    }
}
