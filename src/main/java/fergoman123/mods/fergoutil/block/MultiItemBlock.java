package fergoman123.mods.fergoutil.block;

import fergoman123.mods.fergoutil.helper.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class MultiItemBlock extends ItemBlock
{
    private String blockType[];
    private String unlocalizedName;
    private String append;
    private int specialIndex[] = {-1, -1};

    public MultiItemBlock(Block block, String unlocalizedName, String[] blockTypes)
    {
        super(block);
        if (unlocalizedName.isEmpty())
            this.unlocalizedName = super.getUnlocalizedName();
        else
            this.unlocalizedName = unlocalizedName;
        this.blockType = blockTypes;
        this.append = "";
    }

    public MultiItemBlock(Block block, String unlocalizedName, String appendToEnd, String[] blockTypes)
    {
        super(block);
        this.unlocalizedName = unlocalizedName;
        this.blockType = blockTypes;
        this.append = "." + appendToEnd;
    }

    public void setSpecialIndex(int clampIndex, int stringBuilderIndex)
    {
        specialIndex[0] = clampIndex;
        specialIndex[1] = stringBuilderIndex;
    }

    public int getMetadata(int meta)
    {
        return meta;
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        int pos = MathHelper.clamp_int(stack.getItemDamage(), 0, (specialIndex[0] > -1) ? specialIndex[0] : (blockType.length - 1));
        int sbIndex = (specialIndex[1] > -1) ? pos : (specialIndex[1] - pos);
        if (sbIndex < 0)
            sbIndex = -1 * sbIndex;
        try
        {
            return (new StringBuilder()).append(unlocalizedName).append(".").append(blockType[sbIndex - 1]).append(append).toString();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            LogHelper.warn("[MultiItemBlock] Caught array index error in getUnlocalizedName: " + e.getMessage());
            LogHelper.warn("[MultiItemBlock] Returning unlocalized name: " + getUnlocalizedName());
            return getUnlocalizedName();
        }
    }
}
