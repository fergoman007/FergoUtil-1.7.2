 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergoutil.gui;

import net.minecraft.inventory.ICrafting;

public interface IContainer {

    public void detectAndSendChanges();

    public void addCraftingToCrafters(ICrafting crafting);
}
