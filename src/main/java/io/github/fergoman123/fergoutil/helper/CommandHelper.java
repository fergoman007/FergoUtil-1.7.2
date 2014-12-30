package io.github.fergoman123.fergoutil.helper;

import net.minecraft.command.ICommand;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;

public class CommandHelper
{
    public static ICommand registerCommand(ICommand command)
    {
        ServerCommandManager manager = (ServerCommandManager) MinecraftServer.getServer().getCommandManager();
        return manager.registerCommand(command);
    }
}
