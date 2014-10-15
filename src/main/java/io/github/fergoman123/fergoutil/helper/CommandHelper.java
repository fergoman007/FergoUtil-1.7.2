 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergoutil.helper;

import net.minecraft.command.ICommand;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;

public final class CommandHelper
{
    public static ICommand registerCommand(ICommand command)
    {
        ServerCommandManager manager = (ServerCommandManager) MinecraftServer.getServer().getCommandManager();
        return manager.registerCommand(command);
    }
}
