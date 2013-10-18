package net.rymate.bTimer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 18/10/13
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
public class CommandTimer implements CommandExecutor, Listener {

    private final bTimer plugin;

    public CommandTimer(bTimer bTimer) {
        this.plugin = bTimer;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
