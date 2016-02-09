package io.github.fergoman123.fergoutil.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
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
}
