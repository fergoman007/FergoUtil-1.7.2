package io.github.fergoman123.fergoutil.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public abstract class CommandFergo extends CommandBase
{

    @Override
    public abstract String getName();

    @Override
    public abstract String getCommandUsage(ICommandSender sender);

    @Override
    public abstract boolean canCommandSenderUse(ICommandSender sender);

    @Override
    public abstract int getRequiredPermissionLevel();

    @Override
    public abstract void execute(ICommandSender sender, String[] args) throws CommandException;

    @Override
    public abstract  int compareTo(Object obj);
}
