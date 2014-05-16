package fergoman123.mods.fergoutil.helper;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

/**
 * Created by Fergoman123 on 15/05/2014.
 */
public class FurnaceHelper {

    public static World world;
    public static ItemStack is;
    public static IIconRegister register;
    public static Block block;
    public static TileEntity entity;
    public static EntityPlayer player;

    public static int calcRedstoneFromInventory(IInventory inventory)
    {
        return Container.calcRedstoneFromInventory(inventory);
    }

    public static Block getBlock(int x, int y, int z)
    {
         return world.getBlock(x, y, z);
    }

    public static boolean spawnEntityInWorld(Entity entity)
    {
        return world.spawnEntityInWorld(entity);
    }

    public static void setTileEntity(int x, int y, int z, TileEntity entity)
    {
        world.setTileEntity(x, y, z, entity);
    }

    public static int getBlockMetadata(int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z);
    }

    public static TileEntity getTileEntity(int x, int y, int z)
    {
        return world.getTileEntity(x, y, z);
    }

    public static void setBlock(int x, int y, int z, Block block)
    {
        world.setBlock(x, y, z, block);
    }

    public static void setDefaultDirection(World world, int x, int y, int z)
    {
        if (isNotRemote())
        {
            Block a = getBlock(x, y, z - 1);
            Block b = getBlock(x, y, z + 1);
            Block c = getBlock(x - 1, y, z);
            Block d = getBlock(x + 1, y, z);
            byte b0 = 3;

            if (a.func_149730_j() && !b.func_149730_j())
            {
                b0 = 3;
            }

            if (b.func_149730_j()&& !a.func_149730_j())
            {
                b0 = 2;
            }

            if (c.func_149730_j()&& !d.func_149730_j())
            {
                b0 = 5;
            }

            if (d.func_149730_j()&& !c.func_149730_j())
            {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    public static boolean setBlockMetadataWithNotify(int x, int y, int z, int l, int par5)
    {
        return world.setBlockMetadataWithNotify(x, y, z, l, par5);
    }

    public static boolean hasDisplayName()
    {
        return is.hasDisplayName();
    }

    public static void registerIcon(String icon)
    {
        register.registerIcon(icon);
    }

    public static void spawnParticle(String string, double par1, double par2, double par3, double par4, double par5, double par6)
    {
        world.spawnParticle(string, par1, par2, par3, par4, par5, par6);
    }

    public static void validateTileEntity()
    {
        entity.validate();
    }

    public static int floorDouble(double doub)
    {
        return MathHelper.floor_double(doub);
    }

    public static boolean isRemote()
    {
        return world.isRemote;
    }

    public static boolean isNotRemote()
    {
        return !world.isRemote;
    }

    public static boolean playerIsNotSneaking()
    {
        return !player.isSneaking();
    }

    public static void openGui(Object mod, int guiId, World world, int x, int y, int z)
    {
        player.openGui(mod, guiId, world, x, y, z);
    }

    public static Item getItemFromBlock(Block block)
    {
        return Item.getItemFromBlock(block);
    }


}
