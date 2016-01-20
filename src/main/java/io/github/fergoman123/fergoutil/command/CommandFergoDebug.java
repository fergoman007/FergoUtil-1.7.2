package io.github.fergoman123.fergoutil.command;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;

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
		return sender.getCommandSenderEntity().equals("fergoman123");
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 2;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args){
		Minecraft.getMinecraft().theWorld.getGameRules().setOrCreateGameRule("doMobSpawning", "false");
		Minecraft.getMinecraft().theWorld.getGameRules().setOrCreateGameRule("doDaylightCycle", "false");
		Minecraft.getMinecraft().theWorld.setWorldTime(1600);
	}

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
	

}
