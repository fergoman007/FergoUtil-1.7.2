/*
 * Fergoman123's Tools
 * Copyright (c) 2014 fergoman123.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 */

package io.github.fergoman123.fergoutil.block;

import io.github.fergoman123.fergoutil.item.ItemBlockFergo;

public interface IFergoBlock
{
    Class<? extends ItemBlockFergo> getItemBlock();
}
