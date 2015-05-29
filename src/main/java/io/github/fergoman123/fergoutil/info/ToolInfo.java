/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.info;

import net.minecraft.item.Item.ToolMaterial;

public class ToolInfo extends ItemInfo
{
    private ToolMaterial material;

    public ToolInfo(ToolMaterial material, String name, String model)
    {
        super(name, model);
        this.material = material;
    }

    public ToolMaterial getMaterial()
    {
        return material;
    }
}
