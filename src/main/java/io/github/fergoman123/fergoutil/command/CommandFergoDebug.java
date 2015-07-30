package io.github.fergoman123.fergoutil.command;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;

public class CommandFergoDebug extends CommandFergo
{

	@Override
	public String getCommandName() {
		return "fdb";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "fergoutil.cmd.debug";
	}


	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return sender.getCommandSenderName().equals("fergoman123");
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 2;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		GameRules rules = new GameRules();
		rules.setOrCreateGameRule("doMobSpawning", "false");
		rules.setOrCreateGameRule("doDaylightCycle", "false");
		Minecraft.getMinecraft().theWorld.setWorldTime(1600);
	}
	

}
