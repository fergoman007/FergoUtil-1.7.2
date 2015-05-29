/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.info;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class BowInfo
{
    private ToolMaterial material;
    private String name;
    private String idleModel;
    private String pullModel0;
    private String pullModel1;
    private String pullModel2;

    public BowInfo(ToolMaterial material, String name, String idleModel, String pullModel0, String pullModel1, String pullModel2) {
        this.material = material;
        this.name = name;
        this.idleModel = idleModel;
        this.pullModel0 = pullModel0;
        this.pullModel1 = pullModel1;
        this.pullModel2 = pullModel2;
    }

    public ToolMaterial getMaterial()
    {
        return material;
    }

    public String getName() {
        return name;
    }

    public String getIdleModel() {
        return idleModel;
    }

    public String getPullModel0() {
        return pullModel0;
    }

    public String getPullModel1() {
        return pullModel1;
    }

    public String getPullModel2() {
        return pullModel2;
    }
}
