package fergoman123.mods.fergoutil.util;

import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 15/05/2014.
 */
public interface IBlockOre {

    Item getItemDropped(int par1, Random rand, int par3);

    int quantityDropped(Random rand);

    int damageDropped(Random rand);
}
