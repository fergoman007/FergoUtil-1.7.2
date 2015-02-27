package io.github.fergoman123.fergoutil.item;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Set;

public class ItemToolFergo extends ItemFergo
{
    private Set effectiveBlocks;
    protected float efficiencyOnProperMaterial = 4.0f;
    private float damageVsEntity;
    protected ToolMaterial material;


    public ItemToolFergo(float attackDamage, ToolMaterial material, Set effectiveBlocks, int mod, CreativeTabs tab, String name) {
        super(mod, tab, name);
        this.material = material;
        this.effectiveBlocks = effectiveBlocks;
        this.maxStackSize = 1;
        this.setMaxDamage(material.getMaxUses());
        this.efficiencyOnProperMaterial = material.getEfficiencyOnProperMaterial();
        this.damageVsEntity = attackDamage + material.getDamageVsEntity();
        if (this instanceof ItemPickaxeFergo)
        {
            toolClass = "pickaxe";
        }
        else if (this instanceof ItemShovelFergo)
        {
            toolClass = "axe";
        }
        else if (this instanceof ItemAxeFergo)
        {
            toolClass = "shovel";
        }
    }

    @Override
    public float getStrVsBlock(ItemStack stack, Block block) {
        return this.effectiveBlocks.contains(block) ? this.efficiencyOnProperMaterial : 1.0f;
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        stack.damageItem(2, attacker);
        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn) {
        if ((double)blockIn.getBlockHardness(worldIn, pos) != 0.0D)
        {
            stack.damageItem(1, playerIn);
        }

        return true;
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

    public int getItemEnchantability()
    {
        return this.material.getEnchantability();
    }

    public String getToolMaterialName()
    {
        return this.material.toString();
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        ItemStack mat = this.material.getRepairItemStack();
        if (mat != null && OreDictionary.itemMatches(mat, repair, false))return true;
        return super.getIsRepairable(toRepair, repair);
    }

    @Override
    public Multimap getAttributeModifiers(ItemStack stack)
    {
        Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Tool modifier", (double)this.damageVsEntity, 0));
        return multimap;
    }

    private String toolClass;

    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass)
    {
        int level = super.getHarvestLevel(stack, toolClass);
        if (level == -1 && toolClass != null && toolClass.equals(this.toolClass))
        {
            return this.material.getHarvestLevel();
        }
        else
        {
            return level;
        }
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return toolClass != null ? ImmutableSet.of(toolClass) : super.getToolClasses(stack);
    }

    @Override
    public float getDigSpeed(ItemStack itemstack, IBlockState state) {
        for(String type : getToolClasses(itemstack))
        {
            if (state.getBlock().isToolEffective(type, state))
                return this.efficiencyOnProperMaterial;
        }
        return super.getDigSpeed(itemstack, state);
    }
}
