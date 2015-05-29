/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.info;

import io.github.fergoman123.fergoutil.item.ArmorType;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class ArmorInfo
{
    public static final ArmorInfo helmetDefault = new ArmorInfo(ArmorMaterial.DIAMOND, "helmet_default", ArmorType.helmet, "minecraft:diamond_helmet");
    public static final ArmorInfo chestplateDefault = new ArmorInfo(ArmorMaterial.DIAMOND, "chestplate_default", ArmorType.chestplate, "minecraft:diamond_chestplate");
    public static final ArmorInfo leggingsDefault = new ArmorInfo(ArmorMaterial.DIAMOND, "leggings_default", ArmorType.leggings, "minecraft:diamond_leggings");
    public static final ArmorInfo BootsDefault = new ArmorInfo(ArmorMaterial.DIAMOND, "boots_default", ArmorType.boots, "minecraft:diamond_boots");

    private ArmorMaterial material;
    private String name;
    private ArmorType type;

    public ArmorInfo(ArmorMaterial material, String name, ArmorType type, String model) {
        this.material = material;
        this.name = name;
        this.type = type;
    }

    public ArmorMaterial getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public ArmorType getType() {
        return type;
    }
}
