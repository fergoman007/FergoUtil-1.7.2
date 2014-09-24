 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergoutil.helper;

 import net.minecraft.block.BlockPressurePlate.Sensitivity;
 import net.minecraft.block.material.Material;
 import net.minecraft.enchantment.EnumEnchantmentType;
 import net.minecraft.entity.Entity.EnumEntitySize;
 import net.minecraft.entity.EnumCreatureAttribute;
 import net.minecraft.entity.EnumCreatureType;
 import net.minecraft.entity.item.EntityPainting.EnumArt;
 import net.minecraft.entity.player.EntityPlayer.EnumStatus;
 import net.minecraft.item.EnumAction;
 import net.minecraft.item.EnumRarity;
 import net.minecraft.item.Item.ToolMaterial;
 import net.minecraft.item.ItemArmor.ArmorMaterial;
 import net.minecraft.util.EnumChatFormatting;
 import net.minecraft.util.MovingObjectPosition.MovingObjectType;
 import net.minecraft.world.EnumSkyBlock;
 import net.minecraft.world.gen.structure.StructureStrongholdPieces.Stronghold.Door;
 import net.minecraftforge.common.util.EnumHelper;

public class ToolHelper
{

    public static EnumAction addAction(String name)
    {
        return EnumHelper.addAction(name);
    }

    public static ArmorMaterial addArmorMaterial(String name, int durability, int[] reductionAmounts, int enchantability)
    {
        return EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
    }

    public static EnumArt addArt(String name, String tile, int sizeX, int sizeY, int offsetX, int offsetY)
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

    public static Door addDoor(String name)
    {
        return EnumHelper.addDoor(name);
    }

    public static EnumEnchantmentType addEnchantmentType(String name)
    {
        return EnumHelper.addEnchantmentType(name);
    }

    public static EnumEntitySize addEntitySize(String name)
    {
        return EnumHelper.addEntitySize(name);
    }

    public static Sensitivity addSensitivity(String name)
    {
        return EnumHelper.addSensitivity(name);
    }

    public static MovingObjectType addMovingObjectType(String name)
    {
        return EnumHelper.addMovingObjectType(name);
    }

    public static EnumSkyBlock addSkyBlock(String name, int lightValue)
    {
        return EnumHelper.addSkyBlock(name, lightValue);
    }

    public static EnumStatus addStatus(String name)
    {
        return EnumHelper.addStatus(name);
    }

    public static ToolMaterial addToolMaterial(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
    {
        return EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
    }

    public static EnumRarity addRarity(String name, EnumChatFormatting color, String displayName)
    {
        return EnumHelper.addRarity(name, color, displayName);
    }


}
