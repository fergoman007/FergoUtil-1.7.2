 /*
  * Fergoman123's Util
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package fergoman123.mods.fergoutil.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public abstract class FergoCommand extends CommandBase
{
    public abstract String getCommandName();

    public abstract String getCommandUsage(ICommandSender sender);

    public abstract boolean canCommandSenderUseCommand(ICommandSender sender);

    public abstract int getRequiredPermissionLevel();

    public abstract void processCommand(ICommandSender sender, String[] stringArray);

    public abstract int compareTo(Object object);

}
