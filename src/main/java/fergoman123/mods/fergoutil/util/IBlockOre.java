package fergoman123.mods.fergoutil.util;

import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 15/05/2014.
 */
public interface IBlockOre {


    public Item getItemDropped(int par1, Random rand, int par3);

    public int quantityDropped(Random rand);

    public int damageDropped(Random rand);
}
