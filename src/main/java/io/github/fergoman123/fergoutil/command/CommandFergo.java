package io.github.fergoman123.fergoutil.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public abstract class CommandFergo extends CommandBase
{
    public String getCommandName() {
		return null;
	}
    public String getCommandUsage(ICommandSender sender) {
		return null;
	}
    public void processCommand(ICommandSender sender, String[] args) {
	}
    public int getRequiredPermissionLevel() {
		return 0;
	}
    
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
