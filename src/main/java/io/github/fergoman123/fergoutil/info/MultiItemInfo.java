/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.info;

public class MultiItemInfo
{
    private String name;
    private String[] names;
    private String[] models;

    public MultiItemInfo(String name, String[] names, String[] models)
    {
        this.name = name;
        this.names = names;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public String[] getNames() {
        return names;
    }

    public String[] getModels() {
        return models;
    }
}
