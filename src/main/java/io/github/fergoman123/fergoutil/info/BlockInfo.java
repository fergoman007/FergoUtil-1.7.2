/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.info;

import net.minecraft.block.material.Material;

public class BlockInfo
{
    private Material material;
    private String name;
    private String model;

    public BlockInfo(Material material, String name, String model)
    {
        this.material = material;
        this.name = name;
        this.model = model;
    }

    public Material getMaterial() {
        return material;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
