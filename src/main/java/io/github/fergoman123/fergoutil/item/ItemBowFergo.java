package io.github.fergoman123.fergoutil.item;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.reference.ModConstants;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.input.Keyboard;

import java.util.List;

public abstract class ItemBowFergo extends ItemBow
{
    public static final String[] pullArray = new String[]{"_0", "_1", "_2"};
    private ToolMaterial material;
    private int mod;
    private Item repairItem;

    public ItemBowFergo(ToolMaterial material, int mod, CreativeTabs tab, Item repairItem, String name)
    {
        super();
        this.material = material;
        this.setMod(mod);
        this.setRepairItem(repairItem);
        this.setCreativeTab(tab);
        this.setUnlocalizedName(name);
        this.setMaxDamage(material.getMaxUses());
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.isItemEqual(new ItemStack(this.getRepairItem())) || super.getIsRepairable(toRepair, repair);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return String.format("item.%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) {
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))
        {
            tooltip.add("Tool Material: " + this.material.toString());
            tooltip.add("Uses Remaining: " + (stack.getMaxDamage() - stack.getItemDamage()));
            tooltip.add("Enchantability: " + this.material.getEnchantability());
            tooltip.add("Repair Item: " + NameHelper.translate(this.getRepairItem().getUnlocalizedName()));
        }
        else
        {
            tooltip.add(ModConstants.holdShift);
        }
    }

    public abstract void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityPlayer playerIn, int timeLeft);

    public abstract ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn);

    @Override
    public ModelResourceLocation getModel(ItemStack stack, EntityPlayer player, int useRemaining)
    {
        ModelResourceLocation standby = new ModelResourceLocation(String.format("%s:%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName())), "inventory");
        ModelResourceLocation[] pull = new ModelResourceLocation[3];
        for (int i = 0; i < pull.length; i++) {
            pull[i] = new ModelResourceLocation(String.format("%s:%s%s", NameHelper.getModString(this.getMod()), NameHelper.getUnlocalizedName(super.getUnlocalizedName()), pullArray[i]), "inventory");
        }

        if(stack.getItem() == this && player.getItemInUse() != null)
        {
            if(useRemaining >= 18)
            {
                return pull[2];
            }
            else if(useRemaining > 13)
            {
                return pull[1];
            }
            else if(useRemaining > 0)
            {
                return pull[0];
            }
        }
        return new ModelResourceLocation(standby, "inventory");
    }

    public Item setMod(int mod)
    {
        this.mod = mod;
        return this;
    }

    public int getMod()
    {
        return this.mod;
    }

    public Item setRepairItem(Item repairItem) {
        this.repairItem = repairItem;
        return this;
    }

    public Item getRepairItem() {
        return this.repairItem;
    }
}
