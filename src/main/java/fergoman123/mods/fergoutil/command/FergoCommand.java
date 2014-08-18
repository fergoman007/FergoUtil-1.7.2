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
