/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.info;

import net.minecraft.block.state.IBlockState;

public class StairsInfo
{
    private IBlockState modelState;
    private String name;
    private String model;

    public StairsInfo(IBlockState modelState, String name, String model) {
        this.modelState = modelState;
        this.name = name;
        this.model = model;
    }

    public IBlockState getModelState() {
        return modelState;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
