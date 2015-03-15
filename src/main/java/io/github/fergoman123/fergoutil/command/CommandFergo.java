package io.github.fergoman123.fergoutil.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public abstract class CommandFergo extends CommandBase
{
    public abstract String getCommandName();
    public abstract String getCommandUsage(ICommandSender sender);
    public abstract void processCommand(ICommandSender sender, String[] args) throws CommandException;
    public abstract int getRequiredPermissionLevel();
    public abstract int compareTo(Object obj);
}
