package fergoman123.mods.fergoutil.block;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public interface IFergoFurnaceBlock
{
    public void onBlockAdded(World world, int x, int y, int z);

    public void breakBlock(World world, int x, int y, int z, Block block, int oldBlock);
}
