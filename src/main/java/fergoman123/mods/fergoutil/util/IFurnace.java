package fergoman123.mods.fergoutil.util;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Fergoman123 on 23/05/2014.
 */
public interface IFurnace {

    public Item getItemDropped(int par1, Random rand, int par3);

    public void onBlockAdded(World world, int x, int y, int z);

    public void setDefaultDirection(World world, int x, int y, int z);

    public IIcon getIcon(int par1, int par2);

    public void registerBlockIcons(IIconRegister register);

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ);

    public void randomDisplayTick(World world, int x, int y, int z, Random rand);

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack);

    public void breakBlock(World world, int x, int y, int z, Block block, int meta);

    public boolean hasComparatorInputOverride();

    public int getComparatorInputOverride(World world, int x, int y, int z, int par5);

    public Item getItem(World world, int x, int y, int z);
}
