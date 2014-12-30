package io.github.fergoman123.fergoutil.helper;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;
import net.minecraftforge.common.util.EnumHelper;

public class HelperEnum
{
    public static EnumAction addAction(String name)
    {
        return EnumHelper.addAction(name);
    }

    public static ItemArmor.ArmorMaterial addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    {
        return EnumHelper.addArmorMaterial(name, name, durability, reductionAmounts, enchantability);
    }

    public static EntityPainting.EnumArt addArt(String name, String tile, int sizeX, int sizeY, int offsetX, int offsetY)
    {
        return EnumHelper.addArt(name, tile, sizeX, sizeY, offsetX, offsetY);
    }

    public static EnumCreatureAttribute addCreatureAttribute(String name)
    {
        return EnumHelper.addCreatureAttribute(name);
    }

    public static EnumCreatureType addCreatureType(String name, Class typeClass, int maxNumber, Material material, boolean peaceful, boolean animal)
    {
        return EnumHelper.addCreatureType(name, typeClass, maxNumber, material, peaceful, animal);
    }

    public static StructureStrongholdPieces.Stronghold.Door addDoor(String name)
    {
        return EnumHelper.addDoor(name);
    }

    public static EnumEnchantmentType addEnchantmentType(String name)
    {
        return EnumHelper.addEnchantmentType(name);
    }

    public static BlockPressurePlate.Sensitivity addSensitivity(String name)
    {
        return EnumHelper.addSensitivity(name);
    }

    public static MovingObjectPosition.MovingObjectType addMovingObjectType(String name)
    {
        return EnumHelper.addMovingObjectType(name);
    }

    public static EnumSkyBlock addSkyBlock(String name, int lightValue)
    {
        return EnumHelper.addSkyBlock(name, lightValue);
    }

    public static EntityPlayer.EnumStatus addStatus(String name)
    {
        return EnumHelper.addStatus(name);
    }

    public static Item.ToolMaterial addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
    {
        return EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
    }

    public static EnumRarity addRarity(String name, EnumChatFormatting color, String displayName)
    {
        return EnumHelper.addRarity(name, color, displayName);
    }
}
